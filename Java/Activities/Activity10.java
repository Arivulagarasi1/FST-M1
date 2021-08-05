package activities;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		
		Set<Integer> hs=new HashSet();
		
		hs.add(44);
		hs.add(10);
		hs.add(32);
		hs.add(4);
		hs.add(40);
		hs.add(65);
		
		System.out.println("Size of the Set: "+hs.size());
		
		hs.remove(32);
		
		if(hs.contains(77))
			hs.remove(77);
		else
			System.out.println("Element not exist");

		System.out.println("32 Present? "+hs.contains(32));
		
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
