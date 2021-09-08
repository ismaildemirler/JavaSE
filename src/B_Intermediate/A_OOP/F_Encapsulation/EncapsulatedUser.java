package B_Intermediate.A_OOP.F_Encapsulation;

public class EncapsulatedUser {
	
	private String name;
	private String userName;
	private String password;
	private int age;
	private String city;
	private String readOnlyValue = "Read Only Initial Value";
	private String writeOnlyValue;
	
	public EncapsulatedUser(String name, String userName, String password, int age, String city) {
		this.userName = userName;
		this.password = password;
		
		if (age < 0) {
			System.out.println("Age can not be smaller than zero!");
		}
		else {
			this.age = age;
		}
		this.city = city;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getReadOnlyValue() {
		return this.readOnlyValue;
	}
	
	public void setReadOnlyValue(String readOnlyValue) {
		System.out.println("You can not set a value to this property!");
	}
	
	public void getWriteOnlyValue() {
		System.out.println("You can not get value of this property!");
	}
	
	public void setWriteOnlyValue(String writeOnlyValue) {
		this.writeOnlyValue = writeOnlyValue;
	}
}
