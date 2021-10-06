package A_Beginning.L_Memories;

public class MemoryTypes {
	
	/*
	 * Stack and Heap Memories in Java
	 */
	
	/*
	 * There are 2 memory locations that become reserved for Java application
	 * to run successfully. These are resources of the computer RAM.
	 * You can think of these as memory areas reserved for the successful completion of the application.
	 * One area is referred to as the Stack and the other memory area is referred to as the heap.
	 */
	
	/*
	 * What is Stack?
	 * A stack is a special area of computer’s memory which stores temporary variables created by a function.
	 * Stack Allocation, this allocation happens on contiguous blocks of memory. 
	 * We call it a stack memory allocation because the allocation happens in the function call stack. 
	 * The size of memory to be allocated is known to the compiler and whenever a function is called, 
	 * its variables get memory allocated on the stack. And whenever the function call is over, 
	 * the memory for the variables is de-allocated. This all happens using some predefined 
	 * routines in the compiler. A programmer does not have to worry about memory allocation 
	 * and de-allocation of stack variables. This kind of memory allocation also known as 
	 * Temporary memory allocation because as soon as the method finishes its execution 
	 * all the data belongs to that method flushes out from the stack automatically. 
	 * Means, any value stored in the stack memory scheme is accessible as long as the method 
	 * hasn’t completed its execution and currently in running state.
	 * 
	 * Key Points:
	   - It’s a temporary memory allocation scheme where the data members are accessible 
	     only if the method( ) that contained them is currently is running.
	   - It allocates or de-allocates the memory automatically as soon as the 
	     corresponding method completes its execution.
	   - We receive the corresponding error Java. lang. StackOverFlowError by JVM, 
	     If the stack memory is filled completely.
	   - Stack memory allocation is considered safer as compared to heap memory allocation 
	     because the data stored can only be access by owner thread.
	   - Memory allocation and de-allocation is faster as compared to Heap-memory allocation.
	   - Stack-memory has less storage space as compared to Heap-memory.
	 */
	
	/*
	 * What is Heap?
	 * The memory is allocated during the execution of instructions written by programmers. 
	 * Note that the name heap has nothing to do with the heap data structure. 
	 * It is called heap because it is a pile of memory space available to programmers 
	 * to allocated and de-allocate. Every time when we made an object it always creates 
	 * in Heap-space and the referencing information to these objects are always stored in Stack-memory. 
	 * Heap memory allocation isn’t as safe as Stack memory allocation was because the data stored 
	 * in this space is accessible or visible to all threads. If a programmer does not handle 
	 * this memory well, a memory leak can happen in the program.
	 * 
	 * The Heap-memory allocation is further divided into three categories:
	 * These three categories help us to prioritize the data(Objects) to be stored in the 
	 * Heap-memory or in the Garbage collection.
	 
	   - Young Generation 
	     It’s the portion of the memory where all the new data(objects) are made to allocate 
	     the space and whenever this memory is completely filled then the rest of the 
	     data is stored in Garbage collection.
       - Old or Tenured Generation
         This is the part of Heap-memory that contains the older data objects that are not in 
         frequent use or not in use at all are placed.
       - Permanent Generation 
         This is the portion of Heap-memory that contains the JVM’s metadata for the 
         runtime classes and application methods.
         
      * Key Points: 
        - We receive the corresponding error message if Heap-space is entirely full, 
          java. lang.OutOfMemoryError by JVM.
	    - This memory allocation scheme is different from the Stack-space allocation, 
	      here no automatic de-allocation feature is provided. We need to use a 
	      Garbage collector to remove the old unused objects in order to use the memory efficiently.
		- The processing time(Accessing time) of this memory is quite slow as compared to Stack-memory.
		- Heap-memory is also not threaded-safe as Stack-memory because data stored in 
		  Heap-memory are visible to all threads.
		- Size of Heap-memory is quite larger as compared to the Stack-memory.
		- Heap-memory is accessible or exists as long as the whole application(or java program) runs.
	 */
	
