package C_Advance.A_Collections.D_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class _Map {

	/*
	 * Map Interface in Java
	 */
	
	/*
	 * A map contains values on the basis of key, i.e. key and value pair. 
	 * Each key and value pair is known as an entry. A Map contains unique keys.
	 * A Map is useful if you have to search, update or delete elements on the basis of a key.
	 * The Map interface present in java.util package represents a mapping 
	 * between a key and a value. The Map interface is not a subtype of the 
	 * Collection interface. Therefore it behaves a bit differently from 
	 * the rest of the collection types. A map contains unique keys.
	 */
	
	/*
	 * Characteristics of Map Interface
	   - The Map interface is not a true subtype of Collection interface, 
	     therefore, its characteristics and behaviors are different from 
	     the rest of the collection types.
	   - It provides three collection views – set of keys, set of key-value mappings 
	     and collection of values.
	   - A Map cannot contain duplicate keys and each key can map to at most one value. 
	     Some implementations allow null key and null value (HashMap and LinkedHashMap) 
	     but some does not (TreeMap).
	   - The Map interface doesn’t guarantee the order of mappings, 
	     however, it depends on the implementation. For instance, 
	     HashMap doesn’t guarantee the order of mappings but TreeMap does.
	   - AbstractMap class provides a skeletal implementation of the Java Map interface 
	     and most of the Map concrete classes extend AbstractMap class and 
	     implement required methods.
	 */
	
	/*
	 * Why and When to use Maps?
	 * Maps are perfect to use for key-value association mapping such as dictionaries. 
	 * The maps are used to perform lookups by keys or when someone wants to retrieve 
	 * and update elements by keys. Some examples are:
	   - A map of error codes and their descriptions.
	   - A map of zip codes and cities.
	   - A map of managers and employees. Each manager (key) is associated with a 
	     list of employees (value) he manages.
	   - A map of classes and students. Each class (key) is associated with a 
	     list of students (value).
	 */
	
	/*
	 * There are two interfaces for implementing Map in java: Map and SortedMap, 
	 * and three classes: HashMap, LinkedHashMap, and TreeMap.
	   - SortedMap Interface extends Map Interface,
	   - TreeMap Class implements SortedMap Interface,
	   - HashMap Class implements Map Interface,
	   - LinkedHashMap Class extends HashMap Class and implements Map Interface
	 
	 * A Map doesn't allow duplicate keys, but you can have duplicate values. 
	 * HashMap and LinkedHashMap allow null keys and values, but TreeMap 
	 * doesn't allow any null key or value.
	 * 
	 * A Map can't be traversed, so you need to convert it into 
	 * Set using keySet() or entrySet() method.
	 */
	
	/*
	 * You can choose between the following Map implementations in the Java Collections API:
       1. java.util.HashMap
       	  HashMap is the implementation of Map, but it doesn't maintain any order.
	   2. java.util.LinkedHashMap
	      LinkedHashMap is the implementation of Map. 
	      It inherits HashMap class. It maintains insertion order.
	   3. java.util.TreeMap
	      TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
	 */
	
	public void mapInterface() {
		
		/*
		 * Here are a few examples of how to create a Map instance
		 */
		
		Map map1 = new HashMap<>();
		Map map2 = new LinkedHashMap<>();
		Map map3 = new TreeMap<>();
		
		/*
		 * By default you can put any Object into a Map, but 
		 * Java Generics makes it possible to limit the types 
		 * of keys and values you can insert into a Map as a key and value.
		 * We can create an instance of generic Map like below examples. 
		 * Key can be any of data types and also value can be any of data types.
		 */
		Map<Integer, String> map4 = new HashMap<Integer, String>();
		Map<Double, Float> map5 = new LinkedHashMap<Double, Float>();
		Map<Object, Object> map6 = new TreeMap<Object, Object>();
		
		/*
		 * Map.Entry Interface
		 * 
		 * Entry is the subinterface of Map. So we will be accessed it by Map.Entry name.
		 * It returns a collection-view of the map, whose elements are of this class. 
		 * It provides methods to get key and value.
		 * 
		 * Set<Map.Entry<K,V>> entrySet() method returns the Set view containing all the keys and values.
		 * It convert Map to Entry.Map by using iterative function like foreach.
		 */
		mapEntryInterface();
	}
	
	public void commonMethodsOfMapInterface() {
		
		Map<String, String> map = new HashMap<String, String>();
		
		/*
		 * V put(Object key, Object value)
		 * It is used to insert an entry in the map.
		 */
		map.put("key1", "element 1");
		map.put("key2", "element 2");
		map.put("key3", "element 3");

		/*
		 * Set keySet()
		 * It returns the Set view containing all the keys.
		 */		
		System.out.println("Values and Keys in Map: ");
		for(String key : map.keySet()){
		   String value = map.get(key);
			System.out.println(key + " - " + value);
		}

		System.out.println("**********************");
		
		/*
		 * void putAll(Map map)
		 * It is used to insert the specified map in the map.
		 */
		Map<String, String> map1 = new HashMap<>();
		map1.put("key1", "value 1");
		map1.put("key2", "value 2");
		
		Map<String, String> map2 = new HashMap<>();
		map2.putAll(map1);
		
		System.out.println("Values in Map2 after putAll: ");
		for(String value : map2.values()){
			System.out.println(value);
		}
		System.out.println("*******************************");

		System.out.println("Values and Keys in Map2 after putAll: ");
		for(String key : map2.keySet()){
		   String value = map2.get(key);
			System.out.println(key + " - " + value);
		}
		System.out.println("*******************************");	
		
		/*
		 * V remove(Object key)
		 * It is used to delete an entry for the specified key.
		 */
		map.remove("key1");
		System.out.println("Values and Keys in Map after removing key1: ");
		for(String key : map.keySet()){
		   String value = map.get(key);
			System.out.println(key + " - " + value);
		}
		System.out.println("*******************************");
		
		/*
		 * boolean remove(Object key, Object value)
		 * It removes the specified values with the associated specified keys from the map.
		 */
		map.remove("key3", "element 3");
		System.out.println("Values and Keys in Map after removing key3: ");
		for(String key : map.keySet()){
		   String value = map.get(key);
			System.out.println(key + " - " + value);
		}
		System.out.println("*******************************");
		
		/*
		 * V putIfAbsent(K key, V value)
		 * It inserts the specified value with the specified key in the map 
		 * only if it is not already specified. We will see that key1 is absent so it will be added
		 * but because of that key2 is already specified key2 will not be added.
		 */
		map.putIfAbsent("key1", "element 1");
		map.putIfAbsent("key2", "value 2");
		System.out.println("Values and Keys in Map after putIfAbsent key1 and key2: ");
		for(String key : map.keySet()){
		   String value = map.get(key);
			System.out.println(key + " - " + value);
		}
		System.out.println("*******************************");
		
		/*
		 * boolean containsValue(Object value)
		 * This method returns true if some value equal to the value exists within the map, else return false.
		 */
		boolean hasValue = map.containsValue("element 2");
		String answerValue = hasValue ? "Yes" : "No";
		System.out.println("Map contains a valur which is element 2: " + answerValue);
		System.out.println("*************************************");
		
		/*
		 * boolean containsKey(Object key)
		 * This method returns true if some key equal to the key exists within the map, else return false.
		 */
		boolean hasKey = map.containsKey("key2");
		String answerKey = hasKey ? "Yes" : "No";
		System.out.println("Map contains a key which is key2: " + answerKey);
		System.out.println("*************************************");
		
		/*
		 * V get(Object key)
		 * This method returns the object that contains the value associated with the key.
		 */
		String element = map.get("key2");
		System.out.println("Element in key2 in Map: " + element);
		System.out.println("********************************");
		
		/*
		 * V getOrDefault(Object key, V defaultValue)
		 * It returns the value to which the specified key is mapped, or defaultValue if the map contains no mapping for the key.
		 */
		Map<String, String> map3 = new HashMap<String, String>();
		map3.put("A", "1");
		map3.put("B", "2");
		map3.put("C", "3");
		String value = map.getOrDefault("E", "Default Value");
		System.out.println("Get or Default Value: " + value);
		System.out.println("******************************");
		 
		/*
		 * boolean isEmpty()
		 * This method returns true if the map is empty; returns false if it contains at least one key.
		 */
		boolean isEmpty = map.isEmpty();
		String answerIsEmpty = isEmpty ? "Yes": "No";
		System.out.println("Is Map empty? " + answerIsEmpty);
		System.out.println("******************************");
		
		/*
		 * V replace(K key, V value)
		 * It replaces the specified value for a specified key.
		 */
		System.out.println("Values and Keys in Map after replacing key3: ");
		map.replace("key3", "element 3");
		for(String key : map.keySet()){
			System.out.println(key + " - " + map.get(key));
		}
		System.out.println("*******************************");
		
		map.put("key3", "value 3");
 		
		System.out.println("Values and Keys in Map after adding key3: ");
		for(String key : map.keySet()){
			System.out.println(key + " - " + map.get(key));
		}
		System.out.println("*******************************");
		
		System.out.println("Values and Keys in Map after replacing key3: ");
		map.replace("key3", "element 3");
		for(String key : map.keySet()){
			System.out.println(key + " - " + map.get(key));
		}
		System.out.println("*******************************");
		
		/*
		 * boolean replace(K key, V oldValue, V newValue)
		 * It replaces the old value with the new value for a specified key.
		 */
		map.put("key4", "value 4");
 		
		System.out.println("Values and Keys in Map after adding key4: ");
		for(String key : map.keySet()){
			System.out.println(key + " - " + map.get(key));
		}
		System.out.println("*******************************");
		
		System.out.println("Values and Keys in Map after replacing key4: ");
		map.replace("key4", "value 4", "element 4");
		for(String key : map.keySet()){
			System.out.println(key + " - " + map.get(key));
		}
		System.out.println("*******************************");
		
		/*
		 * Collection values()
		 * It returns a collection view of the values contained in the map.
		 */
		Collection<String> values = map.values();
		System.out.println("Values in map: " + values);
		System.out.println("*******************************");
		
		/*
		 * int size()
		 * This method returns the number of entries in the map.
		 */
		var size = map.size();
		System.out.println("Size of map: " + size);
		System.out.println("*******************************");
		
		/*
		 * forEach() method
		 */
		System.out.println("forEach iteration in map: ");
		map.forEach((k, v) -> {
			System.out.println("Key: " + k + " - " + "Value: " + v);
		});
		System.out.println("********************************");
	}
	
	public void functionalOperationsInMap() {
		
		/*
		 * The Java Map interface had a few functional operations added from Java 8. 
		 * These functional operations make it possible to interact with a Map in a more functional style. 
		 * For instance, you pass a Java Lambda Expression as parameter to these functional style methods.
		 * 
		 * The functional operation methods are:
		   - compute()
		   - computeIfAbsent()
		   - computeIfPresent()
		   - merge()
		 */
		
		/*
		 * compute()
		 * V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
		 * The Map compute() method takes a key object and a lambda expression as parameters. 
		 * The lambda expression must implement the java.util.function.BiFunction interface. 
		 * Here is an example of calling the Java Map compute() method:
		 */
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "element 1");
		map.put("key2", "element 2");
		map.put("key3", "element 3");
		
		String computedValue = map.compute("key1", (key, value) -> value == null ? null : value.toString().toUpperCase());
		System.out.println("Computed Value : " + computedValue);
		System.out.println("************************************");
		
		/*
		 * The compute() method will call the lambda expression internally, 
		 * passing the key object and whatever value is stored in the 
		 * Map for that key object, as parameters to the lambda expression.
		 * Whatever value the lambda expression returns is stored instead 
		 * of the currently stored value for that key. If the lambda expression returns null, 
		 * the entry is removed. There will not be a key -> null mapping stored in the Map.
		 * In the example above you can see that the lambda expression checks if the value mapped 
		 * to the given key is null or not, before calling toString().toUpperCase() on it.
		 * If the lambda expression throws an exception, the entry is also removed.
		 */
		
		/*
		 * computeIfAbsent()
		 * V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
		 * The Map computeIfAbsent() method works similarly to the compute() method, 
		 * but the lambda expression is only called if no entry exists already for the given key.
		 * The value returned by the lambda expression is inserted into the Map. If null is returned, no entry is inserted.
		 * If an exception is thrown by the lambda expression, no entry is inserted either.
		 * Here is an example of calling the Map computeIfAbsent() method:
		 */
		String computedIfAbsentValueKey1 = map.computeIfAbsent("key1", (key) -> "abc");
		System.out.println("key1 Computed If Absent Value : " + computedIfAbsentValueKey1);

		String computedIfAbsentValueKey5 = map.computeIfAbsent("key5", (key) -> "No Key5");
		System.out.println("key5 Computed If Absent Value : " + computedIfAbsentValueKey5);
		System.out.println("************************************");
		
		/*
		 * computeIfPresent()
		 * V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
		 * The Map computeIfPresent() method works oppositely of computeIfAbsent(). 
		 * It only calls the lambda expression passed as parameter to it, if an entry already exists 
		 * in the Map for that key. Here is an example of calling the computeIfPresent() method:
		 */
		String computedIfPresentValueKey1 = map.computeIfPresent("key1", (key, value) -> value == null ? null : value.toString().toUpperCase());
		System.out.println("key1 Computed If Present Value : " + computedIfPresentValueKey1);
		
		String computedIfPresentValueKey10 = map.computeIfPresent("key10", (key, value) -> value == null ? null : value.toString().toUpperCase());
		System.out.println("key10 Computed If Present Value : " + computedIfPresentValueKey10);
		System.out.println("******************************************");
		
		/*
		 * The value returned by the lambda expression will be inserted into the Map instance. 
		 * If the lambda expression returns null, the entry for the given key is removed. 
		 * If the lambda expression throws an exception, the exception is rethrown, 
		 * and the current entry for the given key is left unchanged. 
		 */
		
		/*
		 * merge()
		 * V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
		 * The Map merge() method takes a key, a value, and a lambda expression implementing 
		 * the BiFunction interface as parameters. If the Map does not have an entry for the key, 
		 * or if the value for the key is null, the value passed as parameter to the merge() method is inserted for the given key. 
		 * If, however, an existing value is already mapped to the given key, 
		 * the lambda expression passed as parameter is called instead. 
		 * The lambda expression thus gets a chance to merge the existing value with a new value. 
		 * The value returned by the lambda expression is then inserted into the Map for the given key. 
		 * If the lambda expression returns null, the entry for the given key is removed.
		 * Here is an example of calling the Map merge() method:
		 */
		String mergedValue = map.merge("key1", "New Value", (oldValue, newValue) -> oldValue + " " + newValue + " Ekstra Word");
		System.out.println("Merged Value : " + mergedValue);
		System.out.println("*****************************************");
		
		/*
		 * This example will insert the value New Value into the Map if no value is mapped to the key (key1), 
		 * or if null is mapped to the key. If a non-null value is already mapped to the key, 
		 * the lambda expression is called. The lambda expression returns the old value (ELEMENT 1) 
		 * + new value (New Value) + the value Ekstra Word, meaning ELEMENT 1 New Value Ekstra Word.
		 * If an exception is thrown by the lambda expression, 
		 * the exception is rethrown, and the current mapping for the given key is kept unchanged.
		 */
	}
	
	private void mapEntryInterface() {
		
		Map<String, String> cities = new HashMap<String, String>();
		cities.put("06", "Ankara");
		cities.put("34", "Ýstanbul");
		 
		/*
		 * K getKey() -> It is used to obtain a key.
		 */
		System.out.println("Keys in Cities Map: ");
		for (Map.Entry entry : cities.entrySet()) {
			System.out.println(entry.getKey());
		}	
		System.out.println("**********************");
		
		/*
		 * V getValue() -> It is used to obtain value 
		 */
		System.out.println("Values in Cities Map: ");
		for (Map.Entry entry : cities.entrySet()) {
			System.out.println(entry.getValue());
		}	
		System.out.println("**********************");
		
		/*
		 * int hashCode() -> It is used to obtain hashCode.
		 */
		System.out.println("Hash Codes in Cities Map: ");
		for (Map.Entry entry : cities.entrySet()) {
			System.out.println(entry.hashCode());
		}	
		System.out.println("**********************");
		
		/*
		 * V setValue(V value) -> It is used to replace the value corresponding 
		 * 						  to this entry with the specified value.
		 */
		System.out.println("After Set Values in Cities Map: ");
		int i = 0;
		for (Map.Entry entry : cities.entrySet()) {
			entry.setValue(++i);
		}
		
		for (Map.Entry entry : cities.entrySet()) {
			System.out.println(entry.getValue());
		}
		System.out.println("**********************");
	}		

	public void hashMap() {
		HashMapClass hashMapClass = new HashMapClass();
		hashMapClass.hashMap();
		hashMapClass.sortingHashMap();
	}
	
	public void linkedHashMap() {
		LinkedHashMapClass linkedHashMapClass = new LinkedHashMapClass();
		linkedHashMapClass.linkedHashMap();
	}
	
	public void treeMap() {
		TreeMapClass treeMapClass = new TreeMapClass();
		treeMapClass.treeMap();
	}
}
