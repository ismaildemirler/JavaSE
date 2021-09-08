package B_Intermediate.A_OOP.E_Abstraction.AbstractClasses;

public abstract class Officer extends Worker{
	
	private String department;
	private String shift;
	
	public Officer(String name, String email, String phone, String department, String shift) {
		super(name, email, phone);
		this.department = department;
		this.shift = shift;
	}
	
	public abstract void work();
	
	@Override
	public void showInfos() {
		super.showInfos();
		System.out.println("Department :" + getDepartment());
		System.out.println("Shift :" + getShift());
	}

	public String getDepartment() {
		return department;
	}

	public String getShift() {
		return shift;
	}
}
