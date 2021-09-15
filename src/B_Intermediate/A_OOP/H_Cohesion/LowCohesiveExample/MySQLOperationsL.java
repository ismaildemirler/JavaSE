package B_Intermediate.A_OOP.H_Cohesion.LowCohesiveExample;

public class MySQLOperationsL implements IDatabaseOperationsL{

	@Override
	public void connect() {
		System.out.println("Connected to MySQL!");
	}

	@Override
	public void testConnection() {
		System.out.println("MySQL connection have been tested!");
	}

	@Override
	public void closeConnection() {
		System.out.println("MySQL connection have been closed!");
	}

	@Override
	public void writeLogsToFile() {
		System.out.println("This method is unimplemented and empty in MySQL Connection class. "
				+ "Because it is unnecessary in this class");
	}
}
