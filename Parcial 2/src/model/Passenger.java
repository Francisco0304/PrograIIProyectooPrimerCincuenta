package model;

import java.util.ArrayList;

public class Passenger extends Vehicle {

	private byte numPassenger;
	private ArrayList<Driver> drivers;

	public Passenger(String plate, String mark, short model, String color, float speed) {
		super(plate, mark, model, color, speed);
		
		this.numPassenger = numPassenger;
	}

	public void setNumPassenger(byte numPassenger) {
		this.numPassenger = numPassenger;
	}

	public byte getNumPassenger() {
		return numPassenger;
	}

	public Driver findDriver(String idDriver) {

		for (Driver driver : drivers) {

			if (driver.getIdDriver() == idDriver ) {

				return driver;
			}
		}

		return null;
	}

	public boolean addDriver(Driver drive) {

		if (findDriver(drive.getIdDriver()) == null) {

			drivers.add(drive);
			return true;
		}

		return false;

	}

	public ArrayList<Driver> getDrivers() {
		return (ArrayList<Driver>) drivers.clone();
	}
	
	@Override
	public boolean speedUp(float speed) {
		
		return super.speedUp(speed);
	}

}
