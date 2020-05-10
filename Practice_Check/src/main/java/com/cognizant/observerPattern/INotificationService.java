package com.cognizant.observerPattern;

public interface INotificationService {

	void AddSubscriber(INotificationObserver type);
	void RemoveSubscriber(INotificationObserver type);
	void NotifySubscriber();
}
