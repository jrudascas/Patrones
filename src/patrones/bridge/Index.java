package patrones.bridge;

import java.util.ArrayList;
import java.util.List;

public class Index {
    public static void main(String[] args) {
        List<Abstraccion> abstracciones = new ArrayList<>();
        
        abstracciones.add(new AbstraccionConcreta(new ImplementacionA()));
        abstracciones.add(new AbstraccionConcreta(new ImplementacionB()));
        
        abstracciones.stream().forEach(abstraccion -> abstraccion.operacion());
    }
}
