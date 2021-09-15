package B_Intermediate.A_OOP.H_Cohesion.HighCohesiveExample;

public class MySQLOperationsH implements IDatabaseOperationsH{

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
}
