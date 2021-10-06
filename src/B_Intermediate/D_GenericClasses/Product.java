package B_Intermediate.D_GenericClasses;

public class Product implements Model {
	
	private String name;
	private String code;
	private double price;
	
	public Product(String name, String code, double price) {
		this.name = name;
		this.code = code;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", code=" + code + ", price=" + price + "]";
	}
}
