package B_Intermediate.C_InterfacesAbstractAndInnerClasses.A_Interfaces;

public class _Interfaces {
	
	/*
	 * Interface in Java	
	 */
	
	/*
	 * Java does not support mulitple inheritance. Because if we could inherit from multiple classes, 
	 * methods with same name in parent classes could cause problems. So we have interfaces in Java to achieve
	 * multiple inheritance. Java Interface also represents the IS-A relationship.
	 */
	
	/*
	 * An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. 
	 * A class implements an interface, thereby inheriting the abstract methods of the interface. 
	 * Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types. 
	 * Method bodies exist only for default methods and static methods. Writing an interface is similar to writing a class. 
	 * But a class describes the attributes and behaviors of an object. And an interface contains behaviors that a class implements.
	 * Unless the class that implements the interface is abstract, all the methods of the interface need to be defined in the class.
	 
	 * An interface is similar to a class in the following ways:
	   − An interface can contain any number of methods.
	   - An interface is written in a file with a .java extension, with the name of the interface matching the name of the file.
	   - The byte code of an interface appears in a .class file.
	   - Interfaces appear in packages, and their corresponding bytecode file must be in a directory structure that matches the package name.
     
     * However, an interface is different from a class in several ways, including: 
       − You cannot instantiate an interface.
       - An interface does not contain any constructors.
       - All of the methods in an interface are abstract.
       - An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.
       - An interface is not extended by a class; it is implemented by a class.
       - An interface can extend multiple interfaces.
	 */
	
	/*
	 * When overriding methods defined in interfaces, there are several rules to be followed: 
	   - Checked exceptions should not be declared on implementation methods other than the ones declared 
	     by the interface method or subclasses of those declared by the interface method.
	   - The signature of the interface method and the same return type or subtype should be maintained when overriding the methods.
	   - An implementation class itself can be abstract and if so, interface methods need not be implemented.

     * When implementation interfaces, there are several rules:
       - A class can implement more than one interface at a time.
       - A class can extend only one class, but implement many interfaces.
       - An interface can extend another interface, in a similar way as a class can extend another class.
       - An interface can extend multiple interfaces.
	 */
	
	/*
	 * In an interface, we're allowed to use: 
	   - Constants variables
       - Abstract methods
       - Static methods
       - Default methods

     * We also should remember that:
       - We can't instantiate interfaces directly
       - An interface can be empty, with no methods or variables in it
       - We can't use the final word in the interface definition, as it will result in a compiler error
       - All interface declarations should have the public or default access modifier; 
         The abstract modifier will be added automatically by the compiler
       - An interface method can't be protected or final
       - Up until Java 9, interface methods could not be private; however, 
         Java 9 introduced the possibility to define private methods in interfaces
       - Interface variables are public, static, and final by definition; we're not allowed to change their visibility
	 */
	
	/*
	 * There are mainly three reasons to use interface. They are given below:
	   - It is used to achieve abstraction.
	   - By interface, we can support the functionality of multiple inheritance.
	   - It can be used to achieve loose coupling.
	 */
	
	public void interfaceExample() {
		
		var computerEngineer = new ComputerEngineer(new Person(35, 2010, "Engineer1"));
		int yearOfExperienced1 = computerEngineer.calculateExperienceInYear();
		int salary1 = computerEngineer.calculateSalary();
		computerEngineer.queryForFieldsOfInterest();
		computerEngineer.references();
		double grade1 = computerEngineer.calculateDiplomaGrade();
		computerEngineer.calculateOffDays();
		System.out.println("Year of experienced: " + yearOfExperienced1);
		System.out.println("Salary: " + salary1);
		System.out.println("Grade: " + grade1);
		System.out.println("*******************************************");
		
		var electronicEngineer = new ElectronicEngineer(new Person(25, 2015, "Engineer2"));
		int yearOfExperienced2 = electronicEngineer.calculateExperienceInYear();
		int salary2 = electronicEngineer.calculateSalary();
		electronicEngineer.queryForFieldsOfInterest();
		double grade2 = electronicEngineer.calculateDiplomaGrade();
		System.out.println("Year of experienced: " + yearOfExperienced2);
		System.out.println("Salary: " + salary2);
		System.out.println("Grade: " + grade2);
		System.out.println("*******************************************");
	}
}
