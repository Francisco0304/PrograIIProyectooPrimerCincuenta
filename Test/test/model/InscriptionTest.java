package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscriptionTest {

    private Inscription ins;
    private Driver driver;
    private Vehicle vehicle;

    private void setup() {
        ins = new Inscription();
    }

    @Test
    void addDriver() {
        setup();
        Driver driver1 = new Driver(3234, "Pacho", (byte)24, 2);
        Driver driver2 = new Driver(1234, "Luis", (byte)24, 4);

        assertTrue( ins.addDriver(driver2));
        assertTrue( ins.addDriver(driver1));
        assertFalse( ins.addDriver(driver1));
        assertNotEquals(3234, ins.getDrivers().get(0).getIdDriver());
    }

}