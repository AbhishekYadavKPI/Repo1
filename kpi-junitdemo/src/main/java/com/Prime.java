package com;

public class Prime {
	String primecheck(int a) {
	
		int counter =0;
		for (int i=2;i<a;i++) {
			if(a%i == 0) {
				counter++;
				break;
			  }
		    }
		if(counter==0) {
			
			return "Prime";
		}
		else {return "Not Prime";}

}
}