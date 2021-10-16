package C_Advance.A_Collections.D_Map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
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

	public void workingOfHashMap() {
		
		/*
		 * What is Hashing
		 * It is the process of converting an object into an integer value. 
		 * The integer value helps in indexing and faster searches.
		 */
		
		/*
		 * What is HashMap
		 * HashMap is a part of the Java collection framework. It uses a technique called Hashing. 
		 * It implements the map interface. It stores the data in the pair of Key and Value. 
		 * HashMap contains an array of the nodes, and the node is represented as a class. 
		 * It uses an array and LinkedList data structure internally for storing Key and Value. 
		 * There are four fields in HashMap (Node<K, v>):
		   1. int hash
		   2. K key
		   3. V value
		   4. Node<K, V> next
		 */
		
		/*
		 * Before understanding the internal working of HashMap, you must be aware of hashCode() and equals() method.
	       - equals(): It checks the equality of two objects. It compares the Key, whether they are equal or not. 
	         It is a method of the Object class. It can be overridden. If you override the equals() method, 
	         then it is mandatory to override the hashCode() method.
	       - hashCode(): This is the method of the object class. It returns the memory reference of the object in integer form. 
	         The value received from the method is used as the bucket number. The bucket number is the address of the element 
	         inside the map. Hash code of null Key is 0.
		   - Buckets: Array of the node is called buckets. Each node has a data structure like a LinkedList. 
		     More than one node can share the same bucket. It may be different in capacity.
		 */
		
		/*
		 * Insert Key, Value pair in HashMap
		 * We use put() method to insert the Key and Value pair in the HashMap. 
		 * The default size of HashMap is 16 (0 to 15).
		 */
		HashMap<String, String> teams = new HashMap<String, String>();
		teams.put("Club1", "Player 1");
		teams.put("Club2", "Player 2");
		teams.put("Club3", "Player 3");
		
		/*
		 * Let's see at which index the Key, value pair will be saved into HashMap. 
		 * When we call the put() method, then it calculates the hash code of the Key "Club1" 
		 * Suppose the hash code of "Club1" is 2657860. To store the Key in memory, we have to calculate the index.
		 */
		
		/*
		 * Calculating Index
		 * Index minimizes the size of the array. The Formula for calculating the index is:
		 * 
		 * Index = hashcode(Key) & (n-1)  
		 * 
		 * Where n is the size of the array. Hence the index value for "Club1" is:
		 * 
		 * Index = 2657860 & (16-1) = 4  
		 * 
		 * The value 4 is the computed index value where the Key and value will store in HashMap.
		 */
		
		/*
		 * Hash Collision
		 * This is the case when the calculated index value is the same for two or more Keys. 
		 * Let's calculate the hash code for another Key "Club2" Suppose the hash code for "Club2" is 63281940. 
		 * To store the Key in the memory, we have to calculate index by using the index formula.
		 * 
		 * Index = 63281940 & (16-1) = 4  
		 * 
		 * The value 4 is the computed index value where the Key will be stored in HashMap. 
		 * In this case, equals() method check that both Keys are equal or not. 
		 * If Keys are same, replace the value with the current value. Otherwise, 
		 * connect this node object to the existing node object through the LinkedList. 
		 * Hence both Keys will be stored at index 4.
		 * Similarly, we will store the Key "Club3" Suppose hash code for the Key is 2349873. 
		 * The index value will be 1. Hence this Key will be stored at index 1.
		 */
		
		/*
		 * get() method in HashMap
		 * get() method is used to get the value by its Key. It will not fetch the value if you don't know the Key. 
		 * When get(K Key) method is called, it calculates the hash code of the Key.
		 * Suppose we have to fetch the Key "Club1". The following method will be called.
		 * 
		 * map.get(new Key("Club1"));  
		 * 
		 * It generates the hash code as 2657860. Now calculate the index value of 2657860 by using index formula. 
		 * The index value will be 4, as we have calculated above. get() method search for the index value 4. 
		 * It compares the first element Key with the given Key. If both keys are equal, then it returns 
		 * the value else check for the next element in the node if it exists. In our scenario, it is found as 
		 * the first element of the node and return the value 'Player 1'.
		 * 
		 * Let's fetch another Key "Club2"
		 * The hash code of the Key "Club2" is 63281940. The calculated index value of 63281940 is 4, 
		 * as we have calculated for put() method. Go to index 4 of the array and compare the first element's Key 
		 * with the given Key. It also compares Keys. In our scenario, the given Key is the second element, 
		 * and the next of the node is null. It compares the second element Key with the specified Key and 
		 * returns the value 'Player 2'. It returns null if the next of the node is null.
		 */
		
		/*
		 * Generally if we add same item in a HashSet, it can not be added.
		 * Let's do an example with our custom Object. 
		 */
		HashSet<Citizen> citizens = new HashSet<Citizen>();
		citizens.add(new Citizen("Ýsmail", "111"));
		citizens.add(new Citizen("Ali", "222"));
		citizens.add(new Citizen("Mehmet", "333"));
		citizens.add(new Citizen("Ýsmail", "111"));
		
		System.out.println("Citizens: ");
		citizens.forEach(citizen -> {
			System.out.println(citizen);
		});
		System.out.println("*******************************");
		
		/*
		 * Like we see above objects which has same name and same identity numbers can be added to HashSet.
		 * Because in String or similar data type Java can execute hashCode and equals() methods
		 * and can understand if the item is same or not. But for our custom objects for this,
		 * we have to override hashCode and equals() methods to provide uniqueness.
		 * To show this we will use Customer class which got hashCode and equals() methods overridden below.
		 */
		
		HashSet<Customer> customers = new HashSet<Customer>();
		customers.add(new Customer("Ýsmail", "111"));
		customers.add(new Customer("Ali", "222"));
		customers.add(new Customer("Mehmet", "333"));
		customers.add(new Customer("Ýsmail", "111"));
		
		System.out.println("Customers: ");
		customers.forEach(customer -> {
			System.out.println(customer);
		});
		System.out.println("*******************************");
		
		/*
		 * Like we see above, when we generate hashCode() and equals() method in our object
		 * same instances which has same name and identity number can not be added to HashSet
		 */
	}
	
	public class Citizen {
		private String name;
		private String identityNumber;
		
		public Citizen(String name, String identityNumber) {
			this.name = name;
			this.identityNumber = identityNumber;
		}

		@Override
		public String toString() {
			return "Identity Number : " + identityNumber + " - " + "Name: " + name;
		}
	}
	
	public class Customer {
		private String name;
		private String identityNumber;
		
		public Customer(String name, String identityNumber) {
			this.name = name;
			this.identityNumber = identityNumber;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(identityNumber, name);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Customer other = (Customer) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return identityNumber == other.identityNumber && Objects.equals(name, other.name);
		}

		@Override
		public String toString() {
			return "Identity Number : " + identityNumber + " - " + "Name: " + name;
		}

		private HashMapClass getEnclosingInstance() {
			return HashMapClass.this;
		}
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
