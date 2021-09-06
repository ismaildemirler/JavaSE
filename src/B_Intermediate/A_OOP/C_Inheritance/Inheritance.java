package B_Intermediate.A_OOP.C_Inheritance;

public class Inheritance {
	
	/*
	 * Inheritance in Java
	 */
	
	/*
	 * Inheritance in Java is a concept that acquires the properties from one class to other classes; 
	 * for example, the relationship between father and son. In Java, a class can inherit attributes and methods from another class. 
	 * The class that inherits the properties is known as the sub-class or the child class. 
	 * The class from which the properties are inherited is known as the superclass or the parent class.
	 * 
	 * Inheritance is also known as the IS-A relationship. 
	 * Because for example we have a worker base class. Employee class inherits methods and properties of worker class.
	 * And also manager class inherits methods and properties of worker class. So manager IS-A worker also.
	 */
	
	/*
	 * Super Class: The class whose features are inherited is known as superclass (or a base class or a parent class).
	   Sub Class: The class that inherits the other class is known as a subclass (or a derived class, extended class, or child class). 
	   		The subclass can add its own fields and methods in addition to the superclass fields and methods.
	   Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class 
	   		that includes some of the code that we want, we can derive our new class from the existing class. 
	   		By doing this, we are reusing the fields and methods of the existing class.
	 */
	
	/*
	 * To be able to inherit from a class, "extends" keyword is used.
	 * How inheritance can be done:
	   class derived-class extends base-class  
	   {  
   			//methods and fields  
	   }  
	 */
	
	/*
	 * In Multiple inheritances, one class can have more than one superclass and inherit features from all parent classes. 
	 * Please note that Java does not support multiple inheritances with classes. 
	 * In java, we can achieve multiple inheritances only through Interfaces.
	 */
	
	/*
	 * Important facts about inheritance in Java:
			- Default superclass: Except Object class, which has no superclass, every class has one and only one direct superclass (single inheritance). 
					In the absence of any other explicit superclass, every class is implicitly a subclass of the Object class.
			- Superclass can only be one: A superclass can have any number of subclasses. But a subclass can have only one superclass. 
					This is because Java does not support multiple inheritances with classes. Although with interfaces, 
					multiple inheritances are supported by java.
			- Inheriting Constructors: A subclass inherits all the members (fields, methods, and nested classes) from its superclass. 
					Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass 
					can be invoked from the subclass.
			- Private member inheritance: A subclass does not inherit the private members of its parent class. 
					However, if the superclass has public or protected methods(like getters and setters) for accessing its private fields, 
					these can also be used by the subclass.
	 */
	
	public void inheritanceExample() {
		
		/*
		 * Because Manager class inherits from Worker class, 
		 * we can use all of the features of Worker class 
		 * when we create an instance of Manager class.
		 */
		Manager manager1 = new Manager("Mary", 5000, "Human Resources", 10);
		
		/*
		 * Because we override this method in subclass,
		 * method in super class has not been used,
		 * method in subclass has been used.
		 */
		manager1.showInformations();
		
		/*
		 * We can have particular methods which super class does not have in subclass
		 */
		manager1.increaseSalariesOfEmployees(1000);
		
		manager1.rest();
	}
}
