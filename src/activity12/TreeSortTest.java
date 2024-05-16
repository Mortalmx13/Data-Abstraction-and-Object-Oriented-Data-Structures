package activity12;
//3750
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TreeSortTest {

    public static void main(String[] args) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("activity12_input.txt"));
            while (scanner.hasNextLine()) {
            	String temp1= scanner.nextLine();
            	if(temp1 != "\n") {
            		String[] temp = temp1.split(",");
            		String dateVar = temp[0];
            		
            		String description = temp[1];
            	
                
                String[] tokens = dateVar.split("/");
                int month = Integer.parseInt(tokens[1]);
                int day = Integer.parseInt(tokens[2]);
                int year = Integer.parseInt(tokens[3]);
                
                appointments.add(new Appointment(new Date(month, day, year), description));
            }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }

    public ArrayList<Appointment> treeSort(ArrayList<Appointment> appointments) {
    	 ArrayList<Appointment> temp = new ArrayList<>();
        BinarySearchTree<Appointment, Date> bst = new BinarySearchTree<>();
        TreeIterator<Appointment> iter = new TreeIterator<>(bst);
        iter.setInorder();
        while(iter.hasNext()) {
        	temp.add(iter.next());
        }
        return temp;
    }
    }

