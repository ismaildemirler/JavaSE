package B_Intermediate.C_InterfacesAbstractAndInnerClasses.A_Interfaces;

public class Person {

	private int age;
	private int startingDate;
	private String fullname;
	
	public Person(int age, int startingDate, String fullname) {
		this.age = age;
		this.startingDate = startingDate;
		this.fullname = fullname;
	}
	
	public int getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(int startingDate) {
		this.startingDate = startingDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
}
