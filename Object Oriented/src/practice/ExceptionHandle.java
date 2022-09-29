package practice;

import java.io.BufferedReader;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandle {
	public static void main(String args[]) throws IOException 
	{
		
		try (FileOutputStream fr = new FileOutputStream("outputfile.txt");
				
			BufferedReader br = new BufferedReader(new FileReader("a.txt"))){
				
				String text;
				
				while((text=br.readLine()) != null) {
					
					byte arr[] =text.getBytes();
					
					fr.write(arr);
				}
					
			System.out.println("File content copied");
		        	
		    }
			
		catch(Exception e) {
			System.out.println(e); 
		}
		
		finally
		{
			System.out.println("Resources are closed");
		}
	}
}
