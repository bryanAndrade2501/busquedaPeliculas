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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] matriz = new String[10][6];
        
        matriz[0][0] = "1";
        matriz[1][0] = "2";
        matriz[2][0] = "3";
        matriz[3][0] = "4";
        matriz[4][0] = "5";
        matriz[5][0] = "6";
        matriz[6][0] = "7";
        matriz[7][0] = "8";
        matriz[8][0] = "9";
        matriz[9][0] = "10";
        
        matriz[0][1] = "Peli 1";
        matriz[1][1] = "Peli 2";
        matriz[2][1] = "Peli 3";
        matriz[3][1] = "Peli 4";
        matriz[4][1] = "Peli 5";
        matriz[5][1] = "Peli 6";
        matriz[6][1] = "Peli 7";
        matriz[7][1] = "Peli 8";
        matriz[8][1] = "Peli 9";
        matriz[9][1] = "Peli 10";
        
        matriz[0][2] = "20";
        matriz[1][2] = "12";
        matriz[2][2] = "34";
        matriz[3][2] = "45";
        matriz[4][2] = "54";
        matriz[5][2] = "67";
        matriz[6][2] = "65";
        matriz[7][2] = "123";
        matriz[8][2] = "123";
        matriz[9][2] = "12";
        
        matriz[0][3] = "20";
        matriz[1][3] = "12";
        matriz[2][3] = "32";
        matriz[3][3] = "45";
        matriz[4][3] = "54";
        matriz[5][3] = "67";
        matriz[6][3] = "65";
        matriz[7][3] = "123";
        matriz[8][3] = "123";
        matriz[9][3] = "12";
        
        matriz[0][4] = "1";
        matriz[1][4] = "2";
        matriz[2][4] = "3";
        matriz[3][4] = "4";
        matriz[4][4] = "5";
        matriz[5][4] = "6";
        matriz[6][4] = "7";
        matriz[7][4] = "8";
        matriz[8][4] = "9";
        matriz[9][4] = "10";
        
        matriz[0][5] = "Disponible";
        matriz[1][5] = "Disponible";
        matriz[2][5] = "Disponible";
        matriz[3][5] = "Disponible";
        matriz[4][5] = "Disponible";
        matriz[5][5] = "Disponible";
        matriz[6][5] = "Disponible";
        matriz[7][5] = "Disponible";
        matriz[8][5] = "Disponible";
        matriz[9][5] = "Disponible";
        
        ListaDoble lista = new ListaDoble();
        lista.añadirElementosMatriz(matriz, lista);
        lista.visualizarLista();
        lista.getPrimero();
    }
    
}
