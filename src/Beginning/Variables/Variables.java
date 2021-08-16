package Beginning.Variables;

public class Variables {

	public void BeginningToVariables() {
		
		//To create a variable, we need to define variable type first. For ex: int, char, etc...
        //And we can give a name to variable for ex: counter
        //We can assign a value to variable like below
        int counter = 4;
        System.out.println("Counter = " + counter);

        //We can also assign a value to variable after creation
        int number;
        number = 10;
        System.out.println("Number = " + number);

        //We can also assign mathematical operation to variable instead certain value
        int sum = 4 + 3;
        System.out.println("Sum of the numbers = " + sum);

        int subtraction = 5 - 2;
        System.out.println("Subtraction of the numbers = " + subtraction);

        //We can do mathematical operations using other variables
        int number1 = 10;
        int number2 = 4;
        int number3 = 7;     

        int total = number1 + number2 + number3;
        System.out.println("Sum of the variables = " + total);       

        //We can do more complex mathematical operations using other variables and numbers
        //But to do this we have to be careful about process priority of mathematical operations like *, \, -, +
        int result = number1 + 2 * number2 + number3;
        System.out.println("The result = " + result);       

        //   When giving a name to variables, there are some rules
       
        // - We can not give a name which starts with a number
        //   For ex: int 1counter = 4 gives compile time error.
       
        // - Java variable names are case sensitive.
        //   For ex: money is not same with Money
       
        // - Java variable names must start with a letter. Do not use any special character in first letter like &, $ or _
        //   For ex: _myVar, &myVar, $myVar
       
        // - After the first character in a Java variable name, the name can also contain numbers
        //   For ex: my1Var, myVar1
       
        // - The name must not contain any white spaces.
        //   For ex: String category name = "" gives error.
       
        // - As suggestion variable names are written in lowercase.
        //   For ex: String category = ""
       
        // - As suggestion, If variable names consist of multiple words,
        //   each word after the first word has its first letter written in uppercase.
        //   For ex: String categoryName = ""
       
        // - As a suggestion, avoid using one-character variables such as x, y, z.
        //   For ex: int x = 2
       
        //   PRIMITIVE TYPES
        //   Integral Numbers int, Byte, Short, Long
        //   Byte ve bit anlatýlmalý öncelikle.
       
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

        //   byte --> short --> int --> long
        //   Type Conversion
	}
}
