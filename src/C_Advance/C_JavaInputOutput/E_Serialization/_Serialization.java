package C_Advance.C_JavaInputOutput.E_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class _Serialization {

	/*
	 * Serialization and Deserialization in Java
	 * 
	 * Serialization in Java is a mechanism of writing the state of an object into a byte-stream. 
	 * It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies. The reverse operation 
	 * of serialization is called deserialization where byte-stream is converted into an object. 
	 * The serialization and deserialization process is platform-independent, it means you can 
	 * serialize an object on one platform and deserialize it on a different platform. For serializing 
	 * the object, we call the writeObject() method of ObjectOutputStream class, and for deserialization 
	 * we call the readObject() method of ObjectInputStream class. We must have to implement the 
	 * Serializable interface for serializing the object.
	 * 
	 */
	
	public void serialization() throws IOException {
		
		/*
		 * Advantages of Java Serialization
		 * It is mainly used to travel object's state on the network (that is known as marshalling).
		 * 
		 *          Serialization
		 *          ----------->          
		 * [[Object]]        [[Stream]]
		 *          <-----------
		 *          Deserialization
		 *          
		 */
		
		/*
		 * java.io.Serializable interface
		 * Serializable is a marker interface (has no data member and method). It is used to "mark" Java 
		 * classes so that the objects of these classes may get a certain capability. The Cloneable and 
		 * Remote are also marker interfaces. The Serializable interface must be implemented by the 
		 * class whose object needs to be persisted. The String class and all the wrapper classes 
		 * implement the java.io.Serializable interface by default. Let's see the example given below:
		 */
		
		/*
		 * ObjectOutputStream class 
		 * The ObjectOutputStream class is used to write primitive data types, and Java objects to an 
		 * OutputStream. Only objects that support the java.io.Serializable interface can be written to streams.
		 */
		
		/*
		 * Student class implements Serializable interface. Now its objects can be converted into stream. 
		 * The main class implementation of is showed in the next code.
		 */
		
		Student student = new Student(100, "ismail");    
		 
		//Creating stream and writing the object    
		FileOutputStream fout = new FileOutputStream("f.txt");    
		ObjectOutputStream out = new ObjectOutputStream(fout);    
		out.writeObject(student);    
		out.flush();    
		 
		out.close();    
		
		/*
		 * In above example, we are going to serialize the object of Student class from above code. 
		 * The writeObject() method of ObjectOutputStream class provides the functionality to serialize 
		 * the object. We are saving the state of the object in the file named f.txt.
		 */
		
		/*
		 * Java Serialization with Inheritance (IS-A Relationship)
		 * 
		 * If a class implements Serializable interface then all its sub classes will also be serializable. 
		 * Let's see the example given below:
		 */
		
		//Creating the object    
		Worker worker = new Worker(100, "Ahmet", "Sales", 5000);    
		//Creating stream and writing the object    
		FileOutputStream fileOutputStream = new FileOutputStream("f.txt");    
		ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);    
		outputStream.writeObject(worker);    
		outputStream.flush();      
		outputStream.close(); 
		
		/*
		 * This example has serialized the Worker class object that extends the Person class 
		 * which is Serializable. Parent class properties are inherited to subclasses so if parent class 
		 * is Serializable, subclass would also be.
		 */
		
		
		/*
		 * Java Serialization with Aggregation (HAS-A Relationship)
		 * 
		 * If a class has a reference to another class, all the references must be Serializable 
		 * otherwise serialization process will not be performed. In such case, 
		 * NotSerializableException is thrown at runtime.
		 */
		
		//Creating the object    
		House house = new House(3, "Flower Apartment");   
		
		/*
		 * Since Address is not Serializable, you cannot serialize the instance of the House class.
		 * All the objects within an object must be Serializable.
		 */
		
		
		/*
		 * Java Serialization with the static data member
		 * If there is any static data member in a class, 
		 * it will not be serialized because static is the part of class not object.
		 */
		
		
		/*
		 * Java Serialization with array or collection
		 * Rule: In case of array or collection, all the objects of array or collection must be serializable. 
		 * If any object is not serializable, serialization will be failed.
		 * 
		 * Externalizable in java
		 * The Externalizable interface provides the facility of writing the state of an object into a byte 
		 * stream in compress format. It is not a marker interface. 
		 * 
		 * The Externalizable interface provides two methods:
		   - public void writeExternal(ObjectOutput out) throws IOException
		   - public void readExternal(ObjectInput in) throws IOException
		 */
		
		/*
		 * Java Transient Keyword
		 * If you don't want to serialize any data member of a class, you can mark it as transient.
		 * Now, transient property will not be serialized, so when you deserialize the object after 
		 * serialization, you will not get the value of transient property. It will return default 
		 * value always. In such case, it will return 0 because the data type of age is an integer.
		 */
		
		/*
		 * SerialVersionUID
		 * 
		 * The serialization process at runtime associates an id with each Serializable class which 
		 * is known as SerialVersionUID. It is used to verify the sender and receiver of the serialized 
		 * object. The sender and receiver must be the same. To verify it, SerialVersionUID is used. 
		 * The sender and receiver must have the same SerialVersionUID, otherwise, InvalidClassException 
		 * will be thrown when you deserialize the object. We can also declare our own SerialVersionUID 
		 * in the Serializable class. To do so, you need to create a field SerialVersionUID and assign 
		 * a value to it. It must be of the long type with static and final. It is suggested to explicitly 
		 * declare the serialVersionUID field in the class and have it private also. For example:
		 * 
		 * private static final long serialVersionUID = 1L;
		 */		
	}
	
	public void deserialization() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		/*
		 * Deserialization is the process of reconstructing the object from the serialized state. 
		 * It is the reverse operation of serialization. Let's see an example where we are reading 
		 * the data from a deserialized object. Deserialization is the process of reconstructing 
		 * the object from the serialized state. It is the reverse operation of serialization. 
		 * Let's see an example where we are reading the data from a deserialized object.
		 */
		
		//Creating stream to read the object  
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));  
		Student student = (Student)in.readObject();  
		//printing the data of the serialized object  
		System.out.println(student.id + " " + student.name);  
		//closing the stream  
		in.close();  
	}
	
	public void transientKeyword() throws IOException, ClassNotFoundException {
		
		/*
		 * Java transient Keyword
		 * In Java, Serialization is used to convert an object into a stream of the byte. 
		 * The byte stream consists of the data of the instance as well as the type of data 
		 * stored in that instance. Deserialization performs exactly opposite operation. 
		 * It converts the byte sequence into original object data. During the serialization, 
		 * when we do not want an object to be serialized we can use a transient keyword.
		 * 
		 * Why to use the transient keyword?
		 * The transient keyword can be used with the data members of a class in order to avoid 
		 * their serialization. For example, if a program accepts a user's login details and 
		 * password. But we don't want to store the original password in the file. Here, we can 
		 * use transient keyword and when JVM reads the transient keyword it ignores the original 
		 * value of the object and instead stores the default value of the object.
		 * 
		 * Syntax:
		 * private transient <member variable>;  
		 * 
		 * Or
		 * transient private <member variable>; 
		 */
		
		/*
		 * When to use the transient keyword?

		   - The transient modifier can be used where there are data members derived from the other 
		     data members within the same instance of the class. 
		   - This transient keyword can be used with the data members which do not depict the state 
		     of the object. 
		   - The data members of a non-serialized object or class can use a transient modifier.
		 */
		
		/*
		 * Example of Java Transient Keyword
		 * Let's take an example, we have declared a class as Post, it has three data members id, 
		 * name and age. If you serialize the object, all the values will be serialized but we don't 
		 * want to serialize one value, e.g. age then we can declare the age data member as transient.
		 * 
		 * In this example, we have created two classes Student and PersistExample. The age data member 
		 * of the Student class is declared as transient, its value will not be serialized. If you 
		 * deserialize the object, you will get the default value for transient variable. Let's create 
		 * a class with transient variable.
		 */
		
		Post post = new Post(183, "Latest News", "Sample Content", 42434);//creating object    
		//writing object into file    
		FileOutputStream f = new FileOutputStream("f.txt");    
		ObjectOutputStream out = new ObjectOutputStream(f);    
		out.writeObject(post);    
		out.flush();    
		out.close();    
		f.close();   
		
		/*
		 * Now write the code for deserialization.
		 */
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));    
		Post repost = (Post)in.readObject();    
		System.out.println(repost.id + " " + repost.title + " " + repost.content + " " + repost.displayCount);    
		in.close();    
		
		/*
		 * As you can see, printing displayCount of the Post returns 0 because value of displayCount was not serialized.
		 * In this article, we have discussed use of transient keyword in Java, where to use transient keyword and 
		 * implementation of transient keyword in a Java program.
		 */
	}
	
	public class Student implements Serializable{
		 
		int id;  
		String name;  
		
		public Student(int id, String name) {  
			this.id = id;  
			this.name = name;  
		}  
	}  
	
	public class Person implements Serializable{
		
		private int id;
		private String name;
		
		public Person(int id, String name) {
			this.id = id;
			this.name = name;
		}
	}

	public class Worker extends Person {

		transient int age; //It is not wanted to be serialized
		private String department;
		private int salary;
		static String company = "Microsoft"; //it won't be serialized  
		
		public Worker(int id, String name, String department, int salary) {
			super(id, name);
			this.salary = salary;
			this.department = department;
		}
	}

	public class Address {
		
		String addressLine, city, state;    
		
		public Address(String addressLine, String city, String state) {    
			this.addressLine = addressLine;    
			this.city = city;    
			this.state = state;    
		}    
	}

	public class House implements Serializable {
		
		int number;  
		String name;  
		Address address; //HAS-A  
		
		public House(int number, String name) {  
			this.number = number;  
			this.name = name;  
		}  
	}

	public class Post implements Serializable {
		
		private int id;
		private String title;
		private String content;
		private transient int displayCount;
		
		public Post(int id, String title, String content, int displayCount) {
			this.id = id;
			this.title = title;
			this.content = content;
			this.displayCount = displayCount;
		}
	}
}
