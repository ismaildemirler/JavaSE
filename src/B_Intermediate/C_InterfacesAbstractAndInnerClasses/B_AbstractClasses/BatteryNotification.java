package B_Intermediate.C_InterfacesAbstractAndInnerClasses.B_AbstractClasses;

public class BatteryNotification extends NotificationManager {

	private Notification notification;
	
	public BatteryNotification(Notification notification) {
		super(notification);
		this.notification = notification;
	}

	@Override
	public void changeNotificationPeriod() {	
		System.out.println("Changed notification period in battery notification");	
	}

	@Override
	public void sendNotification() {
		String message = combineNotificationMessage();
		System.out.println("Notification has been sent in battery notification: " + message);
	}

	@Override
	public void disableNotification() {
		System.out.println("Notification has disabled in Battery settings");
	}
}
