package B_Intermediate.C_InterfacesAbstractAndInnerClasses.E_NestedClasses;

public class AnonymousTypeInnerClass {
	
	private IDatabaseService databaseService = new IDatabaseService() {
		
		@Override
		public void update() {
			System.out.println("Record updated!");
		}
		
		@Override
		public void insert() {
			System.out.println("Record inserted!");
		}
		
		@Override
		public void delete() {
			System.out.println("Record deleted!");
		}
	};
	
	private Validation validation = new Validation() {
		
		@Override
		public boolean nameValidation(String name) {
			return name.startsWith("is");
		}
	};
	
	public void insertItem() {
		databaseService.insert();
	}
	
	public void updateItem() {
		databaseService.update();
	}
	
	public void deleteItem() {
		databaseService.delete();
	}

	public void validateUserName(String name) {
		if (validation.nameValidation(name)) {
			System.out.println("Your username is acceptable");
		} else {
			System.out.println("Your username is not acceptable");
		}
	}
	
	public void validateAge(int age) {
		if (validation.pozitiveNumberValidation(age)) {
			System.out.println("Your age is acceptable");
		} else {
			System.out.println("Your age must be bigger than 0!");
		}
	}
	
	public interface IDatabaseService {
		
		void insert();
		void update();
		void delete();
	}

	public abstract class Validation {
		
		public abstract boolean nameValidation(String name);
		
		public boolean pozitiveNumberValidation(int number) {
			return number > 0;
		}
	}
}
