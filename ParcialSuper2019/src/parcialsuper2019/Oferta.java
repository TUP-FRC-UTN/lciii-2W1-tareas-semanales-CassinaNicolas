package parcialsuper2019;

import java.time.LocalDate;

public class Oferta {

    double precioRegular;
    double precioOferta;
    int vigencia;
    double stock;
    Articulo[] articulos;

    public Oferta(double precioRegular, double precioOferta, int vigencia, double stock,int cantArticulos) {
        this.precioRegular = precioRegular;
        this.precioOferta = precioOferta;
        this.vigencia = vigencia;
        this.stock = stock;
        this.articulos = new Articulo[cantArticulos];
    }

    public double getPrecioRegular() {
        return precioRegular;
    }

    public void setPrecioRegular(double precioRegular) {
        this.precioRegular = precioRegular;
    }
    
    public double getPrecioOferta(){
        return precioOferta;
    }
    
    public void setPrecioOferta(){
        this.precioOferta = precioOferta;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }
    
    public void agregarArticulo(Articulo a)
    {
        for (int i = 0; i < articulos.length; i++) {
            if(articulos[i] == null)
            {
                articulos[i] = a;
            }
            
        }
    }
    
    public int RecArt()
            
    {
        int resultado = 0; 
        for (int i = 0; i < articulos.length; i++) {
            int numArt = articulos[i].getNumero();
            resultado += numArt;
            
        }
        return resultado;
    }
    
    
    

}
