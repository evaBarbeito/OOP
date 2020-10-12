package com.eva;

import java.util.Scanner;

public class Design extends Employee {


	   int hours_worked;
	   int hourly_rate;

	   public void getSalary(){
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter weekly rate");
	       this.hourly_rate = sc.nextInt();
	       System.out.println("Enter weeks worked");
	       this.hours_worked = sc.nextInt();
	       System.out.println("Salary design: "+hours_worked*hourly_rate);

	   }
}