/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tp1.tp1;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class TP1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*accceso hacia los ejercicios*/
        
        /*System.out.println("Ingrese el ejercicio a realizar");*/
        int ejercicios = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ejercicio a realizar (1-15)"));
        
        while (ejercicios>15){
            JOptionPane.showMessageDialog(null, "No es un ejercicio valido. Por favor introducir un ejercicio del 1 al 15");
            ejercicios = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ejercicio a realizar (1-15)"));
        }
        
        /*paso  a los ejercicios*/
        /*-------------------------------------------------EJERCICIO 1-----------------------------------------------*/
        if(ejercicios==1){
            System.out.println("Introduzca su nombre");
            String nombre = input.nextLine();
            System.out.println("Bienvenido " + nombre + "!!");
        } /*-------------------------------------------------EJERCICIO 2-----------------------------------------------*/
            else if (ejercicios == 2){
            System.out.println("Introduzca su nombre");
            String nombre = input.nextLine();
            JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
        } /*-------------------------------------------------EJERCICIO 3-----------------------------------------------*/
            else if(ejercicios == 3){
            /*Variables*/
            int x = 7;
            int y = 3;
            int sum=x+y;
            int resta =x-y;
            int mult =x*y;
            double div = x/y;
            int resto = x%y;
            
            /*Proceso y muestra de resultado*/
            /*-------------------SUMA----------------------*/
            System.out.println("-----------SUMA-----------");
            System.out.println(x + " + " + y + " = " + sum);
            /*-------------------MULTIPLICACION----------------------*/
            System.out.println("-----------MULTIPLICACION-----------");
            System.out.println(x + " * " + y + " = " + mult);
            /*-------------------RESTA----------------------*/
            System.out.println("-----------RESTA-----------");
            System.out.println(x + " - " + y + " = " + resta);
            /*-------------------DIVISION----------------------*/
            System.out.println("-----------DIVISION-----------");
            System.out.println(x + " / " + y + " = " + div + " con resto " + resto);
        } /*-------------------------------------------------EJERCICIO 4-----------------------------------------------*/
            else if (ejercicios == 4){
            /*VARIABLES*/
            int a = 100;
            int b = 100;
            
            if (a>b){
                System.out.println(a + " > " + b);
            } else if (a<b){
                System.out.println(a + " < " + b);
            } else if (a==b){
                System.out.println(a + " = " + b);
            }
        } /*-------------------------------------------------EJERCICIO 5-----------------------------------------------*/
            else if (ejercicios == 5){
            int a = Integer.parseInt(JOptionPane.showInputDialog("El numero es multiplo de 2?"));
            
            if (a%2 == 0){
                JOptionPane.showMessageDialog(null, "El numero ingresado es un multiplo de 2");
            } else {
                JOptionPane.showMessageDialog(null, "El numero ingresado no es multiplo de 2");
            }
        } /*-------------------------------------------------EJERCICIO 6-----------------------------------------------*/
            else if(ejercicios == 6){
            /*VARIABLES*/
            double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
            
            double pTotal = a*0.21+a;
            JOptionPane.showMessageDialog(null, "El precio total con iva incluido es de " + pTotal);
        }  /*-------------------------------------------------EJERCICIO 7-----------------------------------------------*/
            
            else if(ejercicios==7){
                int a = 1;
                while (a<=100){
                    System.out.println(a);
                    a++;
                }
        }  /*-------------------------------------------------EJERCICIO 8-----------------------------------------------*/
        
            else if(ejercicios==8){
                for(int a=0;a<=100;a++){
                    System.out.println("numero " + a);
                }
            }
        /*-------------------------------------------------EJERCICIO 9-----------------------------------------------*/
            else if(ejercicios==9){
                int a;
                
                for(a=0;a<=100;a++){
                    if(a%2==0 && a%3==0 && a<=100){
                        System.out.println(a);
                    }   
                }
            }
        /*-------------------------------------------------EJERCICIO 10-----------------------------------------------*/
            else if(ejercicios==10){
                int a;
                do{
                   a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero mayor o igual a 0"));
                   if(a>0){
                       System.out.println("El número " + a + " es un número positivo");
                   } else if(a==0){
                       System.out.println("El número es " + a);
                   }
                }while(a<0);   
            } 
        /*-------------------------------------------------EJERCICIO 11-----------------------------------------------*/
            else if(ejercicios==11){
                String claveCorrecta = "admin1234";
                int cantidadDeIntentos = 0;
                System.out.println("Ingrese clave para acceder");
                String clave = input.nextLine();
                while(!clave.equals(claveCorrecta) && cantidadDeIntentos<2){
                    cantidadDeIntentos++;
                    System.out.println("Clave incorrecta intentelo de nuevo");
                    clave=input.nextLine();
                }
                if(clave.equals(claveCorrecta)){
                    JOptionPane.showMessageDialog(null,"ACCESO CORRECTO");
                }
            }
        /*-------------------------------------------------EJERCICIO 12-----------------------------------------------*/
            else if(ejercicios==12){
                System.out.println("ingrese un dia de la semana en numero");
                int dia= Integer.parseInt(input.nextLine());
                
                if(!(dia>0 && dia<=7)){
                    do{
                        System.out.println("Numero incorrecto, ingresar del 1-7");
                        dia = Integer.parseInt(input.nextLine());
                    }while(!(dia>0 && dia<=7));
                }
                switch(dia){
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            JOptionPane.showMessageDialog(null,"Es dia laboral");
                        case 6:
                        case 7:
                            JOptionPane.showMessageDialog(null,"No es dia laboral");
                }
            }
        /*-------------------------------------------------EJERCICIO 13-----------------------------------------------*/
            else if(ejercicios==13){
                System.out.println("Introduzca un numero para saber si es primo o no");
                int x = Integer.parseInt(input.nextLine());
                int i = 0;
                int result = 1;
                if(x>1){
                    while(result==0 || i==x){
                        i++;
                        result=x%i;
                    }
                    }
                switch(result){
                case 0:
                    JOptionPane.showMessageDialog(null,"No es primo");
                default:
                    JOptionPane.showMessageDialog(null, "Es primo");
            }
            }
        /*-------------------------------------------------EJERCICIO 14-----------------------------------------------*/
            else if(ejercicios==14){
                int x = new Double(Math.random()*100).intValue();
                int cantidadIntentos = 0;
                int y;
                do{
                    cantidadIntentos++;
                    System.out.println("Ingrese un numero entre 0 y 100");
                    y = input.nextInt();
                    if(y>x){
                        System.out.println("Número ingresado: " + y);
                        System.out.println("Respuesta: es mas bajo");
                    }else if(y<x){
                        System.out.println("Número ingresado: " + y);
                        System.out.println("Respuesta: es mas alto");
                    }
                }while(!(y==x));
                if(y==x){
                    System.out.println("Correcto, número encontrado en " + cantidadIntentos + " intentos");
                }
            }
    }
}

