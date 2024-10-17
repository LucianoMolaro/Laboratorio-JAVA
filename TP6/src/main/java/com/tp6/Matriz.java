/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp6;

import java.util.ArrayList;

public class Matriz {
    ArrayList<Celda> matrizCuadrada = new ArrayList<>();
    
    public void agregarCelda(int fila, int columna, String valor){
        Celda cn = new Celda(fila, columna, valor);
        matrizCuadrada.add(cn);
    }
    public void mostrarMatriz(){
        for(Celda a : matrizCuadrada){
            System.out.println(a);
        }
    }
    public String obtenerValor(int fila, int columna) {
        for (Celda celda : matrizCuadrada) {
            if (celda.getFila() == fila && celda.getColumna() == columna) {
                return celda.getValor();
            }
        }
        return "La fila y columna indicada no ha sido asignada";
    }
}
