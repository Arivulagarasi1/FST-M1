package activities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/Users/ArivulagarasiT/IBM FST Projects/Java/src/File1.txt");
		boolean fStatus = file.createNewFile();
		
		if(fStatus) 
		{
		FileWriter wr=new FileWriter("C:/Users/ArivulagarasiT/IBM FST Projects/Java/src/File1.txt");
		wr.write("Writing text into a file");
		wr.close();
		}
		else
			System.out.println("File not exist to write");
		
		File fileUtil = FileUtils.getFile("C:/Users/ArivulagarasiT/IBM FST Projects/Java/src/File1.txt");
		System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

		File destDir = new File("C:/Users/ArivulagarasiT/IBM FST Projects/Java/src/resources");
		FileUtils.copyFileToDirectory(file, destDir);
		
		File filenew = FileUtils.getFile("C:/Users/ArivulagarasiT/IBM FST Projects/Java/src/File1.txt");
		String Text=FileUtils.readFileToString(filenew, "UTF8");
		System.out.println("Data in Directory file: " + Text);
	
	}

}
