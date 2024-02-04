package com.ibm.repo;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ibm.factory.MySessionFactory;
import com.ibm.model.Customer;

public class CustomerRepoImpl implements CustomerRepository {
	private SessionFactory sessionFactory = null;
	private Session session = null;
	{
		try {
			sessionFactory = MySessionFactory.getSessionFactory();
			session = sessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public Customer insertOneCustomer(Customer cus) throws Exception {
		try {
			session = sessionFactory.openSession();
			session.getTransaction().begin();
			session.persist(cus);
			session.getTransaction().commit();
			return cus;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<Customer> getAllCustomers() throws Exception {
		Session session = sessionFactory.openSession();
		TypedQuery<Customer> query = session.createQuery("FROM Customer c",Customer.class);
		return query.getResultList();
	}
	@Override
	public Customer findCustomerById(String cusID) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
