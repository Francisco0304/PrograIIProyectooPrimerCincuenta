package controller;

import exceptions.ValueException;
import model.Driver;

public class Validations {

    public void valAge(byte age ) throws ValueException {
        if ( age < 17 ) {
            throw new ValueException("La edad del conductor debe ser mayor a los 18 años ");
        }
    }

}