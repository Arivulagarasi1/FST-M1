package activities;

public class Activity2 {

	public static void main(String[] args) {
		
		int[] array= {10, 77, 10, 54, -11, 10};
		
		System.out.println("Result: "+findResult(array));
	}
	
	public static boolean findResult(int[] a)
	{
		int sum=0;
		for(int b:a)
		{
			if(b==10)
				sum+=b;
		}
		
		if(sum==30)
			return true;
		else
			return false;
	}

}



