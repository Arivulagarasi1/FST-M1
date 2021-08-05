package activities;

public class Activity5 {
	
	public static void main(String[] args) {
		
		MyBook newNovel= new MyBook();
		newNovel.setTitle("Fairy Tale");
		System.out.println("The Title of the Novel: "+newNovel.getTitle());
	}
}
	abstract class Book {

		String title="";
		
		abstract void setTitle(String tit);
		
		public String getTitle() 
		{
		 return title;
		}
	}
	
	class MyBook extends Book{
		
		public void setTitle(String s) {
		    title = s;
		}
	}
