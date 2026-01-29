/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculas_final;

/**
 *
 * @author fayit
 * Esta clase es para guardar los clientes, validar capacidad, registrar ventas
 * Posibilidad para escalar a una BD
 * 
 */

public class Cine_service_registro {
    
    //Declaro las variables
    // Es privado ya que solo el sistema sabe cuantos asientos hay en toda la sala
    // Y se usa final para que dicho valor no se modifique después de asignarlo, 
    // En otras palabras, que mi capacidad siempre sean 140 asientos.
    private static final int MAX_CLIENTES = 140;
    //Creo un contandor de clientes
    public static int contadorClientes = 0;
    // Un arreglo para ir almacenando los clientes registrados
    // Cliente[] indico que se crea un array en la clase Clientes, y el nombre del arreglo es "clientes"
    // Reserva espacio de memoria para n clientes
    //Regla: CLASES REPRESENTA UN OBJETO, variables /REPRESENTAN LO QUE CONTIENE/
    public static Cliente[] clientes = new Cliente[MAX_CLIENTES];
    
    //Cliente es la clase (Entidad del sistema)
    //cliente (en minuscula) es una variable local, hace una instancia (objeto) de la clase Cliente
    // Solo funciona para el método y nada más, en este caso para registrarCliente
    public EstadoRegistro registrarCliente(Cliente cliente){
        //Es decir si el registro del cliente esta vacío
        if(cliente == null){
            return EstadoRegistro.DATOS_INCOMPLETOS;
        }
        
        Sala sala= cliente.getSala();
        
            if(sala instanceof SalaVIP){
            SalaVIP vip = (SalaVIP) sala;
                if(!vip.hayDisponibilidad(cliente.getTipoAsiento(), cliente.getBoletos())){
                    return EstadoRegistro.SALA_LLENA;
                }
            }else{
                //Para salas que no son VIP
                if(!sala.hayDisponibilidad(cliente.getBoletos())){
                    return EstadoRegistro.SALA_LLENA;
                }   
            }
                

            //Control de error por capacidad
            //Pongo un tope, porque no pueden haber 141 clientes cuando tengo 140 asientos.
            if (contadorClientes >= MAX_CLIENTES){
                //Early return, si algo truena que lo saque de volada
                //return false;
                return EstadoRegistro.SALA_LLENA;
                //Agregar mensaje de CAPACIDAD EXCEDIDA
            }
        
        //Hace registrar un cliente en el arreglo "clientes" tomando por indice el contadorClientes
        clientes[contadorClientes] = cliente;
        //Incrementa el contador en uno
        contadorClientes++;
        return EstadoRegistro.REGISTRO_EXITOSO;
        //return true;
    }    
        //Devuelve la lista de clientes que está guardada dentro de la clase.
        //En otras palabras "Sistema, dame la lista de clientes registrados"
        //Se usará para que en la UI se refleje
        //getClientes, método que devuelve algo; es en plurar porque devuelve muchos clientes
        public Cliente[] getClientes(){
            return clientes;
        }

}
