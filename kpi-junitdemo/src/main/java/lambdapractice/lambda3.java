package lambdapractice;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface help{
	 void print(List A);
	
}
public class lambda3 {
	
	public lambda3() {
		
	}
	
	int EmpID;
	String name;
	
	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int empID) {
		this.EmpID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		lambda3 e1 = new lambda3();
		lambda3 e2 = new lambda3();
		lambda3 e3 = new lambda3();
		List<lambda3> list= new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		list.forEach(i-> e1.getEmpID());
		
		
		
		
	}

}
