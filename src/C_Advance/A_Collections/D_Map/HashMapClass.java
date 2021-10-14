package C_Advance.A_Collections.D_Map;

import java.util.HashMap;
import java.util.Map;

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
	}
}
