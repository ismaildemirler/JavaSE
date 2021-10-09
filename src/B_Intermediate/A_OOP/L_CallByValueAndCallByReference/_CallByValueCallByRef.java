package B_Intermediate.A_OOP.L_CallByValueAndCallByReference;

public class _CallByValueCallByRef {

	/*
	 * Call By Value & Call By Reference in Java
	 */
	
	public void callByValue() {
		
		/*
		 * Call by Value means calling a method with a parameter as value. 
		 * Through this, the argument value is passed to the parameter. 
		 * While Call by Reference means calling a method with a parameter as a reference. 
		 * Through this, the argument reference is passed to the parameter. 
		 * In call by value, the modification done to the parameter passed does not reflect 
		 * in the caller's scope while in the call by reference, 
		 * the modification done to the parameter passed are persistent and changes are reflected 
		 * in the caller's scope. Following is the example of the call by value 
		 * The following program shows an example of passing a parameter by value. 
		 * The values of the arguments remain the same even after the method invocation.
		 */
		
		int number1 = 30;
        int number2 = 45;
        System.out.println("Before swapping, number1 = " + number1 + " and number2 = " + number2);
        
        swapFunction(number1, number2);
        
        System.out.println("\n**Now, Before and After swapping values will be same here**:");
        System.out.println("After swapping, number1 = " + number1 + " and number2 is " + number2);
        
        System.out.println("******************************************************");
	}
	
	public void callByReference() {
		
		/*
		 * Java uses only call by value while passing reference variables as well. 
		 * It creates a copy of references and passes them as valuable to the methods. 
		 * As reference points to same address of object, creating a copy of reference is of no harm. 
		 * But if new object is assigned to reference it will not be reflected.
		 */
		
		IntWrapper wrapper1 = new IntWrapper(30);
        IntWrapper wrapper2 = new IntWrapper(45);
        
        System.out.println("Before swapping, "
        		+ "number1 = " + wrapper1.number + " and number2 = " + wrapper2.number);
        
        // Invoke the swap method
        swapFunction(wrapper1, wrapper2);
        
        System.out.println("\n**Now, Before and After swapping values will be different here**:");
        System.out.println("After swapping, "
        		+ "number1 = " + wrapper1.number + " and number2 is " + wrapper2.number);
        

        System.out.println("******************************************************");
	}
	
	public void swapFunction(int number1, int number2) {
    
		System.out.println("Before swapping (Inside of the swapFunction method), "
      		+ "number1 = " + number1 + " number2 = " + number2);
      
        // Swapping
        int tempNumber = number1;
        number1 = number2;
        number2 = tempNumber;
      
        System.out.println("After swapping (Inside of the swapFunction method), "
      		+ "number1 = " + number1 + " number2 = " + number2);
    }
	
	public void swapFunction(IntWrapper wrapper1, IntWrapper wrapper2) {
		
		System.out.println("Before swapping (Inside of the swapFunction method), "
				+ "number1 = " + wrapper1.number + " number2 = " + wrapper2.number);
		
		// Swapping
		IntWrapper tempWrapper = new IntWrapper(wrapper1.number);
		wrapper1.number = wrapper2.number;
		wrapper2.number = tempWrapper.number;
		
		System.out.println("After swapping (Inside of the swapFunction method), "
				+ "number1 = " + wrapper1.number + " number2 = " + wrapper2.number);
   }
}

class IntWrapper {
	public int number;
	
    public IntWrapper(int number) { 
    	this.number = number;
    }
}
