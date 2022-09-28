package polymorphism;

public class Main {
	public static void main(String args[]) {
		
		test t = new check();
		check a = new check();
		check b = new check();
		check c = new check();
		
		t.display();// Calling method from child class, overriding parent class method
		a.cal(4);// Calling method 1
		b.cal(5.5);// Calling method 2
		c.cal(6,8);// Calling method 3
	}
}



