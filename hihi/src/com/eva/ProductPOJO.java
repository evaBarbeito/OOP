package com.eva;


import java.math.BigDecimal;

public class ProductPOJO {

	private String name;
	private BigDecimal price;
	
	public ProductPOJO() {
	}
	
	public ProductPOJO(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}