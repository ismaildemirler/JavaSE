package B_Intermediate.D_GenericClasses;

public class Customer implements Model{

	private String name;
	private String email;
	private String phone;
	private int age;
	
	public Customer(String name, String email, String phone, int age) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age + "]";
	}
}
