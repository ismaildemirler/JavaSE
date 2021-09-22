package B_Intermediate.C_InterfacesAbstractAndInnerClasses.A_Interfaces;

import java.util.Date;

public class ComputerEngineer implements IEngineer, IWorker{

	private Person person;
	public ComputerEngineer(Person person) {
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
		int salary = calculateExperienceInYear() * 1000 + 2000;
		return salary;
	}

	@Override
	public void queryForFieldsOfInterest() {
		System.out.println("Fields of interest of this engineer are computer science");
	}

	@Override
	public double calculateDiplomaGrade() {
		double grade = 1.4*4;
		return grade;
	}
	
	public void references() {
		System.out.println("There is no reference");
	}

	@Override
	public void calculateOffDays() {
		System.out.println("20 days are off per year");
	}
}
