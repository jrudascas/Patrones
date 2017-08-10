package actividad_patrones_basicos;

/**
 * Simulación de creación y eliminación de clientes
 * @author jrudasc
 */

public class Index {
   
    public static void main(String[] arg) {

        ManejadorCliente manejadorCliente = new ManejadorCliente();

        Cliente cliente1 = new Cliente("Jorge", "Rudas", 46468465, 546465);
        
        Cliente cliente2 = new Cliente("Daniela", "Castillo", 12345, 546465);
        
        manejadorCliente.guardar(cliente1);
        manejadorCliente.guardar(cliente2);
        
        //manejadorCliente.eliminar(cliente1);
    }
}
