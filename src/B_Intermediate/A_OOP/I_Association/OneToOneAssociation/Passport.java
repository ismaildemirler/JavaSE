package B_Intermediate.A_OOP.I_Association.OneToOneAssociation;

public class Passport extends Person{

	private String personName;
	
	public Passport(String name, Long id) {
		super(name, id);
		this.personName = name;
	}
}
