/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tp6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Flia. Molaro
 */
public class TP6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ejercicios=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un ejercicio a realizar"));
        while(Ejercicios<1 || Ejercicios>6){
            Ejercicios=Integer.parseInt(JOptionPane.showInputDialog(null, "El ejercicios  es incorrecto, ingrese un ejerccicio del 1 al 6"));
        }
        
//---------------------------------------------------------EJERCICIO 1---------------------------------------------------------------------//
        if(Ejercicios==1){
            ArrayList<Integer> numeros = new ArrayList<>();
            System.out.println("Ingrese numeros, esto se detendra cuando ingrese un numero menor a 0");
            while (true) {
                int num = sc.nextInt();
                if (num < 0) {
                    break;
                }
                numeros.add(num);
            }
            for (int n : numeros){
                System.out.print(n + " ");
            }
        }
//---------------------------------------------------------EJERCICIO 2---------------------------------------------------------------------//
        if(Ejercicios==2){
            ArrayList<Integer> numeros = new ArrayList<>();
            System.out.println("Ingrese 20 números decimales (se redondearán a enteros):");
            for (int i = 0; i < 20; i++) {
                double numero = sc.nextDouble();
                numeros.add((int) Math.round(numero));
            }
            int mayor = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            for (int num : numeros) {
                if (num > mayor) {
                    mayor = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
            int rango = mayor - menor;
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
            System.out.println("Rango: " + rango);
        }
//---------------------------------------------------------EJERCICIO 3---------------------------------------------------------------------//
        if(Ejercicios==3){
        ArrayList<Integer> numerosPares = new ArrayList<>();
        for(int i=0; i<20; i++){
            int numAleatorio = (int) (Math.random()*101)+1;
            if(numAleatorio%2==0){
                numerosPares.add(numAleatorio);
            }else{
                numerosPares.add(numAleatorio-1);
            }
        }
        int sumaTotal=0;
        for(int numeros : numerosPares){
            sumaTotal += numeros;
        }
        int promedio = sumaTotal/numerosPares.size();
        int mayoresAlPromedio = 0;
        int menoresAlPromedio = 0;
        for(int num : numerosPares){
            if(num<promedio){
                menoresAlPromedio++;
            }else if(num>promedio){
                mayoresAlPromedio++;
            }
        }
        for(int num : numerosPares){
            System.out.print(num + "\t");
        }
        System.out.println("");
        System.out.println("El promedio aritmetico de la lista es: " + promedio);
        System.out.println("La cantidad de numeros menores al promedio en la lista es: " + menoresAlPromedio);
        System.out.println("La cantidad de numeros mayores al promedio en la lista es: " + mayoresAlPromedio);
        }
//---------------------------------------------------------EJERCICIO 4---------------------------------------------------------------------//
        if(Ejercicios==4){
            ArrayList<Integer> numerosAleatorios = new ArrayList<>();
            for(int i=0; i<50; i++){
                int numAleatorio = (int) (Math.random()*100)+1;
                numerosAleatorios.add(numAleatorio);
            }
            System.out.println("Escriba el numero que desea buscar:");
            int numBuscar = Integer.parseInt(sc.nextLine());
            int posicion = 0;
            for(int num : numerosAleatorios){
                posicion++;
                if(numBuscar==num){
                    System.out.println("El numero " + numBuscar + " ha sido encontrado en la posicion " + posicion + " de la lista");
                    break;
                }else if(numBuscar != num && posicion==numerosAleatorios.size()){
                    System.out.println("No se encontro el numero " + numBuscar + " en la lista");
                }
            }
        }
//---------------------------------------------------------EJERCICIO 5---------------------------------------------------------------------//
        if(Ejercicios==5){
            ArrayList<Integer> numeros = new ArrayList<>();
            System.out.println("Ingrese 10 números enteros: ");
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                numeros.add(num);
            }
            ArrayList<Integer> listaAsc = new ArrayList<>(numeros);
            Collections.sort(listaAsc);
            System.out.println("Su lista ingresada de forma ascendente:");
            for (int n : listaAsc){
                System.out.print(n+"\t");
            }
            ArrayList<Integer> listades = new ArrayList<>(listaAsc);
            Collections.reverse(listades);
            System.out.println();
            System.out.println("Su lista ingresada de forma descendete:");
            for (int n : listades){
                System.out.print(n+"\t");
            }
        }
//---------------------------------------------------------EJERCICIO 6---------------------------------------------------------------------//
        if(Ejercicios==6){
            Matriz mc = new Matriz();
            int fila;
            int columna;
            while(true){
                System.out.println("Ingrese un valor para cargar en una celda o fin para terminar");
                String valor = sc.nextLine();
                if(valor.equalsIgnoreCase("fin")){
                    break;
                }
                System.out.println("Ingrese la fila y columna para asignar el valor");
                System.out.print("Fila: ");
                fila= Integer.parseInt(sc.nextLine());
                System.out.print("Columna: ");
                columna= Integer.parseInt(sc.nextLine());
                mc.agregarCelda(fila, columna, valor);
            }
            mc.mostrarMatriz();
            System.out.println("Ingrese una fila y una columna para saber su valor");
            System.out.print("Fila: ");
            fila= Integer.parseInt(sc.nextLine());
            System.out.print("Columna: ");
            columna= Integer.parseInt(sc.nextLine());
            System.out.println(mc.obtenerValor(fila, columna));
        }
    }
    
}
