package B_Intermediate.C_InterfacesAbstractAndInnerClasses.D_FinalKeyword;

public class _FinalKeyword extends DatabaseOperations{

	/*
	 * Final Keyword in Java
	 */
	
	/*
	 * The final keyword in java is used to restrict the user. 
	 * The java final keyword can be used in many context. Final can be:
       1) variable
       2) method
       3) class
       
     * The final keyword can be applied with the variables, 
     * a final variable that have no value it is called blank final variable 
     * or uninitialized final variable. It can be initialized in the constructor only. 
     * The blank final variable can be static also which will be initialized in the static block only. 
     * We will have detailed learning of these. Let's first learn the basics of final keyword.
     * 
     * Can we declare a constructor final?
	   No, because constructor is never inherited.
	 */
	
	/*
	   1) Java Final Variable
 	      If you make any variable as final, you cannot change the value of final variable(It will be constant).
	   2) Java Final Method
	      If you make any method as final, you cannot override it.
	   3) Java Final Class
	      If you make any class as final, you cannot extend it.
	 */
	
	/*
	 * We can assign value to final variable by the time variable is created
	 */
	private final int NUMBER = 3;
	
	/*
	 * Or we can leave final variable uninitialized once it is created and give value
	 * in the constructor.
	 */
	private final int COUNT;

	public _FinalKeyword() {
		//NUMBER = 5; //compile-time error.
		super("");
		COUNT = 0;
	}
	
	public void finalVariables() {
		
		/*
		 * Java Final Variable
		 */
		
		/*
		 * If you make any variable as final, 
		 * you cannot change the value of final variable(It will be constant).
		 */
		
		DatabaseOperations example1 = new DatabaseOperations("Object1");
		DatabaseOperations example2 = new DatabaseOperations("Object2");
		
		/*
		 * Can we initialize blank final variable?
		 * Yes, but only in constructor. 
		 * For example:
		 */
		System.out.println("Number of object1: " + example1.NUMBER_OF_OBJECT);
		System.out.println("Number of object2: " + example2.NUMBER_OF_OBJECT);
		System.out.println("*********************************************");
		
		//example1.NUMBER_OF_OBJECT = 15; //Compile-time error. Because of variable is final we can not change
		
		/*
		 * static blank final variable 
		 * A static final variable that is not initialized at the time of declaration 
		 * is known as static blank final variable. It can be initialized only in static block.
		 * For example:
		 */
		System.out.println("URL of Database: " + DatabaseOperations.DATABASE_URL);
		
		
		/*
		 * Like below, We can use static and final together for variables 
		 * which we want it can not be changed and belong to class than object of class.
		 */
		
		System.out.println("Database Name: " + DatabaseOperations.DATABASE_NAME);
		System.out.println("Username: " + DatabaseOperations.USER_NAME);
		System.out.println("Password: " + DatabaseOperations.PASSWORD);
		System.out.println("*********************************************");
	}

	public void finalMethods() {
		
		/*
		 * Java Final Method
		 */
		
		/*
		 * If you make any method as final, you cannot override it.
		 */
		
		/*
		 * If we don't want our parameters can be changed then we need to write final keyword
		 * in front of the parameters. For example we don't want the connection string changed
		 * so in connect method we define method like 'connect(final String connectionString)'
		 */
		
		DatabaseOperations databaseOperations1 = new DatabaseOperations("test");
		databaseOperations1.connect("exampleconnectionstring");
		System.out.println("*****************************");
		
		/*
		 * Is final method inherited?
		   Yes, final method is inherited but you cannot override it.
		 */
		DatabaseOperations databaseOperations2 = new DatabaseOperations("test");
		databaseOperations2.save();
	}
}
