package model;

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
        return "Driver{" +
                "idDriver=" + idDriver +
                ", nameDriver='" + nameDriver + '\'' +
                ", ageDriver=" + ageDriver +
                '}';
    }
}
