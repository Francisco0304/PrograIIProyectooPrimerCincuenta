package controller;
//import model.*;
import view.View;


public class Control {
    private View view;

    private int contAcc;

    public Control() {
        view = new View();

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
                view.showMessageErr("Accihon invhalida");
            }
            switch ( option ) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    try {
                        optionCheck = view.menuCheckBook();
                    } catch (Exception e){
                        view.showMessageErr("No es vhalido");
                    }
                    if (optionCheck == 1){
                        //addCheckBook();
                        optionCheck = 0;
                    }else{
                        //findChecks();
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
}