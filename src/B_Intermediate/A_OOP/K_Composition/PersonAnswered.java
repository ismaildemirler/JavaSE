package B_Intermediate.A_OOP.K_Composition;

public class PersonAnswered {
	
	private String name;
	private Option option;
	
	public PersonAnswered(String name, Option option) {
		this.name = name;
		this.option = option;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}
}
