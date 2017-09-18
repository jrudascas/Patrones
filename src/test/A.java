/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.List;

/**
 *
 * @author jrudascas
 */

class OperacionNomina{
    
}

public class A {
    
    
    public String generarContenido(List<OperacionNomina> l){
        String contenido = "";
        
        for (OperacionNomina operacion: l){
            contenido = contenido + operacion + "\n";
        }
        
        return contenido;
    }
    
    
    
}
