package activities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		List<String> myList=new ArrayList();
		
		myList.add("ABC");
		myList.add("XYZ");
		myList.add("PQR");
		myList.add("DEF");
		myList.add("LMN");
		
		//Print values using For Loop
		for(String L1:myList)
			System.out.println(L1);
		
		System.out.println("Third name in the List: "+myList.get(2));
		
		System.out.println("LMN is Present? "+myList.contains("LMN"));
		
		System.out.println("Size of the List: "+myList.size());
		
		myList.remove(3);
		System.out.println("Size of the List after removing an element: "+myList.size());
	}

}
