package com.eva;

import java.util.Scanner;

public class HR extends Employee {


	   int hours_worked;
	   int hourly_rate;

	   public void getSalary(){
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter monthly wage");
	       this.hourly_rate = sc.nextInt();
	       System.out.println("Enter months worked");
	       this.hours_worked = sc.nextInt();
	       System.out.println("Salary HR: "+hours_worked*hourly_rate);

	   }
}