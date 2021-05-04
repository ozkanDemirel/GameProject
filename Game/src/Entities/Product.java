package Entities;

import Abstract.Entity;

public class Product implements Entity{
	
	final int id=1;
	final double unitPrice=399.99;
	private int stockAmount=50;
	
	public int getId() {
		return id;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	

}
