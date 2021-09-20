package B_Intermediate.B_ArraysAndLists.B_ArrayLists;

import java.util.ArrayList;

public class ArrayListClass {

	/*
	 * ArrayList in Java
	 */
	
	/*
	 * ArrayList is a part of collection framework and is present in java.util package. 
	 * The ArrayList class is a resizable array. It provides us with dynamic arrays in Java. 
	 * Though, it may be slower than standard arrays but can be helpful in programs 
	 * where lots of manipulation in the array is needed. This class is found in java.util package.
	 */
	
	/*
	 * ArrayList(Class) --->implements---> List(Interface) --->extends---> Collection
	 */
	
	/*
	 * The difference between a built-in array and an ArrayList in Java, 
	 * is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). 
	 * While elements can be added and removed from an ArrayList whenever you want. 
	 * Java ArrayList class uses a dynamic array for storing the elements. 
	 * It is like an array, but there is no size limit. We can add or remove elements anytime.
	 */
	
	/*
	 * The important points about Java ArrayList class are:
	   - Java ArrayList class can contain duplicate elements.
       - Java ArrayList class maintains insertion order.
       - Java ArrayList class is non synchronized.
       - Java ArrayList allows random access because array works at the index basis.
       - In ArrayList, manipulation is little bit slower than the LinkedList in Java 
         because a lot of shifting needs to occur if any element is removed from the array list.
       - ArrayList is always single-dimensional.
       - ArrayList is dynamic in size.
       - ArrayList is generic.
	 */
	
	/*
	 * Differences between Arrays and ArrayLists:
	   a) - Array is static in size. 
	      - ArrayList is dynamic in size.
	   b) - An array is a fixed-length data structure. 
	      - ArrayList is a variable-length data structure. It can be resized itself when needed.
	   c) - It is mandatory to provide the size of an array while initializing it directly or indirectly.
	      - We can create an instance of ArrayList without specifying its size. Java creates ArrayList of default size.
	   d) - It performs fast in comparison to ArrayList because of fixed size.
	      - ArrayList is internally backed by the array in Java. The resize operation in ArrayList slows down the performance.
	   e) - An array can store both objects and primitives type.	
	      - We cannot store primitive type in ArrayList. It automatically converts primitive type to object.
	   f) - We cannot use generics along with array because it is not a convertible type of array
	      - ArrayList allows us to store only generic/ type, that's why it is type-safe.
	   g) - Array provides a length variable which denotes the length of an array.
	      - ArrayList provides the size() method to determine the size of ArrayList.
	   h) - We can add elements in an array by using the assignment operator.
	      - Java provides the add() method to add elements in the ArrayList.
	   i) - Array can be multi-dimensional.
	      - ArrayList is always single-dimensional.
	 */
	
	public void beginningToArrayList() {
		
		/*
		 * Because ArrayList is a class we will create an instance to use ArrayList.
		 */
		ArrayList<String> days = new ArrayList<String>();
		
		/*
		 * After creating ArrayList, we can give values to items by using add() method.
		 */
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		boolean isAdded = days.add("Sunday");
		System.out.println(isAdded ? "Sunday is added to days arraylist": "Sunday is not added to days arraylist");
		System.out.println("*************************************");	
		
		
		/*
		 * add(Object o) method adds item to the end of the arraylist and returns boolean value.
		 * But add(int index, E element) method insert item at index number which we want.
		 */
		days.add(3, "A new day");
		System.out.println("After inserting A new day: ");
		printStringArrayList(days);
		System.out.println("*************************************");	
		
		/*
		 * After giving values to items, we can access them by using get() method.
		 * get() method takes index number which we want to get.
		 * We have to be carefull about size of the array. 
		 * Because if we assign 3 item values, we can not get 4th value. 
		 * Because of that arraylist does not have 4th value, it will throw 'IndexOutOfBoundsException' error. 
		 */
		System.out.println("Third day of the week: " + days.get(2));
		
		System.out.println("*************************************");		

		/*
		 * We can find how many items array have by using size() method.
		 */
		System.out.println("Days array have " + days.size() + " items");
		System.out.println("*************************************");		
		
		/*
		 * Like arrays, arraylists can be sent to a method as parameter 
		 * and can be iterated by using for or foreach loop
		 */
		System.out.println("Days: ");
		printStringArrayList(days);
		
		/*
		 * We can remove an item of arraylist in 2 ways:
		   1) Giving object to remove() method.
		   2) Giving index number to remove() method.
		 */
		
		//1. way:
		days.remove("A new day");
		
		System.out.println("After removing A new day: ");
		printStringArrayList(days);
		
		//2. way:
		days.remove(1);
		
		System.out.println("After removing second item: ");
		printStringArrayList(days);
		
		/*
		 * We can learn index of the specific item by using indexOf() method.
		 * indexOf() method gives the first occurance of the object in the arraylist.
		 * If there is multiple occurance of the object we can find the last one by using lastIndexOf() method.
		 */
		System.out.println("Index of the Saturday item: " + days.indexOf("Saturday"));
		System.out.println("*************************************");	
		
		days.add("Saturday");
		System.out.println("After adding multiple Saturday item: ");
		printStringArrayList(days);
		System.out.println("Index of the last Saturday item: " + days.lastIndexOf("Saturday"));
		System.out.println("*************************************");	
		
		/*
		 * If we search for nonexisting item in the array,
		 * the result of index will be -1
		 */
		System.out.println("Nonexisting Tuesday item index: " + days.lastIndexOf("Tuesday"));
		System.out.println("*************************************");	
		
		/*
		 * If we want to update an item of arraylist, we can use set() method
		 */
		days.set(1, "Tuesday");
		System.out.println("After updating second item as Tuesday: ");
		printStringArrayList(days);
		
		
	}
	
