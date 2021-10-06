package B_Intermediate.D_GenericClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _GenericClasses {

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

	public void wildcards() {
		
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
		
		Product product = new Product("Keyboard", "C234534523", 15.69);
		ProductService productService = new ProductService(product);
		product = modifyAndReturn(productService);
		System.out.println(product);
		System.out.println("*************************************");
		
		Customer customer = new Customer("John", "john@example.com", "0544433322", 22);
		CustomerService customerService = new CustomerService(customer);
		customer = modifyAndReturn(customerService);
		System.out.println(customer);
		System.out.println("*************************************");
		
		/*
		 * In above example we see that we can send multiple type parameter to method and
		 * return multiple type parameter from method using wildcard methodology.
		 * To be able to use method which is inside of common abstract class (ManagerService)
		 * we need to use <E extends ManagerService>. Because we need to tell E is not integer or
		 * E is not String. We need to tell E extends from ManagerService to use modify method inside.
		 */
		
		
		/*
		 * Upper Bounded Wildcards 
		 * The purpose of upper bounded wildcards is to decrease the restrictions on a variable. 
		 * It restricts the unknown type to be a specific type or a subtype of that type. 
		 * It is used by declaring wildcard character ("?") followed by the extends (in case of, class) 
		 * or implements (in case of, interface) keyword, followed by its upper bound.
		 * 
		 * Syntax:
		 * List<? extends Number> 
		 * 
		 * ? is a wildcard character.
		 * extends, is a keyword.
		 * Number, is a class present in java.lang package
		 * Suppose, we want to write the method for the list of Number and its subtypes (like Integer, Double). 
		 * Using List<? extends Number> is suitable for a list of type Number or any of its subclasses 
		 * whereas List<Number> works with the list of type Number only. So, List<? extends Number> 
		 * is less restrictive than List<Number>.
		 */
		ArrayList<Integer> integerList = new ArrayList<Integer>();  
		integerList.add(10);  
		integerList.add(20);  
        System.out.println("Displaying the sum of the integers = " + 
        		upperBoundedWildcardExampleForAdding(integerList));  
		System.out.println("*************************************");
          
        ArrayList<Double> doubleList = new ArrayList<Double>();  
        doubleList.add(30.0);  
        doubleList.add(40.0);  
        System.out.println("Displaying the sum of the doubles = " + 
        		upperBoundedWildcardExampleForAdding(doubleList));  
		System.out.println("*************************************");
		
		
		/*
		 * Unbounded Wildcards
		 * The unbounded wildcard type represents the list of an unknown type such as List<?>. 
		 * This approach can be useful in the following scenarios: 
           - When the given method is implemented by using the functionality provided in the Object class.
	       - When the generic class contains the methods that don't depend on the type parameter.
		 */
		List<Integer> list1 = Arrays.asList(1,2,3);  
	    System.out.println("Displaying the Integer values");  
	    unboundedWildcardExampleForDisplaying(list1);  
		System.out.println("*************************************");
	    
	    List<String> list2 = Arrays.asList("One","Two","Three");  
	    System.out.println("displaying the String values");  
	    unboundedWildcardExampleForDisplaying(list2);    
		System.out.println("*************************************");
		
		
		/*
		 * Lower Bounded Wildcards
		 * 
		 * The purpose of lower bounded wildcards is to restrict the unknown 
		 * type to be a specific type or a supertype of that type. It is used by 
		 * declaring wildcard character ("?") followed by the super keyword, followed by its lower bound.
		 * 
		 * Syntax:
		 * List<? super Integer> 
		 * Here,
		 * ? is a wildcard character.
		 * super, is a keyword.
		 * Integer, is a wrapper class.
		 * 
		 * Suppose, we want to write the method for the list of Integer and 
		 * its supertype (like Number, Object). Using List<? super Integer> is suitable 
		 * for a list of type Integer or any of its superclasses whereas List<Integer> 
		 * works with the list of type Integer only. So, List<? super Integer> 
		 * is less restrictive than List<Integer>.
		 */
		List<Integer> l1=Arrays.asList(1,2,3);  
	    System.out.println("Displaying the Integer values");  
	    lowerBoundedWildcardExampleForNumbers(l1);  
		System.out.println("*************************************");
	      
	    List<Number> l2=Arrays.asList(1.0,2.0,3.0);  
	    System.out.println("Displaying the Number values");  
	    lowerBoundedWildcardExampleForNumbers(l2);  
		System.out.println("*************************************");
	}
	
	private <E extends ManagerService, T extends Model> T modifyAndReturn(E item) {
		T model = (T)item.modify();
		return model;
	}
	
	private Double upperBoundedWildcardExampleForAdding(ArrayList<? extends Number> num) {
        double sum=0.0;            
        for(Number n:num)  
        {  
            sum = sum+n.doubleValue();  
        }            
        return sum;  
    }  
	
	private void unboundedWildcardExampleForDisplaying(List<?> list) {
        for(Object o:list)  
        {  
            System.out.println(o);  
        }            
    }  

	private void lowerBoundedWildcardExampleForNumbers(List<? super Integer> list) {
        for(Object n:list)  
        {  
        	System.out.println(n);  
        }        
    }
}