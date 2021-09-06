package B_Intermediate.A_OOP.D_Polymorphism;

public class PostgreSQL extends Database{

	public PostgreSQL(String name) {
		super(name);
	}

	@Override
	public String connect() {
		return "Connecting to " + this.getName() + " database in PostgreSQL class...";	
	}
}
