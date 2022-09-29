package practice;

import java.util.Scanner;

public class Exception_io {
	public static void main(String args[]) {
		
		
		System.out.println("Enter the two numbers");
		
		try (Scanner sc = new Scanner(System.in);)
		{
			int a= sc.nextInt();
			int b= sc.nextInt();
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();		
		}
		finally {
			System.out.println("Continue");
		}

}
}