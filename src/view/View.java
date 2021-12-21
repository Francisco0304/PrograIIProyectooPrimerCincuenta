package view;

import javax.swing.*;

public class View {

    /**
     * Imprime las opciones del menú y lee la opcion seleccionada
     * @return Devuelve un entero segun la opción seleccionada
     */
    public int optionMenu() {
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccion de usuario\n" +
                "[1] Registrar datos \n"+
                "[2] Compar tiketes \n"+
                "[3] Visualizar datos \n"+
                "[4] Salir", "Menu inicio", JOptionPane.QUESTION_MESSAGE));

        if ( option < 1 || option > 4 )
            showMessageErr("Digito invalido");
        return option;
    }

    /**
     * Metodo que permite mostar mensaje de error.
     * @param message Recibe por parametro una cadena como mensaje.
     */
    public void showMessageErr(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Metodo que permite mostrar un mensaje.
     * @param message Recibe por parametro una cadena como mensaje.
     */
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public void showMessageWarning(String message) {
        JOptionPane.showMessageDialog(null, message, "Advertencia", JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Metodo que permite leer una cadena.
     * @param message Recibe por parametro una cadena como mensaje.
     * @return Devuelve una cadena ingresada por Scanner.
     */
    public String readString(String message, String title) {
        String input = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
        return input;
    }

    /**
     * Metodo que permite leer un entero.
     * @param message Recibe por parametro una cadena como mensaje.
     * @return Devuelve un entero ingresado por Scanner.
     */
    public int readInt(String message, String title) {
        int input = Integer.parseInt(JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE));
        return input;
    }

    public double readDouble(String message, String title) {
        double inputDouble = Double.parseDouble(JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE));
        return inputDouble;
    }

    /**
     * Metodo que permite leer un byte.
     * @param message Recibe por parametro una cadena como mensaje.
     * @return Devuelve un byte ingresado por Scanner.
     */
    public byte readByte(String message, String title) {
        byte inputByte = Byte.parseByte(JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE));
        return inputByte;
    }

    /**
     * Metodo que muestra un mensaje de confirmacion
     * @param message Recibe por parametro una cadena como mensaje
     * @param title Titulo
     * @return Devuelve un int ingresado por scanner
     */
    public int confirmDialog(String message, String title) {
        int conf = JOptionPane.showConfirmDialog(null, message, title,JOptionPane.YES_NO_CANCEL_OPTION ,JOptionPane.QUESTION_MESSAGE);
        return conf;
    }

    public String selection(String massage, String ... options) {
        Object selec = JOptionPane.showInputDialog(null, massage, "", JOptionPane.QUESTION_MESSAGE, null, options, null);
        return selec.toString();
    }

    /**
     * Metodo que permite selccionar una opción.
     * @return Devuelve una cadena indecando la opcion seleccionada.
     */
    public int menuCheckBook0() {
        int optionCheck = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccion\n" +
                "[1] Registrar vehiculo\n" +
                "[2] Registrar Conductor\n"+
                "[3] Registrar Destino", "Menu Registro", JOptionPane.QUESTION_MESSAGE));

        if ( optionCheck < 1 || optionCheck > 3 )
            showMessageErr("Digito invalido");
        return optionCheck;
    }

    /**
     * Metodo que permite selccionar una opción.
     * @return Devuelve una cadena indecando la opcion seleccionada.
     */
    public int menuCheckBook() {
        int optionCheck = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccion\n" +
                "[1] Datos Vehiculo\n" +
                "[2] Datos conductores"+
                "[3] Destino mas popular", "Menu Datos", JOptionPane.QUESTION_MESSAGE));

        if ( optionCheck < 1 || optionCheck > 3 )
            showMessageErr("Digito invalido");
        return optionCheck;
    }
}