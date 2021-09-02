package B_Intermediate.A_Properties;

public class Properties {
	
	/*
	 * Object Oriented Programming in Java
	 */
	
	/*
	 * When we say Object Oriented Programming we try to mean modeling our world into programming world.
	 * We have a lot of items in our environment. For instance we have television, chair etc in home. 
	 * All of that are objects in real world and programming world. Objects provide a basis all of features in programming world
	 * For instance i have a car. Car has properties in real world like color, brand, model year etc.
	 * So if we try to model car in programming world, we call car as object and create a class object which name is Car. 
	 */
	
	/*
	 * Classes in programming world is like factories in real world. In factories a product has some certain features and methods.
	 * When product has been created in the factory, features and methods of product have been defined and assigned to that product.
	 * So in the programming world when the class object of an object has been defined, the features and methods have been defined and 
	 * assigned to that class. When we create an instance of that class, like a factory, that object has been produced and owns
	 * all of the features and methods always.
	 */
	
	public void PropertiesOfClassObjects() {
		
		/*
		 * When we access UserApplication class object, we have to create a reference from the class by using new keyword to initialize the class. 
		 * And assigns values to its properties which defined when the class has been created.
		 */
		UserApplication userApplication1 = new UserApplication();
		userApplication1.name = "John";
		userApplication1.surname = "Wick";
		userApplication1.age = 44;
		userApplication1.country = "USA";
		userApplication1.username = "Jwick";
		
		System.out.println("Username of the user whose fullname is " + userApplication1.name + " " + userApplication1.surname + " is " + userApplication1.username);

		System.out.println("**************************************");
		
		/*
		 * But usage of properties like above is not professional and it can cause errors actually. 
		 * Properties of class have to be private in order to be not reachable. Because public properties can be reached 
		 * everybody and changed easily by assigning wrong values. 
		 * For example some programmer who does not know the features of the class can assign wrong numbers to age property.
		 * userApplication.age = -10;
		 * But age can not be minus value.
		 * In order to prevent this, we have to define properties private and in order to assign value to them, we can define some public methods
		 * which assign values to properties under control.
		 */
		UserApplication userApplication2 = new UserApplication();
		userApplication2.setAge(-20);
		userApplication2.setAge(20);
		int age = userApplication2.getAge();
		System.out.println("The age is : " + age);

		System.out.println("**************************************");
	}
}