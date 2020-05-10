package com.cognizat.observerPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Admin extends INotificationObserver {
	private static final Logger LOGGER=LoggerFactory.getLogger(Admin.class);
	public Admin(INotificationService service, String name, int noOfTickets) {
		super(service, name, noOfTickets);
	}

	@Override
	public void nofication() {
		LOGGER.info("Hello " + name + " .");
		LOGGER.info("Your Event will start soon...");
	}

}

