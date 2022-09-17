
package Negocio;

/**
 *
 * @author User
 */
public class ListaDoble {
      private Nodo cabecera;
    
    public ListaDoble(){
        this.cabecera = null;
        
    }
    
    public Nodo getPrimero(){
        return cabecera;
    }
    
    public void setPrimero(Nodo primero){
        this.cabecera = primero;
    }
    
    public ListaDoble insertarCabeza(Pelicula entrada){
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.setNodoProximo(cabecera);
        if(this.cabecera != null){
            this.cabecera.setNodoAnterior(nuevo);
        }
        cabecera = nuevo;
        return this;
    }
    
    public void visualizarLista(){
        Nodo n;
        int k = 0;
        n = cabecera;
        
        while(n != null){
            System.out.print(n.getPelicula().toString()+ " ");
            //System.out.println();
            n = n.getNodoProximo();
            k++;
            System.out.print((k%15 != 0 ? "":"\n"));
        }
        System.out.println();
    }
    
    public void eliminar(Pelicula dato){
        Nodo actual = this.cabecera;
        boolean encontrado = false;
        while((actual != null) && (!encontrado))
        {
            encontrado = (actual.getPelicula() == dato );
            if(!encontrado)
                actual = actual.getNodoProximo();
        }
        
            if(actual != null)
            {
                if(actual == cabecera)
                {
                    cabecera = actual.getNodoProximo();
                    if(actual.getNodoProximo() != null)
                        actual.getNodoProximo().setNodoAnterior(null);
                }
                    else if(actual.getNodoProximo() != null)
                    {
                        actual.getNodoAnterior().setNodoProximo(actual.getNodoProximo());
                        actual.getNodoProximo().setNodoAnterior( actual.getNodoAnterior());
                    }
                    
                    else
                        actual.getNodoAnterior().setNodoProximo(null);
                    actual = null;
                }
            }
    
    public void añadirElementosMatriz(String [][] matriz , ListaDoble listapelicula){
        Pelicula peliculaMatriz;
        
        for(int i = 0; i<matriz.length; i++){
            String id = matriz[i][0];
            String nombre = matriz[i][1];
            String anio = matriz[i][2];
            String calificacion = matriz[i][3];
            String genero = matriz[i][4];
            String estado = matriz[i][5];
            peliculaMatriz = new Pelicula(Integer.parseInt(id), nombre, Integer.parseInt(anio), Double.parseDouble(calificacion), genero, estado);
            listapelicula.insertarCabeza(peliculaMatriz);
            
        }
        
        
        
    }
    
}
