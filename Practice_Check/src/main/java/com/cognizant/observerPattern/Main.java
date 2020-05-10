package com.cognizant.observerPattern;

public class Main {
	public static void main(String[] args) {
		INotificationObserver steve = new SteveObserver();
		INotificationObserver john = new JohnObserver();
		
		INotificationService service = new NotificationService();
		
		service.AddSubscriber(john);
		service.AddSubscriber(steve);
		
		service.NotifySubscriber();
		
		service.RemoveSubscriber(john);
		
		service.NotifySubscriber();
	}
}
