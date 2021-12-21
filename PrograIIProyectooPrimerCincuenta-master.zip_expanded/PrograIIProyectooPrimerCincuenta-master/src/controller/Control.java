package controller;

import java.time.LocalDate;
import java.util.ArrayList;

import exceptions.ValueException;
import model.*;
import view.View;

public class Control {
	private ArrayList<Tiket>tikets; 
    private View view;
    private Inscription inscription;

    public Control() {
        view = new View();
        inscription = new Inscription();
        tikets = new ArrayList<>();
    }

    public void initialMenu() {
        boolean check = true;
        int option = 0;
        int optionCheck = 0;
        while ( check ) {
            try {
                option = view.optionMenu();
            } catch (Exception e) {
                view.showMessageErr("Acción inválida");
            }
            switch ( option ) {
                case 1:
                	 try {
                         optionCheck = view.menuCheckBook0();
                     } catch (Exception e){
                         view.showMessageErr("No es válido");
                     }
                     if (optionCheck == 1){
                         registerVehicle();
                         optionCheck = 0;
                     }else if (optionCheck == 2){
                         handlingDrivers();
                         optionCheck = 0;
                     }else {
						registrerTravel();
					}

                    break;
                case 2:
                	registrerTiket();
                   
                    break;
                case 3:
                    try {
                        optionCheck = view.menuCheckBook();
                    } catch (Exception e){
                        view.showMessageErr("No es válido");
                    }
                    if (optionCheck == 1){
                        //addCheckBook();
                        optionCheck = 0;
                    }else{
                        dataDrivers();
                        optionCheck = 0;
                    }
                    break;
                case 4:
                	check = false;
                    break;
            }
        }
    }

    public void fullData(){

    }

    private void handlingDrivers() {
        String options = "Conductores registrados: " + inscription.getDrivers().size() +
                "\n[Yes] Agregar conductor\n[No] Eliminar conductor\n[Cancel] Regresar";

        switch ( view.confirmDialog( options, "Gestion de datos" ) ) {
            case 0:
                registerDriver();
                break;
            case 1:
                deleteDriver();
                break;
            case 2:
                break;
        }
    }

    public void registerDriver() {
        byte age = 0;
        Driver drive;
        try {
            int id = view.readInt("Ingrese la identificacion del conductor a agregar", "Ingreso de datos");
            if (inscription.findDriver(id) != null){
                String err = "Ya registrado";
                view.showMessage(err);
                registerDriver();
            }else {
                age = view.readByte("Ingrese la edad del conductor", "Ingreso de datos");
                if (inscription.rangeAge(age) == 0) {
                    String err = "Debe ser mayor de edad";
                    view.showMessage(err);
                    registerDriver();
                }else {
                	String name = view.readString("Ingrese el nombre del conductor", "Ingreso de datos");
                	if (name==null || name=="") {
                		String err = "Debe registrar un dato!";
                        view.showMessage(err);
                        registerDriver();
					} else {

						drive = new Driver(id, name, age, 0);

	                    if (inscription.addDriver(drive)) {
	                        String exit = "Correctamente agregado";
	                        view.showMessage(exit);

	                        String opt = "¿Desea continuar agregando? " +
	                                "\n[Yes] Si\n[No] No";
	                        switch (view.confirmDialog(opt, "Gestion de datos")) {
	                            case 0:
	                                registerDriver();
	                                break;
	                            case 1:
	                                handlingDrivers();
	                                break;
	                        }
	                    }
					}  
                		
                		
                }
            }
        } catch (ValueException valueException) {
            view.showMessageErr(valueException.getMessage());
            handlingDrivers();
        } catch (Exception e) {
            handlingDrivers();
        }

        inscription.getDrivers().forEach( accs -> System.out.println(accs));
    }

    private void deleteDriver() {
        try {
            if (inscription.deleteDrivers(view.readInt("Digite el ID del conductor", "Eliminar conductor")) == false) {
                view.showMessageErr("Conductor no registrado");
                handlingDrivers();
            } else {
                view.showMessage("Conductor eliminado");
            }

        } catch (Exception e) {
            view.showMessageErr("Error");
            handlingDrivers();
        }
    }

    private void dataDrivers() {
        String options = "Conductores registrados: " + inscription.getDrivers().size() +
                "\n[Yes] Histograma\n[No] Consultar conductores\n[Cancel] Regresar";

        switch ( view.confirmDialog( options, "Gestion de datos" ) ) {
            case 0:
                //registerDriver();
                break;
            case 1:
                searchDriver();
                break;
            case 2:
                break;
        }
    }

