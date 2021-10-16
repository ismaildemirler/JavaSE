package A_Beginning.B_Primitives;

public class PrimitiveTypes {
	
	public void integralNumbers() {
		
		/*
		 * PRIMITIVE TYPES
		 * Integral Numbers int, Byte, Short, Long
		 */
       
        // - int - reserves 32 bits - 4 bytes place
        //   min -2^31, max 2^31
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);       

        // - byte - reserves 8 bits - 1 bytes place
        //   min -2^7, max 2^7
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        // - short - reserves 16 bits - 2 bytes place
        //   min -2^15, max 2^15
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);       

        // - long - reserves 64 bits - 8 bytes place
        //   min -2^63, max 2^63
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);       

        /*
         * Java converts integral numbers to each other automatically in this order : byte --> short --> int --> long
         * As reverse order programmer have to convert by casting. And if it is not suitable to convert, 
         * the convertion can cause lost. 
         */
        short shortNumber = 1000;
        //		Conversion short to int automatically
        int integerNumber = shortNumber / 2;
        System.out.println("Number = " + integerNumber);   
        
        int integerResult = shortNumber;
        System.out.println("Result Number = " + integerResult); 
        
        byte byteNumber = 100;
        //		Conversion int to byte manually
        byte result = (byte) (byteNumber / 2);
        System.out.println("Byte Result = " + result); 
        
        short sNumber = 100;
        byte bNumber = 2;
        int iNumber = 4;
        //    	Conversion byte --> short --> integer and then to long automatically
        long lNumber = sNumber + bNumber + iNumber;
        System.out.println("Type Conversion Result = " + lNumber);
	}

	public void decimalNumbers() {
		
		/*
		 * Float - reserves 32 bits - 4 bytes place
		 * The float data type is a single-precision 32-bit IEEE 754 floating-point.
		 * Use a float (instead of double) if you need to save memory in large arrays of floating-point numbers.
		 * upto 7 decimal digits
		 * Default value is 0.0
		 */
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);  
        
        float floatExampleNumber1 = 5f;
        float floatExampleNumber2 = 5.2f;
    	System.out.println("Float Number = " + floatExampleNumber1);  
        
    	/*
    	 * Double - reserves 64 bits - 8 bytes place
    	 * The Double data type is a double-precision 64-bit IEEE 754 floating-point.
    	 * For decimal values, this data type is generally the default choice.
    	 * upto 16 decimal digits
    	 * Defalut value is 0.0
    	 */
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);  
        

		double exampleDoubleNumber1 = 6.77;
		double exampleDoubleNumber2 = 6.0;
		double exampleDoubleNumber3 = 6d;
		double exampleDoubleNumber4 = 6.0;
		System.out.println("Double Number = " + exampleDoubleNumber3);  
        
		/*
		 * Note: Both float and double data types were designed especially for scientific calculations, where approximation errors 
		 * are acceptable. If accuracy is the most prior concern then, it is recommended not to use these data types and use 
		 * BigDecimal class instead. 
		 */
        		
		
		/*
         * Java converts decimal numbers to each other automatically in this order : int --> float --> double
         * As reverse order programmer have to convert by casting. And if it is not suitable to convert, 
         * the convertion can cause lost. 
         */		
		float floatNumber = (float)5.0;
		
		//    	Example 1: Comparison between int, double and float pi values.
		int iExampleNumber = 22 / 7;
		float fExampleNumber = 22f / 7f;
		double dExampleNumber = 22d / 7d;
		
		System.out.println("Int Result = " + iExampleNumber);
		System.out.println("Float Result = " + fExampleNumber);
		System.out.println("Double Result = " + dExampleNumber);
		
		//		Automatic Conversion 
		int iAutoConversionNumber = 5;
		//		Conversion int to float automatically
		float fAutoConversionNumber = iAutoConversionNumber;
		System.out.println("Float Conversion Result = " + fAutoConversionNumber);
		//		Conversion int to double automatically
		double dAutoConversionNumber = iAutoConversionNumber;
		System.out.println("Double Conversion Result = " + dAutoConversionNumber);
		
		//		Manually Conversion 
		double dManuallyConversionNumber = 5.32;
		//		Conversion double to float manually
		float fManuallyConversionNumber = (float) dManuallyConversionNumber;
		System.out.println("Manually Conversion Result = " + fManuallyConversionNumber);
		
		
		//	  Example 2: Comparison between double and float numbers which is average of three numbers.
		double dNumber1 = 70.25;
		double dNumber2 = 60d;
		double dNumber3 = 80.2;
		System.out.println("Double Average = " + (dNumber1 + dNumber2 + dNumber3) / 3);
		
		float fNumber1 = 70.25f;
		float fNumber2 = 60f;
		float fNumber3 = 80.2f;
		System.out.println("Float Average = " + (fNumber1 + fNumber2 + fNumber3) / 3);
	}
}
