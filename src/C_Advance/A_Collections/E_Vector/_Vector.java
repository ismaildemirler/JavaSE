package C_Advance.A_Collections.E_Vector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class _Vector {

	/*
	 * Vector in Java
	 */
	
	/*
	 * Vector is like the dynamic array which can grow or shrink its size. Unlike array, 
	 * we can store n-number of elements in it as there is no size limit. It is a part of 
	 * Java Collection framework since Java 1.2. It is found in the java.util package and implements 
	 * the List interface, so we can use all the methods of List interface here. 
	 * It is recommended to use the Vector class in the thread-safe implementation only. 
	 * If you don't need to use the thread-safe implementation, you should use the ArrayList, 
	 * the ArrayList will perform better in such case. 
	 * The Iterators returned by the Vector class are fail-fast. In case of concurrent modification, 
	 * it fails and throws the ConcurrentModificationException. 
	 * 
	 * public class Vector<E> extends Object<E> implements List<E>, Cloneable, Serializable  
	 * 
	 * It is similar to the ArrayList, but with two differences:
	   - Vector is synchronized.
	   - Java Vector contains many legacy methods that are not the part of a collections framework.
	 */
	
	/*
	 * ArrayList Vs Vector
	 
	   - Synchronization: 
	     ArrayList is non-synchronized which means multiple threads can work on ArrayList at the same time. 
	     For e.g. if one thread is performing an add operation on ArrayList, there can be an another thread 
	     performing remove operation on ArrayList at the same time in a multithreaded environment 
	     while Vector is synchronized. This means if one thread is working on Vector, no other thread can get a hold of it. 
	     Unlike ArrayList, only one thread can perform an operation on vector at a time.

       - Resize: 
         Both ArrayList and Vector can grow and shrink dynamically to maintain the optimal use of storage, 
         however the way they resized is different. ArrayList grow by half of its size when resized 
         while Vector doubles the size of itself by default when grows.

       - Performance: 
         ArrayList gives better performance as it is non-synchronized. 
         Vector operations gives poor performance as they are thread-safe, the thread which works 
         on Vector gets a lock on it which makes other thread wait till the lock is released.

       - Fail-fast: 
         First let me explain what is fail-fast: If the collection (ArrayList, vector etc) 
         gets structurally modified by any means, except the add or remove methods of iterator, 
         after creation of iterator then the iterator will throw ConcurrentModificationException. 
         Structural modification refers to the addition or deletion of elements from the collection.
         As per the Vector javadoc the Enumeration returned by Vector is not fail-fast. 
         On the other side the iterator and listIterator returned by ArrayList are fail-fast.
         
       - Iteration: 
         Vector can use Iterator and Enumeration to traverse over the elements. 
         On the other hand, ArrayList can only use Iterator.
 
       - Who belongs to collection framework really? 
         The vector was not the part of collection framework, it has been included in collections later. 
         It can be considered as Legacy code. There is nothing about Vector which List collection cannot do. 
         Therefore Vector should be avoided. If there is a need of thread-safe operation make ArrayList synchronized 
         as discussed in the next section of this post or use CopyOnWriteArrayList which is a thread-safe variant of ArrayList.
    */
	
	/*
	 * There are few similarities between these classes which are as follows:
	   - Both Vector and ArrayList use growable array data structure.
	   - The iterator and listIterator returned by these classes (Vector and ArrayList) are fail-fast.
	   - They both are ordered collection classes as they maintain the elements insertion order.
	   - Vector & ArrayList both allows duplicate and null values.
	   - They both grows and shrinks automatically when overflow and deletion happens.
	 */
	
	/*
	 * When to use ArrayList and when to use vector?
	 * It totally depends on the requirement. If there is a need to perform “thread-safe” operation 
	 * the vector is your best bet as it ensures that only one thread access the collection at a time.
       - Performance: 
         Synchronized operations consumes more time compared to non-synchronized ones so 
         if there is no need for thread safe operation, ArrayList is a better choice as 
         performance will be improved because of the concurrent processes.	 
	 */
	
	public void vector() {
		
		/*
		 * Java Vector Constructors
		 */
		
		/*
		 * 1. vector()
		 *    It constructs an empty vector with the default size as 10.
		 */
		Vector<String> vector1 = new Vector<>();
		
		/*
		 * 2. vector(int initialCapacity)
		 *    It constructs an empty vector with the specified initial 
		 *    capacity and with its capacity increment equal to zero.
		 */
		Vector<String> vector2 = new Vector<>(5);
		
		/*
		 * 3. vector(int initialCapacity, int capacityIncrement)
		 *    It constructs an empty vector with the specified initial capacity and capacity increment.
		 */
		Vector<Integer> vector3 = new Vector<Integer>(5, 10);
		
		/*
		 * 4. Vector(Collection<? extends E> c)
		 * It constructs a vector that contains the elements of a collection c.
		 */
		Collection<? extends Object> c = new Vector<Object>();
		Vector<Object> vector4 = new Vector<Object>(c);
		
		Vector<String> programmingLanguages = new Vector<String>();
		programmingLanguages.add("Java");
		programmingLanguages.add("C#");
		programmingLanguages.add("Python");
		programmingLanguages.add("PHP");
		programmingLanguages.add("C++");
		
		System.out.println("Programming languages by using Vector Class: ");
		for (String language : programmingLanguages) {
			System.out.println(language);
		}
		System.out.println("*******************************************");
		
		System.out.println("Programming languages by using Vector Class: ");
		Enumeration<String> enumList = programmingLanguages.elements();
		while (enumList.hasMoreElements()) {
			String language = (String) enumList.nextElement();
			System.out.println(language);
		}
		System.out.println("*******************************************");
		
		/*
		 * Because most of the methods of Vector class are same with the methods of ArrayList class,
		 * we will not deep in dive for this subject.
		 */
		
		/*
		 * 1)  add()
		 *     It is used to append the specified element in the given vector.
		 * 2)  addAll()
		 *     It is used to append all of the elements in the specified collection to the end of this Vector.
		 * 3)  addElement()
		 *     It is used to append the specified component to the end of this vector. It increases the vector size by one.
		 * 4)  capacity()
		 *     It is used to get the current capacity of this vector.
		 * 5)  clear()
		 *     It is used to delete all of the elements from this vector.
		 * 6)  clone()
		 *     It returns a clone of this vector.
		 * 7)  contains()
		 *     It returns true if the vector contains the specified element.
		 * 8)  containsAll()
		 *     It returns true if the vector contains all of the elements in the specified collection.
		 * 9)  copyInto()
		 *     It is used to copy the components of the vector into the specified array.
		 * 10) elementAt()
		 *     It is used to get the component at the specified index.
		 * 11) elements()
		 *     It returns an enumeration of the components of a vector.
		 * 12) ensureCapacity()
		 *     It is used to increase the capacity of the vector which is in use, if necessary. 
		 *     It ensures that the vector can hold at least the number of components specified by the minimum capacity argument.
		 * 13) equals()
		 *     It is used to compare the specified object with the vector for equality.
		 * 14) firstElement()
		 *     It is used to get the first component of the vector.
		 * 15) forEach()
		 *     It is used to perform the given action for each element of the Iterable until 
		 *     all elements have been processed or the action throws an exception.
		 * 16) get()
		 *     It is used to get an element at the specified position in the vector.
		 * 17) hashCode()
		 *     It is used to get the hash code value of a vector.
		 * 18) indexOf()
		 *     It is used to get the index of the first occurrence of the specified element in the vector. 
		 *     It returns -1 if the vector does not contain the element.
		 * 19) insertElementAt()
		 *     It is used to insert the specified object as a component in the given vector at the specified index.
		 * 20) isEmpty()
		 *     It is used to check if this vector has no components.
		 * 21) iterator()
		 *     It is used to get an iterator over the elements in the list in proper sequence.
		 * 22) lastElement()
		 *     It is used to get the last component of the vector.
		 * 23) lastIndexOf()
		 *     It is used to get the index of the last occurrence of the specified element in the vector. 
		 *     It returns -1 if the vector does not contain the element.
		 * 24) listIterator()
		 *     It is used to get a list iterator over the elements in the list in proper sequence.
		 * 25) remove()
		 *     It is used to remove the specified element from the vector. 
		 *     If the vector does not contain the element, it is unchanged.
		 * 26) removeAll()
		 *     It is used to delete all the elements from the vector that are present in the specified collection.
		 * 27) removeAllElements()
		 *     It is used to remove all elements from the vector and set the size of the vector to zero.
		 * 28) removeElement()
		 *     It is used to remove the first (lowest-indexed) occurrence of the argument from the vector.
		 * 29) removeElementAt()
		 *     It is used to delete the component at the specified index.
		 * 30) removeIf()
		 *     It is used to remove all of the elements of the collection that satisfy the given predicate.
		 * 31) removeRange()
		 *     It is used to delete all of the elements from the vector whose index is between fromIndex, 
		 *     inclusive and toIndex, exclusive.
		 * 32) replaceAll()
		 *     It is used to replace each element of the list with the result of applying the operator to that element.
		 * 33) retainAll()
		 *     It is used to retain only that element in the vector which is contained in the specified collection.
		 * 34) set()	
		 *     It is used to replace the element at the specified position in the vector with the specified element.
		 * 35) setElementAt()
		 *     It is used to set the component at the specified index of the vector to the specified object.
		 * 36) setSize()	
		 *     It is used to set the size of the given vector.
		 * 37) size()	
		 *     It is used to get the number of components in the given vector.
		 * 38) sort()	
		 *     It is used to sort the list according to the order induced by the specified Comparator.
		 * 39) spliterator()	
		 *     It is used to create a late-binding and fail-fast Spliterator over the elements in the list.
		 * 40) subList()	
		 *     It is used to get a view of the portion of the list between fromIndex, inclusive, and toIndex, exclusive.
		 * 41) toArray()	
		 *     It is used to get an array containing all of the elements in this vector in correct order.
		 * 42) toString() 
		 *     It is used to get a string representation of the vector.
		 * 43) trimToSize()	
		 *     It is used to trim the capacity of the vector to the vector's current size.
		 */
	}
	
	public void concurrency() {
		
		/*
		 * We've already mentioned that ArrayList and Vector are different in their concurrency strategy, 
		 * but let's take a closer look. If we were to dive into Vector's method signatures, 
		 * we'd see that each has the synchronized keyword:

		   - public synchronized E get(int index)

    	 * Simply put, this means that only one thread can access a given vector at a time.
    	 * Really, though, this operation-level synchronizations needs to be overlayed 
    	 * anyway with our own synchronization for compound operations. So in contrast, 
    	 * ArrayList takes a different approach. Its methods are not synchronized and that 
    	 * concern is separated out into classes that are devoted to concurrency.
		 */
		
		Vector<String> programmingLanguagesVector = new Vector<String>();
		programmingLanguagesVector.add("Java");
		programmingLanguagesVector.add("C#");
		programmingLanguagesVector.add("Python");
		programmingLanguagesVector.add("PHP");
		programmingLanguagesVector.add("C++");		
		
		programmingLanguagesVector.get(1); //synchronized
		
		/*
		 * How to make ArrayList synchronized?
		 * As I stated above ArrayList methods are non-synchronized but still 
		 * if there is a need you can make them synchronized like below: 
		 */
		ArrayList<String> programmingLanguagesArrayList = new ArrayList<String>();
		programmingLanguagesArrayList.add("Java");
		programmingLanguagesArrayList.add("C#");
		programmingLanguagesArrayList.add("Python");
		programmingLanguagesArrayList.add("PHP");
		programmingLanguagesArrayList.add("C++");
		
		//Use Collecions.synzhonizedList method
		Collections.synchronizedList(programmingLanguagesArrayList).get(1); // also synchronized
		
		/*
		 * If you want to use iterator on the synchronized list, 
		 * use it like this. It should be in synchronized block.
		 */
		synchronized (programmingLanguagesArrayList) {
			Iterator iterator = programmingLanguagesArrayList.iterator(); 
			while (iterator.hasNext())
				iterator.next();
		}
	}
}
