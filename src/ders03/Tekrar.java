package ders03;

public class Tekrar {

	int price;
	String name;
	String model;
	double discount;
	double unitPriceAfterDiscount;
	
	public Tekrar(int price, String name, String model, double discount, double unitPriceAfterDiscount) {
		super();
		this.price = price;
		this.name = name;
		this.model = model;
		this.discount = discount;
		this.unitPriceAfterDiscount=unitPriceAfterDiscount;
		
	}
	public Tekrar() {
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterDiscount() {
		return unitPriceAfterDiscount;
	}
	
}
