package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Tablet extends Interaction {
    public Tablet(int idDevice, String typeDevice, String mail, String nameDevice, boolean visible, boolean status) {
        super(idDevice, typeDevice, mail, nameDevice, visible, status);
    }

    @Override
    public void NewDevice() {
        super.NewDevice();
    }

    @Override
    public void SearchDevice(String typeDevice, String typeAction) {
        super.SearchDevice(typeDevice, typeAction);
    }

    public void NewTablet() {
        

        /*System.out.println("\n Nota: El dispositivo sera encendido por defecto.");
        System.out.println("-------------------------------------------------");*/


    }
}
