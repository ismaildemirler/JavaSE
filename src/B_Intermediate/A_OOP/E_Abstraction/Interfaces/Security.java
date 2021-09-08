package B_Intermediate.A_OOP.E_Abstraction.Interfaces;

public class Security implements IWorker, IOfficer {

	private String name;
	private String phone;
	private String email;
	private String department;
	private String shift;
	private String document;

	public Security(String name, String phone, String email, String department, String shift, String document) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.department = department;
		this.shift = shift;
		this.document = document;
	}

	public void watch() {
		System.out.println("Security officer has kept watch!");
	}

	@Override
	public void work() {
		System.out.println("Security officer has worked!");
	}

	@Override
	public void enter() {
		System.out.println("Security officer has entered the building!");
	}

	@Override
	public void exit() {
		System.out.println("Security officer has left the building!");
	}

	@Override
	public void eat() {
		System.out.println("Security officer has taken break for eating!");
	}

	@Override
	public void showInfos() {
		System.out.println("Security Officer Name :" + getName());
		System.out.println("Security Officer Email :" + getEmail());
		System.out.println("Security Officer Phone :" + getPhone());
		System.out.println("Security Officer Department :" + getDepartment());
		System.out.println("Security Officer Shift :" + getShift());
		System.out.println("Security Officer Document :" + getDocument());
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

	public String getDepartment() {
		return department;
	}

	public String getShift() {
		return shift;
	}

	public String getDocument() {
		return document;
	}
}
