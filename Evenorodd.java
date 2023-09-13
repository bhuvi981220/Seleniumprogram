package org.javaprogramming;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		
		int num;
		
	Scanner sb = new Scanner(System.in);
	
	System.out.print("enter the number:");
		 
		   num = sb.nextInt();
		
		if(num %2==0) {
			
			System.out.println( +num+"is even number");
			
		}else {
			
			System.out.println(+num+"is odd number");
		}
		
		
	

	}

}
