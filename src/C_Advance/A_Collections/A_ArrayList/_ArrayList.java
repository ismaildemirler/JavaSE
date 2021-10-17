package C_Advance.A_Collections.A_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class _ArrayList {
	
	/*
	 * ArrayList in Java Collections
	 */
	
	/*
	 * Java ArrayList class uses a dynamic array for storing the elements. 
	 * It is like an array, but there is no size limit. 
	 * We can add or remove elements anytime. 
	 * So, it is much more flexible than the traditional array. 
	 * It is found in the java.util package. It is like the Vector in C++.
	 * 
	 * The ArrayList in Java can have the duplicate elements also. 
	 * It implements the List interface so we can use all the methods of List interface here. 
	 * The ArrayList maintains the insertion order internally.
	 * It inherits the AbstractList class and implements List interface.
	 * 
	 * The important points about Java ArrayList class are:
	   - Java ArrayList class can contain duplicate elements.
	   - Java ArrayList class maintains insertion order.
	   - Java ArrayList class is non synchronized.
	   - Java ArrayList allows random access because array works at the index basis.
	   - In ArrayList, manipulation is little bit slower than the LinkedList in Java 
	     because a lot of shifting needs to occur if any element is removed from the array list.
	 */
	
	/*
	 * We have already covered methods of ArrayList. 
	 * So here, we will speak about some more details about Arraylist
	 */

	public void moreAboutArrayList() {
		
		/*
		 * Constructors of ArrayList
		 */
		
		/*
		 * 1) It is used to build an empty array list.
		 */
		var arrayList1 = new ArrayList();
		
		/*
		 * 2) It is used to build an array list that is 
		 * 	  initialized with the elements of the collection Number for example.
		 */
		var arrayList2 = new ArrayList<Collection<? extends Number>>();
		
		/*
		 * 3) It is used to build an array list that has the specified initial capacity.
		 */
		var arrayList3 = new ArrayList(3);
		
		/*
		 * Java ArrayList Example
		 */
		var programmingLanguages = new ArrayList<String>();
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("C");
		programmingLanguages.add("Kotlin");
		
		System.out.println("Some Top Programming Languages: " + programmingLanguages);
		System.out.println("*************************************************");
		
		/*
		 * Iterating ArrayList using Iterator
		 */
		System.out.println("Some Top Programming Languages Using Iterator: " );
		Iterator iterator = programmingLanguages.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("*************************************************");
		
		/*
		 * Iterating ArrayList using Foreach Loop
		 */
		System.out.println("Some Top Programming Languages Using Foreach Loop: " );
		for (String programmingLanguage : programmingLanguages) {
			System.out.println(programmingLanguage);
		}
		System.out.println("*************************************************");
		
		/*
		 * Get and Set ArrayList
		 * The get() method returns the element at the specified index, 
		 * whereas the set() method changes the element.
		 */
		System.out.println("Second program language : " + programmingLanguages.get(1));
		
		//Changing Second Element
		programmingLanguages.set(1, "C++");
		System.out.println("Some Top Programming Languages After Item Changing: " );
		for (String programmingLanguage : programmingLanguages) {
			System.out.println(programmingLanguage);
		}
		System.out.println("*************************************************");
		
		/*
		 * How to Sort ArrayList
		 * The java.util package provides a utility class Collections which has the static method sort(). 
		 * Using the Collections.sort() method, we can easily sort the ArrayList.
		 */
		Collections.sort(programmingLanguages);
		System.out.println("Some Top Programming Languages After Sorting: " );
		for (String programmingLanguage : programmingLanguages) {
			System.out.println(programmingLanguage);
		}
		System.out.println("*************************************************");
	}
	
	public void iteratingThroughRemainingWays() {
		
		/*
		 * Ways to iterate the elements of the collection in Java.
		 * There are various ways to traverse the collection elements:
		   1) By Iterator interface.
	       2) By foreach loop.
		   3) By ListIterator interface.
		   4) By for loop.
		   5) By forEach() method.
		   6) By forEachRemaining() method.
		 */
		
		var programmingLanguages = new ArrayList<String>();
		programmingLanguages.add("Java");
		programmingLanguages.add("C++");
		programmingLanguages.add("C");
		programmingLanguages.add("Kotlin");
		
		/*
		 * Traversing list through List Iterator
		 */
		System.out.println("Traversing list through List Iterator:"); 
		//Here, element iterates in reverse order  
		ListIterator<String> list1 = programmingLanguages.listIterator(programmingLanguages.size());  
        while(list1.hasPrevious())  
        {  
            String item = list1.previous();  
            System.out.println(item);  
        }  
		System.out.println("*************************************************");
		
		/*
		 * Traversing list through for loop
		 */
		System.out.println("Traversing list through for loop:");  
        for(int i = 0; i < programmingLanguages.size(); i++)  
        {  
        	System.out.println(programmingLanguages.get(i));     
        } 
		System.out.println("*************************************************");
		
		/*
		 * Traversing list through forEach() method
		 */
		System.out.println("Traversing list through forEach() method:");  
        //The forEach() method is a new feature, introduced in Java 8.  
		programmingLanguages.forEach(a -> { //Here, we are using lambda expression  
            System.out.println(a);  
        });  
		System.out.println("*************************************************");
		
		/*
		 * Traversing list through forEachRemaining() method
		 */
		System.out.println("Traversing list through forEachRemaining() method:");  
        Iterator<String> itr = programmingLanguages.iterator();  
        itr.forEachRemaining(a -> //Here, we are using lambda expression  
        {  
        	System.out.println(a);  
        });  
		System.out.println("*************************************************");
	}

	public void sortingLists() {
		
		List<String> countryList = new ArrayList<String>();
		countryList.add("Turkey");
		countryList.add("Tunusia");
		countryList.add("Brazil");
		countryList.add("Argentina");
		countryList.add("Spain");
		countryList.add("Netherland");
		countryList.add("Luxemburg");
		countryList.add("Ukraine");
		
		System.out.println("Countries list before sorting: ");
		for (String country : countryList) {
			System.out.println(country);
		}
		System.out.println("***********************");
		/*
		 * Like we see above the countries are in insertion order not alphabetical order.
		 */
		
		Collections.sort(countryList);
		System.out.println("Countries list after sorting: ");
		for (String country : countryList) {
			System.out.println(country);
		}
		System.out.println("***********************");
		/*
		 * Like we see above the countries are in alphabetical order. 
		 * Because String class implements Comparable interface and
		 * Comparable interface has compareTo() method. Because of that
		 * Java knows how to sort String Objects. But if we try to sort
		 * custom Objects that we create. Let's see in example below: 
		 */
		
		List<Country> countries = new ArrayList<Country>();
		
		Country turkey = new Country("Turkey", 90);
		Country brazil = new Country("Brazil", 55);
		Country argentina = new Country("Argentina", 54);
		Country spain = new Country("Spain", 34);
		Country netherland = new Country("Netherland", 31);
		Country luxemburg = new Country("Luxemburg", 352);
		Country ukraine = new Country("Ukraine", 380);
		Country tunusia = new Country("Tunusia", 216);
		
		countries.add(turkey);
		countries.add(brazil);
		countries.add(argentina);
		countries.add(spain);
		countries.add(netherland);
		countries.add(luxemburg);
		countries.add(ukraine);
		countries.add(tunusia);
		
		Collections.sort(countries);
		
		System.out.println("Countries object list after comparable sorting: ");
		for (Country country : countries) {
			System.out.println(country);
		}
		System.out.println("***********************");
		/*
		 * Like we see above, we implemented Country class from Comparable class
		 * and override compareTo() method. So we can sort Country objects.
		 */
		
		/*
		 * And also we can do it by using anonymous Comparator<T> class like below
		 */
		Collections.sort(countries, new Comparator<Country>() {
			@Override
			public int compare(Country country1, Country country2) {
				/*
				 * If we put minus, we want to sort String from Z - A,
				 * If we don't put minus, we want to sort String from A - Z
				 */
				return -country1.name.compareTo(country2.name);
			}
		});
		
		System.out.println("Countries object list after comparator sorting: ");
		for (Country country : countries) {
			System.out.println(country);
		}
		System.out.println("***********************");
		
		/*
		 * Or we can create custom comparator class.
		 */
		Collections.sort(countries, new CustomComparator());
		
		System.out.println("Countries object list after custom comparator sorting: ");
		for (Country country : countries) {
			System.out.println(country);
		}
		System.out.println("***********************");
	}
	
	public class CustomComparator implements Comparator<Country>{
		@Override
		public int compare(Country country1, Country country2) {
			if (country1.getPhoneCode() > country2.getPhoneCode()) {
				return -1;
			}
			else if (country1.getPhoneCode() < country2.getPhoneCode()) {
				return 1;
			}
			return 0;
		}		
	}
	
	public class Country implements Comparable<Country> {
		private String name;
		private int phoneCode;
		
		public Country(String name, int phoneCode) {
			this.name = name;
			this.phoneCode = phoneCode;
		}

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public int getPhoneCode() {
			return phoneCode;
		}

		public void setPhoneCode(int phoneCode) {
			this.phoneCode = phoneCode;
		}

		@Override
		public int compareTo(Country country) {
			if (this.phoneCode < country.phoneCode) {
				return -1;
			}
			else if (this.phoneCode > country.phoneCode) {
				return 1;
			}
			return 0;
		}

		@Override
		public String toString() {
			return "Country [name=" + name + ", phoneCode=" + phoneCode + "]";
		}
	}
}
