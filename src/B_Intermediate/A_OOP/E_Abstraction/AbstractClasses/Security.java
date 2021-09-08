package B_Intermediate.A_OOP.E_Abstraction.AbstractClasses;

public class Security extends Officer {

	private String document;

	public Security(String name, String email, String phone, String department, String shift, String document) {
		super(name, email, phone, department, shift);
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
		super.showInfos();
		System.out.println("Document :" + getDocument());
	}

	public String getDocument() {
		return document;
	}
}
