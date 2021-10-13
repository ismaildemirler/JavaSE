package C_Advance.A_Collections.C_Set;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetClass {

	/*
	 * Java TreeSet class implements the Set interface that uses a tree for storage. 
	 * It inherits AbstractSet class and implements the NavigableSet interface. 
	 * The objects of the TreeSet class are stored in ascending order.
	 * 
	 * The important points about Java TreeSet class are:
	   - Java TreeSet class contains unique elements only like HashSet.
	   - Java TreeSet class access and retrieval times are quiet fast.
	   - Java TreeSet class doesn't allow null element.
	   - Java TreeSet class is non synchronized.
	   - Java TreeSet class maintains ascending order.
	 */
	
	/*
	 * Java TreeSet class implements the NavigableSet interface. 
	 * The NavigableSet interface extends SortedSet, Set, Collection 
	 * and Iterable interfaces in hierarchical order.
	 */
	
	public void treeSet() {
		
		/*
		 * Constructors of Java TreeSet class
		 */
		
		/*
		 * 1) It is used to construct an empty tree set that will be sorted 
		 *    in ascending order according to the natural order of the tree set.
		 */		
		TreeSet<String> set1 = new TreeSet<>();
		
		/*
		 * 2) It is used to build a new tree set that contains the elements of the collection.
		 */
		var set2 = new TreeSet<Collection<? extends String>>();
		
		/*
		 * 3) It is used to construct an empty tree set that will be sorted 
		 *    according to given comparator.
		 */
		var set3 = new TreeSet<Comparator<? extends String>>();
		
		/*
		 * 4) It is used to build a TreeSet that contains the elements of the given SortedSet.
		 */
		var set4 = new TreeSet<SortedSet<String>>();
		
		/*
		 * Java TreeSet examples
		 */
		TreeSet<String> countries = new TreeSet<String>();
		countries.add("Turkey");
		countries.add("USA");
		countries.add("Russia");
		countries.add("England");
		countries.add("Italy");
		
		Iterator<String> iterator1 = countries.iterator();
		System.out.println("Traversing countries through Iterator in non order");
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());			
		}
		System.out.println("***********************");
		
		Iterator iterator2 = countries.descendingIterator();
		System.out.println("Traversing countries through Iterator in descending order");
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println("*****************************");
		
		
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(24);
		numbers.add(70);
		numbers.add(13);
		numbers.add(21);
		
		/*
		 * Retrieve the highest and lowest values
		 * first() -> It returns the lowest(first) element currently in this sorted set.
		 * last() -> It returns the highest(last) element currently in this sorted set.
		 */
		
		System.out.println("Highest Value: " + numbers.pollLast());
		System.out.println("Lowest Value: " + numbers.pollFirst());
		System.out.println("**************************");
		
		/*
		 * Retrieve and remove the highest and lowest values
		 * pollFirst() -> It is used to retrieve and remove the lowest(first) element.
		 * pollLast() -> It is used to retrieve and remove the highest(last) element.
		 */
		
		System.out.println("Highest Value: " + numbers.pollLast());
		System.out.println("Lowest Value: " + numbers.pollFirst());
		System.out.println("**************************");
		
		
		TreeSet<String> charachterSet = new TreeSet<String>();
		charachterSet.add("A");
		charachterSet.add("B");
		charachterSet.add("E");
		charachterSet.add("D");
		charachterSet.add("C");
		
		System.out.println("Characters Set Initially : " + charachterSet);
		
		/*
		 * Performing Some NavigableSet Operations
		 */
		
		/*
		 * NavigableSet descendingSet()
		 * It returns the elements in reversed order.
		 */
		System.out.println("NavigableSet Reverse Set : " + charachterSet.descendingSet());
		
		/*
		 * NavigableSet headSet(E toElement, boolean inclusive)
		 * It returns the group of elements that are that are less than or equal
		 * to (if, inclusive is true) the specified element.
		 */
		System.out.println("NavigableSet Head Set : " + charachterSet.headSet("C", true));
		
		/*
		 * NavigableSet subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
		 * It returns a set of elements that lie between the given range.
		 */
		System.out.println("NavigableSet SubSet : " + charachterSet.subSet("A", false, "E", true));
		
		/*
		 * NavigableSet tailSet(E fromElement, boolean inclusive)
		 * It returns a set of elements that are greater than or 
		 * equal to (if, inclusive is true) the specified element.
		 */
		System.out.println("NavigableSet TailSet : " + charachterSet.tailSet("C", false));
		
		System.out.println("**********************************");
		
		/*
		 * Performing Some SortedSet Operations
		 */
		
		System.out.println("Characters Set Initially : " + charachterSet);
		
		/*
		 * SortedSet headSet(E toElement)
		 * It returns the group of elements that are less than the specified element.
		 */
		System.out.println("SortedSet Head Set : " + charachterSet.headSet("C"));
		
		/*
		 * SortedSet subSet(E fromElement, E toElement)
		 * It returns a set of elements that lie between 
		 * the given range which includes fromElement and excludes toElement.
		 */
		System.out.println("SortedSet SubSet : " + charachterSet.subSet("A", "E"));
		
		/*
		 * SortedSet tailSet(E fromElement)
		 * It returns a set of elements that are greater 
		 * than or equal to the specified element.
		 */
		System.out.println("SortedSet TailSet: " + charachterSet.tailSet("C"));
		
		System.out.println("*************************************");
	}
}
