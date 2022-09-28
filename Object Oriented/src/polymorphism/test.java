package polymorphism;

class test {
	
	void display() {
		System.out.println("test");
}
}

class check extends test{
	//Method 1
	int cal(int a) {
		int c = a+5;
		System.out.println(c);
		return c;
	} 
	// Same method as the first one with different return type and parameter
	double cal(double a) {
		
		double c = a+5;
		System.out.println(c);
		return c;
	}
	// Same method as the first one with different number of parameters
	int cal(int a , int b) {
		int c= a+b;
		System.out.println(c);
		return c;
	}
	
	void display(){
		
		 System.out.println("test overriden");
		 
	 }
	 
}