package C_Advance.A_Collections.C_Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	/*
	 * Java LinkedHashSet class is a Hashtable and Linked list implementation of 
	 * the set interface. It inherits HashSet class and implements Set interface.
	 * 
	 * The important points about Java LinkedHashSet class are:
	   - Java LinkedHashSet class contains unique elements only like HashSet.
	   - Java LinkedHashSet class provides all optional set operation and permits null elements.
	   - Java LinkedHashSet class is non synchronized.
	   - Java LinkedHashSet class maintains insertion order.
	 */
	
	/*
	 * The LinkedHashSet class extends HashSet class which implements Set interface. 
	 * The Set interface inherits Collection and Iterable interfaces in hierarchical order.
	 */
	
	/*
	 * LinkedHashSet stores elements by using HashTable and LinkedList architectures.
	 * So LinkedHashSet maintains insertion order of elements.
	 * Adding, removing and searching have O(1) time complexity in LinkedHashSet.
	 */
	
	public void linkedHashSet() {
		
		/*
		 * Constructors of Java LinkedHashSet class
		 */
		
		/*
		 * 1) It is used to construct a default LinkedHashSet.
		 */
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		
		/*
		 * 2) It is used to initialize the hash set by using the elements of the collection.
		 */
		var set2 = new LinkedHashSet<Collection<? extends String>>();
		
		/*
		 * 3) It is used initialize the capacity of the linked hash set to 
		 * 	  the given integer value capacity.
		 */
		LinkedHashSet<String> set3 = new LinkedHashSet<String>(12);
		
		/*
		 * 4) It is used to initialize both the capacity and the fill ratio 
		 *    (also called load capacity) of the hash set from its argument.
		 */
		LinkedHashSet<String> set4 = new LinkedHashSet<String>(12, 0.8f);
		
		/*
		 * Java LinkedHashSet example ignoring duplicate Elements
		 */
		LinkedHashSet<String> cities = new LinkedHashSet<String>();
		cities.add("Ýstanbul");
		cities.add("Ankara");
		cities.add("Sakarya");
		cities.add("Ýstanbul");
		System.out.println("Cities: ");
		cities.forEach(city -> {
			System.out.println(city);
		});
		System.out.println("*********************");
		
		/*
		 * And like we see above, items are in insertion order
		 */
		
		/*
		 * Java LinkedHashSet from another Collection
		 */
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(9);
		
		HashSet<Integer> set = new HashSet<Integer>(numbers);
		set.add(11);
		
		System.out.println("Numbers: ");
		set.forEach(number -> {
			System.out.println(number);
		});
		System.out.println("*********************");
	}
}
