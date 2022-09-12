package com.jeanlima.springmvccrud.data;

import java.util.List;

import com.jeanlima.springmvccrud.model.Customer;



public interface CustomerDAO {

	public List<Customer> getCustomers();
	
}
