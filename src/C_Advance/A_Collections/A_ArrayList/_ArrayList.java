package C_Advance.A_Collections.A_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class _ArrayList {
	
	/*
	 * ArrayList in Java Collections
	 */
	
	/*
	 * Java ArrayList class uses a dynamic array for storing the elements. 
	 * It is like an array, but there is no size limit. 
	 * We can add or remove elements anytime. 
	 * So, it is much more flexible than the traditional array. 
	 * It is found in the java.util package. It is like the Vector in C++.
	 * 
	 * The ArrayList in Java can have the duplicate elements also. 
	 * It implements the List interface so we can use all the methods of List interface here. 
	 * The ArrayList maintains the insertion order internally.
	 * It inherits the AbstractList class and implements List interface.
	 * 
	 * The important points about Java ArrayList class are:
	   - Java ArrayList class can contain duplicate elements.
	   - Java ArrayList class maintains insertion order.
	   - Java ArrayList class is non synchronized.
	   - Java ArrayList allows random access because array works at the index basis.
	   - In ArrayList, manipulation is little bit slower than the LinkedList in Java 
	     because a lot of shifting needs to occur if any element is removed from the array list.
	 */
	
	/*
	 * We have already covered methods of ArrayList. 
	 * So here, we will speak about some more details about Arraylist
	 */

	public void moreAboutArrayList() {
		
		/*
		 * Constructors of ArrayList
		 */
		
		/*
		 * 1) It is used to build an empty array list.
		 */
		var arrayList1 = new ArrayList();
		
		/*
		 * 2) It is used to build an array list that is 
		 * 	  initialized with the elements of the collection Number for example.
		 */
		var arrayList2 = new ArrayList<Collection<? extends Number>>();
		
		/*
		 * 3) It is used to build an array list that has the specified initial capacity.
		 */
		var arrayList3 = new ArrayList(3);
		
		/*
		 * Java ArrayList Example
		 */
		var programmingLanguages = new ArrayList<String>();
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("C");
		programmingLanguages.add("Kotlin");
		
		System.out.println("Some Top Programming Languages: " + programmingLanguages);
		System.out.println("*************************************************");
		
		/*
		 * Iterating ArrayList using Iterator
		 */
		System.out.println("Some Top Programming Languages Using Iterator: " );
		Iterator iterator = programmingLanguages.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("*************************************************");
		
		/*
		 * Iterating ArrayList using Foreach Loop
		 */
		System.out.println("Some Top Programming Languages Using Foreach Loop: " );
		for (String programmingLanguage : programmingLanguages) {
			System.out.println(programmingLanguage);
		}
		System.out.println("*************************************************");
		
		/*
		 * Get and Set ArrayList
		 * The get() method returns the element at the specified index, 
		 * whereas the set() method changes the element.
		 */
		System.out.println("Second program language : " + programmingLanguages.get(1));
		
		//Changing Second Element
		programmingLanguages.set(1, "C++");
		System.out.println("Some Top Programming Languages After Item Changing: " );
		for (String programmingLanguage : programmingLanguages) {
			System.out.println(programmingLanguage);
		}
		System.out.println("*************************************************");
		
		/*
		 * How to Sort ArrayList
		 * The java.util package provides a utility class Collections which has the static method sort(). 
		 * Using the Collections.sort() method, we can easily sort the ArrayList.
		 */
		Collections.sort(programmingLanguages);
		System.out.println("Some Top Programming Languages After Sorting: " );
		for (String programmingLanguage : programmingLanguages) {
			System.out.println(programmingLanguage);
		}
		System.out.println("*************************************************");
	}
	
	public void iteratingThroughRemainingWays() {
		
		/*
		 * Ways to iterate the elements of the collection in Java.
		 * There are various ways to traverse the collection elements:
		   1) By Iterator interface.
	       2) By for-each loop.
		   3) By ListIterator interface.
		   4) By for loop.
		   5) By forEach() method.
		   6) By forEachRemaining() method.
		 */
		
		var programmingLanguages = new ArrayList<String>();
		programmingLanguages.add("Java");
		programmingLanguages.add("C++");
		programmingLanguages.add("C");
		programmingLanguages.add("Kotlin");
		
		/*
		 * Traversing list through List Iterator
		 */
		System.out.println("Traversing list through List Iterator:"); 
		//Here, element iterates in reverse order  
		ListIterator<String> list1 = programmingLanguages.listIterator(programmingLanguages.size());  
        while(list1.hasPrevious())  
        {  
            String item = list1.previous();  
            System.out.println(item);  
        }  
		System.out.println("*************************************************");
		
		/*
		 * Traversing list through for loop
		 */
		System.out.println("Traversing list through for loop:");  
        for(int i = 0; i < programmingLanguages.size(); i++)  
        {  
        	System.out.println(programmingLanguages.get(i));     
        } 
		System.out.println("*************************************************");
		
		/*
		 * Traversing list through forEach() method
		 */
		System.out.println("Traversing list through forEach() method:");  
        //The forEach() method is a new feature, introduced in Java 8.  
		programmingLanguages.forEach(a -> { //Here, we are using lambda expression  
            System.out.println(a);  
        });  
		System.out.println("*************************************************");
		
		/*
		 * Traversing list through forEachRemaining() method
		 */
		System.out.println("Traversing list through forEachRemaining() method:");  
        Iterator<String> itr = programmingLanguages.iterator();  
        itr.forEachRemaining(a -> //Here, we are using lambda expression  
        {  
        	System.out.println(a);  
        });  
		System.out.println("*************************************************");
	}
}
