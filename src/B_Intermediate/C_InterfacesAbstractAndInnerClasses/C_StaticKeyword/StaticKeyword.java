package B_Intermediate.C_InterfacesAbstractAndInnerClasses.C_StaticKeyword;

public class StaticKeyword {

	/*
	 * Static Keyword in Java
	 */
	
	/*
	 * The static keyword in Java is used for memory management mainly. 
	 * We can apply static keyword with variables, methods, blocks and nested classes. 
	 * The static keyword belongs to the class than an instance of the class.
	 * 
	 * The static can be:
	   - Variable (also known as a class variable)
	   - Method (also known as a class method)
	   - Block
	   - Nested class
	 */
	
	/*
	 * 1) Java static variable
	 * If you declare any variable as static, it is known as a static variable. 
	 * The static variable can be used to refer to the common property of all objects (which is not unique for each object), 
	 * for example, the company name of employees, college name of students, etc. 
	 * The static variable gets memory only once in the class area at the time of class loading.
	 * 
	 * Advantages of static variable
       - It makes your program memory efficient (i.e., it saves memory).
	 */
	
	/*
	 * class Student{  
     		int rollno;  
     		String name;  
     		String college="ITS";  
	   }  
	   
	 * Suppose there are 500 students in my college, now all instance 
	 * data members will get memory each time when the object is created. 
	 * All students have its unique rollno and name, so instance data member is good in such case. 
	 * Here, "college" refers to the common property of all objects. 
	 * If we make it static, this field will get the memory only once.
	 * Java static property is shared to all objects.
	 */
	
	/*
	 * 2) Java static method
	 * If you apply static keyword with any method, it is known as static method.
	 * A static method belongs to the class rather than the object of a class.
	 * A static method can be invoked without the need for creating an instance of a class.
	 * A static method can access static data member and can change the value of it.
	 * 
	 * Restrictions for the static method. 
	 * There are two main restrictions for the static method. They are:
	   - The static method can not use non static data member or call non-static method directly.
	   - this and super cannot be used in static context.
	 
	 * Key Points to Remember: 
	   - static methods in Java are resolved at compile time. 
	     Since method overriding is part of Runtime Polymorphism, so static methods can't be overridden
       - abstract methods can't be static
       - static methods cannot use this or super keywords
       - The following combinations of the instance, class methods and variables are valid:
             1) Instance methods can directly access both instance methods and instance variables
             2) Instance methods can also access static variables and static methods directly
             3) static methods can access all static variables and other static methods
             4) static methods cannot access instance variables and instance methods directly; 
                They need some object reference to do so.
	 */
	
	/*
	 * When to use static methods? 
       - When you have code that can be shared across all instances of the same class, put that portion of code into static method.
       - They are basically used to access static field(s) of the class.
       - Instance method vs Static method

       - Instance method can access the instance methods and instance variables directly.
       - Instance method can access static variables and static methods directly.
       - Static methods can access the static variables and static methods directly.
       - Static methods can’t access instance methods and instance variables directly. 
         They must use reference to object. And static method can’t use this keyword as there is no instance for ‘this’ to refer to.
	 */
	
	/*
	 * 3) Java static block 
	 * A static block is used for initializing static variables. 
	 * Although static variables can be initialized directly during declaration, 
	 * there are situations when we're required to do the multiline processing. 
	 * In such cases, static blocks come in handy. If static variables require additional, 
	 * multi-statement logic while initialization, then a static block can be used.
	 * 
	 * Key Points to Remember:
	   - A class can have multiple static blocks
	   - static fields and static blocks are resolved and executed in the same order as they are present in the class
	 */
	
	/*
	 * A static Class 
	 * Java programming language allows us to create a class within a class. 
	 * It provides a compelling way of grouping elements that are only going to be used in one place, 
	 * this helps to keep our code more organized and readable.
	 * 
	 * The nested class architecture is divided into two:
	   - nested classes that are declared static are called static nested classes whereas,
	   - nested classes that are non-static are called inner classes
     
     * The main difference between these two is that the inner classes 
     * have access to all member of the enclosing class (including private), 
     * whereas the static nested classes only have access to static members of the outer class.
     * In fact, static nested classes behaved exactly like any other top-level class 
     * but enclosed in the only class which will access it, to provide better packaging convenience.
     * 
     * Key Points to Remember
       - static nested classes do not have access to any instance members of the enclosing outer class; 
         it can only access them through an object's reference
       - static nested classes can access all static members of the enclosing class, including private ones
       - Java programming specification doesn't allow us to declare the top-level class as static; 
         only classes within the classes (nested classes) can be made as static
	 */
	
	public void staticVariable() {
		
		Footballer footballer1 = new Footballer("Cristiano Ronaldo");
		Footballer footballer2 = new Footballer("Lionel Messi");
		Footballer footballer3 = new Footballer("Kylian Mbappe");
		
		FootballerService service1 = new FootballerService(footballer1);
		service1.enterThePitch();
		service1.findOutCoachName();
		System.out.println("Count of footballers in the pitch: " + FootballerService.footballerCountInThePitch);
		System.out.println("******************************************");
		
		/*
		 * We can see that the footballer count increases even though we create new instance.
		 * This shows us static variable belongs to class than object instance. 
		 */
		FootballerService service2 = new FootballerService(footballer2);
		service2.enterThePitch();
		service2.findOutCoachName();
		System.out.println("Count of footballers in the pitch: " + FootballerService.footballerCountInThePitch);
		System.out.println("******************************************");
		
		/*
		 * We are changing name of coach by using service2 instance.
		 * But in below example, we can see that coach name is updated for service3 and service1.
		 * Because of that is coachName is static variable. 
		 */
		service2.changeCoachName();
		
		FootballerService service3 = new FootballerService(footballer3);
		service3.enterThePitch();
		service3.findOutCoachName();
		System.out.println("Count of footballers in the pitch: " + FootballerService.footballerCountInThePitch);
		System.out.println("******************************************");
		
		service1.findOutCoachName();
		System.out.println("******************************************");
	}
	
	public void staticMethod() {
		
		Footballer footballer1 = new Footballer("Cristiano Ronaldo");
		Footballer footballer2 = new Footballer("Lionel Messi");
		Footballer footballer3 = new Footballer("Kylian Mbappe");
		
		
		/*
		 * In below example we have used instance method and instance variable. 
		 * So we can see that when we give a tactic to a footballer, other
		 * footballers so team does no effect. 
		 */
		
		FootballerService service1 = new FootballerService(footballer1);
		FootballerService service2 = new FootballerService(footballer2);
		FootballerService service3 = new FootballerService(footballer3);
		
		service1.giveTacticToFootballer("Long Ball Game");
		
		service1.getTacticOfTheFootballer();
		service2.getTacticOfTheFootballer();
		service3.getTacticOfTheFootballer();
		System.out.println("******************************************");
		
		
		/*
		 * In below example we have used static method and static variable. 
		 * So we can see that when we give a tactic to team, other
		 * footballers so team have been effected and have same tactic. 
		 * We have learned how static method works and how are they used.
		 */
		
		service1 = new FootballerService(footballer1);
		service2 = new FootballerService(footballer2);
		service3 = new FootballerService(footballer3);
		
		FootballerService.giveTacticToTeam("The High Press");
        
		service1.getTacticOfTheTeam();
		service2.getTacticOfTheTeam();
		service3.getTacticOfTheTeam();
		System.out.println("******************************************");
	}
}
