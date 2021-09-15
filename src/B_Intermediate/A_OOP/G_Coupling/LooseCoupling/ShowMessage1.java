package B_Intermediate.A_OOP.G_Coupling.LooseCoupling;

public class ShowMessage1 implements IShowMessage{

	public ShowMessage1() {
		
	}

	@Override
	public void showMessage() {
		System.out.println("Message is showing in first class!");
	}
}
