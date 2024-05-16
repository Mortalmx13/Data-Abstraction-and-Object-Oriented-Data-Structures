package activity13;

//6678
//oscar castro

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class MapTest {


	public static void main(String[] args) {
		
		
		String code, state;
		int option = 0;
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		File file = new File("activity13_input.txt");
		Scanner scan = null;
		int i = 0;
		String [] temp, temp1;
		HashMap<String, String> dictionary  = new HashMap<String,String>();
		temp = new String[50];
		temp1 = new String[50];
		
		try {
			scan = new Scanner(file);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		while(scan.hasNextLine())
		{
			StringTokenizer s1 = new StringTokenizer(scan.nextLine(), "\t");
			
			if(s1.hasMoreTokens())
			{
				temp[i] = s1.nextToken();
				temp1[i] = s1.nextToken();
				i++;
			}
		}
		
		for(int j = 0; j < temp.length; j++)
		{
			dictionary.put(temp[j], temp1[j]);
		}
		
		
		  do {
              System.out.println("1. Display all the airports/cities");
              System.out.println("2. Add a new airport");
              System.out.println("3. Search for an airport");
              System.out.println("4. Exit");

              option = input.nextInt();

              switch (option) {
                  case 1:
                      display(dictionary);
                      break;
                  case 2:
                      System.out.println("Enter State code:");
                      code = input2.next();
                      System.out.println("Enter State name:");
                      state = input2.nextLine();
                      add(dictionary, code, state);
                      System.out.println(code + "\t" + state);
                      break;
                  case 3:
                      System.out.println("Enter State code:");
                      code = input2.nextLine();
                      System.out.println(search(dictionary, code));
                      break;
                  default:
                      System.out.println("Invalid option. Please try again.");
                      break;
              }

          } while (option != 4);
		input.close();
		input2.close();
	}
	
	
	public static String search(HashMap<String,String> map, String key)
	{
		return map.get(key);
	}
	public static void add(HashMap<String,String> map, String key, String val)
	{
		map.put(key, val);
	}
	public static void display(HashMap<String,String> map)
	{
		Set<Map.Entry<String,String>> result = map.entrySet();
		Iterator<Map.Entry<String,String>> iter = result.iterator();
		
		Map.Entry<String, String> entry;
		while(iter.hasNext())
		{
			entry = iter.next();
			if(entry.getKey() != null)
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}

}



