/**
 * Charles Young
 */
package assg9_youngch20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import activity12.BinarySearchTree;
import activity12.TreeIterator;

public class CustomerRoster {
	private BinarySearchTree <Customer, String> tree;
	private TreeIterator <Customer> sortedList;
	
	
	public CustomerRoster()
	{
		tree = new BinarySearchTree();
	}
	
	/**
	 * Adds another customer
	 * @param c
	 */
	public void addCustomer(Customer c)
	{
		tree.insert(c);
	}
	
	/**
	 * Displays customer roster 
	 */
	public void displayRoster()
	{
		sortedList = new TreeIterator <Customer>(tree);
		sortedList.setInorder();
		
		while(sortedList.hasNext())
		{
			Customer c = sortedList.next();
			System.out.println(c.getKey() 
					+ "\t" + c.getName() 
					+ "\t" + c.getPhone());
		}
	}
	
	/**
	 * Deletes the user's id that is called
	 * @param id
	 */
	public void deleteCustomer(String id)
	{
		try
		{
			tree.delete(id);
		}
		catch(Exception a)
		{
			System.out.println("Customer does not exist.");
		}
	}
	
	/**
	 * Searches customer by id
	 * @param id
	 * @return
	 */
	public Customer searchCustomer(String id)
	{
		try
		{
			return tree.retrieve(id);
		}
		catch (Exception a)
		{
			System.out.println("Customer does not exist");
		}
		return null;
	}
	
	/**
	 * Updates user by id and changes name and number
	 * @param id
	 * @param name
	 * @param phoneNumber
	 */
	public void updateCustomer(String id, String name, String phoneNumber)
	{
		try
		{
			Customer c = tree.retrieve(id);
			if(c != null)
			{
				c.setName(name);
				c.setPhone(phoneNumber);
			}
		}
		catch (Exception a)
		{
			System.out.println("Customer doesnt exist");
		}
	}
	
	/**
	 * Saves the new data to the file
	 */
	public void save()
	{
		String fOutput = "assg9_CustomerRoster.txt"; 
		PrintWriter oStream = null;
		try {
			oStream = new PrintWriter(fOutput);
			
			sortedList = new TreeIterator <Customer>(tree);
			sortedList.setInorder();
			
			while(sortedList.hasNext())
			{
				Customer c = sortedList.next();
				oStream.println(c.getKey() + "\t" + c.getName() + "\t" + c.getPhone());
			}
		}
		catch(IOException a) {
			System.out.println(a.getMessage());
		}
		oStream.close();
	}
	
	/**
	 * loads the file onto the page
	 * @param filename
	 */
	public void load(String filename)
	{
		filename = "assg9_CustomerRoster.txt";
		Scanner iStream = null;
		String line = " ";
		String[] params;
		
		try {
			iStream = new Scanner(new File(filename));
		}
		catch(FileNotFoundException a) {
			System.out.println("ERROR: File not found.");
			System.exit(1);
		}
		while (iStream.hasNextLine())
		{
			line = iStream.nextLine();
			params = line.split("\t");
			tree.insert(new Customer(params[0], params[1], params[2]));
			
		}
	}
	
	
}
