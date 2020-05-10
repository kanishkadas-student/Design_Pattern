package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiniCar extends Car{

	private static final Logger LOGGER= LoggerFactory.getLogger(LuxuryCar.class);
	public MiniCar(Location location) {
		super(CarType.MINI, location);
		construct();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		LOGGER.info("Connecting to Mini Car");
	}

}
