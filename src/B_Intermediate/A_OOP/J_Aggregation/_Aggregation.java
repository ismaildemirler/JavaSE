package B_Intermediate.A_OOP.J_Aggregation;

import java.util.ArrayList;
import java.util.List;

public class _Aggregation {

	/*
	 * Aggregation in Java
	 */
	
	/*
	 * Aggregation is also a 'has-a' relationship. Aggregation is a weak association 
	 * What distinguishes it from composition, that it doesn't involve owning. As a result, 
	 * the lifecycles of the objects aren't tied: every one of them can exist independently of each other. 
	 * For example, a car and its wheels. We can take off the wheels, and they'll still exist. 
	 * We can mount other (preexisting) wheels, or install these to another car and everything will work just fine.
	 * 
	 * Now, Aggregation in Java is a special type of association. It has the following characteristics:
       - It represents the Has-A relationship.
       - It is a unidirectional association i.e. a one way relationship. 
         For example, department can have students but vice versa is not possible and thus unidirectional in nature.
       - Ending one entity won't affect another, both can be present independently.
	 */
	
	public void aggregationExample() {
		
		Student s1 = new Student("Mia", 1, "CSE");
        Student s2 = new Student("Priya", 2, "CSE");
        Student s3 = new Student("John", 1, "EE");
        Student s4 = new Student("Rahul", 2, "EE");
     
        List <Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s2);
         
        List <Student> ee_students = new ArrayList<Student>();
        ee_students.add(s3);
        ee_students.add(s4);
         
        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);
         
        List <Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);
         
        Institute institute = new Institute("BITS", departments);
         
        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudentsInInstitute());
	}
}
