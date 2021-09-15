package B_Intermediate.A_OOP.G_Coupling;

import B_Intermediate.A_OOP.G_Coupling.LooseCoupling.IShowMessage;
import B_Intermediate.A_OOP.G_Coupling.LooseCoupling.ShowMessage1;
import B_Intermediate.A_OOP.G_Coupling.LooseCoupling.ShowMessage2;
import B_Intermediate.A_OOP.G_Coupling.TightCoupling.DisplayMessage;

public class Coupling {

	/*
	 * Coupling in Java
	 */
	
	/*
	 * In object oriented design, Coupling refers to the degree of direct knowledge that one element has of another. 
	 * In other words, how often do changes in class A force related changes in class B. 
	 */
	
	/*
	 * There are two types of coupling: 
	   - Tight coupling : In general, Tight coupling means the two classes often change together. 
	   	 In other words, if A knows more than it should about the way in which B was implemented, then A and B are tightly coupled.
	   - Loose coupling : In simple words, loose coupling means they are mostly independent. 
	     If the only knowledge that class A has about class B, is what class B has exposed through its interface, 
	     then class A and class B are said to be loosely coupled. In order to over come from the problems of tight coupling between objects, 
	     spring framework uses dependency injection mechanism with the help of POJO/POJI model and through dependency injection 
	     its possible to achieve loose coupling.
	 */
	
	/*
	 * Tight Coupling is bad in but most of the time, because it reduces flexibility and re-usability of code, 
	 * it makes changes much more difficult, it impedes test ability etc. loose coupling is a better choice 
	 * because A loosely coupled will help you when your application need to change or grow. 
	 * If you design with loosely coupled architecture, only a few parts of the application should be affected when requirements change.
	 */
	
	/*
	 * Benefits of loose coupling:
       - Loose coupling allows making changes in the code easily.
       - Testing of loosely coupled structures is easier than the tightly coupled structure.
       - Less amount of code is required to make changes in a loosely coupled structure than in a tightly coupled structure.
	 */
	
	/*
	 * Difference between tight coupling and loose coupling:
	   
	   - Tight coupling is not good at the test-ability. But loose coupling improves the test ability.
       - Tight coupling does not provide the concept of interface. But loose coupling helps us follow 
         the GOF principle of program to interfaces, not implementations.
       - In Tight coupling, it is not easy to swap the codes between two classes. But it’s much easier to swap 
         other pieces of code/modules/objects/components in loose coupling.
       - Tight coupling does not have the changing capability. But loose coupling is highly changeable.
	 */
	
	/*
	 * Coupling increases between two classes A and B if:

	   - A has an attribute that refers to (is of type) B.
	   - A calls on services of an object B.
	   - A has a method that reference B (via return type or parameter).
	   - A is a subclass of (or implements) class B.
	 */
	
	public void tightCouplingExample() {
		
		/*
		 * DisplayMessage is tightly coupled to this class.
		 * This implementation can not be changed dynamically. 
		 * This implementation must be changed everywhere in project when we want to change something.
		 */
		DisplayMessage displayMessage = new DisplayMessage();
		displayMessage.display();
	}
	
	public void looseCouplingExample() {
		
		/*
		 * ShowMessage creating and loosely coupling to this class.
		 * So here, we can use polymorphism and see benefits of loose coupling. 
		 */
		IShowMessage showMessage1 = new ShowMessage1();
		showMessageLooseCoupling(showMessage1);
		
		/*
		 * Because here we are using loose coupling, without any changing
		 * we can send another class as parameter to 'showMessageLooseCoupling' method.
		 */
		IShowMessage showMessage2 = new ShowMessage2();
		showMessageLooseCoupling(showMessage2);
	}
	
	private void showMessageLooseCoupling(IShowMessage showMessage){
		/*
		 * ShowMessage is loosely coupled to this class.
		 * This implementation can be changed dynamically. 
		 */
		showMessage.showMessage();
	}
}
