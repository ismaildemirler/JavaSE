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
}
