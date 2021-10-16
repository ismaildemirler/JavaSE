package C_Advance.A_Collections.D_Map;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapClass {

	/*
	 * TreeMap Class In Java 
	 */
	
	/*
	 * Java TreeMap class is a red-black tree based implementation. 
	 * It provides an efficient means of storing key-value pairs in sorted order.
	 * 
	 * The important points about Java TreeMap class are:
	   - Java TreeMap contains values based on the key. 
	     It implements the NavigableMap interface and extends AbstractMap class.
	   - Java TreeMap contains only unique elements.
	   - Java TreeMap cannot have a null key but can have multiple null values.
	   - Java TreeMap is non synchronized.
	   - Java TreeMap maintains ascending order.
	   - public class TreeMap<K,V> extends AbstractMap<K,V> implements NavigableMap<K,V>, Cloneable, Serializable  
	 */
	
	public void treeMap() {
		
		/*
		 * Constructors of Java TreeMap class
		 */
		
		/*
		 * 1) TreeMap()
		 *    It is used to construct an empty tree map that will be sorted using the natural order of its key.
		 */
		TreeMap<String, String> map1 = new TreeMap<>();
		
		/*
		 * 2) TreeMap(Comparator<? super K> comparator)
		 *    It is used to construct an empty tree-based map that will be sorted using the comparator comp.
		 */
		@SuppressWarnings("unchecked")
		Comparator<? super String> comparator = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return 0;
			}			
		}; 
		TreeMap<String, String> map2 = new TreeMap<>(comparator);
		
		/*
		 * 3) TreeMap(Map<? extends K,? extends V> m)
		 *    It is used to initialize a treemap with the entries from m, 
		 *    which will be sorted using the natural order of the keys.
		 */
		Map<? extends String, ? extends String> map = new TreeMap<>();
		TreeMap<String, String> map3 = new TreeMap<String, String>(map);
		
		/*
		 * 4) TreeMap(SortedMap<K,? extends V> m)
		 *    It is used to initialize a treemap with the entries from the 
		 *    SortedMap sm, which will be sorted in the same order as sm.
		 */
		SortedMap<String, ? extends String> sortedMap =  new TreeMap<String, String>();
		TreeMap<String, String> map4 = new TreeMap<String, String>(sortedMap);
	}
	
	public void extraMethodsOfTreeMap() {
		
		/*
		 * Methods of Map interface are methods of TreeMap class also.
		 */
		
		TreeMap<Integer, String> products = new TreeMap<Integer, String>();
		products.put(98, "Television");
		products.put(100, "Computer");
		products.put(103, "Phone");
		products.put(101, "Printer");
		products.put(107, "Camera");
		products.put(109, "Tablet");
		
		/*
		 * Map.Entry<K,V> ceilingEntry(K key)
		 * This method returns a Entry with the  least key greater than or equal to 
		 * the given key in the argument list, or null if there is no such key
		 */
		System.out.println("Ceiling entry for 99: " + products.ceilingEntry(99));
		System.out.println("Ceiling entry for 103: " + products.ceilingEntry(103));
		System.out.println("****************************************");
		/*
		 * In the output we see ceiling value of key “99” is “100” as we see 99 is not present in treemap, 
		 * it automatically tool least greater than “99” which is “100”. And Ceiling value of “103” is “103”, 
		 * which we see is present in the given map.
		 */
		
		/*
		 * K ceilingKey(K key)
		 * This method returns a key with the  least key greater than or equal to the given 
		 * key in the argument list, or null if there is no such key, This method is same 
		 * as ceilingEntry(Object key) , only difference is it returns only key
		 */
		System.out.println("Ceiling entry for 99: " + products.ceilingKey(99));
		System.out.println("Ceiling entry for 103: " + products.ceilingKey(103));
		System.out.println("****************************************");
		
		/*
		 * Object clone()
		 * This method returns a duplicate copy of the TreeMap object
		 */
		TreeMap<Integer, String> copyProducts = new TreeMap<Integer, String>();
		copyProducts = (TreeMap) products.clone();
		System.out.println("Before using clone method: " + products);
		System.out.println("After using clone method: " + copyProducts);
		System.out.println("****************************************");
		
		/*
		 * Comparator<? super K> comparator()
		 *  This method gives the comparator used in the map, which basically means in 
		 *  what ordering our map has data entries stored, If it returns null means given map is using natural ordering.
		 */
		Comparator comparator = products.comparator();
		System.out.println("Comparator value: " + comparator);
		System.out.println("*********************************");
		/*
		 * Comparator value: null
		 * From output it is very clear that TreeMap uses Natural ordering.
		 */
		
		/*
		 * NavigableSet<K> descendingKeySet()
		 * This method returns descending order of the all the keys stored in the treemap, 
		 * In the following program we are creating object of NavigableSet class and we are 
		 * storing all values in this first, than we are calling descendingKeySet() method
		 */
		NavigableSet navigableSet = products.descendingKeySet();
		System.out.println("Values after using descending key Set method: " + navigableSet);
		System.out.println("*********************************");
		
		/*
		 * NavigableMap<K,V> descendingMap()
		 * This method returns descending order of the all the entries stored in the treemap, 
		 * In the following program we are creating object of NavigableMap class and we are storing 
		 * all values in this first, than we are calling descendingMap() method
		 */
		NavigableMap navigableMap = products.descendingMap();
		System.out.println("Values after using descending map method: " + navigableMap);
		System.out.println("*********************************");
		
		/*
		 * Map.Entry firstEntry()
		 * This method as the name suggests returns the first entry entered into the Treemap, 
		 * that is the lowest entry in the treemap
		 */
		System.out.println("First entry is: "+ products.firstEntry());
		System.out.println("*********************************");
		
		/*
		 * Map.Entry<K,V> floorEntry(K key)
		 * This method returns an entry with greatest key less than or equal to the 
		 * key mentioned in the argument, or null if there is no such key
		 */
		System.out.println("floor entry for '102' is: " + products.floorEntry(102));
		System.out.println("floor entry for '99' is:" + products.floorEntry(99));
		System.out.println("floor entry for '100' is:" + products.floorEntry(100));
		System.out.println("*********************************");
		/*
		 * As we can see in output , floor entry for “102” is “101” because 102 is not present, 
		 * it will automatically give “101” that is  greatest key less than or equal to given key, 
		 * same is the case with key value “99”, And when we entered key “100”, 
		 * as it is present it gives the same key as output.
		 */
		
		/*
		 * SortedMap<K,V> headMap(K toKey)
		 * This method returns the part of the treemap whose key value is less than the mentioned value 
		 * in the argument list, as shown in the example, we have taken a Sorted Map and used 
		 * this method to store the values strictly below key 103
		 */
		SortedMap<Integer, String> sortedMap = new TreeMap<Integer, String>();
		sortedMap = products.headMap(103);
		System.out.println("Value below the headMap is: "+ sortedMap);
		System.out.println("*********************************");
		
		/*
		 * NavigableMap<K,V> headMap(K toKey, boolean inclusive)
		 * This method returns a portion of map, whose key value is less than the value mentioned 
		 * in the first argument, It is very much similar to the SortedMap headMap(Object toKey) method, 
		 * only difference is return type and we have Boolean value , when it is true it will include 
		 * the key mentioned in the program in the output, as shown in the following program.
		 */
		NavigableMap<Integer, String> navigableMap1 = new TreeMap<Integer, String>();
		NavigableMap<Integer, String> navigableMap2 = new TreeMap<Integer, String>();
		
		navigableMap1 = products.headMap(101, true);
		navigableMap2 = products.headMap(101, false);

		System.out.println("Checking values of the map");
		System.out.println("Values when inclusive is True " + navigableMap1);
		System.out.println("Values when inclusive is False " + navigableMap2);
		System.out.println("*********************************");
		
		/*
		 * Map.Entry<K,V> higherEntry(K key)
		 * This method returns the the entry with least key which is strictly greater than the given 
		 * key in argument list, or null if there is no such key, as shown in following example.
		 */
		System.out.println("Higher Entry then '95': " + products.higherEntry(95));
		System.out.println("Higher Entry then '100': " + products.higherEntry(100));
		System.out.println("Higher Entry then '109': " + products.higherEntry(109));
		System.out.println("*********************************");
		/*
		 * As shown in output, higher key than “95”  is  “98” as we are getting in output, 
		 * same with key “100”, and there is no higher key than “109” , so output is null.
		 */
		
		/*
		 * Map.Entry<K,V> lastEntry()
		 * This method as the name suggests returns the last entry or we can say 
		 * highest entry present in the tree map as shown in the following example
		 */
		System.out.println("Value of last entry: " + products.lastEntry());
		System.out.println("*********************************");
		
		/*
		 * Map.Entry<K,V> lowerEntry(K key)
		 * This method returns an entry with the greatest key that is strictly less than 
		 * the given key in argument, or null if there is no such key, as shown in the following example.
		 */
		System.out.println("Lower Entry than '103' is: " + products.lowerEntry(103));
		System.out.println("Lower Entry than '98' is: " + products.lowerEntry(98));
		System.out.println("*********************************");
		
		/*
		 * SortedMap<K,V> subMap(K fromKey, K toKey)
		 * This method returns a group of this map whose keys range from fromKey(including its value), 
		 * to toKey(excluding its value), as shown in the following example.
		 */
		SortedMap<Integer, String> sortedSubMap = new TreeMap<Integer, String>();
		sortedSubMap = products.subMap(98, 103);
		System.out.println("Sub Map obtained : " + sortedSubMap);
		System.out.println("*********************************");
		
		/*
		 * SortedMap<K,V> tailMap(K fromKey)
		 * This method returns a group of entries of this map whose keys are greater 
		 * than or equal to fromKey, as shown in the following example.
		 */
		SortedMap<Integer, String> sortedTailMap = new TreeMap<Integer, String>();
		sortedTailMap = products.tailMap(101);
		System.out.println("Tail map values: " + sortedTailMap);
		System.out.println("*********************************");
		
		/*
		 * NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)
		 * This method returns group of entries of this map whose keys range from fromKey to toKey, 
		 * If “fromInclusive” value is true , it will include that key value pair, 
		 * same is the case with toinclusive, As shown in the following example.
		 */
		NavigableMap<Integer, String> nm1 = new TreeMap<Integer, String>();
		NavigableMap<Integer, String> nm2 = new TreeMap<Integer, String>();
		NavigableMap<Integer, String> nm3 = new TreeMap<Integer, String>();
		NavigableMap<Integer, String> nm4 = new TreeMap<Integer, String>();
		
		nm1 = products.subMap(98, true, 103, true);
		nm2 = products.subMap(98, false, 103, false);
		nm3 = products.subMap(98, true, 103, false);
		nm4 = products.subMap(98, false,103, true);		 
		
		System.out.println("values of Navigable Map 1: " + nm1);
		System.out.println("values of Navigable Map 2: " + nm2);
		System.out.println("values of Navigable Map 3: " + nm3);
		System.out.println("values of Navigable Map 4: " + nm4);
		System.out.println("*********************************");
		
		/*
		 * NavigableMap<K,V> tailMap(K fromKey, boolean inclusive)
		 * This method returns a group of entries of this map whose keys are greater than or equal 
		 * to (or equal to, if inclusive is true) fromKey,  as shown in the following example.
		 */
		NavigableMap<Integer, String> navMap1 = new TreeMap<Integer, String>();
		NavigableMap<Integer, String> navMap2 = new TreeMap<Integer, String>();
		
		navMap1 = products.tailMap(100, true);
		navMap2 = products.tailMap(100, false);

		System.out.println("Tail map values of First Map: " + navMap1);
		System.out.println("Tail map values of Second Map: " + navMap2);
		System.out.println("*********************************");
	}
	
	/*
	 * Difference between HashMap and TreeMap
	 */
	
	/*
	 * Java HashMap and TreeMap both are the classes of the Java Collections framework. 
	 * Java Map implementation usually acts as a bucketed hash table. When buckets get too large, 
	 * they get transformed into nodes of TreeNodes, each structured similarly to those in java.util.TreeMap.
	 */
	
	/*
	 * HashMap
	 * HashMap implements Map<K, V>, Cloneable and Serializable interface. 
	 * It extends AbstractMap<K, V> class. It belongs to java.util package.
	   - HashMap contains value based on the key.
	   - It may have a single null key and multiple null values.
	   - HashMap does not maintain order while iterating.
	   - It contains unique elements.
	   - It works on the principle of hashing.
	 */
	
	/*
	 * TreeMap
	 * TreeMap class extends AbstractMap<K, V> class and implements 
	 * NavigableMap<K, V >, Cloneable, and Serializable interface. T
	 * TreeMap is an example of a SortedMap. It is implemented by the Red-Black tree, 
	 * which means that the order of the keys is sorted.
	   - TreeMap also contains value based on the key.
	   - TreeMap is sorted by keys.
	   - It contains unique elements.
	   - It cannot have a null key but have multiple null values.
	   - Keys are in ascending order.
	   - It stores the object in the tree structure.
	 */
	
	/*
	 * Similarities between HashMap and TreeMap
	   - HashMap and TreeMap classes implement Cloneable and Serializable interface.
	   - Both the classes extend AbstractMap<K, V> class.
	   - A Map is an object which stores key-value pairs. 
	     In the key-value pair, each key is unique, but their values may be duplicate.
	   - Both classes represents the mapping from key to values.
	   - Both maps are not synchronized.
	   - Map use put() method to add an element in the map.
	   - The iterator throws a ConcurrentModificationException if the map gets modify in any way.
	 */
	
	/*
	 * The Key difference between HashMap and TreeMap is:
	 * HashMap does not preserve the iteration order while the TreeMap preserve the order 
	 * by using the compareTo() method or a comparator set in the TreeMap's constructor.
	 * The following table describes the differences between HashMap and TreeMap.
	 * 
	   - Definition : 
	     - Java HashMap is a hashtable based implementation of Map interface.
	     - Java TreeMap is a Tree structure-based implementation of Map interface.
	   
	   - Interface Implements :
	     - HashMap implements Map, Cloneable, and Serializable interface.
	     - TreeMap implements NavigableMap, Cloneable, and Serializable interface.
	     
	   - Null Keys/ Values :
	     - HashMap allows a single null key and multiple null values.
	     - TreeMap does not allow null keys but can have multiple null values.
	     
	   - Homogeneous/ Heterogeneous :
	     - HashMap allows heterogeneous elements because it does not perform sorting on keys.
	     - TreeMap allows homogeneous values as a key because of sorting.
	   
	   - Performance :
	     - HashMap is faster than TreeMap because it provides constant-time performance 
	       that is O(1) for the basic operations like get() and put().
	     - TreeMap is slow in comparison to HashMap because it provides the performance 
	       of O(log(n)) for most operations like add(), remove() and contains().
	   
	   - Data Structure :
	     - The HashMap class uses the hash table.
	     - TreeMap internally uses a Red-Black tree, which is a self-balancing Binary Search Tree.
	   
	   - Comparison Method : 
	     - HashMap uses equals() method of the Object class to compare keys. The equals() method of Map class overrides it.
	     - TreeMap uses the compareTo() method to compare keys.
	   
	   - Functionality :
	     - HashMap class contains only basic functions like get(), put(), KeySet(), etc. .
	     - TreeMap class is rich in functionality, because it contains functions like: 
	       tailMap(), firstKey(), lastKey(), pollFirstEntry(), pollLastEntry().
	   
	   - Order of elements :
	     - HashMap does not maintain any order.
	     - The elements are sorted in natural order (ascending).
	     
	   - Uses :
	     - The HashMap should be used when we do not require key-value pair in sorted order.
	     - The TreeMap should be used when we require key-value pair in sorted (ascending) order.
	 */
}
