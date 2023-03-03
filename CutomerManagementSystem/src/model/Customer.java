package model;
//pojo class

public class Customer {
	private String email;
	private String custoname;
	private String city;
	private String phone;
	private String password;
	
	public Customer() {
		
	}
	
	public Customer(String email, String custoname, String city, String phone, String password) {
		//super();
		this.email = email;
		this.custoname = custoname;
		this.city = city;
		this.phone = phone;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustoname() {
		return custoname;
	}
	public void setCustoname(String custoname) {
		this.custoname = custoname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return "Customer [email=" + email + ", custoname=" + custoname + ", city=" + city + ", phone=" + phone
				+ ", password=" + password + "]";
	}
	
	
}
