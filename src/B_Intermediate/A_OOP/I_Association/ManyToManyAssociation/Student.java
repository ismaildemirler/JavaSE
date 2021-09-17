package B_Intermediate.A_OOP.I_Association.ManyToManyAssociation;

public class Student {

	private String name;
	private Teacher teacher;

	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, Teacher teacher) {
		this.name = name;
		this.teacher = teacher;
	}
	
	public String getName() {
		return name;
	}

	public Teacher getTeacher() {
		return teacher;
	}
}
