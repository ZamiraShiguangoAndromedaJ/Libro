/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zamira.estudiante.shiguangozamira_pulapaanthony.Clases;

/**
 *
 * @author user
 */
public class Compras {
    
   private double Iva = 0.12;
   
   public void mostrarDetallesLibro(Gestionlibro libro){
       
       double precioConIva=libro.getPrecio()+(libro.getPrecio()*Iva);
       System.out.println("Titulo: "+ libro.getTitulo());
       System.out.println("Tipo Genero:" + libro.getTipoGenero());
       System.out.println("Presio (sin Iva):$"+ libro.getPrecio() );
       System.out.println("Presio(con Iva):$"+ precioConIva);
   }
   
   
   public void mostarClientesLibros(Cliente clientes, Gestionlibro libro){
       double precioConIva= libro.getPrecio()+(libro.getPrecio()*Iva);
       System.out.println("Cliente"+ clientes.getNombre());
       System.out.println("TituloAdquerido"+ libro.getTitulo());
       System.out.println("Tipo Genero:"+libro.getTipoGenero());
       System.out.println("Presio(Sin Iva):$ "+libro.getTipoGenero());
       System.out.println("Presio (con Iva):$"+ precioConIva);
   }
   
   
   
   
    
    
    
}
