package ders03;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer idris=new IndividualCustomer();
		idris.customerNumber="312231";
		
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.customerNumber="145435";
		
		SendikaCustomer sendika=new SendikaCustomer();
		sendika.customerNumber="324234";
		
		CustomerManager customerManager=new CustomerManager();
//		customerManager.add(hepsiBurada);
//		customerManager.add(idris);
//		customerManager.add(sendika);
		
		Customer[] customers= {idris,hepsiBurada,sendika};
		customerManager.addMultiple(customers);
		
		
		
		
		
		
		
	}

}
