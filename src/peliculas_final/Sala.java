/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculas_final;

/**
 *
 * @author fayit
 */

public abstract class Sala {
    // No esta encapsulado comoo tal, sino que se asegura que no lo modifiquen externamente, solo las clases hijas pueden
    protected double tarifa;
    protected int capacidadMAX;
    protected int asientosOcupados;
    
    //Constructor
    public Sala(int capacidadMaxima, double tarifa){
        this.capacidadMAX = capacidadMaxima;
        this.tarifa = tarifa;
        this.asientosOcupados = 0;
    }
    
    //Me dice que sí hay asientos o no
    public boolean hayDisponibilidad(int boletosSolicitados){
        //Suma los asientos ya vendidos con los que se solicitan y revisa si hay cupo
        // asientosOcupados= 25
        // boletosSolicitados= 5
        // capacidadMAX=40
        // Da como resultado 30, es decir tengo aun 10 asientos libres, sí procede
        return(asientosOcupados + boletosSolicitados) <= capacidadMAX;
    }
    
    public void ocuparAsientos(int boletos){
        this.asientosOcupados += boletos;
    }
     
    public abstract double precioTotal(int boletos);
    
    public String detallesExtra() {
        return ""; // Por defecto no hay extras
    }
}

