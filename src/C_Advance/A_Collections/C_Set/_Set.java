package C_Advance.A_Collections.C_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class _Set {

	/*
	 * Set Interfaces in Java Collections
	 */
	
	/*
	 * A Set is a Collection that cannot contain duplicate elements. 
	 * It models the mathematical set abstraction. The Set interface contains 
	 * only methods inherited from Collection and adds the restriction that duplicate elements are prohibited.
	 * Set also adds a stronger contract on the behavior of the equals and hashCode operations, 
	 * allowing Set instances to be compared meaningfully even if their implementation types differ.
	 * The set interface is present in java.util package and extends the Collection interface 
	 * is an unordered collection of objects in which duplicate values cannot be stored. 
	 * It is an interface that implements the mathematical set. 
	 * This interface contains the methods inherited from the Collection interface 
	 * and adds a feature that restricts the insertion of the duplicate elements.
	 * There are two interfaces that extend the set implementation namely SortedSet and NavigableSet.
	 * The navigable set extends the sorted set interface. 
	 * Since a set doesn’t retain the insertion order, the navigable set interface 
	 * provides the implementation to navigate through the Set. The class which implements 
	 * the navigable set is a TreeSet which is an implementation of a self-balancing tree. 
	 * Therefore, this interface provides us with a way to navigate through this tree.
	 */
	
	/*
	 * Set Implementations
	 * Being a Collection subtype all methods in the Collection 
	 * interface are also available in the Set interface.
	 * Since Set is an interface you need to instantiate a concrete 
	 * implementation of the interface in order to use it. 
	 * You can choose between the following Set implementations in the Java Collections API:
       - java.util.EnumSet
	   - java.util.HashSet
	   - java.util.LinkedHashSet
	   - java.util.TreeSet

     * Each of these Set implementations behaves a little differently with respect to 
     * the order of the elements when iterating the Set, and the time (big O notation) 
     * it takes to insert and access elements in the sets.
     * HashSet is backed by a HashMap. It makes no guarantees about the sequence 
     * of the elements when you iterate them.
     * LinkedHashSet differs from HashSet by guaranteeing that the order of the elements 
     * during iteration is the same as the order they were inserted into the LinkedHashSet. 
     * Reinserting an element that is already in the LinkedHashSet does not change this order.
     * TreeSet also guarantees the order of the elements when iterated, but the order 
     * is the sorting order of the elements. In other words, the order in which the elements 
     * would be sorted if you used a Collections.sort() on a List or array containing these elements. 
     * This order is determined either by their natural order (if they implement Comparable), 
     * or by a specific Comparator implementation.
     * 
     * There are also Set implementations in the java.util.concurrent package, 
     * but we will leave the concurrency utilities out of this tutorial.
	 */
	
	public void setInterface() {
		
		/*
		 * Here are a few examples of how to create a Set instance
		 */
		
		Set set1 = new HashSet<>();
		Set set2 = new LinkedHashSet<>();
		Set set3 = new TreeSet<>();
		
		/*
		 * By default you can put any Object into a Set, but from Java 5, 
		 * Java Generics makes it possible to limit the types of object you can insert into a Set. 
		 */
		Set<String> set = new HashSet<String>();
		
		/*
		 * This Set can now only have String instances inserted into it. 
		 * You can then access and iterate its elements without casting them.
		 */
		for (String item : set) {
			//System.out.println(item);
		}
		
		
		/*
		 * Set.of()
		 */
		
		/*
		 * Since Java 9 the Set interface contains a set of static factory methods 
		 * that can create unmodifiable (immutable) Set instances.
		 * The Java Set static factory methods are called of() and take either zero or more parameters. 
		 * Here is first an example of creating an empty, immutable Set using Set.of():
		 */
		Set set4 = Set.of();
		
		/*
		 * This example creates an unmodifiable Set with no generic type specified. 
		 * Specifying a generic type of the Set returned by Set.of() looks like this:
		 */
		Set<String> set5 = Set.<String>of();
		
		/*
		 * You can also create unmodifiable Set instances which contains elements of your choice. 
		 * You pass these elements to the of() method. Here is an example of how creating 
		 * a Set containing elements using the Set.of() method looks:
		 */
		Set<String> set6 = Set.<String>of("val1", "val2", "val3");
	}

	public void commonMethodsOfSetInterface() {
		
		/*
		 * We will cover common methods of classes which implements Set interface.
		 * We will use one of the class (ex: HashSet<>) which implements Set interface to show common methods.
		 * These methods are common for LinkedHashset<> and TreeSet<> also.
		 */
		
		/*
		 * Add Element to Set
		 * To add elements to a Set you call its add() method. 
		 * This method is inherited from the Collection interface. 
		 * Here are a few examples:
		 */
		Set<String> set1 = new HashSet<String>();
		set1.add("Item 1");
		set1.add("Item 2");
		set1.add("Item 3");
		set1.add("Item 4");
		set1.add("Item 5");
		set1.add("Item 6");
		
		/*
		 * Iterate Set Elements
		 * There are two ways to iterate the elements of a Java Set:
		   1. Using an Iterator obtained from the Set.
		   2. Using the for-each loop.
		   3. Both of these options are covered in the following sections.
		 
		 * When iterating the elements in the Set the order of the elements 
		 * depends on what Set implementation you use, as mentioned earlier.
		 */
		
		/*
		 * 1) Iterate Set Using Iterator 
		 *    To iterate the elements of a Set using an Java Iterator, 
		 *    you must first obtain an Iterator from the Set. You obtain an Iterator 
		 *    from a Set by calling the iterator() method. 
		 *    Here is an example of obtaining an Iterator from a Set:
		 */
		System.out.println("Items by iterator: ");
		Iterator iterator = set1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());			
		}
		System.out.println("**********************");
		
		/*
		 * 2) Iterate Set Using For-Each Loop 
		 *    The second way to iterate the elements of a Set is by using a for-each loop. 
		 *    Here is how iterating the elements of a Set using a for-each loop looks:
		 */
		System.out.println("Items by foreach loop: ");
		for (String item : set1) {
			System.out.println(item);
		}
		System.out.println("**********************");
		
		/*
		 * 3) Iterate Set Using the Java Stream API
		 *    The third way to iterate a Java Set is via the Java Stream API. 
		 *    To itereate a Java Set using the Java Stream API you must create a Stream from the Set. 
		 *    Here is an example of creating a Java Stream from a Set and iterate the Stream:
		 */
		System.out.println("Items by Stream: ");
		Stream<String> stream = set1.stream();
		stream.forEach(item -> {
			System.out.println(item);
		});
		System.out.println("**********************");
		
		/*
		 * Remove items from Set
		 * You remove elements from a Java Set by calling the remove(Object o) method. 
		 * Here is an example of removing an element from a Java Set:
		 */
		set1.remove("Item 6");
		System.out.println("Items after removing");
		set1.forEach(item -> {
			System.out.println(item);
		});
		System.out.println("**********************");
		
		/*
		 * Remove all items from Set
		 * You can remove all elements from a Java Set using the clear() method. 
		 * Here is an example of removing all elements from a Java Set:
		 */
		set1.clear();
		
		/*
		 * Add all items from another collection
		 * The Java List interface has a method called addAll() 
		 * which adds all elements from another Collection (List or Set) to the Set. 
		 * In set theory this corresponds to the union of the Set and the other Collection. 
		 * Here is an example of adding all elements from another Set to a Java Set:
		 */
		set1.add("Item1");
		
		Set<String> set2 = new HashSet<String>();
		set2.add("Item 2");
		set2.add("Item 3");
		set2.add("Item 4");
		set2.add("Item 5");
		set2.add("Item 6");
		
		set2.addAll(set1);
		System.out.println("New Set list after add all : ");
		set2.forEach(item -> {
			System.out.println(item);
		});
		System.out.println("****************************");
		
		/*
		 * Remove all elements from another collection
		 * The Java Set interface as a method called removeAll() 
		 * which removes all elements in the Set which are also 
		 * present in another Collection. In set theory, this is referred 
		 * to as the difference between the Set and the other Collection. 
		 * Here is an example of removing all elements from a Java Set 
		 * which are also present in another Collection:
		 */
		Set<String> set3 = new HashSet<String>();
		set3.add("Item 6");
		set2.removeAll(set3);
		System.out.println("New Set list after remove all : ");
		set2.forEach(item -> {
			System.out.println(item);
		});
		System.out.println("****************************");
		
		/*
		 * After running this Java example the element Item 6 has been removed, 
		 * because it was present in set2, which was given as parameter to set2.removeAll(set3) .
		 */
		
		/*
		 * Retain All Elements Present in Another Collection
		 * The Java Set interface also has a method which retains all elements 
		 * in the Set which are also present in another Collection. 
		 * All elements found in the Set which are not present in the other Collection 
		 * will be removed. In set theory this is referred to as the intersection between 
		 * the Set and the other Collection. Here is an example of retaining all elements 
		 * in a Java Set which are also present in another Set:
		 */
		Set<String> setA = new HashSet<>();
		setA.add("Mathematic");
		setA.add("Physic");
		setA.add("Chemistry");

		Set<String> setB = new HashSet<>();
		setB.add("Chemistry");
		setB.add("Biology");

		setA.retainAll(setB);
		System.out.println("List after retain all : ");
		setA.forEach(item -> {
			System.out.println(item);
		});
		System.out.println("****************************");
		
		/*
		 * After running this Java code, the set will only contain the String element Chemistry. 
		 * That is the only element which is present in both setA and setB.
		 */
		
		/*
		 * Size Method
		 * You can check the size of a Java Set using the size() method. 
		 * The size of a Set is the number of elements contained in the Set. 
		 * Here is an example of reading the size of a Java Set:
		 */
		System.out.println("Size of the list: " + set1.size());
		System.out.println("****************************");
		
		/*
		 * Check if Set is empty
		 * You can check if a Java Set is empty, meaning it contains no elements, 
		 * by calling the isEmpty() method on the Set. 
		 * Here is an example of checking if a Java Set is empty:
		 */
		String isEmtpy = set1.isEmpty() ? "Set is empty" : "Set is not empty";
		System.out.println("Set is empty or not : " + isEmtpy);
		System.out.println("****************************");
		
		/*
		 * Check if Set contains element
		 * You can check if a Java Set contains a given element 
		 * (object) by calling the contains() method. Here is an example 
		 * of checking if a Java Set contains a given element:
		 */
		String isContains = set1.contains("Item 2") ? "Set contains item 2" : "Set does not contain item 2";
		System.out.println("Set contains item 2 or not : " + isContains);
		System.out.println("****************************");
		
		/*
		 * After running this Java code the contains Item 2 variable will contain 
		 * the value true because the Set actually contains the String Item 2.
		 * To determine if the Set contains the element, the Set will internally 
		 * iterate its elements and compare each element to the object passed as parameter. 
		 * The comparison uses the Java equals method of the element to check if the element 
		 * is equal to the parameter.
		 * 
		 * Since it is possible to add null values to a Set, 
		 * it is also possible to check if the Set contains a null value. 
		 * Here is how you check if a Set contains a null value:
		 */
		set1.add(null);
		String isNullContains = set1.contains(null) ? "Set contains null" : "Set does not contain null";
		System.out.println("Set contains null or not : " + isNullContains);
		System.out.println("****************************");
		
		/*
		 * Obviously, if the input parameter to contains() is null, 
		 * the contains() method will not use the equals() method 
		 * to compare against each element, but rather use the == operator.
		 */
		
		/*
		 * Convert Java Set to List
		 * You can convert a Java Set to a Java List by creating a List 
		 * and calling its addAll() method, passing the Set as parameter to the addAll() method. 
		 * Here is an example of converting a Java Set to a List:
		 */
		List<String> list = new ArrayList<String>();
		list.addAll(set1);
		
		/*
		 * After running this Java example, the List will contain the String items. 
		 * Since these were all the elements present in the Set when List addAll(set) was called.
		 */
	}
}
