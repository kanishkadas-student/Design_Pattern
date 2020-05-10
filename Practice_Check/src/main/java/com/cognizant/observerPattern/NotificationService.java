package com.cognizant.observerPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NotificationService implements INotificationService{
	private static final Logger LOGGER=LoggerFactory.getLogger(NotificationService.class);
	private List<INotificationObserver> notificationService = new LinkedList<>();
	@Override
	public void AddSubscriber(INotificationObserver type) {
		// TODO Auto-generated method stub
		notificationService.add(type);
		LOGGER.info("List of Observers:");
		for (INotificationObserver iNotificationObserver : notificationService) {
			LOGGER.info(iNotificationObserver.toString());
		}
	}

	@Override
	public void RemoveSubscriber(INotificationObserver type) {
		// TODO Auto-generated method stub
		notificationService.remove(type);
		LOGGER.info("List of Observers");
		for (INotificationObserver iNotificationObserver : notificationService) {
			LOGGER.info(iNotificationObserver.toString());
		}
	}

	@Override
	public void NotifySubscriber() {
		// TODO Auto-generated method stub
		for (INotificationObserver iNotificationObserver : notificationService) {
			iNotificationObserver.OnServerDown();
		}
	}

}
