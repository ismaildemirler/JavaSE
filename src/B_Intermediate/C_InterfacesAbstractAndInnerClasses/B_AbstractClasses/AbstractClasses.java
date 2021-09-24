package B_Intermediate.C_InterfacesAbstractAndInnerClasses.B_AbstractClasses;

public class AbstractClasses {

	/*
	 * Abstract Class in Java
	 */
	
	/*
	 * A class which is declared with the abstract keyword is known as an abstract class in Java 
	 * It can have abstract and non-abstract methods (method with the body).
	 * Before learning the Java abstract class, let's remember the abstraction in Java first.
	 * 
	 * Abstraction is a process of hiding the implementation details and showing only functionality to the user.
	 * Abstraction can be achieved with either abstract classes or interfaces.
	 * Another way, it shows only essential things to the user and hides the internal details, 
	 * for example, sending SMS where you type the text and send the message. 
	 * You don't know the internal processing about the message delivery.
	 * Abstraction lets you focus on what the object does instead of how it does it.
	 */
	
	/*
	 * Abstract class in Java 
	 * A class which is declared as abstract is known as an abstract class. 
	 * It can have abstract and non-abstract methods. 
	 * It needs to be extended and its method implemented. It cannot be instantiated.
	 * 
	 * Points to Remember:
	   - An abstract class must be declared with an abstract keyword.
       - It can have abstract and non-abstract methods.
       - It cannot be instantiated.
       - It can have constructors and static methods also.
       - It can have final methods which will force the subclass not to change the body of the method.
	 */
	
	/*
	 * Abstract Method in Java
	 * A method which is declared as abstract and does not have implementation is known as an abstract method.
	 * abstract void printStatus();  
	 * no method body and abstract  
	 */
	
	public void abstractClasses() {
		
		var notificationToDo = new Notification("Todo Item", "You have to do your programming homework"); 
		
		var todoNotification = new TodoNotification(notificationToDo);
		todoNotification.printDefinition();
		todoNotification.changeNotificationPeriod();
		todoNotification.combineNotificationMessage();
		todoNotification.sendNotification();
		todoNotification.disableNotification();
		System.out.println("**************************************");
		
		var notificationAlarm = new Notification("Good Morning!", "Your wake up time in the morning"); 
		
		var alarmNotification = new AlarmNotification(notificationAlarm);
		alarmNotification.printDefinition();
		alarmNotification.changeNotificationPeriod();
		alarmNotification.combineNotificationMessage();
		alarmNotification.sendNotification();
		alarmNotification.disableNotification();
		System.out.println("**************************************");
		
		var notificationBattery = new Notification("Battery Warning!", "Your battery is running out"); 
		
		var batteryNotification = new BatteryNotification(notificationBattery);
		batteryNotification.printDefinition();
		batteryNotification.changeNotificationPeriod();
		batteryNotification.combineNotificationMessage();
		batteryNotification.sendNotification();
		batteryNotification.disableNotification();
		System.out.println("**************************************");
	}
}
