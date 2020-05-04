
package ejercicio1Equipo;

import java.util.logging.Logger;


public class Persona {

    private final String nombre;
    private final int edad;
    
    

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int decimeEdad() {
        return edad;
    }
   
    
    
    
}
