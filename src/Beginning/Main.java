package Beginning;

import Beginning.A_Variables.Variables;
import Beginning.B_Primitives.PrimitiveTypes;
import Beginning.C_Chars.Chars;
import Beginning.D_Strings.Strings;

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
