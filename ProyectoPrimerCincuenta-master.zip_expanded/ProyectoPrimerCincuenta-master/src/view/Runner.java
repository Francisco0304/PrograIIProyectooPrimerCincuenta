package view;

import model.Vehicle;

public class Runner {

    static public void main( String ... args ) {
       // new Control().initialMenu();
        
        Vehicle vh;
        vh = new Vehicle("JRH674","Bus", (byte)12);
        vh.addDriver( vh.new Driver(1234, "Luis", (byte)24));
        vh.addDriver( vh.new Driver(1234, "Carlos", (byte)32));
        vh.addDriver( vh.new Driver(31234, "Pablo", (byte)32));
        vh.addDriver( vh.new Driver(41234, "Tirron", (byte)32));
        vh.addDriver( vh.new Driver(51234, "Unicua", (byte)32));
        vh.addDriver( vh.new Driver(6234, "Austin", (byte)24));
        vh.addDriver( vh.new Driver(71234, "Tasha", (byte)32));
        
        
		for (int i = 0; i < vh.getDrivers().size(); i++) {
			//if (vh.getDrivers().get(i).getAgeDriver() == (byte) 32) {
				System.out.println(vh.getDrivers().get(i).getNameDriver());
			//}

		}

	}

}