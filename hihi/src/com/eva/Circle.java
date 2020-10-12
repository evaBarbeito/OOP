package com.eva;

public class Circle {
	   int radius;

	   Circle(int radius){
	       this.radius = radius;
	   }

	   double area(){
	       return 3.14*radius*radius;
	   }

	   double perimeter(){
	       return 2 * 3.14 * radius;
	   }
}
