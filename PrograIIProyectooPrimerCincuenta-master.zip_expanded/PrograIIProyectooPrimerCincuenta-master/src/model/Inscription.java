package model;

import exceptions.ValueException;

import java.util.ArrayList;

public class Inscription {

    private ArrayList<Vehicle> vehicles;
    private ArrayList<Driver> drivers;
    private ArrayList<Travel> travels;

    public Inscription() {
        vehicles = new ArrayList<>();
        drivers = new ArrayList<>();
    }

    public Driver findDriver(int code){

        for( Driver driver : drivers ){
            if( driver.getIdDriver() == code ){
                return driver;
            }
        }

        return null;
    }

    public byte rangeAge(byte age){
        if(age < 18){
            return 0;
        }
        return age;
    }
    
    public String getId_Vehicle(String LicensePate) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getLicensePate().equals(LicensePate))
                return LicensePate;
        }

        return null;
    }

    public boolean addVehicle(Vehicle vehicle) {

        if (getId_Vehicle(vehicle.getLicensePate()) != vehicle.getLicensePate()) {
            vehicles.add(vehicle);
            return true;
        }

        return false;
    }

	public boolean addTravel(Travel travel) {

		if (travel.getSourceData() != travel.getDestinationData()) {
			travels.add(travel);

			return true;
		}

		return false;
	}

    public boolean addDriver( Driver driver) throws ValueException{
        if (findDriver(driver.getIdDriver()) == null) {
                drivers.add(driver);

                return true;
        }

        return false;
    }

    public ArrayList<Vehicle> getVehicles() {
        return (ArrayList<Vehicle>) vehicles.clone();
    }

    public ArrayList<Driver> getDrivers() {
        return (ArrayList<Driver>) drivers.clone();
        
    }
    
    public ArrayList<Travel> getTravel() {
        return (ArrayList<Travel>) travels.clone();
        
    }

    public boolean deleteDrivers(int number) {
        for (int i = 0; i < drivers.size(); i++) {
            if (number == drivers.get(i).getIdDriver()) {
                return drivers.remove(findDriver(number));
            }
        }
        number = 0;
        return drivers.remove(findDriver(number));
    }

    public String searchDriver(int id){
        for (int i = 0; i < drivers.size(); i++) {
            if (id == drivers.get(i).getIdDriver()) {
                return drivers.toString();
            }
        }
        return null;
    }
}
