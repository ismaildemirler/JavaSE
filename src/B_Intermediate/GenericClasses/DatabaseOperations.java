package B_Intermediate.GenericClasses;

import java.util.List;

public class DatabaseOperations<E> {
	
	public void save(List<E> items) {
		
		for (E item : items) {
			System.out.println(item + " item has been saved to database");
		}
		System.out.println("*************************************");
	}
}
