package com.ibm.service;

import java.util.List;

import com.ibm.model.Customer;
import com.ibm.repo.CustomerRepoImpl;
import com.ibm.repo.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository cusRepo;
	{
		try {
			cusRepo = new CustomerRepoImpl();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public Customer insertOneCustomer(Customer cus) throws Exception {
		return cusRepo.insertOneCustomer(cus);
	}
	@Override
	public List<Customer> getAllCustomers() throws Exception {
		return cusRepo.getAllCustomers();
	}
	
}
