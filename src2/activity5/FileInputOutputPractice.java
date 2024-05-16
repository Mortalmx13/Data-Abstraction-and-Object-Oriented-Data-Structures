package activity5;

import java.util.Scanner;
import java.io.*;

public class FileInputOutputPractice {

public static void main(String[] args) {
		
	String fname = "activity5_input1.txt";
	String lname = "activity5_input2.txt";
	
	Scanner inputStream = null;
	String sentence1 = "";
	String sentence2 = "";
	
	try {
	inputStream = new Scanner(new File(fname));
	}
	catch(FileNotFoundException a){
		System.out.println("File can't open");
		System.exit(1);
	}while(inputStream.hasNextLine()) {
		sentence1=inputStream.nextLine();
		System.out.println(sentence1);
		
	}
	try {
		inputStream = new Scanner(new File(lname));
		}
		catch(FileNotFoundException a){
			System.out.println("File can't open");
			System.exit(1);
		}while(inputStream.hasNextLine()) {
			sentence2=inputStream.nextLine();
			System.out.println(sentence2);
			
		}
		String fileName = "activity5_output.txt"; 
        PrintWriter outputStream = null;
        try
        {
            outputStream = new PrintWriter(fileName);
        }
        catch(IOException e)
        {
            System.out.println("Error opening the file " + fileName);
            System.exit(0);
        }
       
      
         
            outputStream.println( sentence1 + sentence2);
        
        outputStream.close( );
        System.out.println("Those lines were written to " +  fileName);
        inputStream.close();
}
	
}
