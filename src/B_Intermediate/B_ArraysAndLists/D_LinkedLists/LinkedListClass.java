package B_Intermediate.B_ArraysAndLists.D_LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListClass {

	/*
	 * LinkedList in Java
	 */
	
	/*
	 * Linked List is a part of the Collection framework present in java.util package. 
	 * This class is an implementation of the LinkedList data structure which is a linear data structure 
	 * where the elements are not stored in contiguous locations and every element is a separate object 
	 * with a data part and address part. The elements are linked using pointers and addresses. 
	 * Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, 
	 * they are preferred over the arrays. It also has few disadvantages like the nodes cannot be accessed 
	 * directly instead we need to start from the head and follow through the link to reach to a node we wish to access.
	 */
	
	/*
	 * Java LinkedList class uses a doubly linked list to store the elements. 
	 * It provides a linked-list data structure. It inherits the AbstractList class and 
	 * implements List and Deque interfaces. The important points about Java LinkedList are:
	   - Java LinkedList class can contain duplicate elements.
	   - Java LinkedList class maintains insertion order.
	   - Java LinkedList class is non synchronized.
	   - In Java LinkedList class, manipulation is fast because no shifting needs to occur.
	   - Java LinkedList class can be used as a list, stack or queue.
	   
	 * Java LinkedList class extends AbstractSequentialList class and implements List and Deque interfaces.
	 */
	
	/*
	 * An ArrayList is an index based data structure backed by an Array. 
	 * It provides random access to its elements with a performance equal to O(1). 
	 * On the other hand, a LinkedList stores its data as a list of elements and every element 
	 * is linked to its previous and next element. In this case, the search operation for an item 
	 * has execution time equal to O(n). A LinkedList consumes more memory than an ArrayList 
	 * because of every node in a LinkedList stores two references, one for its previous element 
	 * and one for its next element, whereas ArrayList holds only data and its index.
	 */
	
	public void beginningToLinkedLists() {
		
		ArrayList<String> programmingLanguages = new ArrayList();
		programmingLanguages.add("C#");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("Kotlin");
		
		System.out.println("Programming Languages: ");
		printList(programmingLanguages);
		
		programmingLanguages.add(1, "Go");
		System.out.println("Programming Languages after adding: ");
		printList(programmingLanguages);
		
		/*
		 * When we insert an item in arraylist, all items after insertion will be replaced at the next position.
		 * So it will cause big amount of loss in performance and time in too big sized arraylists. 
		 * But in linkedlists, when we want to insert an item, just previous and next item of the inserted index
		 * will be affected. Their pointers will change the point which is pointed. 
		 */
		
		LinkedList<String> languages = new LinkedList();
		languages.add("Turkish");
		languages.add("English");
		languages.add("Spanish");
		languages.add("Italian");
		languages.add("French");
		languages.add("Arabic");
		
		/*
		 * We can iterate items in linkedlist using foreach loop like below:
		 */
		System.out.println("Languages by using foreach: ");
		printList(languages);
		
		/*
		 * But for advanced operations we can want to use ListIterator like below:
		 */
		System.out.println("Languages by using iterator: ");
		printLinkedListByUsingIterator(languages);
		
		/*
		 * We can add an item to linkedlist like arraylist
		 */
		languages.add("Russian");
		printLinkedListByUsingIterator(languages);
		
		/*
		 * An example which is adding items to linkedlist in order:
		 */
		LinkedList<String> courses = new LinkedList();
		addItemsInOrder(courses, "System & Design");
		addItemsInOrder(courses, "Operating Systems");
		addItemsInOrder(courses, "Data Structures & Algorithms");
		
		System.out.println("Courses: ");
		printLinkedListByUsingIterator(courses);
		
		/*
		 * We see that, we can add items in order by using iterator. 
		 * Course items have placed in courses linkedlist in alphabetically order.
		 */
	}
	
	public void methodsOfLinkedList() {
		
		LinkedList<String> languages = new LinkedList();
		languages.add("Turkish");
		languages.add("English");
		languages.add("Spanish");
		languages.add("Italian");
		
		/*
		 * boolean add(E e),
		 * void add(int index, E element),
		 * boolean addAll(Collection<? extends E> c)
		 * boolean addAll(int index, Collection<? extends E> c)
		 * boolean contains(Object o)
		 * E get(int index)
		 * int indexOf(Object o)
		 * int lastIndexOf(Object o)
		 * int size()
		 * 
		 * These above methods are doing same job in linkedlists like arraylists.
		 */
		
		/*
		 * We can insert the given element at the beginning of a list by using addFirst() method.
		 */
		languages.addFirst("Arabic");		
		System.out.println("Languages after inserting Arabic at the beginning of a list: ");
		printLinkedListByUsingIterator(languages);
		
		/*
		 * We can append the given element to the end of a list by using addLast() method.
		 */
		languages.addLast("French");
		System.out.println("Languages after appending French at the beginning of a list: ");
		printLinkedListByUsingIterator(languages);
		
		/*
		 * We can retrieve the first element of a list by using element() method.
		 */
		String element = languages.element();
		System.out.println("First element of the list: " + element);
		System.out.println("*****************************");
		
		/*
		 * We can return the first element and last element in a list 
		 * by using getFirst() and getLast() methods.
		 */
		String firstElement = languages.getFirst();
		String lastElement = languages.getLast();
		System.out.println("First element " + firstElement + " and the last element " + lastElement + " in the list");
		System.out.println("***********************************************");
		
		/*
		 * We can return a list-iterator of the elements in proper sequence, 
		 * starting at the specified position in the list.
		 */
		System.out.println("Languages, beginning from second index of the list: ");
		printLinkedListByUsingIterator(languages, 2);
		
		/*
		 * We can add the specified element as the last element of a list by using offer() method.
		 */
		languages.offer("Spanish");
		System.out.println("Languages after adding the Spanish as the last element of a list: ");
		printLinkedListByUsingIterator(languages);
		
		/*
		 * We can insert the specified element at the front of a list by using offerFirst() method
		 * and insert the specified element at the end of a list by using offerLast() method.
		 */
		languages.offerFirst("Portuguese");
		System.out.println("Languages after inserting Portuguese at the front of a list: ");
		printLinkedListByUsingIterator(languages);
		
		/*
		 * We can retrieve the first element of a list by using peek() method.
		 */
		String firstItem = languages.peek();
		System.out.println("First item of the list: " + firstItem);
		System.out.println("***********************************************");
		
		/*
		 * We can retrieve the first element of a list by using peekFirst() method or returns null if a list is empty.
		 * We can retrieve the last element of a list by using peekLast() method or returns null if a list is empty.
		 */
		String lastItem = languages.peekLast();
		System.out.println("Last item of the list: " + lastItem);
		System.out.println("***********************************************");
		
		/*
		 * We can retrieve and remove the first element of a list by using poll() method
		 */
		String firstElementOfTheList = languages.poll();
		System.out.println("First and removed item of the list: " + firstElementOfTheList);
		System.out.println("Languages after polling: ");
		printLinkedListByUsingIterator(languages);
		
		/*
		 * We can retrieve and remove the first element of a list by using pollFirst() method, 
		 * or returns null if a list is empty.
		 * We can retrieve and remove the last element of a list by using pollLast() method, 
		 * or returns null if a list is empty.
		 */
		
		/*
		 * We can pop an element from the stack represented by a list pop() method.
		 */
		String poppedElement = languages.pop();
		System.out.println("Popped item of the list: " + poppedElement);
		System.out.println("***********************************************");		
		
		/*
		 * We can push an element onto the stack represented by a list.
		 */
		languages.push("Indonesian");
		System.out.println("Languages after pushing Indonesian at the front of a list: ");
		printLinkedListByUsingIterator(languages);
		
		/*
		 * We can return an array containing all the elements in a list in proper sequence 
		 * (from first to the last element).
		 */
		Object[] languagesArr = languages.toArray();
		System.out.println("Language array : ");
		for (Object language : languagesArr) {
			System.out.println(language);
		}
		System.out.println("***********************************************");	
	}
	
	private void printList(List<String> list) {
		for(String item: list) { 
			System.out.println(item);
		}
		System.out.println("*****************************");
	}
	
	private void printLinkedListByUsingIterator(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("*****************************");
	}

	private void printLinkedListByUsingIterator(List<String> list, int index) {
		ListIterator<String> iterator = list.listIterator(index);
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("*****************************");
	}

	private void addItemsInOrder(List<String> list, String newItem) {
		
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
			int comparedValue = iterator.next().compareTo(newItem);
			if (comparedValue == 0) {
				System.out.println("This item is already exist!");
				return;
			}
			else if(comparedValue < 0) {
				//new item is bigger than iterator.next(), so doing nothing.
			}
			else if(comparedValue > 0) {
				iterator.previous();
				iterator.add(newItem);
				return;
			}
		}
		iterator.add(newItem);
	}
}
