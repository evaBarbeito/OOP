package com.eva;

import com.eva.Cart;
import com.eva.Cart.Discount;
import com.eva.Cart.Tax;

/**
 * 
 * @author eva
 *
 */
public class hiWorld {
/**
 * 
 * @param args
 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("Ctrl+space");  //sysout
		System.out.println("------");
		

		/*
		 * ctrl+D delete
		 * ctrl + / commment
		 * ctrl + shift + O arrange imports
		 * alt+shif+R   reformat
		 * ctrl+shif+ R tabs
		 * ctrl+shif + L
		 * 
		 * alt+shift+M --> llevar a nuevo metodo
		 * 
		 */
		User user = new User();
		
//		// === init static nested class
		Tax tax = new Cart.Tax("someTaxType", 0);
//		
//		// === init inner class
		Discount discount = new Cart().new Discount("firstClientDiscount", 0);
		
		// === Abstract class demo
//		Product product = new Product(); // can't create instance of an abstract class
		MasterProduct masterProduct = new MasterProduct();
		VariantProduct variantProduct = new VariantProduct();
		
		masterProduct.setName("Mercedes S-klass");
		variantProduct.setDeliveryAvailable(true);
		
		// === Anonymous class demo
		Product product = new Product() {
			@Override
			public boolean isAvailableInStock() {
				return false;
			}
		};
		
		
		/**
		 *  Exercise 1
		 */
		Programmer p = new Programmer();
		System.out.println(p.id+" "+p.name+" "+p.salary );
		//changing the default values of attributes
		p.name="Rob";
		p.id=10;
		p.salary=2000;
		System.out.println("Programmer" + p.id+" "+p.name+" "+p.salary );


		/**
		 * Exercise 2
		 */
		Circle c = new Circle(10);
		System.out.println(c.perimeter());
		System.out.println(c.area());
		
		/**
		 * Exercise 3
		 */
		Employee e = new Employee();
		e.setData();
		e.getData();

		// lets create the tech object and see if it works
		Tech t = new Tech();
		t.setData();
		t.getSalary();
		t.getData();
		
		// lets create the design object and see if it works
		Design d = new Design();
		d.setData();
		d.getSalary();
		d.getData();
		
		// lets create the design object and see if it works
		HR h = new HR();
		h.setData();
		h.getSalary();
		h.getData();
				
				
		
	}

}
