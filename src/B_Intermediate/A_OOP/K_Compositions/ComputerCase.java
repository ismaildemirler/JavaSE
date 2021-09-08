package B_Intermediate.A_OOP.K_Compositions;

public class ComputerCase {
	
	private String model;
	private String producer;
	private String matter;
	
	public ComputerCase(String model, String producer, String matter) {
		super();
		this.model = model;
		this.producer = producer;
		this.matter = matter;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}
	
	public void openComputer() {
		System.out.println("Computer is opening");
		System.out.println("*******************");
	}
}
