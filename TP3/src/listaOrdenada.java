import java.util.Arrays;

public class listaOrdenada {
    public int[] ascendente(int[] lista) {
        int[] ascendente = new int[lista.length];
        ascendente = Arrays.stream(lista).sorted().toArray();
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length-1; j++) {
                if (lista[j] > lista[j+1]) {
                    int temp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temp;
                }
            }

        }
        return ascendente;
    }
    public int[] descendente(int[] lista) {
        int[] descendente = new int[lista.length];
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length-1; j++) {
                if (lista[j] < lista[j+1]) {
                    int temp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temp;
                }
            }

        }
        return descendente;
    }
}
