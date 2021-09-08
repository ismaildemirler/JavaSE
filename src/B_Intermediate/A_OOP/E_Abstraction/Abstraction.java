package B_Intermediate.A_OOP.E_Abstraction;

import B_Intermediate.A_OOP.E_Abstraction.AbstractClasses.Assistant;
import B_Intermediate.A_OOP.E_Abstraction.AbstractClasses.Informatic;
import B_Intermediate.A_OOP.E_Abstraction.AbstractClasses.Lecturer;
import B_Intermediate.A_OOP.E_Abstraction.AbstractClasses.Security;

public class Abstraction {

	/*
	 * Abstraction In Java
	 */

	/*
	 * A class which is declared with the abstract keyword is known as an abstract
	 * class in Java. It can have abstract and non-abstract methods (method with the
	 * body). It needs to be extended and its method implemented. It cannot be
	 * instantiated. An abstract class can have a data member, abstract method,
	 * method body (non-abstract method), constructor, and even main() method.
	 */

	/*
	 * Abstraction is a process of hiding the implementation details and showing
	 * only functionality to the user. Both abstract class and interface are used
	 * for abstraction. We can achieve 100% abstraction using interfaces. Another
	 * way, it shows only essential things to the user and hides the internal
	 * details, for example, sending SMS where you type the text and send the
	 * message. You don't know the internal processing about the message delivery.
	 */

	/*
	 * There are two ways to achieve abstraction in java - Abstract class (0 to
	 * 100%) - Interface (100%)
	 */

	/*
	 * Abstract Class in Java 
	    - An abstract class is a class that is declared with abstract keyword. 
	    - An abstract method is a method that is declared without implementation. 
	    - An abstract class may or may not have all abstract methods. Some of them can be concrete methods 
	    - A method defined abstract must always be redefined in the subclass, thus making overriding compulsory OR either make subclass itself abstract. 
	    - Any class that contains one or more abstract methods must also be declared with abstract keyword. 
	    - There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator. 
	    - An abstract class can have parameterized constructors and default constructor is always present in an abstract class.
	 */

	/*
	 * Interfaces in Java To declare an interface, use interface keyword. It is used to provide total abstraction. 
	 * That means all the methods in an interface are declared with an empty body and are public and all fields are public, static
	 * and final by default. A class that implements an interface must implement all the methods declared in the interface. 
	 * To implement interface use implements keyword. 
	 * Why do we use interface? 
	   - It is used to achieve total abstraction.
	   - Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance. 
	   - It is also used to achieve loose coupling. 
	   - Interfaces are used to implement abstraction. So the question arises why use interfaces when we have abstract classes?
	 */

	/*
	 * Abstract class vs Interface 
	   - Type of methods: Interface can have only abstract methods. An abstract class can have abstract and non-abstract
	     methods. From Java 8, it can have default and static methods also. 
	   - Final Variables: Variables declared in a Java interface are by default final. An abstract class may contain non-final variables. 
	   - Type of variables: Abstract class can have final, non-final, static and non-static variables. The interface has only static and final variables. 
	   - Implementation: Abstract class can provide the implementation of the interface. Interface can’t provide the implementation of an abstract class. 
	   - Inheritance vs Abstraction: A Java interface can be implemented using the keyword “implements” 
	     and an abstract class can be extended using the keyword “extends”. 
	   - Multiple implementations: An interface can extend another Java interface only, an abstract class can extend another 
	     Java class and implement multiple Java interfaces. 
	   - Accessibility of Data Members: Members of a Java interface are public by default. 
	     A Java abstract class can have class members like private, protected, etc.
	 */

	/*
	 * Points to Remember 
	   - An abstract class must be declared with an abstract keyword. 
	   - It can have abstract and non-abstract methods. 
	   - It cannot be instantiated. 
	   - It can have constructors and static methods also. 
	   - It can have final methods which will force the subclass not to change the body of the method.
	 */

