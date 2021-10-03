package B_Intermediate.A_OOP.K_Composition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _Composition {

	/*
	 * Composition in Java
	 */
	
	/*
	 * Composition is a â€œbelongs-toâ€? type of relationship. It means that one of the objects 
	 * is a logically larger structure, which contains the other object. In other words, 
	 * it's part or member of the other object. Alternatively, we often call it a â€œhas-aâ€? relationship 
	 * (as opposed to an â€œis-aâ€? relationship, which is inheritance).
	 * 
	 * For example, a room belongs to a building, or in other words a building has a room. 
	 * So basically, whether we call it â€œbelongs-toâ€? or â€œhas-aâ€? is only a matter of point of view.
	 * Composition is a strong kind of â€œhas-aâ€? relationship because the containing object owns it. 
	 * Therefore, the objects' lifecycles are tied. It means that if we destroy the owner object, 
	 * its members also will be destroyed with it. For example, the room is destroyed with the building 
	 * in our previous example. 
	 * 
	 * As another example, Suppose if we take an example of the relationship 
	 * between questions and answers. Single questions can have multiple answers, 
	 * but multiple answers can not have multiple questions. If we delete questions, 
	 * answers will automatically be deleted. In this the entities are dependent.
	 */
	
	/*
	 * Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.  
       - It represents part-of relationship.
       - In composition, both entities are dependent on each other.
       - When there is a composition between two entities, the composed object cannot exist without the other entity.
	 */
	
	/*
	 * Aggregation vs Composition 
       - Dependency: Aggregation implies a relationship where the child can exist independently of the parent. 
         For example, Bank and Employee, delete the Bank and the Employee still exist. 
         Whereas Composition implies a relationship where the child cannot exist independent of the parent. 
         Example: Human and heart, heart donâ€™t exist separate to a Human
       - Type of Relationship: Aggregation relation is â€œhas-aâ€? and composition is â€œpart-ofâ€? relation.
       - Type of association: Composition is a strong Association whereas Aggregation is a weak Association.
	 */
	
	/*
	 * The benefits of using Composition is as follows: 
	   - Composition allows the reuse of code.
	   - Java doesnâ€™t support multiple inheritances but by using composition we can achieve it.
	   - Composition offers better test-ability of a class.
	   - By using composition, we are flexible enough to replace the implementation of a composed class with a better and improved version.
	   - By using composition, we can also change the member objects at run time, to dynamically change the behavior of your program.
	 */
	
	/*
	 * They are the certain key points of composition in java which are as follows:
	   - It represents a has-a relationship.
       - In composition, both entities are dependent on each other.
       - When there is a composition between two entities, the composed object cannot exist without the other entity. 
       			For example, A library can have number of books on the same or different subjects. 
       			So, if the library gets destroyed then all books within that particular library will be destroyed. 
       			This is the books can not exist without a library.
       - The composition is achieved by using an instance variable that refers to other objects.
       - We have to favor Composition over Inheritance.
	 */
	
	/*
	 * For example we want to compose a computer. So we get main board object, hard disk object, keyboard object, monitor object.
	 * So by combining them we can have a computer object. Computer object has a lot of objects inside itself. This is composition.
	 */
	
	public void compositionExample() {
		
		/*
		 * In this example we can see that Question and Option classes are associated each other tightly.
		 * If we delete Question class, Option class can not live. Because the options belongs to the particular
		 * Question. This is Composition example which is strong association.
		 */
		Option optionA = new Option("A Choise");
		Option optionB = new Option("B Choise");
		Option optionC = new Option("C Choise");
		Option optionD = new Option("D Choise");
		Option optionE = new Option("E Choise");
		
		List<Option> options = new ArrayList<Option>();
		options.add(optionA);
		options.add(optionB);
		options.add(optionC);
		options.add(optionD);
		options.add(optionE);
		
		Question question = new Question("Is this sentence example question?", options);
		
		System.out.println("The Question: " + question.getQuestionText());
		System.out.println("The Options: ");
		for (Iterator iterator = options.iterator(); iterator.hasNext();) {
			Option option = (Option) iterator.next();
			System.out.println(option.getOptionText());
		}
		
		PersonAnswered personAnswered1 = new PersonAnswered("Person1", optionC);
		PersonAnswered personAnswered2 = new PersonAnswered("Person2", optionA);
		PersonAnswered personAnswered3 = new PersonAnswered("Person3", optionD);
		PersonAnswered personAnswered4 = new PersonAnswered("Person4", optionE);
		PersonAnswered personAnswered5 = new PersonAnswered("Person5", optionD);
		
		List<PersonAnswered> personList = new ArrayList<PersonAnswered>();
		personList.add(personAnswered1);
		personList.add(personAnswered2);
		personList.add(personAnswered3);
		personList.add(personAnswered4);
		personList.add(personAnswered5);
		
		for (Iterator iterator = personList.iterator(); iterator.hasNext();) {
			PersonAnswered person = (PersonAnswered) iterator.next();
			if (person.getOption() == optionD) {
				System.out.println(person.getName() + " has given right answer. Given answer: " + person.getOption().getOptionText());
			}
			else {
				System.out.println(person.getName() + " has given wrong answer. Given answer: " + person.getOption().getOptionText());
			}
		}
	}
}
