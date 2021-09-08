package B_Intermediate.A_OOP.K_Compositions;

public class Compositions {

	/*
	 * Compositions in Java
	 */
	
	/*
	 * The composition is a design technique in java to implement a has-a relationship. 
	 * Java Inheritance is used for code reuse purposes and the same we can do by using composition. 
	 * The composition is achieved by using an instance variable that refers to other objects. 
	 * If an object contains the other object and the contained object cannot exist 
	 * without the existence of that object, then it is called composition. 
	 * In other words composition is a way of describing reference between two or more classes 
	 * using instance variable and an instance should be created before it is used.
	 */
	
	/*
	 * The benefits of using Composition is as follows: 
	   - Composition allows the reuse of code.
	   - Java doesn’t support multiple inheritances but by using composition we can achieve it.
	   - Composition offers better test-ability of a class.
	   - By using composition, we are flexible enough to replace the implementation of a composed class with a better and improved version.
	   - By using composition, we can also change the member objects at run time, to dynamically change the behavior of your program.
	 */
	
	/*
	 * They are the certain key points of composition in java which are as follows:
	   - It represents a has-a relationship.
       - In composition, both entities are dependent on each other.
       - When there is a composition between two entities, the composed object cannot exist without the other entity. 
       			For example, A library can have number of books on the same or different subjects. 
       			So, if the library gets destroyed then all books within that particular library will be destroyed. 
       			This is the books can not exist without a library.
       - The composition is achieved by using an instance variable that refers to other objects.
       - We have to favor Composition over Inheritance.
	 */
	
	/*
	 * For example we want to compose a computer. So we get main board object, hard disk object, keyboard object, monitor object.
	 * So by combining them we can have a computer object. Computer object has a lot of objects inside itself. This is composition.
	 */
	
	public void compositionExample() {
		
		/*
		 * We can do composition like below. 
		 * We have Resolution object in Monitor object.
		 * We have Monitor, Computer Case and Main Board objects in Computer object.
		 */
		Resolution resolution = new Resolution(1920, 1080);
		Monitor monitor = new Monitor("VS", "ASUS", "18.5", resolution);
		
		ComputerCase computerCase = new ComputerCase("Shadow Blade", "Shadow", "Glass");
		MainBoard mainBoard = new MainBoard("B250", "ASUS", 10, "Windows 10");
		
		Computer computer = new Computer(monitor, computerCase, mainBoard);
		
		/*
		 * If we want to access objects in Computer object we can do like below.
		 */
		computer.getComputerCase().openComputer();
		computer.getMonitor().closeTheMonitor();
		computer.getMainBoard().installOperatingSystem("Ubuntu");
	}
}
