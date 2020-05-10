package com.cognizant.abstractFactoryPattern;

public abstract class Car {
	
	private CarType model = null;
	private Location location = null;
	public Car(CarType model, Location location) {
		this.setModel(model);
		this.setLocation(location);
	}
	public CarType getModel() {
		return model;
	}
	public void setModel(CarType model) {
		this.model = model;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	protected abstract void construct();
	@Override
	public String toString() {
		return "CarModel- " + model + " located in " + location;
	}
	
	
}
