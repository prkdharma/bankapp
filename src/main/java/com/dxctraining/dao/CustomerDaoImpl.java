package com.dxctraining.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dxctraining.entities.*;


import com.dxctraining.exceptions.*;

public  class CustomerDaoImpl implements ICustomerDao {	
	private Map<Integer,Customer> store = new HashMap<>();
	
	private int generateId;
	
	private int generateId(){
		generateId++;
		return generateId;
	}
	
	@Override 
	public Customer findById(int id) {
		Customer customer = store.get(id);
		if(customer==null){
			throw new CustomerNotFoundException("Customer Not Found Exception for id = "+id);
		}
		return customer;
		
	}
	

	@Override
	public List <Customer> findAll(){
		Collection <Customer> values= store.values();
		List <Customer> list=new ArrayList<>();
		for(Customer value:values) {
			list.add(value);
		}
		return list;
	}
	
	@Override
	public void add(Customer customer){
	int id=generateId();
	store.put(id,customer);
	customer.setId(id);
	}
	
	@Override
	public Customer updateName(int id,String newName){
		Customer customer=findById(id);
		customer.setName(newName);
		return customer;
	
	}

	@Override
	public Customer Update(Customer customer) {
		int id = customer.getId();
		store.put(id,customer);
		return customer;
	}

	@Override
	public void delete(int id) {
		
		store.remove(id);
	} 
	
}
	
