package B_Intermediate.A_OOP.E_Abstraction.AbstractClasses;

public abstract class Academician extends Worker {

	private String department;
	private String duty;
	private String courses;

	public Academician(String name, String email, String phone, String department, String duty, String courses) {
		super(name, email, phone);
		this.department = department;
		this.duty = duty;
		this.courses = courses;
	}

	public abstract void lecture();
	
	@Override
	public void showInfos() {
		super.showInfos();
		System.out.println("Department :" + getDepartment());
		System.out.println("Duty :" + getDuty());
		System.out.println("Courses :" + getCourses());
	}

	public String getDepartment() {
		return department;
	}

	public String getDuty() {
		return duty;
	}
	
	public String getCourses() {
		return courses;
	}
}
