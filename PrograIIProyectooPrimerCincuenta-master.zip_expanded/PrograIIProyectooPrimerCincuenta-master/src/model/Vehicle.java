package model;


public class Vehicle {

    private String licensePate;
    private String vehicleType;
    private byte quantityPassenger;

    public Vehicle(String licensePate, String vehicleType, byte quantityPassenger) {
        this.licensePate = licensePate;
        this.vehicleType = vehicleType;
        this.quantityPassenger = quantityPassenger;
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

}