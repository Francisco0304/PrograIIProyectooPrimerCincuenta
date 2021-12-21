package model;

import org.junit.jupiter.api.Test;

import exceptions.ValueException;

import static org.junit.jupiter.api.Assertions.*;

class InscriptionTest {

    private Inscription ins;

    private void setup() {
        ins = new Inscription();
    }
    
    @Test
    
    void findVehicle() {
    	
    	//Vehicle("BHQ123", "Microbus", (byte)20)
    	//new Vehicle("LJR123", "Bus", (byte)40)
        ins.addVehicle( ins.findVehicle("BHQ123"));
        ins.addVehicle(ins.findVehicle("LJR123"));
        
        assertNull(ins.findVehicle("BHQ321"));
        assertNull(ins.findVehicle("LJR321"));
        assertEquals("Bus",ins.findVehicle("LJR123").getVehicleType());
        assertNotNull(ins.findVehicle("BHQ123"));
        assertNotNull(ins.findVehicle("LJR123"));
    }
    
//    @Test
//    void findTravel() {
//    	
//         ins.addTravel(new Travel((byte)1, "Duitama", "Bogota", 35000));
//         ins.addTravel(new Travel((byte)2, "Bogota", "Duitama", 40000));
//         
//         assertNull( ins.findTravel((byte)0));
//         assertNull(ins.findTravel((byte)3));
//         assertEquals("Duitama",ins.findTravel((byte)1).getSourceData());
//         assertNotNull(ins.findTravel((byte)1));
//         assertNotNull(ins.findTravel((byte)2));
//    }
//    @Test
//    void findDriver() {   
//        
//        try {
//        	ins.addDriver(new Driver(3234, "Pacho", (byte)24, 3));
//        	ins.addDriver(new Driver(1234, "Luis", (byte)24,5));
//		} catch (ValueException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
//        assertNull( ins.findDriver(12345));
//        assertNull(ins.findDriver(12345));
//        assertEquals("Luis", ins.findDriver(1234).getIdDriver());
//        assertNotNull(ins.findDriver(12345));
//        assertNotNull(ins.findDriver(12345));
//    }

    @Test
    void addVehicle() {
    	setup();
        Vehicle vh1 = new Vehicle("BHQ123", "Microbus", (byte)20);
        Vehicle vh2 = new Vehicle("LJR123", "Bus", (byte)40);
        
            assertTrue(ins.addVehicle(vh2));
            assertTrue(ins.addVehicle(vh1));
            assertFalse(ins.addVehicle(vh2));
            assertEquals("LJR123", ins.getVehicles().get(0).getLicensePate());
    }
    
    @Test
    void addTravel() {
    	setup();
        Travel travel1 = new Travel((byte)1, "Duitama", "Bogota", 35000);
        Travel travel2 = new Travel((byte)2, "Bogota", "Duitama", 40000);
        
            assertTrue(ins.addTravel(travel2));
            assertTrue(ins.addTravel(travel1));
            assertEquals("Bogota", ins.getTravel().get(0).getSourceData());

    }
    
    @Test
    void addDriver() {
    	setup();
        Driver driver1 = new Driver(3234, "Pacho", (byte)24, 3);
        Driver driver2 = new Driver(1234, "Luis", (byte)24,5) ;

        try {
            assertTrue(ins.addDriver(driver2));
            assertTrue(ins.addDriver(driver1));
            assertFalse(ins.addDriver(driver1));
            assertEquals(1234, ins.getDrivers().get(0).getIdDriver());

        } catch (ValueException valueException) {
            valueException.printStackTrace();
        }
    }
    
    

}