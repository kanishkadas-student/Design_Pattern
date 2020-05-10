package com.cognizat.observerPattern;

public class Main {

	public static void main(String[] args) {
		
		INotificationService service = new NotificationService();

		
		INotificationObserver admin1 = new Admin(service, "Kanishka", 101);
		INotificationObserver admin2 = new Admin(service, "Pabitra", 102);
		INotificationObserver admin3 = new Admin(service, "Aman", 100);

		
		service.addObserver(admin1);
		service.addObserver(admin2);
		service.addObserver(admin3);

		
		service.notifyObserver();
		
		service.removeObserver(admin3);
		
		service.notifyObserver();

	}

}
