package com.cognizant.observerPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SteveObserver implements INotificationObserver{
	private static final Logger LOGGER=LoggerFactory.getLogger(SteveObserver.class);
	String name = "Steve";
	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		LOGGER.info("The notification has been received by "+name+".");
	}
	@Override
	public String toString() {
		return "SteveObserver [name=" + name + "]";
	}

}
