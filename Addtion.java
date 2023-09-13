
 
package org.javaprogramming;

  class Addition1{
	void overriding(int a,int b) {
	
		int c= a+b;
	System.out.println(c);
	}
  }
	
	 class Subtraction extends Addition1{
		 
	
	
		 void overriding(int a,int b) {
			 
		 
 
      int c=a-b;
     

    System.out.println(c);
	
	 }
	 }
   

 class Mulitiplication extends Addition1{
    void overriding(int a,int b){
    	
	
	int c=a*b;
	System.out.println(c);
    }
	
	}
 class Division extends Addition1{
	 void overriding(int a,int b) {
		 int c=a/b;
		 
		 System.out.println(c);	 
		 }
	 
 }
 

public class Addtion {

	public static void main(String[] args) {
		
		Addition1 ad=new Addition1();
		ad.overriding(30, 40);
		Subtraction sub = new Subtraction();
		sub.overriding(50,30);
		Mulitiplication mu=new Mulitiplication();
		mu.overriding(5, 3);
		Division dv=new Division();
		dv.overriding(10, 2);
		
	}
}

