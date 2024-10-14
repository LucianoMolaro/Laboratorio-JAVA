/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp5.parcial1a;

/**
 *
 * @author Flia. Molaro
 */
public class MostrarMatrices {
    public void mostrarMatriz(int[][] matriz){
        for(int i=0; i<matriz.length;i++){
            System.out.println("");
            for(int j=0; j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
        }
    }
}
