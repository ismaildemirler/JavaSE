package B_Intermediate.GenericClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericClasses {

	/*
	 * Generics in Java
	 */
	
	/*
	 * The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects. 
	 * It makes the code stable by detecting the bugs at compile time. 
	 * Before generics, we can store any type of objects in the collection, 
	 * i.e., non-generic. Now generics force the java programmer to store a specific type of objects.
	 */
	
	/*
	 * Advantage of Java Generics.
	 * There are mainly 3 advantages of generics. They are as follows:
       1) Type-safety: We can hold only a single type of objects in generics. 
          It doesn't allow to store other objects. 
          So we need to control them and convert them wanted type.
	   2) Type casting is not required: There is no need to typecast the object. 
	   3) Compile-Time Checking: It is checked at compile time so problem will not occur at runtime. 
	      The good programming strategy says it is far better to 
	      handle the problem at compile time than runtime.
	 */
	
	/*
	 * Generic Class in Java
	 * 
	 * A class that can refer to any type is known as a generic class. 
	 * Here, we are using the T type parameter to create the generic class of specific type. 
	 */
	
	/*
	 * Generic Method 
	 * 
	 * Like the generic class, we can create a generic method that can accept any type of arguments. 
	 * Here, the scope of arguments is limited to the method where it is declared. 
	 * It allows static as well as non-static methods.
	 */
	
	/*
	 * Wildcard in Java Generics
	 * 
	 * The ? (question mark) symbol represents the wildcard element. 
	 * It means any type. If we write <? extends Number>, it means any 
	 * child class of Number, e.g., Integer, Float, and double. 
	 * Now we can call the method of Number class through any child class object. 
	 * We can use a wildcard as a type of a parameter, field, return type, or local variable. 
	 * However, it is not allowed to use a wildcard as a type argument for a generic 
	 * method invocation, a generic class instance creation, or a supertype.
	 */
	
	/*
	 * Type Parameters 
	 * The type parameters naming conventions are important to learn generics thoroughly. 
	 * The common type parameters are as follows:
	   
	   1) T - Type
	   2) E - Element
	   3) K - Key
	   4) N - Number
	   5) V - Value
	 */
	
	public void generics() {
		
		/*
		 * Without Generics, we can store any type of objects.
		 */
		List nonGenericList1 = new ArrayList();
		nonGenericList1.add(10);
		nonGenericList1.add("Java");
		nonGenericList1.add(10.0f);
		
		/*
		 * By using Generics, we can restrict adding parameters to class or methods.
		 */
		List<Integer> genericList1 = new ArrayList<Integer>();
		genericList1.add(3);
		//genericList.add("Java"); //returns compime-time error.
		
		/*
		 * Before Generics, we need type casting or we get compile-time error.
		 */
		List nonGenericList2 = new ArrayList();
		nonGenericList2.add("We need to type cast");
		String sentence1 = (String) nonGenericList2.get(0);
		System.out.println(sentence1);
		System.out.println("*************************");
		
		/*
		 * By using Generics, we dont need to type cast.
		 */
		List<String> genericList2 = new ArrayList<String>();
		genericList2.add("We don't need to type cast");
		String sentence2 = genericList2.get(0);
		System.out.println(sentence2);
		System.out.println("*************************");
		
		/*
		 * We can use generic map also like generic lists.
		 */
		Map<Integer, String> programmingLanguages = new HashMap<Integer, String>();  
		programmingLanguages.put(1,"Java");  
		programmingLanguages.put(5,"C#");  
		programmingLanguages.put(3,"Python");  
		    
		Set<Map.Entry<Integer, String>> set = programmingLanguages.entrySet();  
		  
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();  
		while(itr.hasNext()) {  
			Map.Entry e = itr.next(); //no need to typecast  
			System.out.println(e.getKey() + ") " + e.getValue());  
		}
		System.out.println("*************************");
	}

	public void genericClasses() {
		
		/*
		 * By using Generic Class in Java, we created a generic class which is called DatabaseOperations
		 * and all type of items can be sent to this class to save to database.
		 * But if we would not use generic class, we would have to create multiple classes for items
		 * to save to database. For example we would have to create a class to save products to database.
		 * And we would have to create a class to save customers to database. So we would have to 
		 * create number of classes how many items we have. Generics provide us to success saving items to
		 * database with just one generic class like below. 
		 */
		
		Product product1 = new Product("product1", "A043543", 179.99); 
		Product product2 = new Product("product2", "B368232", 229.99);
		
		List<Product> products = new ArrayList<Product>();
		products.add(product1);
		products.add(product2);
		
		Customer customer1 = new Customer("customer1", "customer1@example.com", "98534803408", 25);
		Customer customer2 = new Customer("customer2", "customer2@example.com", "42342344234", 33);
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		
		DatabaseOperations<Product> databaseOperationsForProduct = new DatabaseOperations<Product>();
		databaseOperationsForProduct.save(products);
		
		DatabaseOperations<Customer> databaseOperationsForCustomer = new DatabaseOperations<Customer>();
		databaseOperationsForCustomer.save(customers);
		
		/*
		 * Like we see in example above, We saved all type of the items to database
		 * by using one generic class. 
		 */
	}

	public void genericMethods() {
		
		/*
		 * By using Generic Methods in Java, we created a generic method which is called log 
		 * in LogOperations class and all type of items can be sent to this method to log.
		 * But if we would not use generic method, we would have to create multiple methods for items
		 * to save to database. For example we would have to create a method to log products.
		 * And we would have to create a method to log customers. So we would have to 
		 * create number of methods how many items we have. Generics provide us to success logging items
		 * with just one generic method like below. 
		 */
		
		Product product1 = new Product("product1", "A043543", 179.99); 
		Product product2 = new Product("product2", "B368232", 229.99);
		
		List<Product> products = new ArrayList<Product>();
		products.add(product1);
		products.add(product2);
		
		Customer customer1 = new Customer("customer1", "customer1@example.com", "98534803408", 25);
		Customer customer2 = new Customer("customer2", "customer2@example.com", "42342344234", 33);
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		
		LogOperations logOperations = new LogOperations();
		logOperations.log(products);
		logOperations.log(customers);
		
		/*
		 * Like we see in example above, We logged all type of the items by using one generic method. 
		 */
	}
}
