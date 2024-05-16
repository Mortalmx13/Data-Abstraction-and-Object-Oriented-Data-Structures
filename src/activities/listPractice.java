package activities;

import java.util.ArrayList;
import java.util.Iterator;

public class listPractice {

	public static void main(String[] args) {
		
	ArrayList<String> shopList = new ArrayList<String>();
	Iterator<String> iter;
	shopList.add("TV");
	shopList.add("apples");
	shopList.add("chicken");
	shopList.add(1,"phone");
	shopList.add("milk");
	
	for (String str:shopList)
		System.out.println(str);
	System.out.println();
	for (int i=0; i<shopList.size(); i++)
		System.out.println(shopList.get(i));
	
	shopList.remove(0);
	System.out.println();
	for (int i=0; i<shopList.size(); i++)
		System.out.println(shopList.get(i));
	System.out.println("\nTesting iterator");
	iter = shopList.iterator();
	shopList.add("ice");

	
	}

	}


