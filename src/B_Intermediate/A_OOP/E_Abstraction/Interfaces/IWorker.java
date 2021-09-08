package B_Intermediate.A_OOP.E_Abstraction.Interfaces;

public interface IWorker {
	
	final String nonChangeableVariable = "This variable can not be changed in anytime";
	
	public void enter();
	public void exit();
	public void eat();
	public void showInfos();
}
