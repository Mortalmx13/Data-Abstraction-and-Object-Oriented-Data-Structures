package activity11;
//9981
//Charles Young Abid haq
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ActivityMerge {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        try {
            File file = new File("activity11_input.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found");
            System.exit(0);
        }

        System.out.println("Original list: " + list);
        System.out.println("Sorted list: " + mergeSort(list));
    }

    public static ArrayList<String> merge(ArrayList<String> list1, ArrayList<String> list2) {

        ArrayList<String> mergedList = new ArrayList<String>();
        int index1 = 0;
        int index2 = 0;

        while (index1 < list1.size() && index2 < list2.size()) {
            if (list1.get(index1).compareTo(list2.get(index2)) < 0) {
                mergedList.add(list1.get(index1));
                index1++;
            } else {
                mergedList.add(list2.get(index2));
                index2++;
            }
        }

        while (index1 < list1.size()) {
            mergedList.add(list1.get(index1));
            index1++;
        }

        while (index2 < list2.size()) {
            mergedList.add(list2.get(index2));
            index2++;
        }

        return mergedList;
    }

    public static ArrayList<String> mergeSort(ArrayList<String> list) {

        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;

        ArrayList<String> leftList = new ArrayList<String>();
        for (int i = 0; i < mid; i++) {
            leftList.add(list.get(i));
        }

        ArrayList<String> rightList = new ArrayList<String>();
        for (int i = mid; i < list.size(); i++) {
            rightList.add(list.get(i));
        }

        leftList = mergeSort(leftList);
        rightList = mergeSort(rightList);

        return merge(leftList, rightList);
    }
}
