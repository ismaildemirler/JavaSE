package B_Intermediate.A_OOP.J_Aggregation;

import java.util.List;

public class Department {

	private String name;
    private List<Student> students;
    
    Department(String name, List<Student> students)
    {
        this.name = name;
        this.students = students;
    }
    
    public String getName() {
    	return name;
    }
     
    public List<Student> getStudents()
    {
        return students;
    }
}
