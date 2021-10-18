package C_Advance.A_Collections.G_Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class _Queue {

	/*
	 * Queue Interface in Java
	 */
	
	/*
	 * Java Queue interface orders the element in FIFO(First In First Out) manner. 
	 * In FIFO, first element is removed first and last element is removed at last.
	 * 
	 * public interface Queue<E> extends Collection<E> 
	 * 
	 * Since Queue is an interface you need to instantiate a concrete implementation 
	 * of the interface in order to use it. You can choose between the following Queue 
	 * implementations in the Java Collections API:
	   - java.util.LinkedList
	   - java.util.PriorityQueue

     * LinkedList is a pretty standard queue implementation. 
     * Elements in the queue are stored internally in a standard linked list data structure. 
     * This makes it fast to insert elements at the end (tail) of the list, 
     * and remove elements from the beginning (head) of the list.
     * PriorityQueue stores its elements internally according to their natural order 
     * (if they implement Comparable), or according to a Comparator passed to the PriorityQueue.
     * There are also Queue implementations in the java.util.concurrent package, 
     * but we will leave the concurrency utilities out of this tutorial.
	 */
	
	public void queue() {
		
		/*
		 * Here are a few examples of how to create a Queue instance:
		 */
		Queue queueA = new LinkedList();
		Queue queueB = new PriorityQueue();
		
		/*
		 * In most Queue implementations the head and tail of the queue are at opposite ends. 
		 * It is possible, however, to implement the Queue interface so that the head and 
		 * tail of the queue is in the same end. In that case you would have a stack.
		 */
		
		/*
		 * By default you can put any Object into a Queue, but from Java 5, 
		 * Java Generics makes it possible to limit the types of object you can insert into a Queue. 
		 * This below example, Queue can now only have String instances inserted into it.
		 */
		Queue<String> queue = new LinkedList<String>();
		
		/*
		 * Methods of Java Queue Interface
		 */
		
		/*
		 * Add Element to Queue
		 * The Java Queue interface contains two methods you can use to add elements to a Queue. 
		 * These methods are the add() method and the offer() method. 
		 * These two methods add an element to the end of the Queue. 
		 * The add() and offer() methods differ in how the behave if the Queue is full, 
		 * so no more elements can be added. The add() method throws an exception in that case, 
		 * whereas the offer() method just returns false. 
		 * Here are two examples of adding elements to a Java Queue via its add() and offer() methods:
		 */
		Queue<String> elements = new LinkedList<>();
		elements.add("element 1");
		elements.offer("element 2");
		
		/*
		 * Iterate All Elements in Queue
		 * You can also iterate all elements of a Java Queue, 
		 * instead of just processing one at a time. 
		 * Here is an example of iterating all elements in a Java Queue:
		 */
		
		//Access via Iterator
		System.out.println("Elements via iterator: ");
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		System.out.println("***************************");

		//Access via new for-loop
		System.out.println("Elements via foreach: ");
		for(String element : elements) {
			System.out.println(element);
		}
		System.out.println("***************************");
		
		/*
		 * Peek at the Queue
		 * You can peek at the element at the head of a Queue without taking the element out of the Queue. 
		 * This is done via the Queue element() or peek() methods.
		 * The element() method returns the first element in the Queue. 
		 * If the Queue is empty, the element() method throws a NoSuchElementException. 
		 * Here is an example of peeking at the first element of a Java Queue using the element() method:
		 */
		String firstElementByElement = elements.element();
		System.out.println("Getting first element by using element(): " + firstElementByElement);
		System.out.println("***************************");
		
		/*
		 * After running this Java code the firstElement variable will contain the 
		 * value element 1 which is the first element in the Queue.
		 * The peek() works like the element() method except it does not throw an exception 
		 * if the Queue is empty. Instead it just returns null. 
		 * Here is an example of peeking at the first element of a Queue using the peek() method:
		 */
		String firstElementByPeek = elements.peek();
		System.out.println("Getting first element by using peek(): " + firstElementByPeek);
		System.out.println("***************************");
		
		/*
		 * Take Element From Queue
		 * To take an element from a Java Queue you can call either its poll() or remove() method. 
		 * The poll() and remove() both removes the first element in the Queue. 
		 * They differ in how they behave if the Queue is empty. 
		 * The poll() method returns null if the Queue is empty. 
		 * The remove() method throws an exception if the Queue is empty. 
		 * Here are two examples of taking an element from a Java Queue using its poll() and remove() methods:
		 */
		String element1 = elements.poll();
		System.out.println("Removed element by using poll(): " + element1);
		System.out.println("***************************");
		String element2 = elements.remove();
		System.out.println("Removed element by using remove(): " + element2);
		System.out.println("***************************");
		
		/*
		 * The call to poll() will remove the first element of the Queue
		 * which is the first Java String instance added - "element 1".
		 * The call to remove() will remove the second element of the Queue
		 * which after the first poll() call is now the String instance added - "element 2".
		 */
	}

	public void priorityQueue() {
		PriorityQueueClass priorityQueueClass = new PriorityQueueClass();
		priorityQueueClass.priorityQueue();
	}

	public void deque() {
		DequeClass dequeClass = new DequeClass();
		
	}
}
