
package parcialsuper2019;



public class Articulo {
    int numero;
    String nombre;
    double precio;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Articulo(int numero, String nombre, double precio) {
        this.numero = numero;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo{" + "numero=" + numero + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    


    
    

    

    
    
}
