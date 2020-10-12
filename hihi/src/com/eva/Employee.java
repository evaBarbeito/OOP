package com.eva;

import java.util.Scanner;

public class Employee {
	   int employee_id;
	   String name;
	   int age;

	   public void setData(){
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter employee id");
	       this.employee_id = sc.nextInt();
	       System.out.println("Enter employee Name");
	       this.name = sc.next();
	       System.out.println("Enter employee age");
	       this.age = sc.nextInt();

	   }

	   public void getData(){
	       System.out.println(this.employee_id+" "+this.name+" "+this.age);
	   }
}
