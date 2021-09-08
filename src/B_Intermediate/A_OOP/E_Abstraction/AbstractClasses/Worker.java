package B_Intermediate.A_OOP.E_Abstraction.AbstractClasses;

public abstract class Worker {
	
	private String name;
	private String phone;
	private String email;

	public Worker(String name, String phone, String email) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public abstract void enter();
	
	public abstract void exit();
	
	public abstract void eat();
	
	public void showInfos() {
		System.out.println("Name :" + getName());
		System.out.println("Email :" + getEmail());
		System.out.println("Phone :" + getPhone());
	}
	
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}
}
