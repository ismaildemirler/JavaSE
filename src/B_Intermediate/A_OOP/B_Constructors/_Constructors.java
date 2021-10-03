package B_Intermediate.A_OOP.B_Constructors;

public class _Constructors {
	
	/*
	 * Constructors in Java
	 */
	
	/*
	 * A constructor in Java is a special method that is used to initialize objects. 
	 * The constructor is called when an object of a class is created. 
	 * It can be used to set initial values for object properties. Every class has default parameterless constructor. 
	 * But it is hidden. We can do it visible by writing parameterless constructor. But this is unnecessary.
	 * If we want to set initial values to class properties when class is created then we create constructor method with parameters.
	 */
	
	/*
	 * Note that the constructor name must match the class name, and it cannot have a return type (like void). 
	 * A Java constructor cannot be abstract, static, final, and synchronized
	 * A Java class can have multiple constructor methods by using method overloading.
	 * Also note that the constructor is called when the object is created. 
	 * All classes have constructors by default: if you do not create a class constructor yourself, 
	 * Java creates one for you. However, then you are not able to set initial values for object attributes.
	 */
	
	public void constructorExample() {
		
		/*
		 * First way:
		 * We can assign values to properties and get values of properties by using getter - setter methods like below.
		 */
		Account account1 = new Account();
		
		account1.setAccountId("123456");
		account1.setBalance(1000);
		account1.setEmail("abc@example.com");
		account1.setName("John");
		account1.setPhoneNumber("353534534353");
		
		account1.depositMoney(500);
		account1.withdrawMoney(700);
		account1.withdrawMoney(1000);
		account1.showInformations();
		
		/*
		 * Second way:
		 * We can assign values to properties by using constructor method like below.
		 */
		Account account2 = new Account("1234567", 1500, "def@example.com", "Jake", "3534534534");
		account2.depositMoney(1200);
		account2.withdrawMoney(300);
		account2.withdrawMoney(3000);
		account2.showInformations();
		
		/*
		 * When we call the parameterless constructor of the class we can assign default values inside of that constructor
		 */
		Account account3 = new Account();
		account3.showInformations();
		
		/*
		 * Again by using method overloading, some values can be sent for some of the properties and default values can be assigned 
		 * to properties which has not been sent any value for in that constructor like below.
		 */
		Account account4 = new Account("Tiffany", "tfn@example.com", "4234234234");
		account4.showInformations();
	}	
}
