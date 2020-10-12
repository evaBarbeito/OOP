package com.eva;

import java.util.Scanner;

public class Tech extends Employee {


	   int hours_worked;
	   int hourly_rate;

	   public void getSalary(){
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter hourly rate");
	       this.hourly_rate = sc.nextInt();
	       System.out.println("Enter hours worked");
	       this.hours_worked = sc.nextInt();
	       System.out.println("Salary tech: "+hours_worked*hourly_rate);

	   }
}