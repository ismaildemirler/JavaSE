package B_Intermediate.A_OOP.H_Cohesion.HighCohesiveExample;

public class MongoDBOperationsH implements IDatabaseOperationsH{

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
}
