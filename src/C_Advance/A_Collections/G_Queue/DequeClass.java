package C_Advance.A_Collections.G_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeClass {

	/*
	 * Java Deque Interface
	 */
	
	/*
	 * Java Deque Interface is a linear collection that supports element 
	 * insertion and removal at both ends. Deque is an acronym for "double ended queue".
	 * 
	 * public interface Deque<E> extends Queue<E>
	 * 
	 * Because you can enqueue and dequeue from both ends of a Java Deque, 
	 * you can use a Deque as both a queue and a stack. The Java Deque interface extends 
	 * the Java Queue interface. That means that you can use all the Java Queue methods 
	 * when working with a Deque. The Deque interface does not extend the Java Stack interface, 
	 * but the Deque interface defines methods that enable you to do the same operations 
	 * you would normally do on a stack (push, peek, pop).
	 */
	
	/*
	 * Deque Implementations
	 * Since Java Deque is an interface you need to instantiate a concrete 
	 * implementation of the interface in order to use it. You can choose 
	 * between the following Deque implementations in the Java Collections API:
	   - java.util.LinkedList
	   - java.util.ArrayDeque
	   - The LinkedList class is a pretty standard Deque and Queue implementation. 
	     It uses a linked list internally to model a queue or a deque.

	 * The Java ArrayDeque class stores its elements internally in an array. 
	 * If the number of elements exceeds the space in the array, a new array is allocated, 
	 * and all elements moved over. In other words, the ArrayDeque grows as needed, 
	 * even if it stores its elements in an array.
	 */
	
	public void deque() {
		
		/*
		 * Creating a Deque
		 * Before you can use a Java Deque you must create an 
		 * instance of one of the classes that implements the Deque interface. 
		 * Here is an example of creating a Java Deque instance by creating a LinkedList instance:
		 */
		Deque deque1 = new LinkedList();
		
		/*
		 * Here is another example of creating a Java Deque by creating an ArrayDeque instance:
		 */
		Deque deque2 = new ArrayDeque();
		
		/*
		 * Generic Deque
		 * By default you can put any Object into a Java Deque. 
		 * However, using Java Generics it is possible to limit the types of object 
		 * you can insert into a Deque. This Deque can now only have String instances inserted into it.
		 */
		Deque<String> deque3 = new LinkedList<String>();
		
		/*
		 * Add Element to Deque
		 * As mentioned in the beginning of this Java Deque tutorial, 
		 * you can add elements to both the beginning and end of a Deque. 
		 * The Java Deque interface contains the following methods for adding elements to it:
		   - add()
		   - addLast()
	       - addFirst()
		   - offer()
		   - offerFirst()
		   - offerLast()
		 */
		
		/*
		 * add()
		 * You add elements to the beginning end of a Deque using the add() method.
		 * If the element cannot be inserted into the Deque, the add() method will throw an exception. 
		 * This is different from the offer() method, which will return false if it cannot insert the element.
		 * The add() method is actually inherited from the Queue interface. 
		 */
		
		/*
		 * addLast()
		 * The addLast() method also adds an element to the end (tail) of a Java Deque. 
		 * This is the Deque interface's equivalent of the add() method inherited from the Queue interface.
		 * If the element cannot be inserted into the Deque, the addLast() method will throw an exception. 
		 * This is different from the offerLast() method which will return false if the element cannot be added to the Deque.
		 */
		
		/*
		 * addFirst()
		 * To add an element at the beginning (head) instead of the end of a Java Deque you call the addFirst() method instead.
		 * If the element cannot be added to the beginning of the Deque, the addFirst() method will throw an exception. 
		 * This is different from the offerFirst() method which will return false if an element cannot be inserted in the beginning of the Deque.
		 */
		
		/*
		 * offer()
		 * The offer() method adds an element to the end (tail) of the Deque. 
		 * If adding the element succeeds the offer() method returns true. 
		 * If the adding the element fails - e.g. if the Deque is full, 
		 * the offer() method returns false. This is different from the add() 
		 * method which will throw an exception is adding an element to the end of the Deque fails. 
		 */
		
		/*
		 * offerLast()
		 * The offerLast() method adds an element to the end (tail) of the Deque, just like offer(). 
		 * The method name offerLast() is just a bit more saying about where the element is added to the Deque. 
		 * If adding the element succeeds the offerLast() method returns true. 
		 * If the adding the element fails - e.g. if the Deque is full, the offerLast() method returns false. 
		 * This is different from the addLast() method which will throw an exception is adding an element to the end of the Deque fails.
		 */
		
		/*
		 * offerFirst() 
		 * The offerFirst() method adds an element to the beginning (head) of the Deque. 
		 * If adding the element succeeds the offerFirst() method returns true. 
		 * If the adding the element fails - e.g. if the Deque is full, the offerFirst() method returns false. 
		 * This is different from the addFirst() method which will throw an exception is adding an element to the beginning of the Deque fails.
		 */
		
		/*
		 * push()
		 * The push() method adds an element to the beginning (head) of a Java Deque method. 
		 * If adding the element fails, for instance if the Deque is full, the push() method will throw an exception. 
		 * This is similar to how the addFirst() method works.
		 */
		
		/*
		 * Peek at Element in Deque
		 * You can peek at the first and last elements of a Java Deque. 
		 * Peeking at an element means obtaining a reference to the element without removing the element from the Deque. 
		 * You can peek at the first and last element of a Java Deque using these methods:
		   - peek()
		   - peekFirst()
	       - peekLast()
		   - getFirst()
		   - getLast()
		 */
		
		/*
		 * Remove Element From Deque
		 * To remove elements from a Java Deque, you can use one of the following methods:
		   - remove()
		   - removeFirst()
		   - removeLast()
		   - poll()
		   - pollFirst()
		   - pollLast()
		 */
	}
}
