package com.dxctraining.ui;

import com.dxctraining.entities.Account;
import com.dxctraining.entities.*;
import com.dxctraining.exceptions.*;
import com.dxctraining.service.CustomerServiceImpl;
import com.dxctraining.service.ICustomerService;
import java.util.*;

public class CustomerMain {

	private ICustomerService service = new CustomerServiceImpl();

	public static void main(String[] args) {
		CustomerMain demo = new CustomerMain();
		demo.runApp();
	}

	
	public void runApp() {
		try {
			Account account1 = new Account(6370, "abcee44567a");
			Account account2 = new Account(6410, "rtyui44667b");
			Account account3 = new Account(6590, "opasd43567c");
			Account account4 = new Account(6600, "ghjik14567d");


			

			Customer customer1 = new RegularCustomer("jaggayyapet", 1, "rama",637,account1);
			
			service.add(customer1);
			int id1 = customer1.getId();
			
			
			RegularCustomer customer2 = new RegularCustomer("vedadri", 2, "krishna", 641,account2);
			
			service.add(customer2);
			int id2=customer2.getId();
			
			BusinessCustomer customer3 = new BusinessCustomer("karempudi", 3, "dharma", 658,account3);
			
			service.add(customer3);
			int id3=customer3.getId();
			
			service.updateName(customer3.getId(), "dharma teja");
			
			BusinessCustomer customer4 = new BusinessCustomer("mutyala", 3, "revanth", 659,account4);
			
			service.add(customer4);
			int id4 = customer4.getId(); 
			
			
			Customer fetched = service.findById(id3);
			display(fetched);
			System.out.print("*********diplaying All Customers ***********");
			displayAll();
			}
			catch(InvalidArgumentException e) {
			e.printStackTrace();
			System.out.print(e.getMessage());
			}
			catch(CustomerNotFoundException e) {
			e.printStackTrace();
		 	System.out.println(e.getMessage());
			}	
			catch(Exception e) {
			e.printStackTrace();
			System.out.println("some thing went wrong");
			}
				
	}
		public void displayAll() {
			List<Customer> list=service.findAll();
			for(Customer customer:list) {
				display(customer);
			}
		}
	
		public void display(Customer customer){
			System.out.println("  Customer details " +customer.getId() +" "+customer.getName()
			+" "+customer.getBalance());
			
			Account account = customer.getAccount();
			System.out.println("  Customer account details" + account.getBalance() + " Pancard Number "
					+ account.getPancard());
			
			if (customer instanceof RegularCustomer) {
				RegularCustomer rc = (RegularCustomer) customer;
				System.out.println("house address is " + rc.getHouseAddress());
			}

			if (customer instanceof BusinessCustomer) {
				BusinessCustomer bc = (BusinessCustomer) customer;
				System.out.println("business address is " + bc.getBusinessAddress());

			}

		}	
}
			