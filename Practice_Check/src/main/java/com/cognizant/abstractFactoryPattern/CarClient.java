package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class CarClient {

	private static final com.sun.org.slf4j.internal.Logger LOGGER = LoggerFactory.getLogger(CarClient.class);

	public static void main(String[] args) {
		
		LOGGER.debug("CarFactory: ",CarFactory.buildCar(CarType.MICRO, Location.INDIA));
		LOGGER.debug("CarFactory: ",CarFactory.buildCar(CarType.MINI, Location.USA));
		LOGGER.debug("CarFactory: ",CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT));
	}
}
