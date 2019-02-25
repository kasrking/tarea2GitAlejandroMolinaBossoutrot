/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2gitalejandromolinabossoutrot;

/**
 *
 * @author kasrking
 */
public class Jugador {
    private String nombre;
    private int votos;
    private int id; 
    
    public Jugador(String nombre,int votos, int id){
        this.nombre =nombre;
        this.votos =votos;
        this.id =id;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getVotos(){
        return this.votos;
    }

    public void setVotos(int votos){
        this.votos = votos;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }
    
    @Override
    public String toString(){
    
        return "Jugador{"+"nombre = "+nombre+", votos = "+votos+", id = "+id+"}";
    }
}

