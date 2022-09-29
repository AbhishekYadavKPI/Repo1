package practice;

public interface DefaultMethod1 {
	void display();
	default int add(int a , int b) {
		int c=a+b;
		return c;
	}

}
