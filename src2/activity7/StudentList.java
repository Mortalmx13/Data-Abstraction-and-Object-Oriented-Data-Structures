package activity7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList implements StudentListInterface {
	ArrayList<String> list = new ArrayList<String>();
	Scanner load;
	public StudentList() {
		
		@SuppressWarnings("unused")
		ArrayList<String> list = new ArrayList<String>();
	}
	
	public void loadData(String fname)
	{
		try
		{
			load = new Scanner(new File(fname));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("ERROR");
		}
		while(load.hasNextLine())
		{
			list.add(load.nextLine());
		}
	}
	public void displayRoster()
	{
		System.out.println(list);
	}
}
