/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zamira.estudiante.shiguangozamira_pulapaanthony.Clases;

/**
 *
 * @author user
 */
public class Gestionlibro {
    
   private String titulo;
   private String autor;
   private double precio;
   Private TipoGenero tipoGenero;

    public Gestionlibro(String titulo, String autor, double precio, TipoGenero tipoGenero ) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.tipoGenero = tipoGenero;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public TipoGenero getTipoGenero() {
        return tipoGenero;
    }
   
   

   
   
   
    
}
