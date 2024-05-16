package assg9_youngch20;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import activity12.BinarySearchTree;
import activity12.TreeIterator;

public class PhoneBook {
    private BinarySearchTree<Person, String> tree;
/**
 * Constructor 
 */
    public PhoneBook() {
        tree = new BinarySearchTree<>();
    }
/**
 * add contact with name and contact number
 * @param name
 * @param phoneNumber
 */
    public void addContact(String name, String phoneNumber) {
        Person person = new Person(name, phoneNumber);
        tree.insert(person);
    }
/**
 * deletes contact by name
 * @param name
 */
    public void deleteContact(String name) {
        tree.delete(new Person(name, null));
    }

    public Person searchPhoneNumber(String name) {
    	try
		{
			return tree.retrieve(name);
		}
		catch (Exception a)
		{
			System.out.println("Customer does not exist");
		}
		return null;
    }
/**
 * lets the user edit 
 * @param name
 * @param newPhoneNumber
 */
    public void updatePhoneNumber(String name, String newPhoneNumber) {
    	try
		{
			Person c = tree.retrieve(name);
			if(c != null)
			{
				
				c.setPhoneNumber(newPhoneNumber);
			}
		}
		catch (Exception a)
		{
			System.out.println("Customer doesnt exist");
		}
    }
/**
 * sorts and displays the list
 * @return
 */
    public ArrayList<Person> getSortedPhoneBook() {
    	ArrayList<Person> phoneBookList = new ArrayList<>();
    	TreeIterator<Person> tree = new TreeIterator<Person>(this.tree);
    	tree.setInorder();
    	while(tree.hasNext()) {
    		phoneBookList.add(tree.next());
    	}
    	return phoneBookList;
    }

/**
 * saves and exits the program
 * @param fileName
 * @throws IOException
 */
    public void saveToFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        ArrayList<Person> phoneBook = getSortedPhoneBook();
        for (Person person : phoneBook) {
            writer.write(person.getKey() + "\t" + person.getPhoneNumber() + "\n");
        }
        writer.close();
    }
    
}
