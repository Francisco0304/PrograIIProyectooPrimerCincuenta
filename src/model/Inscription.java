package model;

import exceptions.ValueException;

import java.util.ArrayList;

/**
 * Clase Features: En esta clase estan definidos los métodos que permiten dar la funcionalidad del programa.
 * @ProyectoPrimerCincuenta
 */
public class Inscription {

    private ArrayList<Vehicle> vehicles;
    private ArrayList<Driver> drivers;
    private ArrayList<Travel> travels;

    /**
     * Metodo constructor: Define las variables de tipo String ms y key.
     */
    public Inscription() {
        vehicles = new ArrayList<>();
        drivers = new ArrayList<>();
        travels = new ArrayList<>();
    }

    /**
     * findVehicle: Permite encontrar el vehiculo correspondiente
     * @param LicensePate Recibe la matricula del vehiculo
     * @return Devuelve el array
     */
    public Vehicle findVehicle(String LicensePate) {

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getLicensePate().equalsIgnoreCase(LicensePate)) {
                return vehicle;
            }
        }

        return null;
    }

    /**
     * findDriver: Permite encontrar el chofer correspondiente
     * @param code Recibe el ID del conductor
     * @return Devuelve el array
     */
    public Driver findDriver(int code){

        for( Driver driver : drivers ){
            if( driver.getIdDriver() == code ){
                return driver;
            }
        }

        return null;
    }

    /**
     * findTracel: Permite encontrar el destino correspondiente
     * @param indice Recibe el indice
     * @return Devuelve el array
     */
    public Travel findTravel(byte indice) {

        for (Travel travel : travels) {
            if (travel.getId()==indice) {
                return travel;
            }
        }

        return null;
    }

    /**
     * addVehicle: Permite agregar un vehiculo
     * @param vehicle Recibe el array y lo analiza
     * @return Retorna si es verdadero o falso
     */
    public boolean addVehicle(Vehicle vehicle) {

        if (findVehicle(vehicle.getLicensePate()) == null) {
            vehicles.add(vehicle);
            return true;
        }

        return false;
    }

    /**
     * addTravel: Permite agregar un destino
     * @param travel Recibe el array y lo analiza
     * @return Retorna si es verdadero o falso
     */
    public boolean addTravel(Travel travel) {

        if (travel.getSourceData() != travel.getDestinationData()) {
            travels.add(travel);

            return true;
        }

        return false;
    }

    /**
     * addDriver: Permite agregar un conductor
     * @param driver Recibe el array y lo analiza
     * @return Retorna si es verdadero o falso
     */
    public boolean addDriver( Driver driver) throws ValueException{
        if (findDriver(driver.getIdDriver()) == null) {
            drivers.add(driver);

            return true;
        }

        return false;
    }

    /**
     * rangeAge: Comprueba la edad del conductor
     * @param age Recibe el array y lo analiza
     * @return Retorna un byte determinando que si la edad del conductor no es permitida no valdra
     */
    public byte rangeAge(byte age){
        if(age < 18){
            return 0;
        }
        return age;
    }

    /**
     * searchVehicle: Busca el vehiculo correspondiente
     * @param license Recibe la matricula del vehiculo
     * @return retorna una cadena con los datos del vehiculo encontrado
     */
    public String searchVehicle(String license){
        for (int i = 0; i < vehicles.size(); i++) {
            if (license.equals(vehicles.get(i).getLicensePate())) {
                return vehicles.toString();
            }
        }
        return null;
    }

    /**
     * typeVehicles: Determina el tipo de vehiculo
     * @param indic recibe un int agregado por teclado
     * @return Retorna una cadena con el tipo de bus correspondiente
     */
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

    /**
     * deleteDrivers: elimina al conductor
     * @param number recibe el ID del conductor
     * @return elimina el ID del array
     */
    public boolean deleteDrivers(int number) {
        for (int i = 0; i < drivers.size(); i++) {
            if (number == drivers.get(i).getIdDriver()) {
                return drivers.remove(findDriver(number));
            }
        }
        number = 0;
        return drivers.remove(findDriver(number));
    }

    /**
     * searchDriver: busca al conductor
     * @param id recibe el ID del conductor
     * @return Muestra los datos del ID del array
     */
    public String searchDriver(int id){
        for (int i = 0; i < drivers.size(); i++) {
            if (id == drivers.get(i).getIdDriver()) {
                return drivers.toString();
            }
        }
        return null;
    }
}