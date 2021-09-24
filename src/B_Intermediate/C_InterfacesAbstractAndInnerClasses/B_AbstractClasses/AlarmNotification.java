package B_Intermediate.C_InterfacesAbstractAndInnerClasses.B_AbstractClasses;

public class AlarmNotification extends NotificationManager {

	private Notification notification;
		
	public AlarmNotification(Notification notification) {
		super(notification);
		this.notification = notification;
	}

	@Override
	public void changeNotificationPeriod() {
		System.out.println("Changed notification period in alarm notification");
	}
	
	@Override
	public String combineNotificationMessage() {
		return "Alarm: " + notification.getTitle() + "!!! " + notification.getContent();
	}

	@Override
	public void sendNotification() {
		String message = this.combineNotificationMessage();
		System.out.println("Notification has been sent in alarm notification: " + message);
	}

	@Override
	public void disableNotification() {
		System.out.println("Notification has disabled in Alarm settings");
	}
}
