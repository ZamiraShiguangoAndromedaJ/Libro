/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zamira.estudiante.shiguangozamira_pulapaanthony;

import zamira.estudiante.shiguangozamira_pulapaanthony.Clases.Cliente;
import zamira.estudiante.shiguangozamira_pulapaanthony.Clases.Compras;
import zamira.estudiante.shiguangozamira_pulapaanthony.Clases.Gestionlibro;
import zamira.estudiante.shiguangozamira_pulapaanthony.Clases.TipoGenero;

/**
 *
 * @author user
 */
public class ShiguangoZamira_PulapaAnthony {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
        
        Cliente cliente = new Cliente("Anita Suares", 123456789-7);
        Cliente cliente2 = new Cliente("Juli Grefa", 1342568950-7);
        
       
        
        
        Gestionlibro Peliculo = new Gestionlibro("pirata del carive","Joinider",8.75, TipoGenero.FICCION);
        Gestionlibro pelicula2 = new Gestionlibro("pirata del carive","Joinider",22.75, TipoGenero.NOFICCION);
        
        Compras compra = new Compras();
        
        compra.mostrarDetallesLibro(Peliculo);
        compra.mostrarDetallesLibro(pelicula2);
        
        compra.mostarClientesLibros(cliente, Peliculo);
        compra.mostarClientesLibros(cliente2, pelicula2);
        
      
        
        
    
    
    }
}
