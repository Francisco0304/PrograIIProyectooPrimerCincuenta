package model;

import java.util.ArrayList;

public class Vehicle {

	private String licensePate;
	private String vehicleType;
	private byte quantityPassenger;
	private ArrayList<Driver> drivers;

	public Vehicle(String licensePate, String vehicleType, byte quantityPassenger) {
		this.licensePate = licensePate;
		this.vehicleType = vehicleType;
		this.quantityPassenger = quantityPassenger;
		drivers = new ArrayList<Driver>();
	}

	public String getLicensePate() {
		return licensePate;
	}

	public void setLicensePate(String licensePate) {
		this.licensePate = licensePate;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public byte getQuantityPassenger() {
		return quantityPassenger;
	}

	public void setQuantityPassenger(byte quantityPassenger) {
		this.quantityPassenger = quantityPassenger;
	}

	public ArrayList<Driver> getDrivers() {
		return (ArrayList<Driver>) drivers.clone();
	}

	private int getId(int id) {		
		for (int i = 0; i < drivers.size(); i++) {
			if (id == drivers.get(i).getIdDriver())
			return id;
		}
		
		return 0;
	}

	public boolean addDriver(Driver drive) {

		if (getId(drive.getIdDriver()) != drive.getIdDriver()) {
			drivers.add(drive);
			return true;
		}

		return false;
	}

	public class Driver {

		private int idDriver;
		private String nameDriver;
		private byte ageDriver;

		public Driver(int idDriver, String nameDriver, byte ageDriver) {
			this.idDriver = idDriver;
			this.nameDriver = nameDriver;
			this.ageDriver = ageDriver;
		}

		public int getIdDriver() {
			return idDriver;
		}

		public void setIdDriver(int idDriver) {
			this.idDriver = idDriver;
		}

		public String getNameDriver() {
			return nameDriver;
		}

		public void setNameDriver(String nameDriver) {
			this.nameDriver = nameDriver;
		}

		public byte getAgeDriver() {
			return ageDriver;
		}

		public void setAgeDriver(byte ageDriver) {
			this.ageDriver = ageDriver;
		}

		@Override
		public String toString() {
			return "Driver{" + "idDriver=" + idDriver + ", nameDriver='" + nameDriver + '\'' + ", ageDriver="
					+ ageDriver + '}';
		}
	}
}