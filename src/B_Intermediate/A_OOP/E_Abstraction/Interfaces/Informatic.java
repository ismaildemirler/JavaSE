package B_Intermediate.A_OOP.E_Abstraction.Interfaces;

public class Informatic implements IWorker, IOfficer {
	
	private String name;
	private String phone;
	private String email;
	private String department;
	private String shift;
	private String duty;
	
	public Informatic(String name, String phone, String email, String department, String shift, String duty) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.department = department;
		this.shift = shift;
		this.duty = duty;
	}

	public void scanComputers() {
		System.out.println("Informatic officer has made computers scanned!");
	}
	
	@Override
	public void work() {
		System.out.println("Informatic officer has worked!");
	}

	@Override
	public void enter() {
		System.out.println("Informatic officer has entered the building!");
	}

	@Override
	public void exit() {
		System.out.println("Informatic officer has left the building!");
	}

	@Override
	public void eat() {
		System.out.println("Informatic officer has taken break for eating!");
	}

	@Override
	public void showInfos() {
		System.out.println("Security Officer Name :" + getName());
		System.out.println("Security Officer Email :" + getEmail());
		System.out.println("Security Officer Phone :" + getPhone());
		System.out.println("Security Officer Department :" + getDepartment());
		System.out.println("Security Officer Shift :" + getShift());
		System.out.println("Security Officer Duty :" + getDuty());
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

	public String getDuty() {
		return duty;
	}
}
