import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ejercicios = 0;
        while(ejercicios>10  || ejercicios<1){
            ejercicios = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un ejercicio a realizar"));
            if(ejercicios>10 || ejercicios<1){
                JOptionPane.showMessageDialog(null, "No es un ejercicio valido, ingrese un ejercicio del 1-10");
            }
        }
        if(ejercicios==1){
            System.out.println("Cuando intentas acceder a un elemento con un índice menor que 0 o mayor o igual que la longitud de la array, se lanza la excepción Index Out of Bounds. Esta excepción sirve para que el programa Java indique que estás intentando una operación inválida en la array.");
        }
        if (ejercicios==2){
            int [] numeros = new int[5];
            for (int i = 0; i < 5; i++){
                System.out.print("Ingreses el numero " + (i+1) + " de la lista: ");
                numeros[i] = Integer.parseInt(sc.nextLine());
            }
            System.out.println("Los numeros de la lista son: " + Arrays.toString(numeros));

        }
        if (ejercicios==3){
            multiplosEnLista ml = new multiplosEnLista();
            System.out.print("Ingrese el tamaño de la lista: ");
            int tamanio = Integer.parseInt(sc.nextLine());
            System.out.print("Ingrese un numero a guardar sus multiplos en la lista: ");
            int num = Integer.parseInt(sc.nextLine());
            int [] multiplos = ml.lista(num, tamanio);
            System.out.println("Los multiplos de " + num + " en la lista son: ");
            System.out.print((ml.resultados(multiplos)));

        }
        if(ejercicios==4){
            maxMinDeLista mml = new maxMinDeLista();
            int [] numeros = new int[20];
            for (int i = 0; i < 20; i++){
                System.out.print("Ingrese el numero " + (i+1) + " de la lista: ");
                numeros[i] = Integer.parseInt(sc.nextLine());
            }
            int max = mml.maximo(numeros);
            int min = mml.minimo(numeros);
            int diferencia = mml.diferencia(max, min);
            System.out.println("El mayor numero de la lista es: " + max);
            System.out.println("El menor numero de la lista es: " + min);
            System.out.println("La diferencia entre el mayor y menor de la lista es: " + diferencia);
        }
        if (ejercicios==5){
            paresLista lp = new paresLista();
            int [] pares = lp.pares();
            String listaPares = Arrays.toString(pares);
            int promedio = lp.promedio(pares);
            int mayorPromedio = lp.mayorPromedio(pares);
            int menorPromedio = lp.menorPromedio(pares);
            int iguales = lp.igualesPromedio(pares);
            System.out.println("La lista de pares enteros es: " + listaPares);
            System.out.println("El promedio de los numeros de la lista es: " + promedio);
            System.out.println("La cantidad de numeros iguales al promedio es de: " + iguales);
            System.out.println("La cantidad de numeros mayores al promedio es de: " + mayorPromedio);
            System.out.println("La cantidad de numeros menores al promedio es de: " + menorPromedio);
        }
        if (ejercicios==6){
            System.out.println("Ingrese un  numero a buscar en una lista");
            int numBuscar = Integer.parseInt(sc.nextLine());
            int [] listaRandom = new int[50];
            for (int i = 0; i < 50; i++){
                listaRandom[i] = (int)(Math.random()*100+1);
            }
            busquedaEnLista bn = new busquedaEnLista();
            String[] conclusion = bn.conclusion(listaRandom,numBuscar);
            if (conclusion[0].equals("true")){
                System.out.println(conclusion[1] + ", en posicion: " + conclusion[2]);
            }else if (conclusion[0].equals("false")){
                System.out.print(conclusion[1]);
            }
        }
        if (ejercicios==7){
            int[] lista = new int [20];
            for (int i = 0 ;i < 20; i++){
                lista[i]=(int)(Math.random()*100+1);

            }
            sumaParesImpares spi = new sumaParesImpares();
            String listaString = Arrays.toString(lista);

            int suma=spi.suma(lista);
            int sumaImpares=spi.sumaImpares(lista);
            System.out.println("La lista generada es: " + listaString);
            System.out.println("la suma de los numeros pares de la lista es: " + suma );
            System.out.println("la suma de los numeros impares de la lista es: "+ sumaImpares);
        }
        if (ejercicios==8){
            int[] lista = new int [10];
            for (int i = 0 ;i < 10; i++){
                System.out.print("Ingrese el numero "+ (i+1) + " a la lista:");
                lista[i]=Integer.parseInt(sc.nextLine());
            }
            listaOrdenada lad = new listaOrdenada();
            System.out.println("La lista generada fue: " + Arrays.toString(lista));
            System.out.println("la lista ordenada ascendentemente es: " + Arrays.toString(lad.ascendente(lista)));
            System.out.println("la lista ordenada descendentemente es: " + Arrays.toString(lad.descendente(lista)));
        }
        if (ejercicios==9){
            String string = "45-9-8-6-45-23-21-74-96-32-45-25";
            String[] numeros = string.split("-");
            int sumaTotal=0;
            for (int i = 0; i < numeros.length; i++){
                sumaTotal += Integer.parseInt(numeros[i]);

            }
            System.out.println("La suma total es: " + sumaTotal);
        }
        if (ejercicios==10){
            System.out.println("Ingrese un dni: ");
            String dni = sc.nextLine();
            int dniInt = Integer.parseInt(dni);
            int resto = dniInt/23;

            obtenerLetra dnil= new obtenerLetra();
            System.out.println(dnil.dniLetra(resto));
        }
    }
}


