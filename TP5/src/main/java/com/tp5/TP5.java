package com.tp5;
import java.util.Arrays;
import java.util.Scanner;


public class TP5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ejercicios=0;
        System.out.println("Intrduzca el ejercicio a realizar");
        ejercicios= Integer.parseInt(sc.nextLine());
        while(ejercicios<1 || ejercicios>5){
            System.out.println("Ejercicio incorrecto, introducir numero del 1 al 5");
            ejercicios= Integer.parseInt(sc.nextLine());
        }
        //---------------------------------------EJERCICIO 1------------------------------------------//
        if(ejercicios==1){
            System.out.println("-------------------------Algoritmos de ordenacion------------------------");
            System.out.println("Ordenamiento por insercion: Divide todos los valores en dos pilas: una ordenada y otra sin ordenar. Uno por uno, los numeros de la pila \"sin ordenar\" se seleccionan y se colocan en el orden correcto.");
            System.out.println("Alggoritmo de burbuja: Funciona haciendo una comparacion entre los elementos de un array de dos en dos comenzando con el primero e ir intercambiando posiciones segun se desee ordenar el array.");
            System.out.println("Ordenamiento por seleccion: El método de ordenación por selección consiste en repetir los siguientes pasos: Se busca el elemento más pequeño del array y se coloca en la primera posición. Entre los restantes, se busca el elemento más pequeño y se coloca en la segunda posición. Hasta colocar el ultimo elemento");
            System.out.println("Algoritmo quick-sort:");
            System.out.println("--------------------------Algoritmos de busqueda-------------------------");
            System.out.println("Busqueda secuencial: El método de búsqueda secuencial consiste en ir comparando el elemento o criterio de búsqueda con cada uno de los elementos en el arreglo, esto se hace recorriendo el arreglo y deteniéndose en cada elemento y hacer la comparación, en caso de ser verdadera la comparación, guardar la posición el elemento o dato.");
            System.out.println("Busqueda secuencial: En la búsqueda binaria, una matriz se divide repetidamente en dos mitades hasta que se encuentra la clave (elemento que se busca). La división es virtual, es decir, se mantiene la integridad de los datos. Con cada iteración, se enfoca el valor medio de la matriz. Si el valor es igual a la clave que estamos buscando, el ciclo o función recursiva termina. De lo contrario, sigue en bucle. Si el valor medio es mayor que la clave, la función se enfoca en la primera mitad de la matriz y viceversa.");
            System.out.println("--------------------------Algoritmos de recorrida-------------------------");
            System.out.println("Recorrido por profundidad:");
            System.out.println("Recorrido por anchura:");
        }
        //---------------------------------------EJERCICIO 2------------------------------------------//
        else if(ejercicios==2){
            int[] listaNumeros = new int[]{2,8,4,1,5,3,9,0,7,6};
            OrdenInsercion ol = new OrdenInsercion();
            System.out.println("La lista a ordenar es: " + Arrays.toString(listaNumeros));
            System.out.print("La lista ordenada es: ");
            ol.ordenar(listaNumeros);
            
        }
    }
}
