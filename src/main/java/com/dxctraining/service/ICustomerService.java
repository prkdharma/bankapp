package com.dxctraining.service;

import com.dxctraining.entities.*;

import java.util.List;


public interface ICustomerService {
	
	Customer findById(int id);

	List<Customer> findAll();

	Customer updateName(int id, String newName);

	void add(Customer customer);

	Customer update(Customer customer);

	void delete(int id);

}
