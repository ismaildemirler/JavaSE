package B_Intermediate.A_OOP.E_Abstraction.Interfaces;

public class Assistant implements IWorker, IAcademician {

	private String name;
	private String phone;
	private String email;
	private String department;
	private String duty;
	private String courses;
	private String master;
	
	public Assistant(String name, String phone, String email, String department, String duty, String courses,
			String master) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.department = department;
		this.duty = duty;
		this.courses = courses;
		this.master = master;
	}
	
	public void assesQuiz() {
		System.out.println("Asistant has assessed the quiz!");
	}	

	@Override
	public void lecture() {
		System.out.println("Asistant has lectured the lab!");
	}

	@Override
	public void enter() {
		System.out.println("Asistant has entered the building!");
	}

	@Override
	public void exit() {
		System.out.println("Asistant has left the building!");		
	}

	@Override
	public void eat() {
		System.out.println("Asistant has taken break for eating!");
	}

	@Override
	public void showInfos() {
		System.out.println("Assistant Name :" + getName());
		System.out.println("Assistant Email :" + getEmail());
		System.out.println("Assistant Phone :" + getPhone());
		System.out.println("Assistant Department :" + getDepartment());
		System.out.println("Assistant Duty :" + getDuty());
		System.out.println("Assistant Courses :" + getCourses());
		System.out.println("Assistant Master :" + getMaster());
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

	public String getDuty() {
		return duty;
	}

	public String getCourses() {
		return courses;
	}

	public String getMaster() {
		return master;
	}
}
