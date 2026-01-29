/// 
package peliculas_final;



/// cualquier otra clase puede verla porque usar PUBLIC
/// abstract: principio de abstracción, sirve como molde o concepto, pero no como un objeto real
//public abstract class Clientes {
public class Clientes {
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
    public Clientes(String nombre, String pelicula, int boletos, Sala sala) {
        this.nombre=("Sin Nombre");
        this.pelicula=("No escogida");
        this.boletos = boletos;
        this.sala=sala;
    }
    
    public double total(){
        return sala.precioTotal(boletos);
    }
    
    @Override
    public String toString() {
        return "***************\n"
             + "Nombre: " + nombre + "\n"
             + "Película: " + pelicula + "\n"
             + "Boletos: " + boletos + "\n"
             + sala.detallesExtra()
             + "TOTAL: $" + String.format("%.2f", total());
    };
}
    
    
    /*// --- 3. CONSTRUCTOR CON PARÁMETROS (SOBRECARGA) ---
    // Este es el que más usas en Alta_Clientes.
    // Recibe los datos y los guarda en los atributos privados.
    public Clientes(String nombre, String pelicula, int boletos) {
        this.nombre = nombre;
        this.pelicula = pelicula;
        this.boletos = boletos;
    }
    
    
    // --- 4. MÉTODOS DE ACCESO (GETTERS Y SETTERS) ---
    // Como los datos son privados, usamos estos "puentes" públicos.
    //Obtiene nombre
    public String getNombre() {
        return nombre;
    }
    
    //Lo cambia
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getBoletos() {
        return boletos;
    }

    public void setBoletos(int boletos) {
        this.boletos = boletos;
    }
    
    public abstract double precioTotalBoletos();
    
    //public String toString(){
    //return "Nombre: "+ nombre+"\nNúmero de boletos "+boletos+"\nPelícula: "+pelicula;
    //}
    //Override revisa que el método exista con el Padre y la clase hija (que existe y este bien escrita)
    // Si no lo está entonces manda un error.
    
    @Override
    public String toString() {
        return """
               Nombre: %s
               Película: %s
               Boletos: %d
               %s
               TOTAL: $%.2f
               """.formatted(nombre, pelicula, boletos, sala, total());
    }
    
    
}
*/
