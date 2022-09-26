package transport_system;

abstract class Vehicle {
	
	abstract int reg_no();
	
}

class Truck extends Vehicle{

	@Override
	int reg_no() {
		// TODO Auto-generated method stub
		return 9897;
	}
	
}
class Bus extends Vehicle{

	@Override
	int reg_no() {
		// TODO Auto-generated method stub
		return 4567;
	}
	
}
class Car extends Vehicle{

	@Override
	int reg_no() {
		// TODO Auto-generated method stub
		return 5678;
	}
	
}
class Bike extends Vehicle{

	@Override
	int reg_no() {
		// TODO Auto-generated method stub
		return 8987;
	}
	
}

