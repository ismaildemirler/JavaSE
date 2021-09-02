package B_Intermediate.B_Constructors;

public class Account {
	
	private String accountId;	
	private double balance;
	private String name;
	private String email;
	private String phoneNumber;
	
	/*
	 * Constructor method. Notice that constructor method has same name with the class. 
	 */
	public Account(){
		
		/*
		 * First way:
		 * If we want to assign default values to properties we can do it like below.
		   
		   this.accountId = "None";
		   this.balance = 0;
	       this.email = "None";
		   this.name = "None";
	       this.telephoneNumber = "None";
		 */
				
		/*
		 * Second way:
		 * We can call parameterized constructor method in this constructor like below.
		 */
		this("None", 0, "None", "None", "None");

		System.out.println("The constructor that i defined and it is parameterless contructor method.");
		
		System.out.println("********************************");
	}
	
	/*
	 * Also we can initialize some of the properties with given parameters and others can have default values.
	 */
	public Account(String name, String email, String telephoneNumber) {
		
		this("None", 0, name, email, telephoneNumber);
	}
	
	/*
	 * Also it is constructor method. We can overload our constructor methods.
	 */
	public Account(String accountId, double balance, String name, String email, String phoneNumber) {
		this.accountId = accountId;
		this.balance = balance;
		this.email = email;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void depositMoney(double amountOfMoney) {
		
		this.balance += amountOfMoney;		
		System.out.println("Current balance of your account : " + this.balance);
		
		System.out.println("********************************");
	}
	
	public void withdrawMoney(double amountOfMoney) {
		
		if (amountOfMoney > this.balance) {
			System.out.println("Your balance is not enough! Your balance is " +  this.balance + "$");
		}
		else {
			this.balance -= amountOfMoney;			
			System.out.println("Current balance of your account : " + this.balance + "$");
		}

		System.out.println("********************************");
	}
	
	public void showInformations() {

		System.out.println("Id of the account : " + this.accountId);
		System.out.println("Balance of the account : " + this.balance + "$");
		System.out.println("Name of the owner of the account : " + this.name);
		System.out.println("Email of the owner of the account : " + this.email);
		System.out.println("Phone number of the owner of the account : " + this.phoneNumber);
		System.out.println("********************************");
	}
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
