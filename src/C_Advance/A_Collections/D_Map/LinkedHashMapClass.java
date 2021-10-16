package C_Advance.A_Collections.D_Map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class LinkedHashMapClass {

	/*
	 * Java LinkedHashMap class
	 */
	
	/*
	 * Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface, 
	 * with predictable iteration order. It inherits HashMap class and implements the Map interface.
	 * 
	 * Points to remember
	   - Java LinkedHashMap contains values based on the key.
	   - Java LinkedHashMap contains unique elements.
	   - Java LinkedHashMap may have one null key and multiple null values.
	   - Java LinkedHashMap is non synchronized.
	   - Java LinkedHashMap maintains insertion order.
	   - The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
	   - public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>
	 */
	
	public void linkedHashMap() {
		
		/*
		 * Constructors of Java LinkedHashMap class
		 */
		
		/*
		 * 1) LinkedHashMap()
		 *    It is used to construct a default LinkedHashMap.
		 */
		LinkedHashMap<Integer, String> map1 = new LinkedHashMap<Integer, String>();
		
		/*
		 * 2) LinkedHashMap(int capacity)
		 *    It is used to initialize a LinkedHashMap with the given capacity.
		 */
		LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>(12);
		
		/*
		 * 3) LinkedHashMap(int capacity, float loadFactor)
		 *    It is used to initialize both the capacity and the load factor.
		 */
		LinkedHashMap<Integer, String> map3 = new LinkedHashMap<Integer, String>(12, 0.8f);
		
		/*
		 * 4) LinkedHashMap(int capacity, float loadFactor, boolean accessOrder)
		 *    It is used to initialize both the capacity and the load factor with specified ordering mode.
		 */
		LinkedHashMap<Integer, String> map4 = new LinkedHashMap<Integer, String>(12, 0.8f, true);
		
		/*
		 * 5) LinkedHashMap(Map<? extends K,? extends V> m)
		 *    It is used to initialize the LinkedHashMap with the elements from the given Map class m.
		 */
		Map<? extends Number, ? extends String> map = new LinkedHashMap<>();
		LinkedHashMap<Number, String> map5 = new LinkedHashMap<Number, String>(map);
		
		/*
		 * Methods which we cover in Map interface is valid for LinkedHashMap also.
		 */
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
}
