/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp5.parcial1a;

/**
 *
 * @author Flia. Molaro
 */
public class obtenerValoresCentrales {
    public int[] valoresCentrales(int[][] matriz){
        int numMedio=matriz.length/2;
        
        int[] valores = new int[9];
        valores[0]= matriz[numMedio-1][numMedio-1];
        valores[1]= matriz[numMedio-1][numMedio];
        valores[2]= matriz[numMedio-1][numMedio+1];
        valores[3]= matriz[numMedio][numMedio-1];
        valores[4]= matriz[numMedio][numMedio];
        valores[5]= matriz[numMedio][numMedio+1];
        valores[6]= matriz[numMedio+1][numMedio-1];
        valores[7]= matriz[numMedio+1][numMedio];
        valores[8]= matriz[numMedio+1][numMedio+1];
        
        return valores;
    }
}
