package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		List<Integer> list = new ArrayList();
		
		Random indexGen=new Random();
		
		System.out.println("Enter Integer values");
		while(scan.hasNextInt())
			list.add(scan.nextInt());
		
		Integer[] nums=list.toArray(new Integer[0]);
		
		int random=indexGen.nextInt(nums.length);
		System.out.println("Random Generated Index Value: "+random);
		System.out.println("Value of Array in the index: "+nums[random]);
	}

}
