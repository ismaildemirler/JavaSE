package B_Intermediate.B_ArraysAndLists.A_Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class _ArrayClass {

	/*
	 * Arrays in Java
	 */

	/*
	 * Arrays are used to store multiple values in a single variable, instead of
	 * declaring separate variables for each value. An array is a group of
	 * like-typed variables that are referred to by a common name. Arrays in Java
	 * work differently than they do in C/C++. 
	 * Following are some important points about Java arrays: 
	   - In Java all arrays are dynamically allocated.(discussed below) 
	   - Since arrays are objects in Java, we can find their length using the object property length. 
	     This is different from C/C++ where we find length using sizeof. 
	   - A Java array variable can also be declared like other variables with [] after the data type. 
	   - The variables in the array are ordered and each have an index beginning from 0. 
	   - Java array can be also be used as a static field, a local variable or a method parameter. 
	   - The size of an array must be specified by an int or short value and not long. 
	   - The direct superclass of an array type is Object. 
	   - Every array type implements the interfaces Cloneable and java.io.Serializable. 
	   - Array can contain primitives (int, char, etc.) as well as object (or non-primitive) references
	     of a class depending on the definition of the array. In case of primitive
	     data types, the actual values are stored in contiguous memory locations. 
	     In case of objects of a class, the actual objects are stored in heap segment.
	 */

	public void oneDimensionalArrays() {

		/*
		 * One-Dimensional Arrays
		 */

		int number = 10;

		/*
		 * We have defined an int variable which equals 10. But if i want to define a
		 * variable and assign multiple value to it then we have to define an int array.
		 * How can we create an array? Firstly we will declare a variable that holds an
		 * array of integers then insert some values to it. To insert values to it, we
		 * can use an array literal - place the values in a comma-separated list, inside
		 * curly braces:
		 */

		int[] numbers1 = { 10, 5, 7, 11, 20 };
		
		/*
		 * Also, Arrays can be declared like below:
		 */
		int numbers2[]  = { 10, 5, 7, 11, 20 };

		/*
		 * So far, we have declared int arrays. But Arrays can hold multiple double
		 * values, String values, or all Objects.
		 */
		double[] doubles = { 1.2, 2.3, 5.4 };
		String[] cars = { "Volvo", "Mercedes", "Audi" };
		Object[] objects = { 3, "John", 1.5, 4.5f };

		/*
		 * Like you see in above, if we declare an array which is type of Object, we can
		 * put different type values into it.
		 */

		/*
		 * So far, we have declared an array and gave some initial values once we
		 * declared it. But also we can declare an array and give values to it later
		 * like below. But if we will give values after, we have to define array length
		 * initially.
		 */
		int[] array1 = new int[10];

		/*
		 * When we declared an array like above, the space which is for 10 items is
		 * spared in the ram and array1 variable shows the reference of that space. And
		 * if we declared array1 for 10 items, we can not extend its length later. So we
		 * can not assign 11th item to it. After declaring array1 variable, now we can
		 * give values to it by using indexes. In array which has n items, index begin
		 * from 0 and n-1. For example in array1, we have 10 items. So our indexes are:
		 * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. When we want to give value to first item we use
		 * 0 index. Giving value to second item, we will use 1th index, for third item
		 * we will use 2th index and so on so forth. To access items of the array, same
		 * method will be used also. For example to get value of first item, we will use
		 * 0 index. If we want to get value of the second item we will use 1th index and
		 * so on and so forth.
		 */

		// Giving values to items of array.
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[9] = 100;

		// Getting values of items of the array
		System.out.println("First item of the array: " + array1[0]);
		System.out.println("Second item of the array: " + array1[1]);
		System.out.println("Third item of the array: " + array1[2]);
		System.out.println("Last item of the array: " + array1[9]);
		System.out.println("***********************************");

		/*
		 * If we try to access the value of the item which has not been given any value,
		 * we will get 0 by default in integer array.
		 */
		System.out.println("Undefined 6th item of the array: " + array1[6]);
		System.out.println("***********************************");

		/*
		 * If we try to give value or access the value of the item which has bigger
		 * index number from array length, we will get an error which is
		 * 'ArrayIndexOutOfBoundsException' like below. Because we are exceeding length
		 * of the array. You can see the error result by uncommenting next two lines.
		 */
		// array1[11] = 100;
		// System.out.println("Undefined 6th item of the array: " + array1[11]);

		/*
		 * We can set and get values of items of array variables by using loops for
		 * example in foor loops. But in loops we have to be carefull about not
		 * exceeding array limits.
		 */
		int[] array2 = new int[10];
		for (int i = 0; i < 10; i++) {
			array2[i] = i * 5 + 12;
		}
		System.out.println("Items of the array2: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println("");

		/*
		 * We can find length of arrays like below:
		 */
		System.out.println("Length of the array2: " + array2.length);

		System.out.println("***********************************");

		/*
		 * We can send arrays as parameter to a method or we can get arrays as returning
		 * from methods in Java
		 */
		String[] someCitiesOfTurkey = new String[] { "İstanbul", "Ankara", "Sakarya", "Isparta", "Konya" };
		printArray(someCitiesOfTurkey);

		String[] returningArray = createAndReturnArray();
		printArray(returningArray);

		int[] array3 = { 10, 15, 33, 21 };
		float average = findAverageOfTheItems(array3);
		System.out.println("Average of the items of the array3: " + average);
		System.out.println("***********************************");

		/*
		 * We can sort array items which must be comparable by using Arrays.sort()
		 * method.
		 */
		int[] array4 = { 1001, 23, 321, 432, 543 };
		Arrays.sort(array4);
		System.out.print("Sorted ");
		printArray(array4);

		/*
		 * We can compare array in two ways: 1- We can compare items of arrays. 2- We
		 * can compare reference of arrays
		 */

		/*
		 * Below example, we have compared references of two arrays by using == operator. 
		 * Because we assign array5 to array6 now array6 shows the reference of the array5. So they are equal.
		 */
		int[] array5 = { 1, 2, 3, 4 };
		int[] array6 = array5;

		if (array5 == array6) {
			System.out.println("Array5 and array6 are equal");
		} else {
			System.out.println("Array5 and array6 are not equal");
		}

		System.out.println("***********************************");
		
		/*
		 * Below example, we have compared references of two arrays by using == operator. 
		 * But we have seen that array7 and array8 are not equal. Because they show different references in ram.
		 * Even if they have exactly same items they are not equal in way of comparing references. 
		 */
		int[] array7 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] array8 = { 1, 2, 3, 4, 5, 6, 7 };
		
		if (array7 == array8) {
			System.out.println("Array7 and array8 are equal");
		} else {
			System.out.println("Array7 and array8 are not equal");
		}
		
		System.out.println("***********************************");
		
		/*
		 * If we want to compare arrays according to items we can use Arrays.equals() method.
		 * So below example we will see that array7 and array8 are equal because all items of the arrays are same.
		 */
		if (Arrays.equals(array7, array8)) { 
			System.out.println("Array7 and array8 are equal");
		} else {
			System.out.println("Array7 and array8 are not equal");
		}
		System.out.println("***********************************");
	}

	public void multipleDimensionalArrays() {
		
		/*
		 * Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other array. 
		 * These are also known as Jagged Arrays. A multidimensional array is created by appending one set of square brackets ([]) per dimension. 
		 * Examples:
		 */
		int[][] int2DArray = new int[2][2]; //a 2D array or matrix
		int[][][] int3DArray = new int[10][20][10]; //a 3D array
		
		/*
		 * Giving value to first row and first column of the array.
		 * We can populate the array like below after initialization.
		 */
		int2DArray[0][0] = 25; 
		int2DArray[0][1] = 15; 
		int2DArray[1][0] = 30; 
		int2DArray[1][1] = 40; 
		
		/*
		 * Or we can give initial values to array once we created.
		 */
		int[][] arr = {{ 1, 32 }, { 4, 5 }};
		System.out.println("First row second column value of the array " + arr[0][1]);
		System.out.println("***********************************");
		
		/*
		 * How to populate two dimensional array which has big length:
		 */
		int[][] populatedArray = new int[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				populatedArray[i][j] = j * i + j + i;
			}
		}
		
		/*
		 * How to get values of the items of two dimensional array:
		 */		
		System.out.println("Values of the items: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(populatedArray[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("***********************************");
	}
	
	public void foreachLoop() {
		
		/*
		 * In arrays, to get access items of the array we have iterative alternative way beside for loop.
		 * This is foreach loop. This is an efective way to get access items of arrays.
		 */		
		String[] companies = { "Microsoft", "Amazon", "Facebook", "Google" };
		System.out.println("Companies: " );
		for (String company : companies ) {
			System.out.println(company);
		}
		System.out.println("***********************************");
		
		/*
		 * We can define an object array which is a class like below. Our array is list of student objects.
		 */		
		Student student1 = new Student("Student1");
		Student student2 = new Student("Student2");
		Student student3 = new Student("Student3");
		Student[] students = { student1, student2, student3 };
		
		System.out.println("Students: " );
		for(Student student: students) {
			System.out.println(student.getName());
		}
		System.out.println("***********************************");
	}
	
	public void classObjectsForArrays() {
		
		int intArray[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortsArray[] = new short[3];
          
        // Array of Strings
        String[] strArray = new String[3];
          
        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass());
        System.out.println(byteArray.getClass());
        System.out.println(shortsArray.getClass());
        System.out.println(strArray.getClass());
		System.out.println("***********************************");
        
        /*
         * Explanation :

		   - The string “[I�? is the run-time type signature for the class object “array with component type int“.
           - The only direct superclass of any array type is java.lang.Object.
           - The string “[B�? is the run-time type signature for the class object “array with component type byte“.
           - The string “[S�? is the run-time type signature for the class object “array with component type short“.
           - The string “[L�? is the run-time type signature for the class object “array with component type of a Class�?. 
             The Class name is then followed.
         */
        
        /*
         * Now as we know that arrays are object of a class and direct superclass of arrays is class Object.
         * The members of an array type are all of the following:

           - The public final field length, which contains the number of components of the array length may be positive or zero.
           - All the members inherited from class Object; the only method of Object that is not inherited is its clone method.
           - The public method clone(), which overrides clone method in class Object and throws no checked exceptions.
         */        
	}
	
	public void cloningOfArrays() {
		
		/*
         * When we clone a single dimensional array, such as Object[], a “deep copy�? is performed with 
         * the new array containing copies of the original array’s elements as opposed to references.
         */
        
        int int1DArray[] = {1,2,3};
        
        int clone1DArray[] = int1DArray.clone();
          
        // will print false as deep copy is created
        // for one-dimensional array
        System.out.println(int1DArray == clone1DArray);
          
        for (int i = 0; i < clone1DArray.length; i++) {
            System.out.print(clone1DArray[i]+" ");
        }

		System.out.println("");
		System.out.println("***********************************");
		
		/*
		 * A clone of a multi-dimensional array (like Object[][]) is a “shallow copy�? however, 
		 * which is to say that it creates only a single new array with each element array 
		 * a reference to an original element array, but subarrays are shared.
		 */
		int int2DArray[][] = {{1,2,3},{4,5}};
        
        int clone2DArray[][] = int2DArray.clone();
          
        // will print false
        System.out.println(int2DArray == clone2DArray);
          
        // will print true as shallow copy is created
        // i.e. sub-arrays are shared
        System.out.println(int2DArray[0] == clone2DArray[0]);
        System.out.println(int2DArray[1] == clone2DArray[1]);
        
		System.out.println("***********************************");
	}
	
	private void printArray(String[] incomingArrayParameter) {
		System.out.print("Items of the array parameter: ");
		for (int i = 0; i < incomingArrayParameter.length; i++) {
			System.out.print(incomingArrayParameter[i] + " ");
		}
		// For new line
		System.out.println("");

		System.out.println("Length of the array parameter: " + incomingArrayParameter.length);
		System.out.println("***********************************");
	}

	private void printArray(int[] incomingArrayParameter) {
		System.out.print("Items of the array parameter: ");
		for (int i = 0; i < incomingArrayParameter.length; i++) {
			System.out.print(incomingArrayParameter[i] + " ");
		}
		// For new line
		System.out.println("");

		System.out.println("Length of the array parameter: " + incomingArrayParameter.length);
		System.out.println("***********************************");
	}

	private String[] createAndReturnArray() {
		String[] departments = { "HR", "IT", "R-D", "CR" };
		return departments;
	}

	private float findAverageOfTheItems(int[] array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}

		float average = (float) total / array.length;
		return average;
	}

}
