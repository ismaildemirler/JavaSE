package B_Intermediate.C_InterfacesAbstractAndInnerClasses.A_Interfaces;

import java.util.Date;

public class ElectronicEngineer implements IEngineer{
	
	private Person person;
	public ElectronicEngineer(Person person) {
		this.person = person;
	}

	@Override
	public int calculateExperienceInYear() {
		Date date = new Date();
		int experiencedTimeInYear = date.getYear() - person.getStartingDate();
		return experiencedTimeInYear;
	}

	@Override
	public int calculateSalary() {
		int salary = calculateExperienceInYear() * 1250 + 3000;
		return salary;
	}

	@Override
	public void queryForFieldsOfInterest() {
		System.out.println("Fields of interest of this engineer are electronic science");
	}

	@Override
	public double calculateDiplomaGrade() {
		double grade = 1.2*4;
		return grade;
	}
}
