package C_Advance.A_Collections.B_LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _LinkedList {

	/*
	 * Java LinkedList class uses a doubly linked list to store the elements. 
	 * It provides a linked-list data structure. It inherits the AbstractList 
	 * class and implements List and Deque interfaces.
	 * 
	 * The important points about Java LinkedList are:
	   - Java LinkedList class can contain duplicate elements.
	   - Java LinkedList class maintains insertion order.
	   - Java LinkedList class is non synchronized.
	   - In Java LinkedList class, manipulation is fast because no shifting needs to occur.
	   - Java LinkedList class can be used as a list, stack or queue.
	 
	 * Java LinkedList class extends AbstractSequentialList class 
	 * and implements List and Deque interfaces.
	 */
	
	/*
	 * Note:
	   1. Head of the LinkedList only contains the Address of the First element of the List.
	   2. The Last element of the LinkedList contains null in the pointer part of the node 
	      because it is the end of the List so it doesn’t point to anything.
	   3. There is another complex type variation of LinkedList which is called doubly linked list, 
	      node of a doubly linked list contains three parts: 
	      1) Pointer to the previous node of the linked list 
	      2) content of the element 
	      3) pointer to the next node of the linked list.
	 */
	
	/*
	 * Why Do We Need a Linked List?
	 * You must be aware of the arrays which is also a linear data structure 
	 * but arrays have certain limitations such as:
	   1) Size of the array is fixed which is decided when we create an array 
	      so it is hard to predict the number of elements in advance, 
	      if the declared size fall short then we cannot increase the size of an array 
	      and if we declare a large size array and do not need to store that many elements 
	      then it is a waste of memory.
       2) Array elements need contiguous memory locations to store their values.
       3) Inserting an element in an array is performance wise expensive 
          as we have to shift several elements to make a space for the new element. 
          For example: Let’s say we have an array that has following elements: 
          10, 12, 15, 20, 4, 5, 100, 
          now if we want to insert a new element 99 after the element that has value 12 
          then we have to shift all the elements after 12 to their right to make space for new element.
          
     * Similarly deleting an element from the array is also a performance wise expensive operation 
     * because all the elements after the deleted element have to be shifted left. 
     * These limitations are handled in the Linked List by providing following features:
       1. Linked list allows dynamic memory allocation, which means memory allocation is done 
          at the run time by the compiler and we do not need to mention the size of the list 
          during linked list declaration.
       2. Linked list elements don’t need contiguous memory locations 
          because elements are linked with each other using the reference part of the node 
          that contains the address of the next node of the list.
       3. Insert and delete operations in the Linked list are not performance wise expensive 
          because adding and deleting an element from the linked list does’t require element shifting, 
          only the pointer of the previous and the next node requires change.
	 */
	
	public void moreAboutLinkedList() {
		
		/*
		 * Constructors of Java LinkedList
		 */
		
		/*
		 * 1) It is used to construct an empty list.
		 */
		var linkedList1 = new LinkedList();
		
		/*
		 * 2) It is used to construct a list containing the elements 
		 *    of the specified collection, in the order, 
		 *    they are returned by the collection's iterator.
		 */
		var linkedList2 = new LinkedList<Collection<? extends Number>>();
		
		/*
		 * A simple Java LinkedList Example
		 */
		LinkedList<String> products = new LinkedList<String>();  
		products.add("Phone");  
		products.add("Tablet");  
		products.add("Laptop");  
		products.add("Camera");  
		products.add("TV");  		

		System.out.println("LinkedList of Products: ");
		System.out.println(products); 
		System.out.println("*******************************");
		
		System.out.println("Products: ");
		
		Iterator<String> itr = products.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		System.out.println("*******************************");
		
		/*
		 * Example to reverse a list of elements
		 */
		Iterator iterator = products.descendingIterator();
		System.out.println("Descending Order of Products: ");
		while(iterator.hasNext()){  
			System.out.println(iterator.next());  
		}  
		System.out.println("*******************************");
	}

	public void comparingPerformanceOfArrayListAndLinkedList() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		/*
		 * When we add item to end of the ArrayList and LinkedList, 
		 * we will see that ArrayList is little faster than LinkedList.
		 * Because in Array List, just one item is being created in the end and added. 
		 * But in Linked List, a new item is being created in memory and 
		 * also reference address of the item is being pointed and added to list.
		 * So Linked List is little slower than Array List. 
		 * But this is not important. They are close in 1000000 item.
		 */
		addingItemToEndOfTheList(arrayList, "Array List");
		addingItemToEndOfTheList(linkedList, "Linked List");
		
		/*
		 * When we add item to beginning of the ArrayList and LinkedList, 
		 * we will see that LinkedList is too much faster than ArrayList.
		 * Because in Array List, we have to shift several elements 
		 * to make a space for the new element. This is too much time.
		 * But in Linked List, adding an element does’t require element shifting, 
		 * only the pointer of the previous and the next node requires change.
		 * So LinkedList is much more better from ArrayList in 100000 item for example.
		 * But LinkedList uses more memory because it stores values of items and 
		 * pointer also.
		 */	
		addingItemToBeginningOfTheList(arrayList, "Array List");
		addingItemToBeginningOfTheList(linkedList, "Linked List");
	}
	
	private void addingItemToEndOfTheList(List<Integer> list, String dataType) {
		long startTime;
		long finishTime;
		
		startTime = System.currentTimeMillis();
		addItemToEnd(list);
		finishTime = System.currentTimeMillis();
		
		System.out.println("Elapsed time to add item to end of the list in " 
				+ dataType + " : " + (finishTime - startTime) + " ms");
		System.out.println("********************************************");
	}
	
	private void addingItemToBeginningOfTheList(List<Integer> list, String dataType) {
		long startTime;
		long finishTime;
		
		startTime = System.currentTimeMillis();
		addItemToBeginning(list);
		finishTime = System.currentTimeMillis();
		
		System.out.println("Elapsed time to add item to beginning of the list in " 
				+ dataType + " : " + (finishTime - startTime) + " ms");
		System.out.println("********************************************");
	}
	
	private void addItemToEnd(List<Integer> list) {
		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}
	}
	
	private void addItemToBeginning(List<Integer> list) {
		for (int i = 0; i < 100000; i++) {
			list.add(0, i);
		}
	}
}
