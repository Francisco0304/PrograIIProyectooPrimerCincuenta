package model;

public class Driver {

    private int idDriver;
    private String nameDriver;
    private byte ageDriver;
    private int travelsquantity;

    public Driver(int idDriver, String nameDriver, byte ageDriver, int travelsquantity) {
        this.idDriver = idDriver;
        this.nameDriver = nameDriver;
        this.ageDriver = ageDriver;
        this.travelsquantity = travelsquantity;
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

    public int getTravelsquantity() {
        return travelsquantity;
    }

    public void setTravelsquantity(int travelsquantity) {
        this.travelsquantity = travelsquantity;
    }

    @Override
    public String toString() {
        return " Informacion: " +
                "\nDocumento identificacion: " + idDriver +
                "\nNombre: '" + nameDriver + '\'' +
                "\nEdad: " + ageDriver +
                "\nConductor encontrado. ";
    }
}
