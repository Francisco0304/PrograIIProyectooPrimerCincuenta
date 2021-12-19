package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehiculoTest {

	 private Vehicle vh;

	    void setup(){
	        vh = new Vehicle("JRH674","Bus", (byte)12);
	    }
	    
	    @Test
	    
	    void getId() {
	    	
	    }

	    @Test
	    void addDriver() {
	        setup();
	        
	        Vehicle.Driver driver1= vh.new Driver(1234, "Luis", (byte)24);
	        Vehicle.Driver driver2= vh.new Driver(21234, "Carlos", (byte)32);
	        
	        assertTrue( vh.addDriver(driver2));
	        assertTrue( vh.addDriver(driver1));
	    	assertFalse( vh.addDriver(driver1));
	    	assertNotEquals(1234, vh.getDrivers().get(0).getIdDriver());
	    }

}