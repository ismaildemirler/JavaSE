package B_Intermediate.A_OOP.H_Cohesion.LowCohesiveExample;

public class MongoDBOperationsL implements IDatabaseOperationsL{

	@Override
	public void connect() {
		System.out.println("Connected to MongoDB!");
	}

	@Override
	public void testConnection() {
		System.out.println("MongoDB connection have been tested!");
	}

	@Override
	public void closeConnection() {
		System.out.println("MongoDB connection have been closed!");
	}

	@Override
	public void writeLogsToFile() {
		System.out.println("Logs have been writen to a file after MongoDB connection!");
	}

}
