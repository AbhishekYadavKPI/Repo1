package practice;

public class calc implements DefaultMethod1 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Interface");
	}
	
	public static void main(String Args[]) {
		calc ob = new calc();
		System.out.println(ob.add(9, 7));
		ob.display();
	}

}
