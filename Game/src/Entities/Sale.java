package Entities;

import Abstract.Entity;

public class Sale implements Entity{
	
	private int saleAmount;
	private double salePrice;
	
	public Sale(int saleAmount) {
		
		this.saleAmount = saleAmount;
	}
	public int getSaleAmount() {
		return saleAmount;
	}
	public void setSaleAmount(int saleAmount) {
		this.saleAmount = saleAmount;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	
	
	
}
