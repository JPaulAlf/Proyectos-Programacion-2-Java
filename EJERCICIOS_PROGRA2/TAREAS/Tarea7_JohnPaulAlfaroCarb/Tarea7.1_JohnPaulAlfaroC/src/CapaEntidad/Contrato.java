/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaEntidad;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author johnpaul
 */
public class Contrato {
    private static int numContrato=0;
    private ArrayList<Pintor>arrayPintores;
    
    public Contrato(){
        arrayPintores= new ArrayList();
        numContrato++;
    }
    
public void addPintor(Pintor pintor){
    arrayPintores.add(pintor);
}
    
    @Override
    public String toString() {
        String hilera="";
        hilera+="Numero de Contrato: "+numContrato+"\n";
        hilera+="Lista de pintores: \n\n";
        for (Pintor arrayPintore : arrayPintores) {
            hilera+= arrayPintore.toString()+"\n";
        }
        return hilera;
    }
    
    
    
    
}// fin de la clase 
