package B_Intermediate.C_InterfacesAbstractAndInnerClasses.B_AbstractClasses;

public abstract class NotificationManager implements INotificationManager{

	private Notification notification;
	
	public NotificationManager(Notification notification) {
		this.notification = notification;
	}

	public void printDefinition() {
		System.out.println("This is notification class!");
	}
	
	@Override
	public String combineNotificationMessage() {
		return notification.getTitle() + "! " + notification.getContent();
	}
	
	public abstract void disableNotification();
}