    public void searchDriver(){
        try {
            int data = view.readInt("Digite el ID del conductor", "Buscar conductor");
            if (inscription.findDriver(data) == null) {
                view.showMessageErr("Conductor no registrado");
                dataDrivers();
            } else {
                view.showMessage(inscription.searchDriver(data));
            }
        } catch (Exception e) {
            view.showMessageErr("Error");
            handlingDrivers();
        }
    } 
    
    public void registerVehicle() {
    	Vehicle vehicle;
    	view.showMessage("Tiene registrados: "+ inscription.getVehicles().size()+ " Vehiculos ");
        try {
            String licensePate = view.readString("Ingese la placa del vehiculo" , "Registro de vehiculos");
            if(inscription.findVehicle(licensePate) != null){
                String err = "Ya registrado";
                view.showMessage(err);
                registerVehicle();
            }else {
                byte type = view.readByte("Ingrese el tipo de Bus \n[1] Bus \n[2] Buseta \n[3] MicroBus", "Registro de vehiculos");
                if (type != 1 && type != 2 && type != 3) {
                    String err = "Valor invalido, debe se un numero entre 1 y 3";
                    view.showMessage(err);
                    registerVehicle();
                } else {
                    String fin = inscription.typeVehicles(type);
                    byte passengers = 0;
                    if(type == 1){
                        passengers = 60;
                    }else if (type == 2){
                        passengers = 30;
                    }else{
                        passengers = 15;
                    }
                    vehicle = new Vehicle(licensePate, fin, passengers);
                    if (inscription.addVehicle(vehicle)) {
                        String exit = "Correctamente agregado";
                        view.showMessage(exit);

                        String opt = "�Desea continuar agregando? " +
                                "\n[Yes] Si\n[No] No";
                        switch (view.confirmDialog(opt, "Gestion de datos")) {
                            case 0:
                                registerVehicle();
                                break;
                            case 1:
                                break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            registerVehicle();
        }

        inscription.getVehicles().forEach( accs -> System.out.println(accs));

    }

    public void searchVehicles(){
        try {
            String data = view.readString("Digite la placa del vehiculo", "Buscar vehiculo");
            if (inscription.findVehicle(data) == null) {
                view.showMessageErr("Vehiculo no registrado");
                searchVehicles();
            } else {
                view.showMessage(inscription.searchVehicle(data));
            }
        } catch (Exception e) {
            view.showMessageErr("Error");
            handlingDrivers();
        }
    }
    
    private void registrerTravel() {
    	Travel travel;
    	
    	try {
           
    		
    		String sourceData = view.readString("Ingrese la ciudad de Origen", "Registro de Ruta");
    		String destinationData = view.readString("Digite la ciudad de destino",  "Registro de Ruta");
    		byte cont = (byte) (inscription.getTravel().size()+1);
    		int unitvalue = view.readInt("Digite el valor unitario de el vijae ", "Registro de Ruta");
    		
    		travel = new Travel(cont, sourceData, destinationData, unitvalue);		
    		if (inscription.addTravel(travel)) {
                String exit = "Correctamente agregado";
                view.showMessage(exit);

                String opt = "�Desea continuar agregando? " +
                        "\n[Yes] Si\n[No] No";
                switch (view.confirmDialog(opt, "Gestion de datos")) {
                    case 0:
                        registrerTravel();
                        break;
                    case 1:
                        break;
                }
            }
    		
    		view.showMessage(inscription.searchTravel(cont));
        } catch (Exception e) {
            registerVehicle();
        }

        inscription.getTravel().forEach( accs -> System.out.println(accs));
    }
    
	private void registrerTiket() {

		String licensePate = view.readString("Ingrese la placa del vehiculo a despachar", "Datos del vehiculo");
		int idDriver = view.readInt("Ingrese la cedula del vehiculo", "Datos del Conductor");
		byte idTravel = view.readByte("Ingrese el indicador del viaje", "Datos del Viaje");

		tikets.add(new Tiket(18, inscription.findVehicle(licensePate), inscription.findTravel(idTravel),
				inscription.findDriver(idDriver), LocalDate.now()));

		for (int i = 0; i < tikets.size(); i++) {

			System.out.println(tikets.get(i).getVehicle().getVehicleType() + "---" + tikets.get(i).getTravel().getSourceData());

		}

	}

}