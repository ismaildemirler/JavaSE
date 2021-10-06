package B_Intermediate.C_InterfacesAbstractAndInnerClasses.A_Interfaces;

public interface IWorker {
	
	public int workerCount = 10;
	public String factoryName = "Factory1";
	public static int counter = 0;
	public final int workHoursPerWeek = 40;
	
	public static void work() {
		System.out.println("Worker is working!");
	}
	
	void calculateOffDays();
}
