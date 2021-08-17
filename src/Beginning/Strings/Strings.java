package Beginning.Strings;

public class Strings {
	
	public void StringType() {

		/*
		 * 
		 * primitive type is predefined by the language and is named by a reserved
		 * keyword.
		 * 
		 * Primitive values do not share state with other primitive values. The eight
		 * primitive data types
		 * 
		 * supported by the Java programming language are:
		 *
		 * - byte
		 * 
		 * - short
		 * 
		 * - int
		 * 
		 * - long
		 * 
		 * - float
		 * 
		 * - double
		 * 
		 * - boolean
		 * 
		 * - char
		 * 
		 * And primitive types have no method in them.
		 * 
		 */

		// String data type is not a primitive type. Strings can be defined array of
		// chars also.

		// String types can be sum
		String sentence = "Hello My Friend.";
		System.out.println(sentence + " Welcome");
		String sentence1 = "Java ";
		String sentence2 = "Programming ";
		String sentence3 = "Language";
		System.out.println(sentence1 + sentence2 + sentence3);

		// Int and string can be sum in Java. Java can convert int to string
		// automatically in a sentence.
		int number = 54;
		String word = "Hello";
		String newWord = word + number;
		System.out.println(newWord);

		// Int, String, double, byte... can be sum. And it can print screen as String.
		String exampleWord = "Hello";
		double exampleDouble = 3.52;
		byte exampleByte = 10;
		exampleWord = exampleWord + exampleDouble + exampleByte;
		System.out.println("Example Word = " + exampleWord);

		// String and char can be sum. And it can print screen as String.
		char exampleChar = '?';
		String greetings = "Hello, how are you" + exampleChar;
		System.out.println("Greetings = " + greetings);

		// \t gives tab space in a string
		String tabString = "Java\tProgramming\tLanguage";
		System.out.println("Tab String = " + tabString);
		String newLineString = "Java\nProgramming\nLanguage";
		System.out.println("New Line String = " + newLineString);
	}

	public void StringMethods() {

		String exampleWord = "I Am Learning Java.";

		/*
		 * 
		 * Method: char charAt(int index)
		 * 
		 * returns char value for the particular index
		 * 
		 */
		char returnChar = exampleWord.charAt(3);
		System.out.println("charAt Returns = " + returnChar);

		/*
		 * 
		 * Method: int length()
		 * 
		 * returns returns string length
		 * 
		 */
		int length = exampleWord.length();
		System.out.println("Length = " + length);

		/*
		 * 
		 * Method: String substring(int beginIndex)
		 * 
		 * returns substring for given begin index.
		 * 
		 */
		String subString = exampleWord.substring(4);
		System.out.println("Sub String = " + subString);

		/*
		 * 
		 * Method: String substring(int beginIndex, int endIndex)
		 * 
		 * returns substring for given begin index and end index.
		 * 
		 */
		String subStringWithEndIndex = exampleWord.substring(4, 12);
		System.out.println("Sub String With End Index = " + subStringWithEndIndex);

		/*
		 * 
		 * Method: boolean contains(CharSequence s)
		 * 
		 * returns true or false after matching the sequence of char value.
		 * 
		 */
		boolean contains = exampleWord.contains("learn");
		System.out.println("Contains = " + contains);

		/*
		 * 
		 * Method: boolean equals(Object another)
		 * 
		 * checks the equality of string with the given object.
		 * 
		 */
		boolean isEqual = exampleWord.equals("learn");
		System.out.println("Is Equal = " + isEqual);

		/*
		 * 
		 * Method: boolean isEmpty()
		 * 
		 * checks if string is empty.
		 * 
		 */
		boolean isEmpty = exampleWord.isEmpty();
		System.out.println("Is Empty = " + isEmpty);

		/*
		 * 
		 * Method: String concat(String str)
		 * 
		 * concatenates the specified string.
		 * 
		 */
		String newString = exampleWord.concat(" Because Java is nice.");
		System.out.println("New String = " + newString);

		/*
		 * 
		 * Method: String replace(char old, char new)
		 * 
		 * replaces all occurrences of the specified char value.
		 * 
		 */
		String replacedString = exampleWord.replace(".", "!");
		System.out.println("Replaced String = " + replacedString);

		/*
		 * 
		 * Method: String replace(CharSequence old, CharSequence new)
		 * 
		 * replaces all occurrences of the specified CharSequence.
		 * 
		 */
		String replacedNewString = exampleWord.replace("Java", "Mathematic");
		System.out.println("Replaced New String = " + replacedNewString);

		/*
		 * 
		 * Method: String[] split(String regex)
		 * 
		 * returns a split string matching regex.
		 * 
		 */
		String[] splittedString = exampleWord.split("J");
		System.out.println("Replaced New String = " + splittedString[0] + "- " + splittedString[1]);

		/*
		 * 
		 * Method: int indexOf(String ch)
		 * 
		 * returns the specified char value index.
		 * 
		 */
		int index = exampleWord.indexOf("J");
		System.out.println("Index = " + index);

		/*
		 * 
		 * Method: String toLowerCase()
		 * 
		 * returns a string in lowercase.
		 * 
		 */
		String lowerCaseString = exampleWord.toLowerCase();
		System.out.println("Lower Case String = " + lowerCaseString);

		/*
		 * 
		 * Method: String toUpperCase()
		 * 
		 * returns a string in uppercase.
		 * 
		 */
		String upperCaseString = exampleWord.toUpperCase();
		System.out.println("Upper Case String = " + upperCaseString);

		/*
		 * 
		 * Method: String trim()
		 * 
		 * removes beginning and ending spaces of this string.
		 * 
		 */
		String trimmedString = exampleWord.trim();
		System.out.println("Trimmed String = " + trimmedString);
	}
}
