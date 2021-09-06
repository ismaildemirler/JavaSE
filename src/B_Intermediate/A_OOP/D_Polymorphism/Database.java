package B_Intermediate.A_OOP.D_Polymorphism;

public class Database {

	private String name;

	public Database(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String connect() {
		return "Connecting to " + this.getName() + " database in super class...";
	}
}
