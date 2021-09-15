package B_Intermediate.A_OOP.H_Cohesion.LowCohesiveExample;

public interface IDatabaseOperationsL {
	
	public void connect();
	public void testConnection();
	public void closeConnection();
	public void writeLogsToFile();
}
