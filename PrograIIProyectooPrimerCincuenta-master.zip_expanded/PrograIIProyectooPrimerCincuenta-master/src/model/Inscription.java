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
        travels = new ArrayList<>();
    }

	public Vehicle findVehicle(String LicensePate) {

		for (Vehicle vehicle : vehicles) {
			if (vehicle.getLicensePate().equalsIgnoreCase(LicensePate)) {
				return vehicle;
			}
		}

		return null;
	}

    public Driver findDriver(int code){

        for( Driver driver : drivers ){
            if( driver.getIdDriver() == code ){
                return driver;
            }
        }

        return null;
    }
    
	public Travel findTravel(byte indice) {

		for (Travel travel : travels) {
			if (travel.getId()==indice) {
				return travel;
			}
		}

		return null;
	}
    public boolean addVehicle(Vehicle vehicle) {

        if (findVehicle(vehicle.getLicensePate()) == null) {
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
    
    public byte rangeAge(byte age){
        if(age < 18){
            return 0;
        }
        return age;
    }
    
    public int limitPassengers() {
    	
    	return 0;
    }
    
    public String searchVehicle(String license){
        for (int i = 0; i < vehicles.size(); i++) {
            if (license.equals(vehicles.get(i).getLicensePate())) {
                return vehicles.toString();
            }
        }
        return null;
    }
    
    public String searchDriver1(int id){
    	String msj="";
        for (int i = 0; i < drivers.size(); i++) {
            
        	msj+=drivers.get(i).getNameDriver();
            }
        return msj;
        }
        

    
    public String searchTravel(byte id){
    	String msj="";
        for (int i = 0; i < drivers.size(); i++) {
        	msj+=travels.get(i).getSourceData()+" - "+travels.get(i).getDestinationData() ;
            }
        return msj;
        }
    
    public String typeVehicles(byte indic){
        String equals = "";
        if(indic == 1){
            equals = "Bus";
        }else if(indic == 2) {
            equals = "Buseta";
        }else{
            equals = "MicroBus";
        }
        return equals;
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
