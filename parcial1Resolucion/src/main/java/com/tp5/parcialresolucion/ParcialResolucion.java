/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tp5.parcialresolucion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Flia. Molaro
 */
public class ParcialResolucion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //----------------------------------2-----------------------------------------//
        String[][] componentesPc = new String[][] {
            {"AAA","Placa Madre", "20000", "S"} , 
            {"BBB","Procesador" ,"25000" , "S"} , 
            {"CCC","Memoria RAM", "5000" , "S"} , 
            {"DDD","Placa de Red", "3000" , "N"} , 
            {"EEE","Disco Rigido SSD", "22000" , "S"} , 
            {"FFF"," Placa de Video", "42000" , "N"} , 
            {"GGG","Monitor Led 21", "32000" , "N"} , 
            {"HHH","Monitor Led 25", "41000" , "N"} , 
            {"JJJ","KitTeclado - Mouse", "9000" , "N"} , 
            {"KKK","Gabinete", "6500" , "S"}, 
            {"LLL","Fuente de Alimentación", "6500" , "S"}, 
            {"MMM","Placa de Sonido", "16500" , "N"}};
        //------------------------------------2 a-----------------------------------------//
        Computadora pc = new Computadora();
        System.out.println("Ingrese una marca");
        pc.setMarca(sc.nextLine());
        System.out.println("Ingrese el modelo");
        pc.setModelo(sc.nextLine());
        System.out.println("Ingrese un codigo de barras, solo numeros");
        String codigoBarra = sc.nextLine();
        codigoBarra = codigoBarra.replace(" ", "");
        pc.setCodigoBarras(Long.parseLong(codigoBarra));
        while(true){
            if(codigoBarra.length()<7 || codigoBarra.length()>15){
                System.out.println("Ingrese un codigo de 7 a 15 numeros");
                codigoBarra = sc.nextLine();
            }else{
                break;
            }
        }
        
        //--------------------------------------2 b-----------------------------------------// 
        System.out.println("Ingrese cuantos componentes tendra su computadora");
        int componentesCantidad = Integer.parseInt(sc.nextLine());
        while(true){
            if(componentesCantidad<5 || componentesCantidad>12){
                System.out.println("Ingrese una cantidad entre 5 y 12");
                componentesCantidad = Integer.parseInt(sc.nextLine());
            }else{
                break;
            }
        }
        
        //--------------------------------------2 c-----------------------------------------//
        pc.setComponentes(pc.tamanioComponentes(componentesCantidad, 3));

        /*System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(completarEspacios("Codigo de componente") + "|" + completarEspacios("Denominacion") + "|" + completarEspacios("Precio") + "|" + completarEspacios("Es obligatorio"));
        for(int i=0; i<componentesCantidad;i++){
            System.out.println(completarEspacios(pc.getComponentes()[i][0]) + "\t" + completarEspacios(pc.getComponentes()[i][1])+ "\t" +completarEspacios(pc.getComponentes()[i][2]));
        }
        System.out.println("-------------------------------------------------------------------------------------");*/
        
        //--------------------------------------2 d1-----------------------------------------//
        System.out.println("Componentes de la computadora");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(completarEspacios("Codigo de componente") + "|" + completarEspacios("Denominacion") + "|" + completarEspacios("Precio") + "|" + completarEspacios("Es obligatorio"));
        for(int i=0; i<12;i++){
            System.out.println(completarEspacios(componentesPc[i][0]) + "\t" + completarEspacios(componentesPc[i][1])+ "\t" +completarEspacios(componentesPc[i][2])+ "\t" +completarEspacios(componentesPc[i][3]));
        }
        System.out.println("-------------------------------------------------------------------------------------");
       
        //--------------------------------------2 d2-----------------------------------------//
        String[][] temp = pc.getComponentes();
        boolean puedeAgregarse = false;
        for(int i=1;i<componentesCantidad+1;i++){
            puedeAgregarse=false;
           while(true){
               System.out.println("Ingrese el codigo del componente que desea agregar a su computadora");
               String compAgregar=sc.nextLine();
       //--------------------------------------2 d3-----------------------------------------//
               for(int comparar=0;comparar<12;comparar++){
                   if(compAgregar.equalsIgnoreCase(componentesPc[comparar][0])){
                       for(int j=1; j<componentesCantidad+1;j++){
                           if(compAgregar.equalsIgnoreCase(temp[j][0])){
                               System.out.println("El componente ya fue agregado anteriormente");
                               break;
                           }else{
                               System.out.println("El componente es: " + componentesPc[comparar][1] + "\n" 
                               + "Componente agregado a su computadora");
                               puedeAgregarse=true;
                               temp[i][0]=compAgregar.toUpperCase();
                               temp[i][1]=componentesPc[comparar][1];
                               temp[i][2]=componentesPc[comparar][2];
                               break;
                           }
                       }
                   }
                   else if(puedeAgregarse){
                       break;
                   }
               }
               if(puedeAgregarse){
                   break;
               }else{
                   System.out.println("No ingreso un codigo valido, intentelo de nuevo");
               }
           }
        }
        pc.setComponentes(temp);
        
         //--------------------------------------2 f-----------------------------------------//
          int sumaTotal = 0;
         for(int i=1; i<componentesCantidad+1;i++){
             sumaTotal += Integer.parseInt(pc.getComponentes()[i][2]);
         }
         pc.setPrecioTotal(sumaTotal);
        
         //--------------------------------------2 e-----------------------------------------//
         String[] componentesNecesarios=new String[]{"AAA", "BBB", "CCC", "EEE", "KKK", "LLL"};
         
         for(int i=0;i<5;i++){
             for(int j=1; j<componentesCantidad+1;j++){
                 if(componentesNecesarios[i].equalsIgnoreCase(pc.getComponentes()[j][0])){
                     break;
                 }else{
                     System.out.println("Atención, 1 o más de los componentes obligatorios no fueron agregados, por este motivo se cobrara un recargo del 20%");
                     pc.setPorcentajeAumento(pc.getPrecioTotal()*0.2);
                     pc.setMontoFinal(pc.getPrecioTotal()+pc.getPorcentajeAumento());
                 }
             
             }
         }
         
        //--------------------------------------2 g-----------------------------------------//
        
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("La computadora especificada es: " + "\n"
                + "Marca: " + pc.getMarca() + "\n" 
                + "Modelo: " + pc.getModelo() + "\n" 
                + "Codigo de barras: " + pc.getCodigoBarras() );
        for(int i=0; i<componentesCantidad+1;i++){
            System.out.println(completarEspacios(pc.getComponentes()[i][0]) + "\t" + completarEspacios(pc.getComponentes()[i][1])+ "\t" +completarEspacios(pc.getComponentes()[i][2]));
        }
        System.out.println(completarEspacios("El monto de los componentes es:")+ pc.getPrecioTotal() + "\n"
                + completarEspacios("El recargo es de:") +  pc.getPorcentajeAumento() + "\n"
                +completarEspacios("El monto final es de:")+ pc.getMontoFinal()
        );
        System.out.println("-------------------------------------------------------------------------------------");
    }
    private static String completarEspacios(String a){
        int cantidadDeEspacios = 22 - a.length();
        for (int i=0; i<cantidadDeEspacios;i++){
            a+=" ";
        }
        return a;
    }
}
