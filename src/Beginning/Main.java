package Beginning;

import Beginning.Variables.Variables;
import Beginning.Chars.Chars;
import Beginning.Primitives.PrimitiveTypes;
import Beginning.Strings.Strings;

public class Main {

	public static void main(String[] args) {

		Variables variables = new Variables();
		variables.BeginningToVariables();
		
		PrimitiveTypes primitiveTypes = new PrimitiveTypes();
		primitiveTypes.IntegralNumbers();
		primitiveTypes.DecimalNumbers();
		
		Chars chars = new Chars();
		chars.CharType();
		chars.BooleanType();
		
		Strings strings = new Strings();
		strings.StringType();
		strings.StringMethods();
	}
}
