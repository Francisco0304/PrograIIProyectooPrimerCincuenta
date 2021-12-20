package controller;

import exceptions.ValueException;
import model.*;
import view.View;

import javax.swing.*;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Control {
    private View view;
    private Ticket ticket;
    private Driver driver;
    private Validations val;
    Driver conductor;
    private int contAcc;

    public Control() {
        view = new View();
        ticket = new Ticket();

        contAcc = 0;
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

                    break;
                case 2:
                    try {
                        optionCheck = view.menuCheckBook0();
                    } catch (Exception e){
                        view.showMessageErr("No es válido");
                    }
                    if (optionCheck == 1){
                        //addCheckBook();
                        optionCheck = 0;
                    }else{
                        handlingDrivers();
                        optionCheck = 0;
                    }
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

                    break;
                case 5:
                    check = false;
                    break;
            }
        }
    }

    public void fullData(){

    }

    private void handlingDrivers() {
        String options = "Conductores registrados: " + ticket.getDrivers().size() +
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
        boolean chechk = false;
        try {
            int id = view.readInt("Ingrese la identificacion del conductor a agregar", "Ingreso de datos");
            if (ticket.findDriver(id) != null){
                String err = "Ya registrado";
                view.showMessage(err);
                registerDriver();
            }else {
                age = view.readByte("Ingrese la edad del conductor", "Ingreso de datos");
                if (ticket.rangeAge(age) == 0) {
                    String err = "Debe ser mayor de edad";
                    view.showMessage(err);
                    registerDriver();
                }else {
                    String name = view.readString("Ingrese el nombre del conductor", "Ingreso de datos");
                    conductor = new Driver(id, name, age, 0);

                    if (ticket.addDriver(conductor)) {
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
        } catch (ValueException valueException) {
            view.showMessageErr(valueException.getMessage());
            handlingDrivers();
        } catch (Exception e) {
            handlingDrivers();
        }

        ticket.getDrivers().forEach( accs -> System.out.println(accs));
    }

    private void deleteDriver() {
        try {
            if (ticket.deleteDrivers(view.readInt("Digite el ID del conductor", "Eliminar conductor")) == false) {
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
        String options = "Conductores registrados: " + ticket.getDrivers().size() +
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
            if (ticket.findDriver(data) == null) {
                view.showMessageErr("Conductor no registrado");
                dataDrivers();
            } else {
                view.showMessage(ticket.searchDriver(data));
            }
        } catch (Exception e) {
            view.showMessageErr("Error");
            handlingDrivers();
        }
    }

}