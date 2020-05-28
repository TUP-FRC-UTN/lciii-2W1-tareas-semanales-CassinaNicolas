package parcialsuper2019;

import java.time.LocalDate;

public class Folleto {

    int fechaInicio;
    Oferta[] ofertas;

    public Folleto(int fechaInicio, int cantOfertas) {
        this.fechaInicio = fechaInicio;
        this.ofertas = new Oferta[cantOfertas];
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Oferta[] getOfertas() {
        return ofertas;
    }

    public void setOfertas(Oferta[] ofertas) {
        this.ofertas = ofertas;
    }

    public void agregarOferta(Oferta o) {
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] == null) {
                ofertas[i] = o;
            }

        }
    }

    public int Mas5Dias() {
        int contador = 0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] != null && ofertas[i].getVigencia() > 5) {
                contador++;
            }

        }
        return contador;
    }
    
    public double sumStock()
    {
        double acum = 0;
        for (int i = 0; i < ofertas.length; i++) {
            if(ofertas[i] != null)
            {
                acum += ofertas[i].getStock();
            }
            
        }
        return acum;
    }
    
    public double artDescMas20()
    {
        int cont = 0;
        for (int i = 0; i < ofertas.length; i++) {
            if(ofertas[i] != null && (ofertas[i].getPrecioRegular()-ofertas[i].getPrecioOferta() > 20)){
                cont++;
            }
            
        }
        return cont;
    }
    
    public double RecaudacionBusq(int numero)
    {
        double resultado = 0;
        for (int i = 0; i < ofertas.length; i++) {
            if(ofertas[i] != null && ofertas[i].RecArt() == numero){
                resultado += ofertas[i].getPrecioOferta()*ofertas[i].getStock();
            } 
        }
        return resultado;
    }
    
    

}
