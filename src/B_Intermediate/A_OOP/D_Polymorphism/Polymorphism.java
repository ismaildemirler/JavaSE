package B_Intermediate.A_OOP.D_Polymorphism;

public class Polymorphism {

	/*
	 * Polymorphism in Java
	 */
	
	/*
	 * Polymorphism is considered one of the important features of Object-Oriented Programming.
	 * For example in real life, A person at the same time can have different characteristic. 
	 * Like a man at the same time is a father, a husband, an employee. So the same person poses 
	 * different behavior in different situations. This is called polymorphism.
	 * Polymorphism allows us to perform a single action in different ways. 
	 * In other words, polymorphism allows you to define one interface and have multiple implementations.
	 */
	
	/*
	 * In Java polymorphism is mainly divided into two types:
		- Compile time Polymorphism
		- Runtime Polymorphism
		
		Compile-time polymorphism: It is also known as static polymorphism. 
			This type of polymorphism is achieved by function overloading or operator overloading. 
			But Java doesn’t support the Operator Overloading.
		
			Method Overloading: When there are multiple functions with same name but different parameters 
			then these functions are said to be overloaded. Functions can be overloaded by change in number 
			of arguments or/and change in type of arguments.
		
		Runtime polymorphism: It is also known as Dynamic Method Dispatch. It is a process in which a function call 
			to the overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding.

			Method overriding, on the other hand, occurs when a derived class has a definition for one of the member 
			functions of the base class. That base function is said to be overridden.
	 */
	
	public void runtimePolymorphismExample() {
		
		/*
		 * Runtime Polymorphism Example 
		 */
		
		/*
		 * We can create an instance of super class.
		 * And when we call the connect method in super class
		 * Connect method which is in super class print the result.
		 */
		Database database1 = new Database("MSSQL v.2.3.1");
		String connectionResult1 = database1.connect();
		System.out.println(connectionResult1);

		System.out.println("**************************");
		
		/*
		 * But we can also set instance reference of subclasses to super class
		 * Because There is IS-A relationship between subclasses and super class.
		 * So MongoDB is a database.
		 * If we do so we will see that the result of MongoDB connect method will be printed. 
		 */
		Database database2 = new MongoDB("MongoDB v2.3.4");
		String connectionResult2 = database2.connect();
		System.out.println(connectionResult2);

		System.out.println("**************************");
		
		/*
		 * We can set instance reference of subclasses to super class
		 * Because There is IS-A relationship between subclasses and super class.
		 * So PostgreSQL is a database also.
		 * If we do so we will see that the result of PostgreSQL connect method will be printed. 
		 */
		Database database3 = new PostgreSQL("PostgreSQL v1.5.2");
		String connectionResult3 = database3.connect();
		System.out.println(connectionResult3);

		System.out.println("**************************");
		
		/*
		 * If we don't have overridden the method which is in super class in subclass,
		 * Then the method which is in super class will be called.
		 */
		Database database4 = new MySQL("MySQL v3.6.3");
		String connectionResult4 = database4.connect();
		System.out.println(connectionResult4);
		
		System.out.println("**************************");
		
		
	    /*
	     * In above, Database object acts multiple roles. 
	     * Database object behaves like MongoDB object, PostgreSQL object and also MySQL object as multiple form.
	     * This is polymorphism.
	     */
		
		/*
		 * Also we can send subclasses instances as a parameter to other methods easily.
		 * For example 'makeDBConnected' method waits our super class as parameter and we send one of the subclasses which we want.
		 * 'makeDBConnected' method will accept this because of IS-A relationship.
		 * So if we want to use another database technology, we will not have to change 'makeDBConnected'.
		 * This provide us to protect 'SOLID' principles which we will cover later.
		 */
		makeDBConnected(new MongoDB("MongoDB v2.3.3"));		
		makeDBConnected(new PostgreSQL("PostgreSQL v1.5.4"));
	}

	public void instanceofKeyword() {
		
		/*
		 * instanceof Keyword in Java
		 */
		
		/*
		 * We can control subclass object is instance of the super class object or not by using instanceof keyword.
		 * And also we can control super class instance is which subclass instance actually.
		 */
		MongoDB mongoDatabase = new MongoDB("MongoDB v1.0.0");
		if (mongoDatabase instanceof MongoDB) {
			System.out.println("This is instance of MongoDB");
			System.out.println("**************************");
		}
		
		/*
		 * We can see that mongoDB instance is instance of Database
		 */
		if (mongoDatabase instanceof Database) {
			System.out.println("This is instance of Database");
			System.out.println("**************************");
		}
		
		/*
		 * In base, every class extends from Object Class in Java.
		 * Our Database class extends from Object Class.
		 * Also our MongoDB, PostgreSQL and MySQL classes extends from Object Class.
		 * So if our 'makeDBConnectedWithObjectClass' waits Object class as parameter and 
		 * we send our classes, 'makeDBConnectedWithObjectClass' method will accept this.
		 * Because all classes in java extends from Object class. And inside of the 'makeDBConnectedWithObjectClass' method
		 * we have to specify which subclass we are working on by using if-else. 
		 * If we have 100 clases, we have to control instance 100 times. So this is bad.
		 * We can see advantages of polymorphism in this example. 
		 */
		Database database = new Database("MSSQL v2.3.4");
		PostgreSQL postgreSQL = new PostgreSQL("PostgreSQL v1.2.3");
		MongoDB mongoDB = new MongoDB("MongoDB v1.2.5");
		MySQL mySql = new MySQL("MySQL v1.2.6");
		
		makeDBConnectedWithObjectClass(database);
		makeDBConnectedWithObjectClass(mongoDB);
		makeDBConnectedWithObjectClass(postgreSQL);
		makeDBConnectedWithObjectClass(mySql);
	}
	
	//By using polymorphism. It is good use case.
	private void makeDBConnected(Database database) {
		String connectionResult = database.connect();
		System.out.println(connectionResult);
		System.out.println("**************************");
	}

	//Not using polymorphism. It is bad use case.
	private void makeDBConnectedWithObjectClass(Object object) {
		if (object instanceof PostgreSQL) {
			PostgreSQL postgreSQL = (PostgreSQL) object;
			System.out.println(postgreSQL.connect());
			System.out.println("**************************");
			
		} else if (object instanceof MongoDB) {
			MongoDB mongoDB = (MongoDB) object;
			System.out.println(mongoDB.connect());
			System.out.println("**************************");
			
		} else if (object instanceof MySQL) {
			MySQL mySql = (MySQL) object;
			System.out.println(mySql.connect());
			System.out.println("**************************");
			
		} else if (object instanceof Database) {
			Database database = (Database) object;
			System.out.println(database.connect());
			System.out.println("**************************");
		}
	}
}
