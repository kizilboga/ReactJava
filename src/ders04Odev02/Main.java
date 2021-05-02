package ders04Odev02;

import java.util.Date;

import ders04Odev02.Classes.CustomerCheckManager;
import ders04Odev02.Classes.NeroCustomerManager;
import ders04Odev02.Classes.StarbucksCustomerManager;
import ders04Odev02.Entities.Customer;
import ders04Odev02.Interfaces.BaseCustomerManager;


public class Main {

	public static void main(String[] args) {
		Customer realCustomer = new Customer(1,"Halit Enes","Kalaycý","41192011504",new Date(2000,6,28));
		Customer fakeCustomer = new Customer(2,"Engin","Demiroð","12345678901",new Date(1989,2,11));
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(realCustomer);
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(realCustomer);
		starbucksCustomerManager.save(fakeCustomer);

		
	}

}
