package B_Intermediate.C_InterfacesAbstractAndInnerClasses.D_NestedClasses;

import B_Intermediate.C_InterfacesAbstractAndInnerClasses.D_NestedClasses.MemberTypeInnerClass.Factorial;

public class NestedClasses {
	
	/*
	 * Java Inner Classes (Nested Classes)
	 */
	
	/*
	 * Java inner class or nested class is a class that is declared inside the class or interface. 
	 * We use inner classes to logically group classes and interfaces in one place to be more readable and maintainable.
	 * Additionally, it can access all the members of the outer class, including private data members and methods.
	 * Sometimes users need to program a class in such a way so that no other class can access it. 
	 * Therefore, it would be better if you include it within other classes. 
	 * If all the class objects are a part of the outer object then it is easier 
	 * to nest that class inside the outer class. That way all the outer class can access 
	 * all the objects of the inner class.
	 */
	
	/*
	 * There are two types of nested classes non-static and static nested classes. 
	 * The non-static nested classes are also known as inner classes.
	   - Non-static nested class (inner class) (This does not have implementation because this has several kinds belong to itself. Good example of usage of abstract classes)
		     1) Member inner class
		     2) Anonymous inner class
		     3) Local inner class
       - Static nested class
	 * An inner class is a part of a nested class. Non-static nested classes are known as inner classes.
	 */
	
	/*
	 * Member Inner Class: A class created within class and outside method.
	 * Anonymous Inner Class: A class created for implementing an interface or extending class. 
	                          The java compiler decides its name. 
     * Local Inner Class: A class was created within the method.
     * Static Nested Class: A static class was created within the class.
     * Nested Interface: An interface created within class or interface.
	 */
	
	/*
	 * There are three advantages of inner classes in Java. They are as follows:
	   - Nested classes represent a particular type of relationship that is 
	     it can access all the members (data members and methods) of the outer class, including private.
	   - Nested classes are used to develop more readable and maintainable code 
	     because it logically group classes and interfaces in one place only.
	   - Code Optimization: It requires less code to write.
	 */
	
	public void memberTypeInnerClass() {
		
		/*
		 * A non-static class that is created inside a class but outside a method is called member inner class. 
		 * It is also known as a regular inner class. It can be declared with access modifiers like public, default, private, and protected.
		 */
		
		/*
		 * We can create instance and access of the properties of member type inner classes like below:
		 */
		
		MemberTypeInnerClass memberTypeInnerClass = new MemberTypeInnerClass();
		
		MemberTypeInnerClass.Factorial factorialInnerClass = memberTypeInnerClass.new Factorial();
		MemberTypeInnerClass.PrimeNumbers primeNumbersInnerClass = memberTypeInnerClass.new PrimeNumbers();
		MemberTypeInnerClass.Area areaInnerClass = memberTypeInnerClass.new Area();
		
		factorialInnerClass.calculateFactorial(5);
		primeNumbersInnerClass.isNumberPrimeOrNot(13);
		areaInnerClass.areaOfCircle(5);
		
		System.out.println("********************************************");
	}
	
	public void anonymousTypeInnerClass() {
		
		/*
		 * Java anonymous inner class is an inner class without a name and for which only a single object is created. 
		 * An anonymous inner class can be useful when making an instance of an object with certain "extras" 
		 * such as overloading methods of a class or interface, without having to actually subclass a class. 
		 * In simple words, a class that has no name is known as an anonymous inner class in Java. 
		 * It should be used if you have to override a method of class or interface. 
		 * 
		 * Java Anonymous inner class can be created in two ways:
	       1) Interface
	       2) Class (may be abstract or concrete).
		 */
		
		/*
		 * 1)
		 * In below example, anonymous class was created from interface
		 * We can create instance and access of the properties of anonymous 
		 * type inner classes which was created from interface like below:
		 */
		
		AnonymousTypeInnerClass anonymousTypeInnerClass = new AnonymousTypeInnerClass();
		anonymousTypeInnerClass.insertItem();
		anonymousTypeInnerClass.updateItem();
		anonymousTypeInnerClass.deleteItem();		
		
		System.out.println("********************************************");
		
		
		/*
		 * 2)
		 * In below example, anonymous class was created from abstract class
		 * We can create instance and access of the properties of anonymous 
		 * type inner classes which was created from abstract class like below:
		 */
		
		anonymousTypeInnerClass.validateUserName("ismail");;
		anonymousTypeInnerClass.validateAge(15);		
		
		System.out.println("********************************************");
	}

	public void localTypeInnerClass() {
		
		/*
		 * A class i.e., created inside a method, is called local inner class in java. 
		 * Local Inner Classes are the inner classes that are defined inside a block. 
		 * Generally, this block is a method body. Sometimes this block can be a for loop, or an if clause. 
		 * Local Inner classes are not a member of any enclosing classes. 
		 * They belong to the block they are defined within, due to which local inner classes cannot 
		 * have any access modifiers associated with them. However, they can be marked as final or abstract. 
		 * These classes have access to the fields of the class enclosing it.
		 * 
		 * If you want to invoke the methods of the local inner class, you must instantiate this class inside the method.
		 */
		
		/*
		 * Rule: Local variables can't be private, public, or protected.
		 * Rule: Local inner class cannot be invoked from outside the method.
		 * Rule: Local inner class cannot access non-final local variable till JDK 1.7. 
	 	         Since JDK 1.8, it is possible to access the non-final local variable in the local inner class.
		 */
		
		/*
		 * We can create instance and access of the properties of local type inner classes like below:
		 */
		
		LocalTypeInnerClass localTypeInnerClass = new LocalTypeInnerClass();
		LocalTypeInnerClass.User user = localTypeInnerClass.new User("Admin", "1234");
		localTypeInnerClass.login(user);
	}

	public void staticNestedClass() {
		
		/*
		 * A static class is a class that is created inside a class, is called a static nested class in Java. 
		 * It cannot access non-static data members and methods. It can be accessed by outer class name.
		 * It can access static data members of the outer class, including private. 
		 * The static nested class cannot access non-static (instance) data members or
		 */
		
		
	}
}
