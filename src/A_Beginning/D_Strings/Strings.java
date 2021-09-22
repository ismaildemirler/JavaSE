package A_Beginning.D_Strings;

public class Strings {
	
	public void stringType() {

		/*
		 * 
		 * primitive type is predefined by the language and is named by a reserved keyword. 
		 * Primitive values do not share state with other primitive values. The eight primitive data types 
		 * supported by the Java programming language are: 
		 * - byte 
		 * - short 
		 * - int 
		 * - long 
		 * - float 
		 * - double 
		 * - boolean 
		 * - char 
		 * And primitive types have no method in them. 
		 */

		// String data type is not a primitive type. Strings can be defined array of chars also. 
		// String types can be sum
		String sentence = "Hello My Friend.";
		System.out.println(sentence + " Welcome");
		String sentence1 = "Java ";
		String sentence2 = "Programming ";
		String sentence3 = "Language";
		System.out.println(sentence1 + sentence2 + sentence3);
		System.out.println("****************************************");

		// Int and string can be sum in Java. Java can convert int to string automatically in a sentence.
		int number = 54;
		String word = "Hello";
		String newWord = word + number;
		System.out.println(newWord);
		System.out.println("****************************************");

		// Int, String, double, byte... can be sum. And it can print screen as String.
		String exampleWord = "Hello";
		double exampleDouble = 3.52;
		byte exampleByte = 10;
		exampleWord = exampleWord + exampleDouble + exampleByte;
		System.out.println("Example Word = " + exampleWord);
		System.out.println("****************************************");

		// String and char can be sum. And it can print screen as String.
		char exampleChar = '?';
		String greetings = "Hello, how are you" + exampleChar;
		System.out.println("Greetings = " + greetings);
		System.out.println("****************************************");

		// \t gives tab space in a string
		String tabString = "Java\tProgramming\tLanguage";
		System.out.println("Tab String = " + tabString);
		String newLineString = "Java\nProgramming\nLanguage";
		System.out.println("New Line String = " + newLineString);
		System.out.println("****************************************");
	}

	public void stringMethods() {

		String exampleWord = "I Am Learning Java.";

		/* 
		 * Method: char charAt(int index) 
		 * returns char value for the particular index 
		 */
		char returnChar = exampleWord.charAt(3);
		System.out.println("charAt Returns = " + returnChar);
		System.out.println("***********************");

		/* 
		 * Method: int length() 
		 * returns returns string length 
		 */
		int length = exampleWord.length();
		System.out.println("Length = " + length);
		System.out.println("***********************");

		/* 
		 * Method: String substring(int beginIndex) 
		 * returns substring for given begin index. 
		 */
		String subString = exampleWord.substring(4);
		System.out.println("Sub String = " + subString);
		System.out.println("***********************");

		/* 
		 * Method: String substring(int beginIndex, int endIndex) 
		 * returns substring for given begin index and end index. 
		 */
		String subStringWithEndIndex = exampleWord.substring(4, 12);
		System.out.println("Sub String With End Index = " + subStringWithEndIndex);
		System.out.println("***********************");

		/* 
		 * Method: boolean contains(CharSequence s) 
		 * returns true or false after matching the sequence of char value. 
		 */
		boolean contains = exampleWord.contains("learn");
		System.out.println("Contains = " + contains);
		System.out.println("***********************");

		/* 
		 * Method: boolean equals(Object another) 
		 * checks the equality of string with the given object. 
		 */
		boolean isEqual = exampleWord.equals("learn");
		System.out.println("Is Equal = " + isEqual);
		System.out.println("***********************");

		/* 
		 * Method: boolean isEmpty() 
		 * checks if string is empty. 
		 */
		boolean isEmpty = exampleWord.isEmpty();
		System.out.println("Is Empty = " + isEmpty);
		System.out.println("***********************");

		/* 
		 * Method: String concat(String str) 
		 * concatenates the specified string. 
		 */
		String newString = exampleWord.concat(" Because Java is nice.");
		System.out.println("New String = " + newString);
		System.out.println("***********************");

		/* 
		 * Method: String replace(char old, char new) 
		 * replaces all occurrences of the specified char value. 
		 */
		String replacedString = exampleWord.replace(".", "!");
		System.out.println("Replaced String = " + replacedString);
		System.out.println("***********************");

		/* 
		 * Method: String replace(CharSequence old, CharSequence new) 
		 * replaces all occurrences of the specified CharSequence. 
		 */
		String replacedNewString = exampleWord.replace("Java", "Mathematic");
		System.out.println("Replaced New String = " + replacedNewString);
		System.out.println("***********************");

		/* 
		 * Method: String[] split(String regex) 
		 * returns a split string matching regex. 
		 */
		String[] splittedString = exampleWord.split("J");
		System.out.println("Replaced New String = " + splittedString[0] + "- " + splittedString[1]);
		System.out.println("***********************");

		/* 
		 * Method: int indexOf(String ch) 
		 * returns the specified char value index. 
		 */
		int index = exampleWord.indexOf("J");
		System.out.println("Index = " + index);
		System.out.println("***********************");

		/* 
		 * Method: String toLowerCase() 
		 * returns a string in lowercase. 
		 */
		String lowerCaseString = exampleWord.toLowerCase();
		System.out.println("Lower Case String = " + lowerCaseString);
		System.out.println("***********************");

		/* 
		 * Method: String toUpperCase() 
		 * returns a string in uppercase. 
		 */
		String upperCaseString = exampleWord.toUpperCase();
		System.out.println("Upper Case String = " + upperCaseString);
		System.out.println("***********************");

		/* 
		 * Method: String trim() 
		 * removes beginning and ending spaces of this string. 
		 */
		String trimmedString = exampleWord.trim();
		System.out.println("Trimmed String = " + trimmedString);
		System.out.println("***********************");
		
		/* 
		 * Method: Boolean startsWith() 
		 * returns boolean according to the string starts with the given parameter or not. 
		 */
		boolean startsWith = exampleWord.startsWith("ex");
		System.out.println("String starts with 'ex': " + startsWith);
		
		startsWith = exampleWord.startsWith("I");
		System.out.println("String starts with 'I': " + startsWith);
		
		System.out.println("*********************************");
		
		/*
		 * We can convert from int to String, String to int
		 */
		String stringNumber = "14332";
		int parsedToInt = Integer.parseInt(stringNumber);
		System.out.println("int from String: " + parsedToInt);
		
		int number = 3423;
		String fromInt = String.valueOf(number);
		System.out.println("String from int: " + fromInt);
		System.out.println("*********************************");
	}

