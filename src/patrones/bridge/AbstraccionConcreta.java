/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.bridge;

class AbstraccionConcreta implements Abstraccion{
    private Implementador implementador;
    public AbstraccionConcreta(Implementador implementador){
        this.implementador = implementador;
    }
    @Override
    public void operacion(){
        implementador.operacion();
    }
}