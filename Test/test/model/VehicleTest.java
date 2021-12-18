package model;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Vehicle vh;
    private Driver dv;

    void setup(){
        dv = new Driver(1234, "", (byte)23);
        vh = new Vehicle("JRH674","Bus", (byte)12);
    }


    @org.junit.jupiter.api.Test
    void addDriver(Driver dv) {
        setup();
        Driver driver1 = new Driver(1234, "Luis", (byte)24);
        Driver driver2 = new Driver(3674, "Pablo", (byte)36);

        //.addDriver(driver1);
        assertFalse(vh.addDriver(driver1));
        assertTrue(vh.addDriver(driver2));
        //assertFalse(vh.addDriver(driver2));
        //assertEquals(25, vh.getDrivers().get(0).getIdDriver());
    }
}