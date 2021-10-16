package C_Advance.A_Collections.D_Map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapClass {
	
	/*
	 * HashMap in Java
	 */
	
	/*
	 * Java HashMap class implements the Map interface which allows us to store key and value pair, 
	 * where keys should be unique. If you try to insert the duplicate key, it will replace the element 
	 * of the corresponding key. It is easy to perform operations using the key index like updation, deletion, etc. 
	 * HashMap class is found in the java.util package.
	 * HashMap in Java is like the legacy Hashtable class, but it is not synchronized. 
	 * It allows us to store the null elements as well, but there should be only one null key. 
	 * Since Java 5, it is denoted as HashMap<K,V>, where K stands for key and V for value. 
	 * It inherits the AbstractMap class and implements the Map interface.
	 */
	
	/*
	 * Points to remember
	   - Java HashMap contains values based on the key.
       - Java HashMap contains only unique keys.
	   - Java HashMap may have one null key and multiple null values.
	   - Java HashMap is non synchronized.
	   - Java HashMap maintains no order.
	   - The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
	 */
	
	public void hashMap() {
		
		/*
		 * All methods which we cover in Map interface subject, can be used for HashMap also.
		 */
		
		/*
		 * Constructors of Java HashMap class
		 */
		
		/*
		 * 1) HashMap()
		 *    It is used to construct a default HashMap.
		 */
		var map1 = new HashMap<String, String>();
		
		/*
		 * 2) HashMap(Map<? extends K,? extends V> m) 		
		 *    It is used to initialize the hash map by using the elements of the given Map object m.
		 */
		Map<? extends Number, ? extends String> map = new HashMap<Number, String>();
		var map2 = new HashMap<Number, String>(map);
		
		/*
		 * 3) HashMap(int capacity)
		 *    It is used to initializes the capacity of the hash map to the given integer value, capacity.
		 */
		var map3 = new HashMap<String, Integer>(5);
		
		/*
		 * 4) HashMap(int capacity, float loadFactor)
		 *    It is used to initialize both the capacity and load factor of the hash map by using its arguments.
		 */
		var map4 = new HashMap<String, Integer>(5, 0.6f);
		
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		students.put(76543, "Selim"); 
		students.put(76545, "Sinan");    
		students.put(76547, "Selin");   
		students.put(76549, "Sinem");
		
		System.out.println("Iterating students: ");
		for (Map.Entry student : students.entrySet()) {
			System.out.println("Student Id: " + student.getKey() + " - " + "Student Name: " + student.getValue());
		}
		System.out.println("******************************************************");
		
		/*
		 * You can not store duplicate keys in HashMap. However, 
		 * if you try to store duplicate key with another value, it will replace the value.
		 */
		students.put(76549, "Serpil");
		System.out.println("Iterating students after trying to duplicate key 76549: ");
		for (Map.Entry student : students.entrySet()) {
			System.out.println("Student Id: " + student.getKey() + " - " + "Student Name: " + student.getValue());
		}
		System.out.println("******************************************************");
		
		/*
		 * Other Way of Iteration
		 */
		System.out.println("Foreach iteration on map: ");
		students.forEach((k, v) -> {
			System.out.println("Student Id: " + k + " - " + "Student Name: " + v);
		});
		System.out.println("******************************************************");
	}

	/*
	 * Difference between HashSet and HashMap class in Java
	 */
	
	/*
	 * The HashMap and HashSet in Java are the most popular Collection classes. Both are used for the data structure. 
	 * The following table describes the difference between HashMap and HashSet:
	   
	   - Definition :
	     - Java HashMap is a hash table based implementation of Map interface.
	     - HashSet is a Set. It creates a collection that uses a hash table for storage.
	   
	   - Implementation :
	     - HashMap implements Map, Cloneable, and Serializable interfaces.
	     - HashSet implements Set, Cloneable, Serializable, Iterable and Collection interfaces.
	   
	   - Stores :
	     - In HashMap we store a key-value pair. It maintains the mapping of key and value.
	     - In HashSet, we store objects.
	    
	   - Duplicate values :
	     - HashMap does not allow duplicate keys, but duplicate values are allowed.
	     - HashSet does not allow duplicate values.
	   
	   - Null values : 
	     - HashMap can contain a single null key and multiple null values.
	     - HashSet can contain a single null value.
	   
	   - Method of insertion :
	     - HashMap uses the put() method to add the elements in the HashMap.
	     - HashSet uses the add() method to add elements in the HashSet.
	     
	   - Performance : 
	     - HashMap is faster than HashSet because values are associated with a unique key.
	     - HashSet is slower than HashMap because the member object is used for 
	       calculating hashcode value, which can be same for two objects.
	   
	   - The Number of objects :
	     - In HashMap, there are two objects created during put operation, one for key and one for value.
	     - In HashSet, only one object is created during the add operation.
	   
	   - Storing Mechanism : 
	     - HashMap internally uses hashing to store objects.
	     - HashSet internally uses a HashMap object to store objects.
	   
	   - Uses :
	     - Always prefer HashMap when we do not maintain the uniqueness.
	     - HashSet is used when we need to maintain the uniqueness of data.	   
	 */
}
