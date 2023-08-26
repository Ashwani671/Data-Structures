package list;

public class Student {
	private int id;
	private String Name;
	private String Address;
	private int Age;
	private Course course;
	
	public Student(int id, String name, String address, int age) {
		super();
		this.id = id;
		Name = name;
		Address = address;
		Age = age;
		this.course = course;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Address=" + Address + ", Age=" + Age + ", course=" + course
				+ "]";
	}
	
	
	
	

}
