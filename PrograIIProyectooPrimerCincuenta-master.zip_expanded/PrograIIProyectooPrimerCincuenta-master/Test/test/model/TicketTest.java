package model;

import exceptions.ValueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    private Inscription tck;

    private void setup() {
        tck = new Inscription();
    }

    @Test
    void addVehicle() {
        setup();
        Vehicle vehicle1 = new Vehicle("PCJ707","Bus", (byte) 14);
        Vehicle vehicle2 = new Vehicle("BCJ707","Buseta", (byte) 14);
        Vehicle vehicle3 = new Vehicle("CSD431","Bus", (byte) 14);
        Vehicle vehicle4 = new Vehicle("BCJ707","Bus", (byte) 14);

        assertTrue( tck.addVehicle(vehicle1));
        assertTrue( tck.addVehicle(vehicle2));
        assertTrue( tck.addVehicle(vehicle3));

        assertEquals("PCJ707", tck.getVehicles().get(0).getLicensePate());
        assertEquals("Buseta", tck.getVehicles().get(1).getVehicleType());
    }

    @Test
    void addDriver() {
        setup();
        Driver driver1 = new Driver(3234, "Pacho", (byte)24, 3);
        Driver driver2 = new Driver(1234, "Luis", (byte)24,5) ;

        try {
            assertTrue(tck.addDriver(driver2));
            assertTrue(tck.addDriver(driver1));
            assertFalse(tck.addDriver(driver1));
            assertEquals(1234, tck.getDrivers().get(0).getIdDriver());

        } catch (ValueException valueException) {
            valueException.printStackTrace();
        }
    }
}