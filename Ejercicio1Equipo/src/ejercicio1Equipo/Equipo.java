/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1Equipo;

import java.util.Scanner;

/**
 *
 * @author herma
 */
public class Equipo {

    
    public static void main(String[] args) {
        Jugador[] equipo;
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese cantidad de jugadores: ");
        int cantidad = sc.nextInt();
        
        equipo = new Jugador[cantidad];
    
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese nombre del jugador " + i + ":");
            sc.nextLine();
            String nombre = sc.nextLine();
            System.out.print("Ingrese posicion del jugador " + i + ":");
            int posicion = sc.nextInt();
            
            System.out.print("Ingrese nroCamiseta del jugador " + i + ":");
            int nroCamiseta = sc.nextInt();
            
            System.out.print("Ingrese cant part jugados del jugador " + i + ":");
            int cantPartJugados = sc.nextInt();
            
            System.out.print("Ingrese porc estado fisico del jugador " + i + ":");
            int porcEstadoFisico = sc.nextInt();
            
            equipo[i] = new Jugador(nombre, posicion, nroCamiseta, cantPartJugados, porcEstadoFisico);
            
        }
        
        for (int i = 0; i < equipo.length; i++) {
            System.out.println(equipo[i]);
            
        }
        
        int cantMenos10Partidos = 0;
        for (int i = 0; i < equipo.length; i++) {
            if(equipo[i].getCantPartJugados()<10)
            {
                cantMenos10Partidos++;
            }
            
        }
        
        System.out.println("Jugadores con menos de 10 partidos jugados: " + cantMenos10Partidos);
        
        Jugador jugadorConMasPartJugados = equipo[0];
        
        for (int i = 0; i < equipo.length; i++) {
            if(equipo[i].getCantPartJugados()>jugadorConMasPartJugados.getCantPartJugados())
            {
                jugadorConMasPartJugados = equipo[i];
                        
            }
            
        }
        int acumPorcEstFis = 0, contEstFis = 0;
        for (int i = 0; i < equipo.length; i++) {
            acumPorcEstFis += equipo[i].getPorcEstFisico();
            contEstFis++;
        }
        double promEstFis = (double)acumPorcEstFis / contEstFis;
        System.out.println("El promedio de estado físico de todo el equipo es de: " + promEstFis + "%");
        
        System.out.println("El jugador con mas partidos jugados es: " + jugadorConMasPartJugados);
        System.out.println("Ingrese nro Camiseta");
        int nroCamiseta = sc.nextInt();
        Jugador j = equipo[0];
        for (int i = 0; i < equipo.length; i++) {
            if(equipo[i].getNroCamiseta() == nroCamiseta)
            {
                j = equipo[i];
                break;
            }
            
        }
        
        System.out.println("Estado fisico de ese jugador es: " + j.getPorcEstFisico());
        
        int acumPos1 = 0;
        int acumPos2 = 0;
        int acumPos3 = 0;
        int acumPos4 = 0;
        for (int i = 0; i < equipo.length; i++) {
            switch(equipo[i].getPosicion())
            {
                case 1:
                    acumPos1++;
                    break;
                
                case 2:
                    acumPos2++;
                    break;
                    
                case 3:
                    acumPos3++;
                    break;
                    
                case 4:
                    acumPos4++;
                    break;
            }
        }
        double promPos1 = (double)acumPos1 / cantidad;
        double promPos2 = (double)acumPos2 / cantidad;
        double promPos3 = (double)acumPos3 / cantidad;
        double promPos4 = (double)acumPos4 / cantidad;
        
        System.out.println("El promedio de jugadores en la posicion 1 es de: " + promPos1 + "jugadores");
        System.out.println("El promedio de jugadores en la posicion 2 es de: " + promPos2 + "jugadores");
        System.out.println("El promedio de jugadores en la posicion 3 es de: " + promPos3 + "jugadores");
        System.out.println("El promedio de jugadores en la posicion 4 es de: " + promPos4 + "jugadores");
    }
    
}
