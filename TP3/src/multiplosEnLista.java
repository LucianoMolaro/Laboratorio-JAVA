import java.util.Arrays;

public class multiplosEnLista {
    public int[] lista(int num, int tamanio){
        int [] multiplos = new int[tamanio];
        for (int i = 0; i < tamanio; i++){
            multiplos[i] = num*(i+1);
        }
        return multiplos;
    }
    public String resultados(int[] multiplos){
        String[] resultado = new String[multiplos.length];
        for (int i = 0; i < multiplos.length; i++){
            resultado[i] = Integer.toString(multiplos[i]);
        }

        return Arrays.toString(resultado);
    }
}
