package B_Intermediate.GenericClasses;

import java.util.List;

public class LogOperations {
	
	public <E> void log(List<E> items){
		
		for (E item : items) {
			System.out.println(item + " item has been logged");	
		}

		System.out.println("*********************************");
	}
}
