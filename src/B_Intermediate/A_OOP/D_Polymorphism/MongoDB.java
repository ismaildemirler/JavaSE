package B_Intermediate.A_OOP.D_Polymorphism;

public class MongoDB extends Database{

	public MongoDB(String name) {
		super(name);
	}

	@Override
	public String connect() {
		return "Connecting to " + this.getName() + " database in MongoDB class...";	
	}
}
