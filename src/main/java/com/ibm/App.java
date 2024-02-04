package com.ibm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import com.ibm.factory.MySessionFactory;
import com.ibm.model.Customer;
import com.ibm.model.Order;
import com.ibm.service.CustomerService;
import com.ibm.service.CustomerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	private static CustomerService cusService;
	static {
		cusService = new CustomerServiceImpl();
	}
	private static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	public static void main( String[] args )
    {
		/*
		 * try { Customer cus = new Customer();
		 * cus.setCustomerId(UUID.randomUUID().toString().split("-")[0]);
		 * System.out.println("Enter customer name: ");
		 * cus.setCustomerName(br.readLine()); Order or = new Order();
		 * or.setOrderId(UUID.randomUUID().toString().substring(0,10));
		 * System.out.println("Enter order type: "); or.setOrderType(br.readLine());
		 * System.out.println("Enter order price: ");
		 * or.setOrderPrice(Double.parseDouble(br.readLine()));
		 * System.out.println("Enter true/false: is order confirmed?");
		 * or.setIsConfirmed(Boolean.valueOf(br.readLine())); cus.setOrder(or);
		 * cusService.insertOneCustomer(cus); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */
		
		try {
			for (Customer c : cusService.getAllCustomers()) {
				System.out.println(c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
