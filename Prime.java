package org.javaprogramming;

public class Prime {

	public static void main(String[] args) {
		int i,j,prime=0;
		System.out.println("all the prime number 1 to 100");
		
		for(i=2;i<=100;i++) {
			
			
			
			
		for(j=2;j<=i/2;j++) {
			if(i%j==0) {
				prime=1;
				break;
			}
								
		}
			
	if(prime==0) {
		System.out.println(i);
		}
		
	prime=0;

	}}
}
	


