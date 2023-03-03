package database;

import java.util.ArrayList;

import model.Customer;

public class CustomerService {
	private CustomerDatabase customerDatabase ;

	public CustomerService(CustomerDatabase customerDatabase) {
		// TODO Auto-generated constructor stub
		this.customerDatabase = customerDatabase;
	}
	public ArrayList<Customer> getAllCustomers() throws Exception
	{
		if(customerDatabase.getAllCustomers().size() == 0)
			throw new Exception("No customers registered yet");

		return this.customerDatabase.getAllCustomers();
	}
	public boolean registerCustomer(Customer customer) throws Exception
	{
		if(customer.getEmail() == null || customer.getEmail().isEmpty())
			throw new Exception("email cannot be empty or null");
		try {
			customerDatabase.insertCustomer(customer);

		} catch (Exception e) {
			// lint errors
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public Customer getCustomerByEmail(String email) throws Exception
	{
		if(email==null || email.isEmpty())
			throw new Exception("email cannot be empty or null");
		Customer cust = this.customerDatabase.getCustomerByEmail(email);
		if(cust == null)
			throw new Exception("Customer with email "+email+" does not exist");
		return cust;
	}

	public boolean validateCredentials(String email, String password) throws Exception
	{
		if(email==null || email.isEmpty())
			throw new Exception("email cannot be empty or null");
		
		return this.customerDatabase.login(email, password);
	}
	//Profile
	public Customer getCustomer(String email, String pass) throws Exception {
		if(email==null || email.isEmpty())
			throw new Exception("email cannot be empty or null");
		Customer cust = this.customerDatabase.getCustomerByEmail(email);
		if(cust == null)
			throw new Exception("Customer with email "+email+" does not exist");
		return cust;
		//return null;
	}
	//change password
	public void changePass(String email,String newpass) throws Exception {
		customerDatabase.changePass(email, newpass);
	}
	
	//Update Profile
	//Update name
	public void updateName(String email, String newName) throws Exception {
		customerDatabase.updateName(email, newName);
	}
	
	//Update PhoneNo.
	public void updatePhoneNo(String email,String newPhone) throws Exception {
		customerDatabase.updatePhoneNo(email,newPhone);
	}
	//Upadate City
	public void updateCity(String email, String newCity) throws Exception {
		customerDatabase.updateCity(email,newCity);
	}
}
