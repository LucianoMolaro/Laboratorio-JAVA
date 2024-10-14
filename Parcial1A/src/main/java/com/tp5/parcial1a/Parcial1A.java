/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tp5.parcial1a;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Flia. Molaro
 */
public class Parcial1A {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese un numero para crear una matriz");
        int numeroDeMatriz= Integer.parseInt(sc.nextLine());
        while(true){
            if(numeroDeMatriz<3 || numeroDeMatriz>15){
                System.out.println("El numero debe ser impar entre 3 y 15");
                numeroDeMatriz=Integer.parseInt(sc.nextLine());
            }else{
                if(numeroDeMatriz%2!=0){
                    break;
                }else{
                    System.out.println("No es impar, ingrese un numero impar");
                    numeroDeMatriz=Integer.parseInt(sc.nextLine());
                }
            }
        }
        int[][] matrizNumeros = new int[numeroDeMatriz][numeroDeMatriz];
        
       
        for(int i=0; i<matrizNumeros.length;i++){
            System.out.println("Ingrese numeros para la  ultima fila de la matriz del 10 al 99");
            int numerosUltimaFila = Integer.parseInt(sc.nextLine());
            while(numerosUltimaFila<10 || numerosUltimaFila>99){
                System.out.println("El numero no esta en el rango pedido, por favor ingrese otro numero");
                numerosUltimaFila=Integer.parseInt(sc.nextLine());
            }
            matrizNumeros[numeroDeMatriz-1][i]+=numerosUltimaFila;
        }
        RellenarMatrizAleatorio rm = new RellenarMatrizAleatorio();
        matrizNumeros = rm.rellenar(matrizNumeros);
        MostrarMatrices mm = new MostrarMatrices();
        mm.mostrarMatriz(matrizNumeros);
        
        obtenerValoresCentrales vc = new obtenerValoresCentrales();
        System.out.println(Arrays.toString(vc.valoresCentrales(matrizNumeros)));
        
        
    }
}
