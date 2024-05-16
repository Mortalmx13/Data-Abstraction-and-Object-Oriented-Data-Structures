package activity5;

import java.util.Scanner;
import java.io.*;

public class FileInputOutputPractice {

public static void main(String[] args) {
		
	String fname = "activity5_input1.txt";
	
	
	Scanner inputStream = null;
	String sentence = "";
	int count = 0;
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
    
	try {
	inputStream = new Scanner(new File(fname));
	}
	catch(FileNotFoundException a){
		System.out.println("File can't open");
		System.exit(1);
	}while(inputStream.hasNextLine()) {
		sentence=inputStream.nextLine();
		System.out.println(sentence);
		count++;
		 outputStream.println(count + " " + sentence.toUpperCase());
		
	}
	
		
		
       
      
         
           
        
        outputStream.close( );
        System.out.println("These lines were written to " +  fileName);
        inputStream.close();
}
	
}
