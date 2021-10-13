package C_Advance.A_Collections.C_Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class HashSetClass {
	
	/*
	 * Java HashSet
	 */
	
	/*
	 * Java HashSet class is used to create a collection 
	 * that uses a hash table for storage. It inherits the 
	 * AbstractSet class and implements Set interface.
	 * 
	 * The important points about Java HashSet class are:
	   - HashSet stores the elements by using a mechanism called hashing.
	   - HashSet contains unique elements only.
	   - HashSet allows null value.
	   - HashSet class is non synchronized.
	   - HashSet doesn't maintain the insertion order. 
	     Here, elements are inserted on the basis of their hashcode.
	   - HashSet is the best approach for search operations.
	   - The initial default capacity of HashSet is 16, and the load factor is 0.75.
	 */
	
	/*
	 * The HashSet class extends AbstractSet class which implements Set interface. 
	 * The Set interface inherits Collection and Iterable interfaces in hierarchical order.
	 */
	
	/*
	 * HashSet uses HashTable mechanism, so elements are not in insertion order.
	 * Adding, removing and searching have O(1) time complexity in HashSet.
	 */
		
	public void hashSet() {
		
		/*
		 * Constructors of Java HashSet class
		 */
		
		/*
		 * 1) It is used to construct a default HashSet.
		 */
		HashSet<String> hashSet1 = new HashSet<>();
		
		/*
		 * 2) It is used to initialize the capacity of the hash set to the 
		 *    given integer value capacity. The capacity grows automatically 
		 *    as elements are added to the HashSet.
		 */
		HashSet<String> hashSet2 = new HashSet<String>(5);
		
		/*
		 * 3) This constructor initializes both the capacity and the load factor 
		 *    (also called fill ratio or load capacity) of the hash set from its arguments. 
		 *    Here the fill ratio must be between 0.0 and 1.0, and it determines 
		 *    how full the hash set can be before it is resized upward. 
		 *    Specifically, when the number of elements is greater than the capacity 
		 *    of the hash set multiplied by its fill ratio, the hash set is expanded.
		 */
		HashSet<String> hashSet3 = new HashSet<String>(5, 0.6f);
		
		/*
		 * 4) It is used to initialize the hash set 
		 *    by using the elements of the collection c.
		 */
		ArrayList<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		Collection<? extends String> c = list;
		HashSet<String> hashSet4 = new HashSet<String>(c);
		
		/*
		 * Java HashSet from another Collection
		 */
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mehmet");
		names.add("Ayþe");
		names.add("Ekrem");
		names.add("Ýsmail");
		names.add("Sevgi");
		
		HashSet<String> set = new HashSet<String>(names);
		set.add("Ahmet");
		
		System.out.println("Names: ");
		set.forEach(item -> {
			System.out.println(item);
		});
		System.out.println("***************************");
		
		/*
		 * And like we see above, items are not in insertion order
		 */
		
		/*
		 * HashSet stores elements uniquely
		 * Like below example, when we add same item as 'Ýsmail' HashSet does not 
		 * accept this and Set list remains same.
		 */
		names.add("Ýsmail");
		System.out.println("Names: ");
		set.forEach(item -> {
			System.out.println(item);
		});
		System.out.println("***************************");
		
		/*
		 * Methods in 'commonMethodsOfSetInterface' method above is valid for HashSet.
		 */
	}
}
