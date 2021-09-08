package B_Intermediate.A_OOP.E_Abstraction.AbstractClasses;

public class Informatic extends Officer{
	
	private String duty;

	public Informatic(String name, String email, String phone, String department, String shift, String duty) {
		super(name, email, phone, department, shift);
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
		super.showInfos();
		System.out.println("Duty :" + getDuty());
	}

	public String getDuty() {
		return duty;
	}
}
