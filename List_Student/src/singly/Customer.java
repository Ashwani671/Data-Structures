package singly;

public class Customer {
	private int id;
	private String Name;
	private String Address;
	private int Age;
	
	public Customer(int id, String name, String address, int age) {
		super();
		this.id = id;
		Name = name;
		Address = address;
		Age = age;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public int getAge() {
		return Age;
	}



	public void setAge(int age) {
		Age = age;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", Name=" + Name + ", Address=" + Address + ", Age=" + Age + "]";
	}
	
	
	
	
	

}
