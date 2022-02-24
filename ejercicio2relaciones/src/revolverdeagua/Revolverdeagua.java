/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revolverdeagua;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Revolverdeagua {
    
    private Integer posicionactual; //posicion en donde se dispara, se carga aleatoriamente
    private Integer posiciondeagua; //posicion donde esta el agua , se carga aleatoriamente

    public Revolverdeagua() {
    }

    
    public Revolverdeagua(Integer posicionactual, Integer posiciondeagua) {
        this.posicionactual = posicionactual;
        this.posiciondeagua = posiciondeagua;
    }

    public Integer getPosicionactual() {
        return posicionactual;
    }

    public void setPosicionactual(Integer posicionactual) {
        this.posicionactual = posicionactual;
    }

    public Integer getPosiciondeagua() {
        return posiciondeagua;
    }

    public void setPosiciondeagua(Integer posiciondeagua) {
        this.posiciondeagua = posiciondeagua;
    }
    
    public Revolverdeagua llenarRevolver()
    {
        Scanner leer= new Scanner(System.in);
        Random r1= new Random();
        Random r2= new Random();
        posicionactual= r1.nextInt(6);
        posiciondeagua= r2.nextInt(6);
        Revolverdeagua revolver=new Revolverdeagua(posicionactual, posiciondeagua);
        return revolver;
        
    }
    public boolean mojar()
    {
        if (posicionactual==posiciondeagua) {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void siguienteChorro()
    {
        posicionactual+=1;
        if (posicionactual>5) {
            posicionactual=0;
        }
    }

    @Override
    public String toString() {
        return "Revolverdeagua{" + "posicionactual=" + (posicionactual+1) + ", posiciondeagua=" + (posiciondeagua+1) + '}';
    }
    
}
