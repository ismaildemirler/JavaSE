package B_Intermediate.C_InterfacesAbstractAndInnerClasses.D_FinalKeyword;

public class DatabaseOperations {

	public final int NUMBER_OF_OBJECT;
	private static int count = 0;
	private final String NAME;
	
	public static final String DATABASE_URL;
	
	public static final String DATABASE_NAME = "test";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "12345";
	
	static {
		DATABASE_URL = "10.111.123.34";
	}
	
	public DatabaseOperations(String name) {
		this.NAME = name;
		count++;
		NUMBER_OF_OBJECT = count;
	}
	
	public void connect(final String connectionString) {
		System.out.println("Connected using unchangeable connection string");
	}
	
	public final void save() {
		System.out.println("Saved!");
	}
}
