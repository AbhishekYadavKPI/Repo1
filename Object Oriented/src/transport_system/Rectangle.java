package transport_system;

public class Rectangle extends Area {
	void show() {
		System.out.print("I am Rectangle");
	}
	
	public static void main(String a[]) {
		Rectangle r = new Rectangle();
		r.show();
}
}