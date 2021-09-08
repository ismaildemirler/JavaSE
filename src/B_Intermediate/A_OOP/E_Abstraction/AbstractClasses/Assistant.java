package B_Intermediate.A_OOP.E_Abstraction.AbstractClasses;

public class Assistant extends Academician {

	private String master;

	public Assistant(String name, String email, String phone, String department, String duty, String courses, String master) {
		super(name, email, phone, department, duty, courses);
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
		super.showInfos();
		System.out.println("Master : " + getMaster());
	}

	public String getMaster() {
		return master;
	}
}
