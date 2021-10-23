package C_Advance.A_Collections;

public class _Collections {
	
	/*
	 * Collections in Java
	 */
	
	/*
	 * The Collection in Java is a framework that provides an architecture to store and manipulate 
	 * the group of objects. Java Collections can achieve all the operations that you perform 
	 * on a data such as searching, sorting, insertion, manipulation, and deletion.
	 * 
	 * Java Collection means a single unit of objects. 
	 * Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes 
	 * (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
	 */
	
	/*
	 * What is Collection in Java
	 * A Collection represents a single unit of objects, i.e., a group.
	 */
	
	/*
	 * What is a framework in Java
	   - It provides readymade architecture.
	   - It represents a set of classes and interfaces.
	   - It is optional.
	 */
	
	/*
	 * What is Collection framework
	 * The Collection framework represents a unified architecture 
	 * for storing and manipulating a group of objects. It has:
	   1) Interfaces and its implementations, i.e., classes
	   2) Algorithm
	 */
	
	/*
	 * Advantages of the Collection Framework: 
	 * Since the lack of a collection framework gave rise to the above set of disadvantages, 
	 * the following are the advantages of the collection framework.
	   1) Consistent API: The API has a basic set of interfaces like Collection, 
	      Set, List, or Map, all the classes (ArrayList, LinkedList, Vector, etc) 
	      that implement these interfaces have some common set of methods.
	   2) Reduces programming effort: A programmer doesn’t have to worry about the 
	      design of the Collection but rather he can focus on its best use in his program. 
	      Therefore, the basic concept of Object-oriented programming (i.e.) abstraction 
	      has been successfully implemented.
	   3) Increases program speed and quality: Increases performance by providing 
	      high-performance implementations of useful data structures and algorithms 
	      because in this case, the programmer need not think of the best implementation 
	      of a specific data structure. He can simply use the best implementation 
	      to drastically boost the performance of his algorithm/program.
	 */
	
	/*
	 * Hierarchy of Collection Framework
	 * Let us see the hierarchy of Collection framework. 
	 * The java.util package contains all the classes and interfaces for the Collection framework.
	 * 
	   - Iterable (Interface)
	     - Collection (Interface)
	       - Queue (Interface)
	         - PriorityQueue (Class)
	         - Deque (Interface)
	           - ArrayDeque (Class)
	         
	       - List (Interface)
	         - ArrayList (Class)
	         - LinkedList (Class)
	         - Vector (Class)
	           - Stack (Class)
	           
	       - Set (Interface)
	         - SortedSet (Interface)
	           - TreeSet (Class)
	         - Set (Interface)
	           - HashSet (Class)
	           - LinkedHashSet (Class)
	           
	  - Map (Interface)
        - SortedMap (Interface)
          - NavigableMap (Interface)
            - TreeMap (Class)
        - AbstractMap (Class)
          - HashMap (Class)
          - EnumMap (Class)
	 */
	
	/*
	   - Collection extends Iterable
	     
	     - List extends Collection
	     - Queue extends Collection
	     - Set extends Collection
	     
	       - ArrayList, LinkedList, Vector implements List, Stack extends Vector
	       - PriorityQueue implements Queue, Deque extends Queue, ArrayDeque implements Deque
	         LinkedList implements Deque
	       - HashSet, LinkedHashSet implements Set, SortedSet extends Set, TreeSet implements SortedSet
	   
	   - SortedMap extends Map
	     - NavigableMap extends SortedMap
	       - TreeMap implements NavigableMap, extends AbstractMap
	       
	   - AbstractMap implements Map
	     - HashMap, EnumMap extends AbstractMap
	     
	 */
	
	/*
	 * Features of Collection Framework
	   - Collection Framework has a lot of interfaces and classes.
	   - To be able to group multiple objects as list we use List interface,
	     as queue we use Queue interface and to be able to group unique we use Set interface.
	     All of these 3 interfaces implement Collection interface.
	   - Although Map interface is not associated with Collection interface, 
	     it has place in Collection Framework. 
	 */
	
	/*
	 * ********************************************************************************************
	 */
	
	/*
	 * SUMMARIZE OF THE COLLECTIONS
	 */
	
	/*
	 * The Properties Of The Classes Which Implements List Interface:
	   - They store elements as list.
	   - They can have duplicate elements.
	   - They have indexes for every elements.
	   - They maintain insertion order.
	   - It is too slow to search for one element.
	   - It is too fast to find an element by using index number.
	   - Lists can be sorted by using Collections.sort() method.
	   - Because of that some of its methods were developed by using "synchronized" keyword,
	     Vectors can be used in Thread operations.
	   - When we want to add an item to end of list we better use ArrayList structure.
	     Because ArrayList structure is faster in situations when the items are added to the end.
	   - When we want to insert an item to beginning or middle of list we better use LinkedList structure.
	     Because LinkedList does not handle all items, it handles just previous and next items of the inserted element.
	 */
	
	/*
	 * The Properties Of The Classes Which Implements Set Interface:
	   - They do not allow duplicate elements. One element can be existed uniquely.
	     So they need to use when elements are wanted to contained just once.
	   - Elements do not have indexes.
	   - Controlling if an element is exist or not is faster than List structure.
	   - In some time when it is not important the data structure maintain insertion order and wanted to
	     have faster results in query operations, HashSet structure is needed to use.
	     Because HashSet does not maintain insertion order. It stores and query elements by using 
	     hash functions. Because of that query operations are fast and have constant time complexity. O(1).
	   - When it is important the data structure maintain insertion order and wanted to have faster 
	     results in query operations, LinkedHashSet structure is needed to use.
	     Because LinkedHashSet uses hash functions to store and query elements and also maintains insertion
	     order by linked structure. Querying operations have constant time O(1).
	   - When it is important the data structure sort elements, TreeSet is needed to use.
	     Because TreeSet store elements in tree structure, the elements are always sorted. But querying 
	     operations have O(log(n)) time complexity because of the tree structure.
	 */
	
	/*
	 * The Properties Of The Classes Which Implements Map Interface:
	   - Elements are stored by using key-value pair relationship.
	   - A key have one value.
	   - Keys can not be duplicated. 
	   - It is too fast to find a value of element by using key of the element.
	   - Iterating elements one by one is slow.
	   - In HashMap, keys and values are not sorted and not in insertion order.
	   - LinkedHashMap maintains insertion order of keys and values.
	   - In TreeMap, elements are sorted by keys.
	 */
	
	/*
	 * The Properties Of The Classes Which Implements Queue Interface:
	   - LinkedList: When a LinkedList is created by using a reference of Queue Interface, it acts like
	     Queue. It works by using First In First Out (FIFO) method.
	   - Though PriorityQueue implements Queue Interface, it does not work by using First In First Out 
	     (FIFO) method. Because some of the methods have priority.
	 */
	
	/*
	 * The Properties Of The Classes Which Extends Vector Class:
	   - Stack: It works by using Last In First Out (LIFO) method. It has a lot of implementations in computers.  
	 */
	
	/*
	 * Points to Remember:
	   - We need to implement Comparable Interface or Comparator Interface to sort a data structure which
	     has custom class objects.
	   - We can iterate all items in a data structure by creating an iterator of that data structure.
	     So we need to implement Iterable Interface and create an iterator of data structure which
	     has custom class objects to iterate objects which is created from custom classes.
	 */
}
