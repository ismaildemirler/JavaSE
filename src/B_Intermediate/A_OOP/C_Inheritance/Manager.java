package B_Intermediate.A_OOP.C_Inheritance;

public class Manager extends Worker { // Subclass

	//We can add extra features particular to this class.
	private int countOfEmployees;
	
	/*
	 * Because this class inherits from Worker so we have to have a constructor in base class 
	 * and we have to send parameters to super class by using super keyword.
	 */
	public Manager(String name, int salary, String department, int countOfEmployees) {
		super(name, salary, department);
		
		this.countOfEmployees = countOfEmployees;
	} 
	
	/*
	 * We have all features of Worker Class in here.
	 * But also we can have methods in this class particularly.
	 */
	public void increaseSalariesOfEmployees(int amountOfIncrease) {
		System.out.println("Amount of increase : " + amountOfIncrease);
		System.out.println("****************************");	
	}
	
	/*
	 * We have extra information in Manager class comparing to Worker class.
	 * So we want to rearrange showInformations method according to this class because of that
	 * we want to print countOfEmployees information. 
	 * In order to do that we override the method in subclass like below. 
	 */
	public void showInformations() {
		
		/*
		 * First Way
		 */		
		System.out.println("Manager Name: " + getName());
		System.out.println("Manager Salary: " + getSalary());
		System.out.println("Manager Department: " + getDepartment());
		
		/*
		 * Second Way
		 */
		super.showInformations();
		
		System.out.println("Count of Employees: " + this.countOfEmployees);
		System.out.println("****************************");		
	}	
	
	public void rest() {
		
		/*
		 * When we use it like below, it will use the method which in super class even if the method is overridden.
		 */
		super.takeABreak(10);
		
		/*
		 * When we use it like below, it will use the method which in sub class if the method is overridden. 
		 * If the method is not overridden in subclass, the method in super class will be used.
		 * So the suggestion is we better use the method always as below.
		 */
		takeABreak(10);
	}
	
	public void takeABreak(int minutes) {
		System.out.println("Manager take a break for " + minutes +" minutes");
		System.out.println("****************************");	
	}
}
