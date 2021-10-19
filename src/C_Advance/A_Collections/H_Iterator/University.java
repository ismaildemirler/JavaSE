package C_Advance.A_Collections.H_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class University implements Iterable<String>{

	private ArrayList<String> universities = new ArrayList<String>();
	
	public University(String[] universities) {
		for (String university : universities) {
			this.universities.add(university);
		}
	}

	@Override
	public Iterator<String> iterator() {
		
		/*
		 * 1. Way 
		 */
		Iterator iterator = universities.iterator();
		
		/*
		 * 2. Way
		 */
		iterator = new UniversityIterator();
		
		return iterator;
	}	
	
	public class UniversityIterator implements Iterator<String>{

		private int index = 0;
		
		@Override
		public boolean hasNext() {
			if (index < universities.size()) {
				return true;
			}
			else {
				return false;
			}
		}

		@Override
		public String next() {
			String value = universities.get(index);
			index++;
			return value;
		}
	}
}
