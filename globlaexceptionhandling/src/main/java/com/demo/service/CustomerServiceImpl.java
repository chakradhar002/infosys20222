package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.CustomerDTO;
import com.demo.entity.Address;
import com.demo.entity.Customer;
import com.demo.exception.InfyBankException;
import com.demo.repository.CustomerRepository;

@Service(value = "customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<CustomerDTO> getAllCustomers() throws InfyBankException {
		// send the list of records to the client
		List<CustomerDTO> customers2 = new ArrayList<>();

		// this line interact with db fetch all record -select * from tablename
		Iterable<Customer> listofcustomersfromdb = customerRepository.findAll();

		listofcustomersfromdb.forEach(custo -> {

			CustomerDTO cust = new CustomerDTO();

			cust.setCustomerId(custo.getCustomerId());
			cust.setDateOfBirth(custo.getDateOfBirth());
			cust.setEmailId(custo.getEmailId());
			cust.setName(custo.getName());

			customers2.add(cust); // adding to the list and this list will return to controller clas
		});

		if (customers2.isEmpty())
			throw new InfyBankException("Service.CUSTOMERS_NOT_FOUND");
		return customers2;

	}

	@Override
	public CustomerDTO getCustomer(Integer customerId) throws InfyBankException {
		Optional<Customer> optional = customerRepository.findById(customerId);
		Customer customer = optional.orElseThrow(() -> new InfyBankException("Service.CUSTOMER_NOT_FOUND"));
		CustomerDTO customer2 = new CustomerDTO();
		customer2.setCustomerId(customer.getCustomerId());
		customer2.setDateOfBirth(customer.getDateOfBirth());
		customer2.setEmailId(customer.getEmailId());
		customer2.setName(customer.getName());
		return customer2;
	}

	@Override
	public Integer addCustomer(CustomerDTO customerDTO) throws InfyBankException {
		Customer customer = new Customer();// this is entity customer object
		// customerDTO.getEmailId() this part is coming postman
		// and setting into customer which is nothing but entity class which create
		// colums in db
		// UI
		customer.setDateOfBirth(customerDTO.getDateOfBirth());
		customer.setEmailId(customerDTO.getEmailId());
		customer.setName(customerDTO.getName());
		customer.setCustomerId(customerDTO.getCustomerId());

		// doing for address

		Address address = new Address();

		address.setStreet(customerDTO.getAddressDTO().getStreet());
		address.setStreet(customerDTO.getAddressDTO().getStreet());
		address.setCity(customerDTO.getAddressDTO().getCity());

		customer.setAddress(address);/// this is used to associated customer s

		customerRepository.save(customer);

		return customer.getCustomerId();

	}

}
