package model;

import java.time.LocalDate;

public class Tiket {

	private Vehicle vehicle;
	private Travel travel;
	private Driver driver;
	private LocalDate date;
	private int chairsfull;

	public Tiket(int chairs, Vehicle vehicle, Travel travel, Driver driver, LocalDate date) {
		super();
		this.chairsfull = chairs;
		this.vehicle = vehicle;
		this.travel = travel;
		this.driver = driver;
		this.date = date;
	}

	public int getChairs() {
		return chairsfull;
	}

	public void setChairs(int chairsFull) {
		this.chairsfull = chairsFull;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}