	/*
	 * Advantages of Abstraction 
	   - It reduces the complexity of viewing the things.
	   - Avoids code duplication and increases reusability. 
	   - Helps to increase security of an application or program as only important details are provided to the user.
	 */

	/*
	 * Encapsulation vs Data Abstraction 
	   - Encapsulation is data hiding(information hiding) while Abstraction is detail hiding(implementation hiding). 
	   - While encapsulation groups together data and methods that act upon the data, data abstraction deals with exposing 
	     the interface to the user and hiding the details of implementation.
	 */

	public void abstractionExampleWithAbstractClasses() {
		
		/*
		 * We use abstraction when we want to restrict using the class. 
		 * In some cases using that class is useless, because the class does not define a real situation or explain a realistic event.
		 * In this example we have 'Worker' classc which is base class and does not define real identity. Under that there are a lot of
		 * positions and implementable titles. We can derive titles from 'Worker' class. So we do not want to get 'Worker' class used.
		 * Same is valid for 'Academician' and 'Officer' classes. We do not want to get those classes used also. They are used to provide
		 * a basis for implementable classes like 'Assistant', 'Lecturer', 'Security Officer', 'Informatic Officer'.
		 */
		
		Assistant assistant = new Assistant("John", "j@hotmail.com", "+108094583830", "IEEE", "Assist", "IEEE, SOS",
				"IEEE");
		assistant.enter();
		assistant.assesQuiz();
		assistant.lecture();
		assistant.eat();
		assistant.exit();
		assistant.showInfos();
		
		System.out.println("************************************");
		
		Lecturer academician = new Lecturer("Luis", "l@hotmail.com", "+13423423534", "CENG", "Lecturing", "Programming Course", "Dr.");
		academician.enter();
		academician.assesExam();
		academician.attendMeeting();
		academician.lecture();
		academician.eat();
		academician.exit();
		academician.showInfos();
		
		System.out.println("************************************");
		
		Security security = new Security("Borris", "b@hotmail.com", "+108094583830", "Security Department", "Night", "Document Example");
		security.enter();
		security.watch();
		security.work();
		security.eat();
		security.exit();
		security.showInfos();
		
		System.out.println("************************************");
		
		Informatic informatic = new Informatic("Henry", "h@hotmail.com", "+1234234234", "Information Technologies Department", "Day", "IT");
		informatic.enter();
		informatic.scanComputers();
		informatic.work();
		informatic.eat();
		informatic.exit();
		informatic.showInfos();
		
		System.out.println("************************************");
	}
	
	public void abstractionExampleWithInterfaces() {
		
		/*
		 * We can use same contruction for abstraction by using interfaces instead of using abstract classes.
		 * You can realize differences between abstract classes and interfaces by reviewing this examples. 
		 */
		
		Assistant assistant = new Assistant("John", "j@hotmail.com", "+108094583830", "IEEE", "Assist", "IEEE, SOS",
				"IEEE");
		assistant.enter();
		assistant.assesQuiz();
		assistant.lecture();
		assistant.eat();
		assistant.exit();
		assistant.showInfos();
		
		System.out.println("************************************");
		
		Lecturer academician = new Lecturer("Luis", "l@hotmail.com", "+13423423534", "CENG", "Lecturing", "Programming Course", "Dr.");
		academician.enter();
		academician.assesExam();
		academician.attendMeeting();
		academician.lecture();
		academician.eat();
		academician.exit();
		academician.showInfos();
		
		System.out.println("************************************");
		
		Security security = new Security("Borris", "b@hotmail.com", "+108094583830", "Security Department", "Night", "Document Example");
		security.enter();
		security.watch();
		security.work();
		security.eat();
		security.exit();
		security.showInfos();
		
		System.out.println("************************************");
		
		Informatic informatic = new Informatic("Henry", "h@hotmail.com", "+1234234234", "Information Technologies Department", "Day", "IT");
		informatic.enter();
		informatic.scanComputers();
		informatic.work();
		informatic.eat();
		informatic.exit();
		informatic.showInfos();
		
		System.out.println("************************************");
	}
}
