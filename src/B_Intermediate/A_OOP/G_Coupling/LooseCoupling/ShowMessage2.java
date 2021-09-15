package B_Intermediate.A_OOP.G_Coupling.LooseCoupling;

public class ShowMessage2 implements IShowMessage{

	public ShowMessage2() {
		
	}

	@Override
	public void showMessage() {
		System.out.println("Message is showing in second class!");
	}
}
