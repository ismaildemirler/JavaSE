package B_Intermediate.A_OOP.F_Encapsulation;

public class _Encapsulation {

	/*
	 * Encapsulation in Java
	 */
	
	/*
	 * Encapsulation is defined as the wrapping up of data under a single unit. 
	 * It is the mechanism that binds together code and the data it manipulates. 
	 * Another way to think about encapsulation is, it is a protective shield that prevents the data 
	 * from being accessed by the code outside this shield.
	 
	   - Technically in encapsulation, the variables or data of a class is hidden from any other class 
	   	 and can be accessed only through any member function of its own class in which it is declared.
       - As in encapsulation, the data in a class is hidden from other classes using the data hiding concept 
         which is achieved by making the members or methods of a class private, and the class is exposed to the end-user or 
         the world without providing any details behind implementation using the abstraction concept, 
         so it is also known as a combination of data-hiding and abstraction.
       - Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods 
         in the class to set and get the values of variables
	 */
	
	/*
	 * Advantages of Encapsulation:  
	   - Data Hiding: The user will have no idea about the inner implementation of the class. 
	     It will not be visible to the user how the class is storing values in the variables. 
	     The user will only know that we are passing the values to a setter method and variables are getting initialized with that value.
       - Increased Flexibility: We can make the variables of the class read-only or write-only depending on our requirement. 
         If we wish to make the variables read-only then we have to omit the setter methods like setName(), setAge(), etc. 
         from the above program or if we wish to make the variables as write-only then we have to omit the get methods like getName(), 
         getAge(), etc. from the above program
       - Reusability: Encapsulation also improves the re-usability and is easy to change with new requirements. 
         Testing code is easy: Encapsulated code is easy to test for unit testing.
	 */
	
	public void notEncapsulatedExample() {
		
		NotEncapsulatedUser notEncapsulatedUser = new NotEncapsulatedUser();
		
		/*
		 * If we do not use encapsulation, we can face to those below:
		 */
		
		/* 
		 * - Because of that the properties are accessible and assignable without controlling, 
		     they can be assigned wrong way or useless values. Because there is no control to set values.
		 */
		notEncapsulatedUser.age = -10;
		System.out.println("Age of the user: " + notEncapsulatedUser.age);
		
		/*
		   - Because of that we did not create constructor with fields, we can forget to set 
		   	 important properties initially. So our algorithms can work wrong. We can see that
		   	 some of the properties are null. And program did not throw an error.
		 */
		System.out.println("Username of the user: " + notEncapsulatedUser.userName);
		System.out.println("Password of the user: " + notEncapsulatedUser.password);
		System.out.println("city of the user: " + notEncapsulatedUser.city);
		System.out.println("Age of the user: " + notEncapsulatedUser.age);
		
		/*
		 * - If we change names of some of the properties inside of the model class, we have to change names of the properties
		   	 everywhere, maybe 1000 or more places. This makes our project not maintainable and not professional.
		 */
	}
	
	public void encapsulatedExample() {
		
		/*
		 * - We can see here we have to set initial values to properties by using constructor with field. 
		     Because if not Java will throw an error. So we can not forget to set initial values to any of the properties. 
		 */
		EncapsulatedUser encapsulatedUser1 = new EncapsulatedUser("Valery", "Vi", "1234", 15, "Paris");
		
		/*
		   - We can see here if we set irrational value to age property, program will warn us. 
		     Because we controlled setting values to properties by using encapsulation.
		 */
		EncapsulatedUser encapsulatedUser2 = new EncapsulatedUser("Paris", "Par", "12345", -15, "London");
		
		/*
		   - Also if we want to change name of some properties we have to arrange just model class.
		     For example if we change name of the 'city' property to 'userCity', we will arrange just model class.
		     And there will be no effect in other classes which we have used model class.
		 */
		
		/*
		   - Like here, when we send the model class as parameter to one method, encapsulation matters too much.
		     Because if we add a new property to model class, there will be no effect in methods which we send model class as parameter to.
		     But if we do not use model class and send properties one by one to the method, we would have to change all methods.
		     Again this is not maintainable and not professional.
		 */
		EncapsulatedUser encapsulatedUser3 = new EncapsulatedUser("Bill", "bill", "12374", 25, "Newyork");
		showUserInfos(encapsulatedUser3);
		
		/*
		   - And we can restrict the parameters read only or write only thanks to encapsulation.
		 */
		EncapsulatedUser encapsulatedUser4 = new EncapsulatedUser("Ahmet", "ahmet", "12340", 30, "İstanbul");
		System.out.println("Read only property: " + encapsulatedUser4.getReadOnlyValue());
		encapsulatedUser4.setReadOnlyValue("Can we set value to this property?");
		encapsulatedUser4.setWriteOnlyValue("We can only set a value to this parameter.");
		encapsulatedUser4.getWriteOnlyValue();
		System.out.println("**************************************************");
	}
	
	public void showUserInfos(EncapsulatedUser encapsulatedUser) {
		System.out.println("Name of the user: " + encapsulatedUser.getName());
		System.out.println("Username of the user: " + encapsulatedUser.getUserName());
		System.out.println("Password of the user: " + encapsulatedUser.getPassword());
		System.out.println("city of the user: " + encapsulatedUser.getCity());
		System.out.println("Age of the user: " + encapsulatedUser.getAge());
		System.out.println("**************************************************");
	}
}
