package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MicroCar extends Car{
	private static final java.util.logging.Logger LOGGER=LoggerFactory.getLogger(MicroCar.class); 
	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		LOGGER.info("Connecting to Micro Car");
	}

}
