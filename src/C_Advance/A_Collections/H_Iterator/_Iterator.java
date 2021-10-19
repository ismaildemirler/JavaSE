package C_Advance.A_Collections.H_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _Iterator {

	/*
	 * Iterator in Java
	 */
	
	/*
	 * In Java, an Iterator is one of the Java cursors. 
	 * Java Iterator is an interface that is practiced in order to iterate over a collection of Java object 
	 * components entirety one by one. It is free to use in the Java programming language since the 
	 * Java 1.2 Collection framework. It belongs to java.util package.
	 * Though Java Iterator was introduced in Java 1.2, however, it is still not the oldest tool available 
	 * to traverse through the elements of the Collection object. The oldest Iterator in the Java programming 
	 * language is the Enumerator predated Iterator. Java Iterator interface succeeds the enumerator iterator 
	 * that was practiced in the beginning to traverse over some accessible collections like the ArrayLists.
	 * The Java Iterator is also known as the universal cursor of Java as it is appropriate for all the classes 
	 * of the Collection framework. The Java Iterator also helps in the operations like READ and REMOVE. 
	 * When we compare the Java Iterator interface with the enumeration iterator interface, we can say that the names 
	 * of the methods available in Java Iterator are more precise and straightforward to use.
	 */
	
	/*
	 * Advantages of Java Iterator
	 * Iterator in Java became very prevalent due to its numerous advantages. 
	 * 
	 * The advantages of Java Iterator are given as follows:
       - The user can apply these iterators to any of the classes of the Collection framework.
	   - In Java Iterator, we can use both of the read and remove operations.
	   - If a user is working with a for loop, they cannot modernize(add/remove) the Collection, 
	     whereas, if they use the Java Iterator, they can simply update the Collection.
	   - The Java Iterator is considered the Universal Cursor for the Collection API.
	   - The method names in the Java Iterator are very easy and are very simple to use.
	 */
	
	/*
	 * Disadvantages of Java Iterator
	 * Despite the numerous advantages, the Java Iterator has various disadvantages also. 
	 * 
	 * The disadvantages of the Java Iterator are given below -
	   - The Java Iterator only preserves the iteration in the forward direction. 
	     In simple words, the Java Iterator is a uni-directional Iterator.
	   - The replacement and extension of a new component are not approved by the Java Iterator.
	   - In CRUD Operations, the Java Iterator does not hold the various operations like CREATE and UPDATE.
	   - In comparison with the Spliterator, Java Iterator does not support traversing elements 
	     in the parallel pattern which implies that Java Iterator supports only Sequential iteration.
	   - In comparison with the Spliterator, Java Iterator does not support more reliable execution to traverse the bulk volume of data.
	 */
	
	/*
	 * Java Iterator Methods
	 * The following figure perfectly displays the class diagram of the Java Iterator interface. 
	 * 
	 * It contains a total of four methods that are:
       - hasNext()
	   - next()
	   - remove()
	   - forEachRemaining()
	 
	 * The forEachRemaining() method was added in the Java 8. Let's discuss each method in detail.
	   
	   - boolean hasNext(): The method does not accept any parameter. 
	     It returns true if there are more elements left in the iteration. 
	     If there are no more elements left, then it will return false.
	     If there are no more elements left in the iteration, then there is no need to call the next() method. 
	     In simple words, we can say that the method is used to determine whether the next() method is to be called or not.
	   
	   - E next(): It is similar to hasNext() method. It also does not accept any parameter. 
	     It returns E, i.e., the next element in the traversal. If the iteration or collection 
	     of objects has no more elements left to iterate, then it throws the NoSuchElementException.
     
       - default void remove(): This method also does not require any parameters. There is no return type of this method. 
         The main function of this method is to remove the last element returned by the iterator traversing 
         through the underlying collection. The remove () method can be requested hardly once per the next () method call. 
         If the iterator does not support the remove operation, then it throws the UnSupportedOperationException. 
         It also throws the IllegalStateException if the next method is not yet called.

       - default void forEachRemaining(Consumer action): It is the only method of Java Iterator that takes a parameter. 
         It accepts action as a parameter. Action is nothing but that is to be performed. There is no return type of the method. 
         This method performs the particularized operation on all of the left components of the collection until all the components 
         are consumed or the action throws an exception. Exceptions thrown by action are delivered to the caller. 
         If the action is null, then it throws a NullPointerException.
	 */
	
	public void iterator() {
		
		/*
		 * Points to Remember
		   - The Java Iterator is an interface added in the Java Programming language 
		     in the Java 1.2 Collection framework. It belongs to java.util package.
		   - It is one of the Java Cursors that are practiced to traverse the objects of the collection framework.
		   - The Java Iterator is used to iterate the components of the collection object one by one.
		   - The Java Iterator is also known as the Universal cursor of Java as it is 
		     appropriate for all the classes of the Collection framework.
		   - The Java Iterator also supports the operations like READ and REMOVE.
		   - The methods names of the Iterator class are very simple and easy to 
		     use compared to the method names of Enumeration Iterator.
		   - It can be used in class which implements Set, Queue, List Interfaces
		   - It has not previous() method.
		 */
		
		ArrayList<String> cityNames = new ArrayList<String>();  
	    
        cityNames.add("Ankara");  
        cityNames.add("Sakarya");  
        cityNames.add("Istanbul");  
        cityNames.add("Bursa");  
        cityNames.add("Izmir");  
    
        // Iterator to iterate the cityNames  
        Iterator<String> iterator = cityNames.iterator();  
    
        System.out.println("CityNames elements : ");  
    
        while (iterator.hasNext())  {
        	System.out.print(iterator.next() + " ");
        }
    
        System.out.println();
        System.out.println("**********************************");
        
        System.out.println("Again CityNames elements : ");  
        while (iterator.hasNext())  
            System.out.print(iterator.next() + " ");  
        
        System.out.println("**********************************");
        
        /*
         * Like we see, our iterator finished and print out the list the screen,
         * because there is no more elements, because iterator is in the end,
         * iterator can not move. So it can not print out anything. 
         * Because it has no previous() method.
         */
	}

	public void listIterator() {
		
		/*
		 * The listIterator () method of Java ArrayList returns a list iterator 
		 * over the elements in this list starting at the specified position in this list. 
		 * The specified index indicates the first element that would be returned by an initial call to next. 
		 * An initial call to previous would return the element with the specified index minus one.
		 * 
		 * public ListIterator<E> listIterator(int index)
		 * 
		 * Parameter:
		 * "index": is the index of the first element to be returned from the list iterator when calling iterator.next () method.
		 * 
		 * Return:
		 * Return "ListIterator": returns list iterator over the elements in this list starting at the specified position in this list.
		 * 
		 * Exception:
		 * IndexOutOfBoundsException:If the index is out of range (index<0 || index > size).
		 * 
		 * ListIterator can be used in class which implements only List Interface.
		 * It has next() and previous() methods.
		 * In extra it has add() method.
		 */
		
		/*
		 * Example 1
		 */
		ArrayList<String> arrlist = new ArrayList<String>();  
		arrlist.add("d");  
		arrlist.add("dd");  
		arrlist.add("ddd");  
		arrlist.add("dddd");  
		arrlist.add("ddddd");  
		System.out.println("Our list: " + arrlist);    // [d, dd, ddd, dddd, ddddd]  
		System.out.println("*****************************************");
		
		System.out.println("Our next list items after second index: ");
		ListIterator<String> iterator1 = arrlist.listIterator(2);  
		while (iterator1.hasNext())  
		{  
			String i = iterator1.next();  
			System.out.println(i);  
		}  
		System.out.println("*****************************************");
		
		System.out.println("Our previous list items: ");
		while (iterator1.hasPrevious())  
		{  
			String i = iterator1.previous();  
			System.out.println(i);  
		}  
		System.out.println("*****************************************");
		
		/*
         * We can remove and items while iterating them.
         */
		ListIterator<String> iterator2 = arrlist.listIterator();  
        while (iterator2.hasNext())  {
        	String value = iterator2.next();
        	if(value.equals("dddd")) {
        		iterator2.remove();
        		iterator2.add("eeee");
        	}
        }

        System.out.println("List elements after removing dddd and adding eeee : ");  
        for (String city : arrlist) {
			System.out.println(city);
		}
        System.out.println("**********************************");
		
		/*
		 * Example 2
		 */
		System.out.println("Our list: " + arrlist);    // [d, dd, ddd, dddd, ddddd]  
		System.out.println("*****************************************");
		
		ListIterator<String> iterator3 = arrlist.listIterator(5);  
		System.out.println("Has iterator an element after fifth index? " + iterator3.hasNext());    // false  
		//iterator2 = arrlist.listIterator(6);    // IndexOutOfBoundsException  
		System.out.println("*****************************************");
		
		
	}

	public void customIterable() {
		
		String[] universities = { "Hacettepe", "Gazi", "ODTU", "Bogazici", "Yildiz Teknik", "ITU" };
		University university = new University(universities);
		
		/*
		 * We used 2 ways in iterator method in University class. 
		 * Printing universities by custom iterator or implementing iterable interface
		 */
		System.out.println("Printing universities by using foreach loop :");
		for (String item : university) {
			System.out.println(item);
		}
		System.out.println("********************************************");
		
		System.out.println("Printing universities by using own iterator of University class :");
		Iterator<String> iterator = university.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("********************************************");
	}

	public void example() {
		
	}
}
