package B_Intermediate.C_InterfacesAbstractAndInnerClasses.C_StaticKeyword;

public class FootballerService {

	private Footballer footballer;
	public static int footballerCountInThePitch;
	public static String staticTactic;
	public String instanceTactic = "Park The Bus";
	
	static {
		staticTactic = "Park The Bus";
		footballerCountInThePitch = 0;
		
		System.out.println("Static block run");
	}

	public FootballerService(Footballer footballer) {
		this.footballer = footballer;
		
		System.out.println("Constructor block run");
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
