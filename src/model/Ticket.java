package model;

import com.sun.deploy.util.JVMParameters;
import exceptions.ValueException;

import java.util.ArrayList;

public class Ticket {

    private ArrayList<Vehicle> vehicles;
    private ArrayList<Driver> drivers;

    public Ticket() {
        vehicles = new ArrayList<>();
        drivers = new ArrayList<>();
    }

    public Vehicle findVehicle(String codeVehicle ){

        for( Vehicle vehicle : vehicles ){
            if (vehicle.getLicensePate().equals(codeVehicle)){
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

    public byte rangeAge(byte age){
        if(age < 18){
            return 0;
        }
        return age;
    }

    public boolean addVehicle( Vehicle vehicle ){
        if ( findVehicle( vehicle.getLicensePate()) == null){
            vehicles.add( vehicle );

            return true;
        }

        return false;
    }

    public boolean addDriver( Driver driver)throws ValueException {
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
