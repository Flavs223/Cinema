
package peliculas_final;

public class SalaVIP extends Sala {

    //private String tipoAsiento;
    private int reclinableDispo;
    private int camasDispo;
    private final double IVA = 0.16;
    
    //public TipoAsiento tipoAsiento;

    public SalaVIP(int reclinables, int camas) {
        //this.tarifa = 360;
        // 50 espacios en la sala, sin especificar si son camas o reclinables
        super(50, 150); //Capacidad total, precio de la sala
        //Asigno la cantidad de cada tipo de asiento que hay en la sala
        this.reclinableDispo = 30;
        this.camasDispo = 20;
        //this.TipoAsiento = asiento;
    }
    
    @Override
    public boolean hayDisponibilidad(int boletos) {
        // Llama a hayEspacio según el tipo de asiento que tenga el cliente
        // Pero necesitamos pasarle TipoAsiento, entonces hacemos un método extra:
        throw new UnsupportedOperationException("Use hayDisponibilidad(TipoAsiento, int) para VIP");
}

    public boolean hayDisponibilidad(TipoAsiento tipo, int boletos){
        if(tipo == TipoAsiento.RECLINABLE){
            return reclinableDispo >= boletos;
        } else{
            return camasDispo >= boletos;
        }
}
    
    public boolean hayEspacio(TipoAsiento tipo, int boletos){
        //Si solicita reclinable revisa si hay disponibles para cubir los boletos
        if(tipo == TipoAsiento.RECLINABLE){
            //Termina el método: si son más asientos disponibles que boletos, o sea que sí hay para cubrir la petición
            return reclinableDispo >= boletos;
        } else{
            // Si no elige reclinable, verifica si hay camas disponibles para cubrir la petición
            return camasDispo >= boletos;
        }
    }
    
    //Esto entra cuando es pago exitoso
    public void ocuparAsientos(TipoAsiento tipo, int boletos){
        if(tipo == TipoAsiento.RECLINABLE){
            reclinableDispo -= boletos;
        } else{
            camasDispo -= boletos;
        }
        asientosOcupados +=boletos;
    }

    @Override
    public double precioTotal(int boletos) {
        return boletos * tarifa * (1 + IVA);
    }

    //Polimorfismo
    @Override
    public String detallesExtra() {
        return "Asientos VIP disponibles:\n"+
                "Reclinables:" + reclinableDispo + "\n" +
                "Camas: " + camasDispo;
    }
}
