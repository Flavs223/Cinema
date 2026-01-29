/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculas_final;

/**
 *
 * @author fayit
 */

/// cualquier otra clase puede verla porque usar PUBLIC
/// abstract: principio de abstracción, sirve como molde o concepto, pero no como un objeto real
//public abstract class Clientes {

public class Cliente {
    /// Encapsulamiento: Se emplea private para que nadie pueda modificar los datos directamente
    /*
    * Uso de final
        Inmutable: El cliente no puede cambiar los datos de compra una vez efecutada
    * Datos fijos de la compra.
    * Se marcan como final porque no deben cambiar
    * después de crear el objeto Cliente.
    */
    
    /**
    * Nombre del cliente.
    * Es final porque representa la compra ya confirmada
    * y no debe modificarse después.
    */
    
    /**
    * Película seleccionada en la compra.
    */
    private final String nombre,pelicula;
    
    /**
    * Número de boletos comprados.
    */
    private final int boletos;
    private final Sala sala;
    private final TipoAsiento tipoAsiento; //Para  mi sala VIP

    ///Constructor por defecto
    // Se ejecuta si creas un cliente sin pasarle datos.
    // Sirve para inicializar variables y evitar que el programa truene (NullPointer).
    /**
 * Crea un cliente con su compra de boletos.
 *
 * @param nombre   Nombre del cliente
 * @param pelicula Película seleccionada
 * @param boletos  Cantidad de boletos
 * @param sala     Sala elegida
 */
    public Cliente(String nombre, String pelicula, int boletos, Sala sala, TipoAsiento tipoAsiento) {
        this.nombre=nombre;
        this.pelicula=pelicula;
        this.boletos = boletos;
        this.sala=sala;
        this.tipoAsiento = tipoAsiento;
    }
    
    public double total(){
        return sala.precioTotal(boletos);
    }
    
    public Sala getSala(){
        return sala;
    }
    
    public int getBoletos(){
        return boletos;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getPelicula(){
        return pelicula;
    }
    
    public TipoAsiento getTipoAsiento() {
        return tipoAsiento;
    }
    
    @Override
    public String toString() {
        return "***************\n"
            + "Nombre: " + nombre + "\n"
            + "Película: " + pelicula + "\n"
            + "Boletos: " + boletos + "\n"
                // Verifica si el asiento no es nulo para agregarlo al reporte, si es nulo concatena un vacío
                // " ? " Es un "entonces" haz esto
                // " : " (de lo contrario,  un else vaya)
                // (tipoAsiento != null) Es mi condicional
            + (tipoAsiento != null ? "Tipo de asiento: " + tipoAsiento + "\n" : "")
            + sala.detallesExtra()
            + "TOTAL: $" + String.format("%.2f", total());
    };
}
    
    

