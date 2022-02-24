/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revolverdeagua;

/**
 *
 * @author Usuario
 */
public class Jugador {
    private Integer id; //numero que va despues del 
    private String nombre;
    private String mojado;//indica si el jugador esta mojado o no 

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMojado() {
        return mojado;
    }

    public void setMojado(String mojado) {
        this.mojado = mojado;
    }

    public Jugador(Integer id) {
        this.id = id;
        this.nombre = "Jugador: "+id;
        mojado="Salvado";
    }

  

    public Jugador() {
    }
    public String disparo(Revolverdeagua r)
    {
        if (r.mojar()) {
            mojado= "Mojado";
        }
        else
        {
            mojado="Salvado";
        }
        return mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
}
