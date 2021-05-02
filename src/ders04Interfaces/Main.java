package ders04Interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(),new EmailLogger()};
		CustomerManager customerManager= new CustomerManager(loggers);
		
		Customer idris= new Customer(1,"idris","kizil");

		customerManager.add(idris);
		
	}

	

}
