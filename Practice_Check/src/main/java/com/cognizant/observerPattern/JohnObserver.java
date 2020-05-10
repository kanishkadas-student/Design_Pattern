package com.cognizant.observerPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class JohnObserver implements INotificationObserver{

	private String name = "John";
	private static final Logger LOGGER=LoggerFactory.getLogger(JohnObserver.class);
	
	public void OnServerDown() {
		LOGGER.info("The notification has been received by "+name+".");
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "JohnObserver [name=" + name + "]";
	}

}
