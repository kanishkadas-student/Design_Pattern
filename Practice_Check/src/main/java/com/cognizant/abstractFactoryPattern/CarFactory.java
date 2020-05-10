package com.cognizant.abstractFactoryPattern;

public class CarFactory {
	private CarFactory() {
		
	}
	
	public static Car buildCar(CarType model, Location location) {
		Car car = null;
		switch (location) {
		case USA:
			car = UsaCarfactory.buildCar(model);
			break;
			
		case INDIA:
			car = IndiacarFactory.buildCar(model);
			break;
			
		
		default:
			car = DefaultCarFactory.buildCar(model);
			break;
		}
		return car;
	}
}
