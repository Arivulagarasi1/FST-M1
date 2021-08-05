package activities;

import java.util.Map;
import java.util.TreeMap;

public class Activity11 {

	public static void main(String[] args) {
		
		Map<Integer,String> colours=new TreeMap();
		
		colours.put(0, "Blue");
		colours.put(4, "Purple");
		colours.put(2, "Red");
		colours.put(3, "Yellow");
		colours.put(1, "Green");
		
		System.out.println(colours);
		
		colours.remove(2);
		System.out.println("Map after removing an element "+colours);
		
		System.out.println("Green colour exist: "+colours.containsValue("Green"));

		System.out.println("Size of the Map: "+colours.size());
	}

}
