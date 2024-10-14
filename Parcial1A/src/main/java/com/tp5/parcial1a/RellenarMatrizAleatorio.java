/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp5.parcial1a;

public class RellenarMatrizAleatorio {
    public int[][] rellenar(int[][] matriz){
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                if(matriz[i][j]==0){
                    matriz[i][j]=(int) (Math.random()*88)+11;
                }
            }
        }
        return matriz;
    }
}
