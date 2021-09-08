package B_Intermediate.A_OOP.E_Abstraction.AbstractClasses;

public class Lecturer extends Academician {

	private String title;

	public Lecturer(String name, String email, String phone, String department, String duty, String courses, String title) {
		super(name, email, phone, department, duty, courses);
		this.title = title;
	}

	public void attendMeeting() {
		System.out.println("Lecturer has attended the meeting!");
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
		super.showInfos();
		System.out.println("Title :" + getTitle());
	}

	public String getTitle() {
		return title;
	}
}
