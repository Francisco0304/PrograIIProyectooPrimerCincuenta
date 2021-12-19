package model;

import java.util.ArrayList;

public class Inscription {

	
	private ArrayList<Vehicle> vehicles;
	private ArrayList<Travel> travels;
	private ArrayList<Vehicle.Driver> drivers;
	
	
	public Inscription() {
		this.vehicles = new ArrayList<>();
		this.travels = new ArrayList<>();
	}


	public ArrayList<Vehicle> getVehicles() {
		return (ArrayList<Vehicle>) vehicles.clone();
	}

	public ArrayList<Travel> getTravels() {
		return (ArrayList<Travel>) travels.clone();
	}

	public String typeVehicle(int num) {

		String typeVehicle;
		
		if (num == 1) {
			
			typeVehicle = "Micro-Bus";
			
		} else if (num == 2) {
			
			typeVehicle = "Buseta";
			
		} else {
			
			typeVehicle = "Bus";
		}

		return typeVehicle;
	}	
}
