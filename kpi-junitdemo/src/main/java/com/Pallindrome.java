package com;

public class Pallindrome {
	String pallindromecheck(int a) {
		int sum=0;
		int n=a;
		while(n>0) {
			sum = sum*10+ (n%10);
			n = n/10;	
		}
		if(sum == a) {return "Pallindrome";}
		else {return "Not Pallindrome";}		

}

}
