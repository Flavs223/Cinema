
package peliculas_final;

public class SalaNormal extends Sala {

    public SalaNormal() {
        // 100 asientos, $50 por boleto
        // En clase Padre Sala tengo public Sala(int capacidadMaxima, double tarifa)
        // Super: Llama a lo que está en la clase Padre (superclase)
        super(100,50); 
    }

    @Override
    public double precioTotal(int boletos) {
        return boletos * tarifa;
    }
}

///////////////////
///
/*public class SalaNormal extends Clientes {
    private String discapacidad;
    private final double tarifa=130;
    public SalaNormal() {

    }
    public SalaNormal(String nombre, String pelicula, int boletos,String discapacidad) {
        super(nombre, pelicula, boletos);
        this.discapacidad = discapacidad;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    
    public double precioTotalBoletos() {
       return super.getBoletos()*tarifa;
    }
    public String toString(){
	 return "***************\nSala Normal\n "+super.toString()+"\nTipo Asiento: "+discapacidad+"\nPrecio total: $"+precioTotalBoletos();
    }
    
}
*/