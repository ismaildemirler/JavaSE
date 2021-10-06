package B_Intermediate.GenericClasses;

public class CustomerService extends ManagerService{

	private Customer customer;
	
	public CustomerService(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public Customer modify() {
		customer.setPhone("4242423423234");
		System.out.println("Customer phone has been changed!");
		return customer;
	}

}