	public void moreMothodsOfArrayList() {
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>();
		numbers1.add(1);
		numbers1.add(2);
		numbers1.add(3);
		numbers1.add(4);
		numbers1.add(5);
		
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		numbers1.add(6);
		numbers1.add(7);
		numbers1.add(8);
		numbers1.add(9);
		numbers1.add(10);
		
		/*
		 * We can combine two or more arraylist by using addAll() method.
		 * Also we can use addAll(int index, Collection<? extends E) to insert specific index.
		 */
		boolean isAddedAllNumbers = numbers1.addAll(numbers2);
		System.out.println(isAddedAllNumbers ? "All numbers added": "All numbers did not add");
		System.out.println("After added all numbers of numbers2 to first arraylist: ");
		printIntegerArrayList(numbers1);
		
		ArrayList<Integer> numbers3 = new ArrayList<Integer>();
		numbers3.add(12);
		numbers3.add(11);
		numbers3.add(15);
		numbers1.addAll(2, numbers3);
		System.out.println("After inserting all numbers of numbers3 at second index of first arraylist: ");
		printIntegerArrayList(numbers1);
		
		
		/*
		 * We can learn if arraylist is empty or not by using empty() method
		 */
		ArrayList<String> days = new ArrayList<String>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		
		System.out.println(days.isEmpty() ? "Days araylist is empty" : "Days araylist is not empty");
		System.out.println("****************************************");
		
		/*
		 * We can convert ArrayList to Array by using toArray() method.
		 */
		Object[] daysArr = days.toArray();
		System.out.println("After converting to Array: ");
		printArray(daysArr);
		
		/*
		 * To get a shallow copy of an ArrayList, we can use clone() method.
		 */
		ArrayList<String> clonedDays = (ArrayList<String>) days.clone();
		System.out.println("After cloning of days arraylist: ");
		printStringArrayList(clonedDays);
		
		/*
		 * Because in ArrayLists clone() method get a shallow copy of arraylist,
		 * their references are not equal like we see below example.
		 * But their items are equal so equals() method will say that they are equal.
		 */
		String areTheirReferencesEqual = clonedDays == days ? "Their references are equal": "Their references are not equal";
		System.out.println(areTheirReferencesEqual);
		System.out.println("****************************************");
		
		String areTheyEqual = clonedDays.equals(days) ? "They are equal": "They are not equal";
		System.out.println(areTheyEqual);
		System.out.println("****************************************");
		
		/*
		 * We can find out that an arraylist has an item or not by using contains() method. 
		 */
		String isContainsFriday = days.contains("Friday") ? "Days arraylist contains Friday" : "Days arraylist does not contain Friday";
		System.out.println(isContainsFriday);
		System.out.println("****************************************");
		
		/*
		 * We can delete all items in arraylist by using clear() method.
		 */
		numbers1.clear();
		System.out.println("After deleting all items: ");
		printIntegerArrayList(numbers1);
	}
	
	private void printStringArrayList(ArrayList<String> arrayList) {
		for(String item: arrayList) {
			System.out.println(item);
		}
		System.out.println("*************************************");	
	}
	
	private void printIntegerArrayList(ArrayList<Integer> arrayList) {
		for(int item: arrayList) {
			System.out.println(item);
		}
		System.out.println("*************************************");	
	}
	
	private void printArray(Object[] array) {
		for(Object item: array) {
			System.out.println(item);
		}
		System.out.println("*************************************");	
	}
}
