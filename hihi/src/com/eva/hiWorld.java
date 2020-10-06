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
		
//		 TODO eva
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
		
		
	}

}
