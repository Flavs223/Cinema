
package peliculas_final;

import javax.swing.JTextField;


//Esto para el calculo de 
public class Sala4DX extends Sala {
    //private String lentes;
    private Lentes_size lentes_size;
    private final double IVA = 0.16;

    public Sala4DX(int capacidad, Lentes_size lentes_size) {
        super(120,60);
        //tarifa = 580;
        this.lentes_size = lentes_size;
    }
    
    //Con el Override se asegura que exista en el Padre, si no marca un error
    @Override
    public double precioTotal(int boletos) {
        return boletos * tarifa * (1 + IVA);
    }
    
    @Override
    public String detallesExtra() {
        return "Tamaño de lentes: " + lentes_size + "\n";
    }
    
}
