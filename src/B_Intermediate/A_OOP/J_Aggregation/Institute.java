package B_Intermediate.A_OOP.J_Aggregation;

import java.util.List;

public class Institute {

	private String instituteName;
    private List<Department> departments;
     
    Institute(String instituteName, List<Department> departments)
    {
        this.instituteName = instituteName;
        this.departments = departments;
    }
    
    public String getInstituteName() {
		return instituteName;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public int getTotalStudentsInInstitute()
    {
        int noOfStudents = 0;
        List<Student> students;
        for(Department dept : departments)
        {
            students = dept.getStudents();
            for(Student s : students)
            {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}
