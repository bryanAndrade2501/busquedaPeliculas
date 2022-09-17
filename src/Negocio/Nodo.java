/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author User
 */
public class Nodo {
    
    private Pelicula pelicula;
    private Nodo nodoProximo;
    private Nodo nodoAnterior;

    public Nodo() {
    }

    public Nodo(Pelicula pelicula) {
        this.pelicula = pelicula;
        this.nodoProximo = null;  
        this.nodoAnterior = null;
    }
    
    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Nodo getNodoProximo() {
        return nodoProximo;
    }

    public void setNodoProximo(Nodo nodoProximo) {
        this.nodoProximo = nodoProximo;
    }

    public Nodo getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(Nodo nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
    
}
