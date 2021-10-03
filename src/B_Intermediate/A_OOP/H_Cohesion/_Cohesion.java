package B_Intermediate.A_OOP.H_Cohesion;

import B_Intermediate.A_OOP.H_Cohesion.HighCohesiveExample.IDatabaseOperationsH;
import B_Intermediate.A_OOP.H_Cohesion.HighCohesiveExample.ILogOperations;
import B_Intermediate.A_OOP.H_Cohesion.HighCohesiveExample.Log4JLogging;
import B_Intermediate.A_OOP.H_Cohesion.HighCohesiveExample.LogBackLogging;
import B_Intermediate.A_OOP.H_Cohesion.HighCohesiveExample.MongoDBOperationsH;
import B_Intermediate.A_OOP.H_Cohesion.HighCohesiveExample.MySQLOperationsH;
import B_Intermediate.A_OOP.H_Cohesion.LowCohesiveExample.IDatabaseOperationsL;
import B_Intermediate.A_OOP.H_Cohesion.LowCohesiveExample.MongoDBOperationsL;
import B_Intermediate.A_OOP.H_Cohesion.LowCohesiveExample.MySQLOperationsL;

public class _Cohesion {

	/*
	 * Cohesion Subject
	 */
	
	/*
	 * In object oriented design, Cohesion is associated with that a class (or a method) nice to have a 
	 * well-focused single purpose. The well-focused class has high cohesion. The advantages of high 
	 * cohesion is that such classes are much easier to maintain (and less frequently changed) 
	 * than classes with low cohesion. Another benefit of high cohesion is that classes with 
	 * a well-focused purpose tend to be more reusable than other classes.
	 */
	
	/*
	 * For example, we have a class that manages connecting to database and makes transactions on database.
	 * If we would add some implementations that logs events to a file in same class. This would be an example 
	 * of low cohesive class. Because the class has multiple purpose which are logging to a file and managing
	 * database transactions. To make it high cohesive, we would have to create a class for logging and 
	 * another class for managing database transactions. 
	 */
	
	/*
	 * Difference between high cohesion and low cohesion:
       - High cohesion is when you have a class that does a well defined job. Low cohesion is when a class 
       	 does a lot of jobs that don�t have much in common.
       - High cohesion gives us better maintaining facility and Low cohesion results in monolithic classes 
         that are difficult to maintain, understand and reduces re-usability
	 */
	
	/*
	 * Low Cohesion Example:
	   A class that contains numerous methods that have not much in common is an example of low cohesion.
	   
	   class Utilities {
	   		public void displayMessage(String message) { ... }
	   		public boolean fileExists(String fileName) { ... }
	   		public String captureInput() { ... }
	   		public String[] getClassMethods(Object object) { ... }
	   }
	 */
	
	/*
	 * High Cohesion Example:
	   The degree of cohesion increases as the functionality of the class becomes more specific.
	   
	   class ObjectInformation {
	   		public String getObjectClassName(Object object) { ... }
	   		public String getObjectSuperClassName(Object object) { ... }
	   		public ArrayList<String> getObjectFields(Object object) { ... }
	   		public ArrayList<String> getObjectConstructors(Object object) { ... }
	   		public ArrayList<String> getObjectMethods(Object object) { ... }
	   }
	   
	   The class above contains methods that serve a common purpose. They all perform tasks directly 
	   related to Object Information.
	 */
	
	/*
	 * We should always aim at having a high level of cohesion, even if that means putting a single method 
	 * inside of a single class. If nothing else, we will at least be able to locate the method much easier later
	 * on down the road if our project becomes a monster. Cohesion is related with Single Responsibility Principle
	 * in SOLID Principles.
	 */
	
	public void lowCohesiveExample() {
		
		/*
		 * Below example is an example of low cohesive classes. 
		 * Because in IDatabaseOperations interface has multiple objectives which are
		 * managing database operations and writing logs to file.
		 */
		
		/*
		 * There are multiple disadvantages of low cohesion. One of them is that project will
		 * be not maintainable and not suitable with programming basic principles. 
		 * We can see an example below which has low cohesive classes.
		 */
		
		IDatabaseOperationsL databaseOperations1 = new MongoDBOperationsL();
		databaseOperations1.connect();
		databaseOperations1.testConnection();
		databaseOperations1.writeLogsToFile();
		
		System.out.println("**********************");
		
		IDatabaseOperationsL databaseOperations2 = new MySQLOperationsL();
		databaseOperations2.connect();
		databaseOperations2.testConnection();
		databaseOperations2.writeLogsToFile();
		
		/*
		 * We can see another one of disadvantages of low cohesion.
		 * We can create an interface and if the interface is low cohesive, 
		 * classes which is implemented from the interface will have unimplemented empty
		 * methods. Because all methods of interface must be implemented in child class.
		 */
		
		System.out.println("**********************");
	}

	public void highCohesiveExample() {
		
		/*
		 * Below example is an example of high cohesive classes. 
		 * All interfaces and classes have methods which serve one common objective.
		 * And this project which includes this type of classes and interfaces
		 * will be maintainable and support SOLID and similar principles.
		 */
		
		IDatabaseOperationsH databaseOperations1 = new MongoDBOperationsH();
		databaseOperations1.connect();
		databaseOperations1.testConnection();
		
		System.out.println("**********************");
		
		IDatabaseOperationsH databaseOperations2 = new MySQLOperationsH();
		databaseOperations2.connect();
		databaseOperations2.testConnection();
		
		System.out.println("**********************");
		
		ILogOperations logOperations1 = new LogBackLogging();
		logOperations1.writeLogs();

		System.out.println("**********************");

		ILogOperations logOperations2 = new Log4JLogging();
		logOperations2.writeLogs();

		System.out.println("**********************");
	}
}