	public void moreDetailsAboutString() {
		
		String exampleSentence = "More about Java Strings";
		
		/*
		 * We can accept that String is char array.
		 * So we can iterate String by using for loop
		 */
		System.out.println("Chars in example word: ");
		for (int i = 0; i < exampleSentence.length(); i++) {
			System.out.print(exampleSentence.charAt(i) + " ");
		}
		System.out.println("");
		System.out.println("****************************************");
		
		/*
		 * We can declare String in two ways.
		 */
		
		//1. Way
		String first = "Java Programming";
		
		//2. Way
		String second = new String("Java Programming");
		
		System.out.println("First String: " + first);
		System.out.println("Second String: " + second);
		System.out.println("****************************************");
		
		/*
		 * We can see that both of String definition did same job and print screen same thing.
		 * But there is a difference between definitions like first and second string.
		 */
		
		String string1 = "Java";
		String string2 = "Java";
		
		if (string1 == string2) {
			System.out.println("String1 and String2 are equal");
		}
		
		/*
		 * We see that, like above when we create simple String declarations which have same content,
		 * Java does not create two different reference. Java points same reference for both of string1 and string2.  
		 */
		System.out.println("****************************************");
		
		String stringClassInstance1 = new String("Example Sentence");
		String stringClassInstance2 = new String("Example Sentence");
		if (stringClassInstance1 == stringClassInstance2) {
			System.out.println("stringClassInstance1 and stringClassInstance2 are equal");
		}
		else {
			System.out.println("stringClassInstance1 and stringClassInstance2 are not equal");
		}
		System.out.println("****************************************");
		
		/*
		 * We see that, like above when we create String declarations by using String class instance,
		 * Java creates two different reference even if they have same content. 
		 * Java points different reference address for stringClassInstance1 and stringClassInstance2.  
		 * Because of that reason, when we compare these by using '==' operator we will see that they are not equal.
		 */
		
		/*
		 * But if we compare them according to their contents by using equals() method,
		 * we will see that they are equal. 
		 */
		
		if (stringClassInstance1.equals(stringClassInstance2)) {
			System.out.println("stringClassInstance1 and stringClassInstance2 are equal");
		}
		else {
			System.out.println("stringClassInstance1 and stringClassInstance2 are not equal");
		}
		System.out.println("****************************************");
	}
}
