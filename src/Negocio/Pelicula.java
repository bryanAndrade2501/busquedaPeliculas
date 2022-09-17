
package Negocio;

/**
 *
 * @author User
 */
public class Pelicula {
    
    private int id_peli;
    private String nombre;
    private int año;
    private double calificacion;
    private String genero;
    private String estado;

    public Pelicula() {
    }

    public Pelicula(int id_peli, String nombre, int año, double calificacion, String genero, String estado) {
        this.id_peli = id_peli;
        this.nombre = nombre;
        this.año = año;
        this.calificacion = calificacion;
        this.genero = genero;
        this.estado = estado;
    }

    public int getId_peli() {
        return id_peli;
    }

    public void setId_peli(int id_peli) {
        this.id_peli = id_peli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pelicula: "+
                "\nNombre: " + nombre +
                "\nID: " + id_peli +
                "\nAño: " + año +
                "\nCalificacion" + calificacion +
                "\nGenero: " + genero +
                "\nEstado: " + estado;
    }
    
    
    
}
