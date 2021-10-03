package B_Intermediate.C_InterfacesAbstractAndInnerClasses.D_NestedClasses;

public class StaticNestedClass {

	public static class Message {
		
		public void giveMessage() {
			System.out.println("I am non-static method which is inside of static nested class");
			System.out.println("*****************************************************");
		}
		
		public static void giveStaticMessage() {
			System.out.println("I am static method which is inside of static nested class");
			System.out.println("*********************************************************");
		}
	}
}
