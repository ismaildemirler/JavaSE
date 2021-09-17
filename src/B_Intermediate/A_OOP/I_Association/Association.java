package B_Intermediate.A_OOP.I_Association;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import B_Intermediate.A_OOP.I_Association.ManyToManyAssociation.Student;
import B_Intermediate.A_OOP.I_Association.ManyToManyAssociation.Teacher;
import B_Intermediate.A_OOP.I_Association.ManyToOneAssociation.City;
import B_Intermediate.A_OOP.I_Association.ManyToOneAssociation.State;
import B_Intermediate.A_OOP.I_Association.OneToManyAssociation.Company;
import B_Intermediate.A_OOP.I_Association.OneToManyAssociation.Employee;
import B_Intermediate.A_OOP.I_Association.OneToOneAssociation.Passport;

public class Association {

	/*
	 * Association Subject
	 */

	/*
	 * We will cover Association in Java in this class. Association in Java is one
	 * of the building blocks and the most basic concept of object-oriented
	 * programming. Association is a connection or relation between two separate
	 * classes that are set up through their objects. Association relationship
	 * indicates how objects know each other and how they are using each other�s
	 * functionality. It can be one-to-one, one-to-many, many-to-one and
	 * many-to-many.
	 */

	/*
	 * - For example, a person can have only one passport. That is a �one-to-one�
	 * relationship. - If we talk about the association between a Bank and Employee,
	 * a bank can have many employees, So it is a one-to-many relationship. -
	 * Similarly, every city exists in exactly one state, but a state can have many
	 * cities, which is a many-to-one relationship. - Lastly, if we talk about the
	 * association between a teacher and a student, multiple students can be
	 * associated with a single teacher and a single student can also be associated
	 * with multiple teachers but both can be created or deleted independently. This
	 * is a many-to-many relationship.
	 */

	/*
	 * Association is the weakest relationship between the three. It isn't a 'has-a'
	 * relationship, none of the objects are parts or members of another.
	 * Association only means that the objects know each other. For example, a
	 * mother and her child.
	 */
	
	/*
	 * Types of Association:
	   - IS-A Association: The IS-A Association is also referred to as Inheritance. So this was covered in 
	     Inheritance subject.
	   - HAS-A Association: The HAS-A Association is further classified into two parts,
	   	 a. Aggregation: In Java, the Aggregation association defines the HAS-A relationship. 
	   	    Aggregation follows the one-to-one or one-way relationship. 
	   	    If two entities are in the aggregation composition, and one entity fails due to some error, 
	   	    it will not affect the other entity. Let's take the example of a mobile phone and a battery. 
	   	    A single battery can belong to a mobile phone, but if the mobile phone stops working, 
	   	    and we delete it from our database. The phone battery will not be deleted because 
	   	    it may still be functional. So in aggregation, while there is ownership, objects have their own lifecycle.
	   	 b. Composition: A restricted form of the Aggregation where the entities are strongly dependent on each other. 
	   	 	Unlike Aggregation, Composition represents the part-of relationship. When there is an aggregation 
	   	 	between two entities, the aggregate object can exist without the other entity, but in the case of 
	   	 	Composition, the composed object can't exist. Suppose if we take an example of the relationship 
	   	 	between questions and answers. Single questions can have multiple answers, 
	   	 	but multiple answers can not have multiple questions. If we delete questions, 
	   	 	answers will automatically be deleted. In this the entities are dependent.
	 */

	public void oneToOneAssociationExample() {

		/*
		 * This example is one-to-one example. Because a person can have one passport. A
		 * passport can have one owner.
		 * 
		 * 1 1 Person ----> Passport
		 */
		Passport passport = new Passport("Mark", 13242342345L);
		System.out.println(passport.getName() + " is a person with a passport number " + passport.getId());

		System.out.println("************************************************");
	}

	public void oneToManyAssociationExample() {

		/*
		 * This example is one-to-many example. Because a company can have multiple
		 * employees. But an employee can have one company at the same time.
		 * 
		 * 1 0..* Company ----> Employee
		 */
		Employee employee1 = new Employee("Employee1", 15, "HR");
		Employee employee2 = new Employee("Employee2", 20, "IT");

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);

		Company company = new Company("XYZ", employees);

		for (Iterator item = employees.iterator(); item.hasNext();) {
			Employee employee = (Employee) item.next();
			System.out.print(employee.getName() + ",");
		}
		System.out
				.println(" are the employees of the " + company.getCompanyName() + " company");

		System.out.println("************************************************");
	}

	public void manyToOneAssociationExample() {
		
		/*
		 * n this example program there are two classes, namely, states and cities. 
		 * These two separate classes are associated through their Objects. 
		 * Moreover, every city exists in exactly one state, but a state can have many cities, 
		 * hence the term �many-to-one� relationship. 
		 * 
		 * 0..*       1
		 * City ----> State
		 */
		State state = new State();
		state.setStateName("California");

		City city1 = new City();
		city1.setCityName("Los Angeles");
		City city2 = new City();
		city2.setCityName("San Diago");

		List<City> cities = new ArrayList<City>();
		cities.add(city1);
		cities.add(city2);

		state.setState(cities);
		
		for (Iterator item = cities.iterator(); item.hasNext();) {
			City city = (City) item.next();
			System.out.print(city.getCityName() + ",");
		}
		System.out.println(" are cities in the state " + state.getStateName());

		System.out.println("************************************************");
	}

	public void manyToManyAssociationExample() {
		
		/*
		 * In this example, we can talk about the association between a teacher and a student, 
		 * multiple students can associate with a single teacher and a single student is also associated 
		 * with multiple teachers but both can be created or deleted independently. 
		 * So, when a teacher leaves the school, we don�t need to remove any students, 
		 * and when a student leaves the school, we don�t need to remove any teachers.
		 * 
		 *    0..*       0..*
		 * Teacher ----> Student
		 */
	    Student student1 = new Student("Student1");
		Teacher teacher1 = new Teacher("Teacher1", student1);	    
	    System.out.println(teacher1.getStudent().getName() + " is student of " + teacher1.getTeacherName());
	    
	    System.out.println("**********************************");
	    
	    Student student2 = new Student("Student2");
		teacher1 = new Teacher("Teacher1", student2);
	    System.out.println(teacher1.getStudent().getName() + " is student of " + teacher1.getTeacherName());

	    System.out.println("**********************************");
	    
		Teacher teacher2 = new Teacher("Teacher2");	
	    student1 = new Student("Student1", teacher2);	    
	    System.out.println(student1.getName() + " is student of " + student1.getTeacher().getTeacherName());

	    System.out.println("**********************************");
	    
	    student2 = new Student("Student2", teacher2);	    
	    System.out.println(student2.getName() + " is student of " + student2.getTeacher().getTeacherName());

	    System.out.println("**********************************");
	}
}
