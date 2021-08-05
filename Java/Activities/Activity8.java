package activities;

public class Activity8 {
	
	public static void main(String[] args)
	{
		try 
		{
		exceptionTest("abc");
		exceptionTest(null);
		}
		catch(CustomException cus) 
		{
		System.out.println("Exception: "+cus.getMessage());
		}
	}
		public static void exceptionTest(String s)throws CustomException 
		{
			if(s==null)
			throw new CustomException("s is null");
			else
				System.out.println(s);
		}
}

class CustomException extends Exception{
	
	 private String message;
		
		public CustomException(String message)
		{
			this.message=message;
		}
		
		@Override
		public String getMessage()
		{
			return message;
		}

	}