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
	
	public void sortingHashMap() {
		
		/*
		 * Java HashMap does not preserve any order by default. 
		 * If there is a need to sort HashMap we sort it explicitly based on the requirements. 
		 * Java provides an option to sort HashMap based on keys and values. 
	       - Sort HashMap by Keys
		   - Sort HashMap by Values
		 */
		
		/*
		 * Sort HashMap by Keys
		 * There are following ways to sort HashMap by keys:
		   - By using TreeMap
		   - By using LinkedHashMap
		 
		 * When we use LinkedHashMap, we should follow the process: 
		   When we use LinkedHashMap, then we need to get Key set. 
		   Convert the Set into List, sort the list and then add the sorted list 
		   into LinkedHashMap in the same order. The same process we have done in the example Sort HashMap by Value.
		   
		 * In the following example, we use TreeMap constructor to sort the elements and pass the object of HashMap 
		 * class as an argument. This is the simplest way to sort HashMap by Keys.
		 */
		
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		students.put(76543, "Selim"); 
		students.put(76545, "Sinan");    
		students.put(76547, "Selin");   
		students.put(76549, "Sinem");
		students.put(76541, "Alp");
		
		System.out.println("Before sorting students by key: ");
		students.forEach((k, v) -> {
			System.out.println(k + " - " + v);
		});
		System.out.println("*************************");
		
		//using TreeMap constructor to sort the HashMap  
		TreeMap<Integer, String> treeMapStudents = new  TreeMap<Integer, String> (students);

		System.out.println("After sorting students by key: ");
		treeMapStudents.forEach((k, v) -> {
			System.out.println(k + " - " + v);
		});
		System.out.println("*************************");
		
		
		/*
		 * Sort HashMap by Values using Comparator Interface
		 * In Java, sorting HashMap by values is complicated because there is no direct method is available. 
		 * To sort the HashMap by values, we need to create a Comparator. 
		 * It compares two elements based on the values.
		 * After that get the Set of elements from the Map and convert Set into the List. 
		 * Use the Collections.sort(List) method to sort the list of elements by values 
		 * by passing customized comparator. Now create a new LinkedHashMap and copy the sorted elements into that. 
		 * Since LinkedHashMap guarantees the insertion order of mappings. We get a HashMap whose values are in sorted order.
		 * There is a slight difference between sorting HashMap by Keys and Values is that it can have duplicate 
		 * values but not duplicate Keys. We cannot use TreeMap to sort values because TreeMap sorts elements by Keys.
		 */
		System.out.println("Before sorting students by value: ");
		students.forEach((k, v) -> {
			System.out.println(k + " - " + v);
		});
		System.out.println("*************************");
		
		Map<Integer, String> sortedStudents = sortValues(students);
		System.out.println("After sorting students by value: ");
		sortedStudents.forEach((k, v) -> {
			System.out.println(k + " - " + v);
		});
		System.out.println("*************************");
	}
	
	private HashMap sortValues(HashMap map) {
		List list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
			}
		});
		
		HashMap sortedHashMap = new LinkedHashMap();
		list.forEach(item -> {
			Map.Entry entry = (Entry) item;
			sortedHashMap.put(entry.getKey(), entry.getValue());
		});
		return sortedHashMap;
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
