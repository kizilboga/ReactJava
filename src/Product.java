
public class Product {

	public Product(){
		System.out.println("Selamlar");
	}
	
	public Product(int id,String name,double unitPrice,String details) {
		this();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.details=details;
	}
	
	int id;
	String name;
	double unitPrice;
	String details;
	
	
}
