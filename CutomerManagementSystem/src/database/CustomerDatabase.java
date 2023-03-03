package database;

import java.util.ArrayList;
import model.Customer;

public class CustomerDatabase {
	  ArrayList<Customer> customers = new ArrayList<>();
	
	public CustomerDatabase()
	{
		customers.add(new Customer("a@a.c","aa","Pune","1111111111","aa"));
		customers.add(new Customer("b@a.c","bb","Hyderabad","2222222222","bb"));
		customers.add(new Customer("c@a.c","cc","Pune","3333333333","cc"));
	}
	
	public ArrayList<Customer> getAllCustomers()
	{
		return this.customers;
	}
	
	public boolean insertCustomer(Customer customer) throws Exception
	{
		for(Customer cust:customers)
		{
			if(cust.getEmail().equals(customer.getEmail()))
				throw new Exception("Customer cannot be registered as email already exists");
		}
			
		customers.add(customer);
		return true;
	}
	public Customer getCustomerByEmail(String email)
	{
		Customer customer = null;
		
		for(Customer cust : customers)
		{
			if(cust.getEmail().equals(email))
			{
				customer = cust;
				break;
			}
		}
		return customer;
	}
	public boolean login(String email, String password)
	{
		for(Customer c : customers)
		{
			if(c.getEmail().equals(email))
			{
				if(c.getPassword().equals(password))
					return true;
			}
		}
		return false;
	}
	//Change Password
	public void changePass(String email,String newpass)throws Exception {
		for(Customer c : customers)
		{
			if(c.getEmail().equals(email))
			{
				c.setPassword(newpass);
				break;
			}
			else {
				throw new Exception("Password can't be updated as this customer doesn't exists");
			}
		}
	}
	//Update  PassWord
	public  void updateName(String email, String newName)throws Exception {
		for(Customer c : customers)
		{
			if(c.getEmail().equals(email))
			{
				c.setCustoname(newName);
				break;
			}
			else {
				throw new Exception("name can't be updated as this customer doesn't exists");
			}
		}
	}
    //Update Phone number
	public void updatePhoneNo(String email, String newPhone) throws Exception {
		// TODO Auto-generated method stub
		for(Customer c : customers)
		{
			if(c.getEmail().equals(email))
			{
				c.setPhone(newPhone);
				break;
			}
			else {
				throw new Exception("Phone Number can't be updated as this customer doesn't exists");
			}
		}
	}
    //Update city
	public void updateCity(String email, String newCity) throws Exception {
		// TODO Auto-generated method stub
		for(Customer c : customers)
		{
			if(c.getEmail().equals(email))
			{
				c.setCity(newCity);
				break;
			}
			else {
				throw new Exception("City can't be updated as this customer doesn't exists");
			}
		}
		
	}

}
