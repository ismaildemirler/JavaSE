package B_Intermediate.A_OOP.E_Abstraction.Interfaces;

public class Lecturer implements IWorker, IAcademician{

	private String name;
	private String phone;
	private String email;
	private String department;
	private String duty;
	private String courses;
	private String title;
	
	public Lecturer(String name, String phone, String email, String department, String duty, String courses,
			String title) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.department = department;
		this.duty = duty;
		this.courses = courses;
		this.title = title;
	}
	
	public void attendMeeting() {
		System.out.println("Asistant has attended the meeting!");
	}
	
	public void assesExam() {
		System.out.println("Lecturer has assessed the exam!");
	}
	
	@Override
	public void lecture() {
		System.out.println("Lecturer has lectured the course!");
	}

	@Override
	public void enter() {
		System.out.println("Lecturer has entered the building!");
	}

	@Override
	public void exit() {
		System.out.println("Lecturer has left the building!");
	}

	@Override
	public void eat() {
		System.out.println("Lecturer has taken break for eating!");
	}

	@Override
	public void showInfos() {
		System.out.println("Lecturer Name :" + getName());
		System.out.println("Lecturer Email :" + getEmail());
		System.out.println("Lecturer Phone :" + getPhone());
		System.out.println("Lecturer Department :" + getDepartment());
		System.out.println("Lecturer Duty :" + getDuty());
		System.out.println("Lecturer Courses :" + getCourses());
		System.out.println("Lecturer Title :" + getTitle());
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

	public String getTitle() {
		return title;
	}
}
