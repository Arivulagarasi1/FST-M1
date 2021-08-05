package activities;

public class Activity12 {

	public static void main(String[] args) {
		
		Addable ad1 = (a,b) -> (a+b);
		Addable ad2 = (int x,int y) ->{
			return x+y;
		};
		
		System.out.println(ad1.add(2,4));
		System.out.println(ad2.add(2,8));
	}

@FunctionalInterface
public interface Addable {
	
	abstract int add(int num1,int num2);
	
}
}
