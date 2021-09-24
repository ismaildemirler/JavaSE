package B_Intermediate.C_InterfacesAbstractAndInnerClasses.B_AbstractClasses;

public class TodoNotification extends NotificationManager{

	private Notification notification;
	
	public TodoNotification(Notification notification) {
		super(notification);
		this.notification = notification;
	}

	@Override
	public void changeNotificationPeriod() {
		System.out.println("Changed notification period in todo notification");
	}

	@Override
	public void sendNotification() {
		String message = combineNotificationMessage();
		System.out.println("Notification has been sent in todo notification: " + message);
	}

	@Override
	public void disableNotification() {
		System.out.println("Notification has disabled in Todo settings");
	}	
}
