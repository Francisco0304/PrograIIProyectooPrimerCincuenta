package model;

import java.util.ArrayList;

public class Inscription {

    private ArrayList<Vehicle> vehicles;
    private ArrayList<Travel> travels;
    private ArrayList<Driver> drivers;


    public Inscription() {
        this.vehicles = new ArrayList<>();
        this.travels = new ArrayList<>();
        this.drivers = new ArrayList<>();
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
}