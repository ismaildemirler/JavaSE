package B_Intermediate.A_OOP.C_Inheritance;

public class Worker { //Super Class or Base Class

	private String name;
	private int salary;
	private String department;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Worker(String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public void work() {
		System.out.println("Worker is working...");
		System.out.println("****************************");		
	}
	
	public void changeDepartment(String department) {
		System.out.println("Department is changing...");
		this.department = department;
		System.out.println("Department has changed. New department : " + this.department);
		System.out.println("****************************");	
	}
	
	public void takeABreak(int minutes) {
		System.out.println("Worker take a break for " + minutes +" minutes");
		System.out.println("****************************");	
	}
	
	public void showInformations() {
		System.out.println("Worker Name: " + name);
		System.out.println("Worker Salary: " + salary);
		System.out.println("Worker Department: " + department);
		System.out.println("****************************");		
	}
}
