package view;

import javax.swing.*;

public class View {

    public int optionMenu() {
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccion de usuario\n" +
                "[1] Registrar datos \n"+
                "[2] Compar tiketes \n"+
                "[3] Visualizar datos \n"+
                "[4] Salir","Menu Inicio", JOptionPane.QUESTION_MESSAGE));

        if ( option < 1 || option > 4 )
            showMessageErr("Digito invalido");
        return option;
    }

    public void showMessageErr(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public void showMessageWarning(String message) {
        JOptionPane.showMessageDialog(null, message, "Advertencia", JOptionPane.WARNING_MESSAGE);
    }

    public String readString(String message, String title) {
        String input = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
        return input;
    }

    public int readInt(String message, String title) {
        int input = Integer.parseInt(JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE));
        return input;
    }

    public double readDouble(String message, String title) {
        double inputDouble = Double.parseDouble(JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE));
        return inputDouble;
    }

    public byte readByte(String message, String title) {
        byte inputByte = Byte.parseByte(JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE));
        return inputByte;
    }

    public int confirmDialog(String message, String title) {
        int conf = JOptionPane.showConfirmDialog(null, message, title,JOptionPane.YES_NO_CANCEL_OPTION ,JOptionPane.QUESTION_MESSAGE);
        return conf;
    }

    public String selection(String massage, String ... options) {
        Object selec = JOptionPane.showInputDialog(null, massage, "", JOptionPane.QUESTION_MESSAGE, null, options, null);
        return selec.toString();
    }

    public int menuCheckBook0() {
        int optionCheck = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccion\n" +
                "[1] Registrar vehiculo\n" +
                "[2] Registrar Conductor\n"+
                "[3] Registrar Destino", "Menu Registro", JOptionPane.QUESTION_MESSAGE));

        if ( optionCheck < 1 || optionCheck > 3 )
            showMessageErr("Digito invalido");
        return optionCheck;
    }

    public int menuCheckBook() {
        int optionCheck = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccion\n" +
                "[1] Datos Vehiculo\n" +
                "[2] Datos conductores", "Menu Datos", JOptionPane.QUESTION_MESSAGE));

        if ( optionCheck < 1 || optionCheck > 2 )
            showMessageErr("Digito invalido");
        return optionCheck;
    }
}