	/*
	 * Key Differences Between Stack and Heap Allocations 
	   - In a stack, the allocation and de-allocation are automatically done by the 
	     compiler whereas in heap, it needs to be done by the programmer manually.
       - Handling of Heap frame is costlier than the handling of the stack frame.
	   - Memory shortage problem is more likely to happen in stack whereas the main issue in 
	     heap memory is fragmentation.
       - Stack frame access is easier than the heap frame as the stack have a small region 
         of memory and is cache-friendly, but in case of heap frames which are dispersed throughout 
         the memory so it causes more cache misses.
	   - A stack is not flexible, the memory size allotted cannot be changed whereas a heap is flexible, 
	     and the allotted memory can be altered.
	   - Accessing time of heap takes is more than a stack.
	 */
	
	
	public void stack() {
		
		/*
		 * We create a variable type of int. Let's say it is called age. The interpreter is going to
		 * line by line executing code. When it gets to below declaration of variables 
		 * what is going to happen is inside of the stack 
		 * a specific reservation is going to be made for these variables.
		 */
		
		int number;
		int age = 10;
		int[] list = new int[10];	
		
		/*
		 * These are local variables. All these variables get memory allocated on stack. 
		 * These variables have data in stack.
		 * Primitive types have values, address their values in stack memory.
		 * The stack memory is a physical space (in RAM) allocated to each thread at run time. 
		 * It is created when a thread creates. Memory management in the stack follows 
		 * LIFO (Last-In-First-Out) order because it is accessible globally. 
		 * It stores the variables, references to objects, and partial results. 
		 * Memory allocated to stack lives until the function returns. 
		 * If there is no space for creating the new objects, it throws the java.lang.StackOverFlowError. 
		 * The scope of the elements is limited to their threads. 
		 * The JVM creates a separate stack for each thread.
		 */
		
		String word = new String();
		
		/*
		 * But above example, String is not a primitive type, it is class. 
		 * So in stack, this method is creating and 'word' variable is creating.
		 * But 'word' variable has not actual data. It has reference data and 
		 * it points actual reference in heap memory.
		 */
		
		word = new String();
		
		/*
		 * We have assigned 'word' variable a new address of where the object resides.
		 * So we completely lost all connection and communication with this old String Object.
		 * So this is actually object that is a candidate for being deleted. 
		 * This is where garbage collection comes in. Garbage Collection is a process that
		 * runs in the heap and every so often it comes and it looks for objects that 
		 * don't have any relationship to any variable that is pointing to them. 
		 * It looks for those objects and it eliminates them to clear the space in the memory.
		 * 
		 */
	}
	
	public void heap() {
		
		int id = 21;
        String name = "Maddy";
        Employee person = null;
        person = employeeDetail(id, name);
        System.out.println("Employee: " + person);
        System.out.println("*********************");
        
        /*
         * Following are the conclusions on which we’ll make after analyzing the above example:
           - As we start execution of the have program, all the run-time classes 
			 are stored in the Heap-memory space.
		   - Then we find this method in the next line which is stored into the 
		     stack along with all it’s primitive(or local) and the reference variable 
		     Employee class will also be stored in the Stack and will point out 
		     to the corresponding object stored in Heap memory.
		   - Then the next line will call to the parameterized constructor 
		     Employee(int, String) from main( ) and it’ll also allocate to the top of 
		     the same stack memory block. This will store:
		     - The object reference of the invoked object of the stack memory.
			 - The primitive value(primitive data type) int id in the stack memory.
			 - The reference variable of String emp_name argument which will point to the 
			   actual string from string pool into the heap memory.
		   - Then the main method will again call to the Emp_detail() static method, 
		     for which allocation will be made in stack memory block on top of the previous memory block.
		   - So, for the newly created object Employee and all instance variables 
		     will be stored in heap memory.
         */
	}
	
	private Employee employeeDetail(int id, String employeeName) {
        return new Employee(id, employeeName);
    }
	
	class Employee {
	    int id;
	    String employeeName;
	 
	    public Employee(int id, String employeeName) {
	        this.id = id;
	        this.employeeName = employeeName;
	    }

		@Override
		public String toString() {
			return "Employee [id=" + id + ", employeeName=" + employeeName + "]";
		}
	}
}
