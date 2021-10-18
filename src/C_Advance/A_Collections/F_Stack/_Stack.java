package C_Advance.A_Collections.F_Stack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class _Stack {

	/*
	 * Stack in Java
	 */
	
	/*
	 * The stack is a linear data structure that is used to store the collection of objects. 
	 * It is based on Last-In-First-Out (LIFO). Java collection framework provides many 
	 * interfaces and classes to store the collection of objects. One of them is the Stack class 
	 * that provides different operations such as push, pop, search, etc.
	 * The stack data structure has the two most important operations that are push and pop. 
	 * The push operation inserts an element into the stack and pop operation removes an element 
	 * from the top of the stack. Let's see how they work on stack.
	 */
	
	/*
	 * Let's push 20, 13, 89, 90, 11, 45, 18, respectively into the stack.
	 * 
	 *  Push 20   Push 13        Push 18
	 * |      |  |      |  ...  |  18  |-> Top of the Stack
 	 * |      |  |      |  ...  |  45  |
	 * |      |  |      |  ...  |  11  |
	 * |      |  |      |  ...  |  90  |
	 * |      |  |      |  ...  |  89  |
	 * |      |  |  13  |  ...  |  13  |
	 * |__20__|  |__20__|  ...  |__20__|
	 * 
	 * Let's remove (pop) 18, 45, 11 from the Stack
	 * 
	 *   pop()     pop()          
	 * |  18  |  |      |  ...  |      |
 	 * |  45  |  |  45  |  ...  |      |
	 * |  11  |  |  11  |  ...  |      |
	 * |  90  |  |  90  |  ...  |  90  |-> Top of the Stack
	 * |  89  |  |  89  |  ...  |  89  |
	 * |  13  |  |  13  |  ...  |  13  |
	 * |__20__|  |__20__|  ...  |__20__|
	 * 
	 * Empty Stack: If the stack has no element is known as an empty stack. 
	 * When the stack is empty the value of the top variable is -1.
	 * 
	 * The following table shows the different values of the top.
	 *    Top Value                 Meaning
	 *       -1					    It shows the Stack is empty.
	 *        0						The Stack has only an element.
	 *       N-1				    The Stack is full
	 *        N						The Stack is overflow
	 */
	
	/*
	 * In Java, Stack is a class that falls under the Collection framework that extends the Vector class. 
	 * It also implements interfaces List, Collection, Iterable, Cloneable, Serializable. 
	 * It represents the LIFO stack of objects. Before using the Stack class, we must import the java.util package. 
	 * The stack class arranged in the Collections framework hierarchy, 
	 * Vector Class implements List Interface, Stack Class extends Vector Class.
	 */
	
	public void stack() {
		
		/*
		 * The Stack class contains only the default constructor that creates an empty stack.
		 * If we want to create a stack, first, import the java.util package and create an object of the Stack class.
		 */
		Stack stack1 = new Stack();
		Stack<Object> stack2 = new Stack<Object>();
		
		/*
		 * Methods 
		 * We can perform push, pop, peek and search operation on the stack. 
		 * The Java Stack class provides mainly five methods to perform these operations. 
		 * Along with this, it also provides all the methods of the Java Vector class.
		 */
		Stack<String> movies = new Stack<String>();
		
		/*
		 * push()
		 * The method inserts an item onto the top of the stack. 
		 * It works the same as the method addElement(item) method of the Vector class. 
		 * It passes a parameter item to be pushed into the stack.
		 */
		movies.push("Godfather");
		movies.push("Inception");
		movies.push("Matrix");
		movies.push("Lord Of The Rings");
		movies.push("Forrest Gump");
		movies.push("Prestige");	
		movies.push("Star Wars");		
		
		/*
		 * empty()
		 * The empty() method of the Stack class check the stack is empty or not. 
		 * If the stack is empty, it returns true, else returns false. 
		 * We can also use the isEmpty() method of the Vector class.
		 */
		String isEmpty = movies.isEmpty() ? "Stack is empty" : "Stack is not empty";
		System.out.println("Is Stack empty? " + isEmpty);
		System.out.println("****************************");
		
		/*
		 * pop()
		 * The method removes an object at the top of the stack and returns the same object. 
		 * It throws EmptyStackException if the stack is empty.
		 */
		String element = movies.pop();
		System.out.println("Last and removed element: " + element);
		System.out.println("****************************");
		
		/*
		 * peek()
		 * It looks at the element that is at the top in the stack. 
		 * It also throws EmptyStackException if the stack is empty.
		 * It returns the top elements of the stack.
		 */
		String movie = movies.peek();
		System.out.println("Movie at the top of the Stack: " + movie);
		System.out.println("****************************");
		
		/*
		 * search()
		 * The method searches the object in the stack from the top. 
		 * It parses a parameter that we want to search for. 
		 * It returns the 1-based location of the object in the stack. 
		 * This topmost object of the stack is considered at distance 1.
		 * Suppose, o is an object in the stack that we want to search for. 
		 * The method returns the distance from the top of the stack of 
		 * the occurrence nearest the top of the stack. 
		 * It uses equals() method to search an object in the stack.
		 * It returns the object location from the top of the stack. 
		 * If it returns -1, it means that the object is not on the stack.
		 */
		int location = movies.search("Matrix");  
		System.out.println("Location of Matrix: " + location); 
		System.out.println("****************************");
		
		/*
		 * size()
		 * We can also find the size of the stack using the size() method of the Vector class. 
		 * It returns the total number of elements (size of the stack) in the stack.
		 */
		System.out.println("Size of the movie stack: " + movies.size());
		System.out.println("****************************");
		
		/*
		 * Iterate Elements
		 * Iterate means to fetch the elements of the stack. 
		 * We can fetch elements of the stack using three different methods are as follows:
		   - Using iterator() Method
		   - Using forEach() Method
		   - Using listIterator() Method
		   - Using elements() Method of Vector class
		 */
		
		/*
		 * Using the iterator() Method
		 */
		System.out.println("Movies by using iterator: ");
		Iterator iterator = movies.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("****************************");
		
		/*
		 * Using foreach() Method
		 */
		System.out.println("Movies by using foreach: ");
		movies.forEach(item -> {
			System.out.println(item);
		});
		System.out.println("****************************");
		
		/*
		 * Using listIterator() Method
		 * Parameter: The method parses a parameter named index.
		 * Returns: This method returns a list iterator over the elements, in sequence.
		 * Exception: It throws IndexOutOfBoundsException if the index is out of range.
		 */
		System.out.println("Movies by using list iterator: ");
		ListIterator listIterator = movies.listIterator(movies.size());
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println("****************************");
		
		/*
		 * Using elements() Method
		 */
		System.out.println("Movies by using elements: ");
		Enumeration enumeration = movies.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		System.out.println("****************************");
		
		/*
		 * In some problems or algorithms, 
		 * below example is very good to know.
		 */
		while(!movies.isEmpty()) {
			String removed = movies.pop();
			System.out.println("Removed element: " + removed);
		}
		System.out.println("****************************");
	}

	public void stackExample() {
		
		/*
		 * In this example, we will control given word is palindrome or not using Stack
		 */
		String word1 = "palindrome is palindrome or not";
		String word2 = "no lemon no melon";
		
		isStringPalindrome(word1);
		isStringPalindrome(word2);
	}
	
	private void isStringPalindrome(String s) {
		String word = s.trim().replace(" ", "");
		Stack<Character> palindrome = new Stack<Character>();
		for (int i = 0; i < word.length(); i++) {
			if (palindrome.isEmpty()) {
				palindrome.push(word.charAt(i));
			}
			else {
				if (palindrome.peek().equals(word.charAt(i))) {
					palindrome.pop();
				}
				else {
					palindrome.push(word.charAt(i));
				}
			}
		}
		
		if (palindrome.isEmpty()) {
			System.out.println("'" + s + "'" + " is palindrome");
		}
		else {
			System.out.println("'" + s + "'" + " is not palindrome");
		}
	}
}
