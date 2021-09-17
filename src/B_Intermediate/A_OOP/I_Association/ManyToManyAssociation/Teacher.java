package B_Intermediate.A_OOP.I_Association.ManyToManyAssociation;

public class Teacher {

	private String name;
	private Student student;

	public Teacher(String name) {
		this.name = name;
	}
	
	public Teacher(String name, Student student){
		this.name = name;
		this.student = student;
	}

	public String getTeacherName() {
		return this.name;
	}
	
	public Student getStudent() {
		return student;
	}
}
