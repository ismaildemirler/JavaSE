package B_Intermediate.B_ArraysAndLists.C_WrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {

	/*
	 * Wrapper Classes, Autoboxing and Unboxing in Java
	 */
	
	/*
	 * In Java, we have 8 primitive data types. Java provides type wrappers, 
	 * which are classes that encapsulate a primitive type within an Object. 
	 * A wrapper class wraps (encloses) around a primitive datatype and gives it an object appearance. 
	 * Wherever the primitive datatype is required as an object type, this type wrapper can be used.
	 * Wrapper classes include methods to unwrap the object and give back the data type.
	 * The type wrappers classes are part of java.lang package. 
	 * Each primitive type has a corresponding wrapper class.
	 */
	
	/*
	 *    Primitive Type              Wrapper Class
	 *  ------------------          ------------------
	 *  	 double                       Double
	 *       float                        Float
	 *       long                         Long
	 *       int                          Integer
	 *       short                        Short
	 *       byte                         Byte
	 *       char                         Character
	 *       boolean                      Boolean
	 */
	
	/*
	 * When to use Wrapper Classes
	   Java wrapper classes are used in scenarios:
       - When two methods wants to refer to the same instance of an primitive type, then pass wrapper class as method argument.
       - Java Generics works only with object and does not support primitive types.
       - Java Collections deal only with objects; to store a primitive type in one of these classes, 
         you need to wrap the primitive type in a class.
       - When you want to refer null from data type, the you need object. Primitives cannot have null as value.
	 */
	
	/*
	 * Autoboxing: Converting a primitive value into an object of the corresponding wrapper class is called autoboxing. 
	 * For example, converting int to Integer class. The Java compiler applies autoboxing when a primitive value is:
       - Passed as a parameter to a method that expects an object of the corresponding wrapper class.
       - Assigned to a variable of the corresponding wrapper class.
	 */
	
	/*
	 * Unboxing: Converting an object of a wrapper type to its corresponding primitive value is called unboxing. 
	 * For example conversion of Integer to int. The Java compiler applies unboxing when an object of a wrapper class is:
	   - Passed as a parameter to a method that expects a value of the corresponding primitive type.
       - Assigned to a variable of the corresponding primitive type.
	 */
	
	public void autoboxingUnboxing() {
		
		/*
		 * Conversions
		 */
		
		/* A)
		 * There are two ways for converting a primitive type into an object of corresponding wrapper class:
		   1) Using constrcutors
		   2) Using static factory methods
		 */
		
		// 1. using constructor
		Integer intObject1 = new Integer(10);
		 
		// 2. using static factory method
		Integer intObject2 = Integer.valueOf(10); //primitive to wrapper
		
		/*
		 * In above example, the valueOf() method is a static factory method that returns 
		 * an instance of Integer class representing the specified int value.
		 * Similarly, we can convert the other primitive types like boolean to Boolean, char to Character, short to Short, etc.
		 */

		Boolean booleanObject1 = new Boolean(false);
		Boolean booleanObject2 = Boolean.valueOf(false);
		
		/*
		 * Java wrapper classes uses internal caching which returns internally cached values 
		 * that makes wrapper classes more efficient in perfomance and memory unilization.
		 */
		
		/* B)
		 * Converting from wrapper class to primitive type is simple. 
		 * We can use the corresponding instance methods to get the primitive type. e.g. intValue(), doubleValue(), shortValue() etc.
		 */
		
		int number = intObject1.intValue();    //wrapper to primitive
		System.out.println("Converted number from wrapper to primitive: " + number);
		
		
		/* C)
		 * Autoboxing and Unboxing
		   Beginning with JDK 5, Java added two important features:
		   - Autoboxing
		   - Auto-Unboxing
		 */
		
		/*
		 * Autoboxing:
		 * Autoboxing is the automatic conversion of the primitive types into their corresponding wrapper class.
		 * For example, converting an int to an Integer, a char to a Character, and so on.
		 * We can simply pass or assign a primitive type to an argument or reference accepting wrapper class type.
		 */
		
		Character ch = 'a';     //char to Character		 
		
		List<Integer> integerList1 = new ArrayList<>();
		 
		for (int i = 1; i < 10; i ++) 
		{
		    integerList1.add(i);     //int to Integer
		}
		
		/*
		 * In given example, integerList is a List of Integers. It is not a list of primitive type int values. 
		 * Compiler automatically creates an Integer object from i and adds the object to integerList. 
		 * Thus, the previous code turn into the following at runtime:
		 */
		List<Integer> integerList2 = new ArrayList<>();
		 
		for (int i = 1; i < 50; i += 2) 
		{
		    integerList2.add(Integer.valueOf(i));        //autoboxing
		}
		
		/*
		 * Unboxing:
		 * Unboxing happens when the conversion happens from wrapper class to its corresponding primitive type. 
		 * It means we can pass or assign a wrapper object to an argument or reference accepting primitive type.
		 */
		
		List<Integer> integerList3 = new ArrayList<Integer>();
		integerList3.add(20);
		integerList3.add(5);
		integerList3.add(4);		
	    
		int sum = 0;
	    for (Integer i: integerList3) {
	        if (i % 2 == 0)
	            sum += i;           //Integer to int
	    }
	    System.out.println("Total number after unboxing: " + sum);
	    
	    /*
	     * In above example, the remainder (%) and unary plus (+=) operators does not apply on Integer objects. 
	     * The compiler automatically converts an Integer to an int at runtime by invoking the intValue() method. 
	     * Autoboxing and unboxing lets developers write cleaner code, make it easier to read.
	     */
	}
}
