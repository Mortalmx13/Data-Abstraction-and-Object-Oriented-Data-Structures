package activity11;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MergeActivity {
public static void main(String[] args) {   

ArrayList<Integer> list = new ArrayList<Integer>();

System.out.print ("Enter the number of Integers you want sorted:");
Scanner  scan = new Scanner (System.in);
Scanner scan2 = new Scanner (System. in);
int size = scan.nextInt();
System.out.println("Enter the Integers seperated by a space:");
String str = scan2.nextLine();
StringTokenizer s1 = new StringTokenizer(str," ");
while(s1.hasMoreTokens()){
try{

list.add(Integer.valueOf(s1. nextToken()));
}
catch (NumberFormatException e){

System.out.println(e.getMessage());
}
}
System.out.println(list);
System.out.println(mergeSort(list));
}

public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2){

int inlist;
int inlist2 = 0;

        for (inlist = 0; inlist2 < list2.size(); inlist++)

        {

            if (inlist == list1.size() || list1.get(inlist) > list2.get(inlist2)){

                list1.add(inlist, list2.get(inlist2++));
            }
        }
        return list1;
    }

public static ArrayList<Integer> mergeSort(ArrayList<Integer> list){

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        ArrayList<Integer> list2 = new ArrayList<Integer>();       
        int size = list.size();
        int mid = list.size() /2;   
        
        if(size == 1){
        return list;
        }

        for(int i = 0; i < mid; i++){
        	list1.add(list.get(i));
        }
        for(int i = mid; i < size; i++){
        	list2.add(list.get(i));
        }
        list1 = mergeSort(list1);
        list2 = mergeSort(list2);        
       return merge(list1,list2);        

    }

 

}
