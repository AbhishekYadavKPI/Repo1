package transport_system;

public class Transport_demo {
	public static void main(String a[]) {
		Truck t1 = new Truck();
		Bus b1 = new Bus();
		Car c1 = new Car();
		Bike z1 = new Bike();
		t1.reg_no();
		b1.reg_no();
		c1.reg_no();
		z1.reg_no();
		
		Maruti ob1 = new Maruti();
		ob1.model();
		ob1.vehicle_type();// Calling method from  base class Car
		ob1.reg_no();// Calling method from super base class Vehicle
		
}
}