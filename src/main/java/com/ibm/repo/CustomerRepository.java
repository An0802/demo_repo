package com.ibm.repo;

import java.util.List;

import com.ibm.model.Customer;

public interface CustomerRepository {
	Customer insertOneCustomer (Customer cus) throws Exception;
	List<Customer> getAllCustomers() throws Exception;
	Customer findCustomerById(String cusID) throws Exception;
}
