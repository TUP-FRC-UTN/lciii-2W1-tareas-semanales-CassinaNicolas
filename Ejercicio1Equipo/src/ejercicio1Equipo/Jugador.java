
package ejercicio1Equipo;


public class Jugador {
    private String nombre;
    private int posicion;
    private int nroCamiseta;
    private int cantPartJugados;
    private int porcEstFisico;

    public Jugador(String nombre, int posicion, int nroCamiseta, int cantPartJugados, int porcEstFisico) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nroCamiseta = nroCamiseta;
        this.cantPartJugados = cantPartJugados;
        this.porcEstFisico = porcEstFisico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public int getCantPartJugados() {
        return cantPartJugados;
    }

    public void setCantPartJugados(int cantPartJugados) {
        this.cantPartJugados = cantPartJugados;
    }

    public int getPorcEstFisico() {
        return porcEstFisico;
    }

    public void setPorcEstFisico(int porcEstFisico) {
        this.porcEstFisico = porcEstFisico;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + ", nroCamiseta=" + nroCamiseta + ", cantPartJugados=" + cantPartJugados + ", porcEstFisico=" + porcEstFisico + '}';
    }
    
    
    
}
