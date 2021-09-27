package B_Intermediate.C_InterfacesAbstractAndInnerClasses.C_StaticKeyword;

public class Footballer {
	
	private String name;
	public static String coachName = "Pep Guardiola";
	
	public Footballer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
