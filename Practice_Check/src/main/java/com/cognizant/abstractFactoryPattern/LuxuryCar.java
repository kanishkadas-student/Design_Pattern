package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuxuryCar extends Car{
	
	private static final java.util.logging.Logger LOGGER = LoggerFactory.getLogger(LuxuryCar.class);
	
	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		LOGGER.info("Connecting to LUXURY car");
	}

}
