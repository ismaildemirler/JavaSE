package B_Intermediate.GenericClasses;

public class ProductService extends ManagerService{

	private Product product;
	
	public ProductService(Product product) {
		this.product = product;
	}

	@Override
	public Product modify() {
		product.setPrice(101.5);
		System.out.println("Product price has been changed!");
		return product;
	}
}
