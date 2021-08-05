package activities;

public class Activity4 {
	
	static void insertionSort(int[] sort)
	{
		int size=sort.length;
		int i=0;
		
		
		for (i=1;i<size;i++)
		{
			int move=sort[i];
			int j=i-1;
			while(j>=0&& move<sort[j])
			{
				sort[j+1]=sort[j];
				j=j-1;
			}
			sort[j+1]=move;
			
		}	
	}
	
	public static void main(String[] args) {
		
		int[] array	= {10,7,2,6,4};
		insertionSort(array);
		for (int b:array)
			System.out.print(" "+b);

	}

}
