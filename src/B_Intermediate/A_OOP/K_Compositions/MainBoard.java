package B_Intermediate.A_OOP.K_Compositions;

public class MainBoard {

	private String model;
	private String producer;
	private int holesCount;
	private String operatingSystem;

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

	public int getHolesCount() {
		return holesCount;
	}

	public void setHolesCount(int holesCount) {
		this.holesCount = holesCount;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public MainBoard(String model, String producer, int holesCount, String operatingSystem) {
		this.model = model;
		this.producer = producer;
		this.holesCount = holesCount;
		this.operatingSystem = operatingSystem;
	}
	
	public void installOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
		System.out.println("New operating system " + operatingSystem +" is installed");
		System.out.println("******************************");
	}
}
