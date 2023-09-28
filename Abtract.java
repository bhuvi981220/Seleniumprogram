package org.javaprogramming;

abstract class Shape{
	
public abstract double caculateArea();
public abstract double volume();
	void dispaly() {
		System.out.println("Shape details");
		
	 }
	
  public void objectcolour() {
	System.out.println("colour of the Shape");
  }	
}	 
  class Circles extends Shape{
	  double radius;
	  double a;
	  
	  
	    Circles(double radius){
	    this.radius=radius;	
	    }
	    
      public double caculateArea() {
		
		double area =3.14*radius*radius;
		System.out.println("Area of the Circle:"+area);		
		return area;
	}

	@Override
	public double volume() {
	
		double r =2*3.14*a;
		System.out.println("volume of the circles:"+r);
		
		return r;
	}
	  
  }

 
class Rectangles extends Shape{
	 
	int length;
	int width;
	int heigth;
	Rectangles(int length,int width ,int heigth){
		this.length=length;
		this.width=width;
		this.heigth=heigth;
		
	
}

	@Override
	public double caculateArea() {
		
		int rec = length*width;
		System.out.println("Area of the Reactangle:"+rec);
		return rec;
	}

	@Override
	public double volume() {
		int re =length*heigth*width;
		System.out.println("volume of the:"+re);
		
		return re;
	}
}
	
	class Squares extends Shape{
		
		int side;
		Squares(int side){
			this.side=side;
		}
	
         @Override
		public double caculateArea() {
        	 
		 int si = side*side;
		 System.out.println("Area of the Square:"+side);
			return side;
		}

		@Override
		public double volume() {
			int sid =side*side*side;
			System.out.println("volume of the square:"+sid);
			return sid;
		}
		
	}
		
		
  class Triangle extends Shape{
	  
	  int breadth;
	  int heigth;
	  Triangle(int breadth,int heigth){
		  this.breadth=breadth;
		  this.heigth=heigth;
	  }
  

	@Override
	public double caculateArea() {
		
		double tri = 0.5*breadth*heigth;
		System.out.println("Area of the Triangle:"+tri);
		return tri;
	}


	@Override
	public double volume() {
		int ti = breadth*heigth;
		System.out.println("volume of the Triangle:"+ti);
		return ti;
	}
	
}
 

  
public class Abtract {

	public static void main(String[] args) {
		Circles circle = new Circles(5.8);
		Rectangles rectangle =new Rectangles(6,8, 4);
		Squares si = new Squares(3);
		Triangle tri = new Triangle(3,6);
		
		circle.caculateArea();
		circle.volume();
		
		si.caculateArea();
		si.volume();
		
		tri.caculateArea();
		tri.volume();
		
	
		 }

	}


