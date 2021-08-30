package B_Intermediate.A_Properties;

public class UserApplication {
	
	public String name;
	public String surname;
	public String username;
	public int age;
	public String country;
	
	private int privateAge;
	
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("Age can not be under zero");
		}
		else {
			this.privateAge = age;
		}
	}
	
	public int getAge() {
		return this.privateAge;
	}
}
