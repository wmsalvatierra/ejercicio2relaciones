/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revolverdeagua;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolverdeagua revolver;

    

    public Juego() {
        jugadores=new ArrayList();
        revolver= new Revolverdeagua();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolverdeagua getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolverdeagua revolver) {
        this.revolver = revolver;
    }
    
    public void llenarJuego()
    {
        System.out.println("Ingrese el numero de jugadores");
        Scanner leer= new Scanner(System.in);
        int n= leer.nextInt();
        if(n>6)
        {
            n=6;
        }
       
        for (int i = 0; i < n; i++) {
            jugadores.add(new Jugador(i+1));
        }
        revolver= revolver.llenarRevolver();
        ronda();
    }
    public void ronda()
    {
        int cont=0;
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("Preciona una tecla");
            Scanner leer= new Scanner(System.in);
            String p= leer.next();
            if (jugadores.get(i).disparo(revolver).equals("Mojado")) {
                System.out.println(revolver.toString());
                System.out.println(jugadores.get(i).getNombre()+" Estas mojado, PERDISTE!");
                i=jugadores.size();
                cont=1;
            }
            else
            {
                System.out.println(jugadores.get(i).getNombre()+" "+jugadores.get(i).getMojado());
                System.out.println(revolver.toString());
                revolver.siguienteChorro();
            }
        }
        if (cont==0) {
            ronda();
        } 
    }
    public void mostrar()
    {
        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore.toString()+"\n");
        }
    }
    
}
