package parcialsuper2019;

import java.time.LocalDate;
import java.util.Scanner;

public class ParcialSuper2019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos productos desea cargar?");
        int cantidad = sc.nextInt();
        System.out.println("Ingresar el numero de día que es hoy");
        int dia = sc.nextInt();
        Folleto f = new Folleto(dia, cantidad);
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el numero de producto");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese nombre del producto");
            String nombre = sc.nextLine();
            System.out.println("Ingrese precio regular del producto");
            double precioRegular = sc.nextDouble();
            System.out.println("Ingrese precio de oferta");
            double precioOferta = sc.nextDouble();
            System.out.println("Ingrese cantidad de días en vigencia");
            int vigencia = sc.nextInt();
            System.out.println("Ingrese stock del producto");
            double stock = sc.nextDouble();
            Articulo a = new Articulo(numero, nombre, precioRegular);
            Oferta o = new Oferta(precioRegular, precioOferta, vigencia, stock, cantidad);
            o.agregarArticulo(a);
            f.agregarOferta(o);
        }

        while (true) {
            menu();
            System.out.println("Ingrese la opción que desea");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La cantidad de articulos ofertados por mas de 5 dias es de: " + f.Mas5Dias());
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("El total de unidades a la venta es de: " + f.sumStock());
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("La cantidad de articulos ofrecidos con un descuento superior a $20 es de: " + f.artDescMas20());
                    System.out.println("");
                    break;
                    
                case 4:
                    System.out.println("Ingresar numero de articulo");
                    int compArt = sc.nextInt();
                    System.out.println("El total a recaudar del art " + compArt + " es de $" + f.RecaudacionBusq(compArt));
                    break;

                case 5:
                    System.out.println("Saliendo");
                    System.exit(0);
                    break;
            }
        }

    }

    public static void menu() {
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("1. Cantidad de articulos ofertados por mas de 5 dias");
        System.out.println("2. Total de unidades que hay a la venta");
        System.out.println("3. Cantidad de articulos ofrecidos con un descuento superior a $20");
        System.out.println("4. Total a recaudar por un artículo en particular indicando su codigo");
        System.out.println("5. Salir");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("");
    }

}
