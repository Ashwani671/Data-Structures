package list;

public class Customer {
	
	private String Name;
	private int Age;
	private String Address;
	private int id;
	
	public Customer(String name, int age, String address, int id) {
		super();
		Name = name;
		Age = age;
		Address = address;
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", Age=" + Age + ", Address=" + Address + ", id=" + id + "]";
	}
	
	

}
