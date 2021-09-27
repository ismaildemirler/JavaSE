package B_Intermediate.C_InterfacesAbstractAndInnerClasses.C_StaticKeyword;

public class FootballerService {

	private Footballer footballer;
	public static int footballerCountInThePitch = 0;
	public static String staticTactic = "Park The Bus";
	public String instanceTactic = "Park The Bus";

	public FootballerService(Footballer footballer) {
		this.footballer = footballer;
	}
	
	public void enterThePitch() {
		footballerCountInThePitch++;
		System.out.println(footballer.getName() + " has entered the pitch");
	}
	
	public void findOutCoachName() {
		System.out.println("Coach of " + footballer.getName() + " is " + Footballer.coachName);
	}
	
	public void changeCoachName() {
		Footballer.coachName = "Jose Mourinho";
	}
	
	public static void giveTacticToTeam(String tactic) {
		staticTactic = tactic;
		System.out.println("Tactic has been set at the team: " + staticTactic);
	}
	
	public void getTacticOfTheTeam() {
		System.out.println("Tactic of  " + footballer.getName() + " is "  + staticTactic);
	}
	
	public void giveTacticToFootballer(String tactic) {
		instanceTactic = tactic;
		System.out.println("Tactic has been set at the footballer: " + instanceTactic);
	}
	
	public void getTacticOfTheFootballer() {
		System.out.println("Tactic of  " + footballer.getName() + " is "  + instanceTactic);
	}
}
