package com.demo.service;

import java.util.List;

import com.demo.dto.CustomerDTO;
import com.demo.exception.InfyBankException;

public interface CustomerService {
	  // GET
	// display the list of records from db or else class
	public List<CustomerDTO> getAllCustomers() throws InfyBankException ;
	 //GET
	public CustomerDTO getCustomer(Integer customerId) throws InfyBankException;
//POST
	public Integer addCustomer(CustomerDTO customerDTO) throws InfyBankException;
}
