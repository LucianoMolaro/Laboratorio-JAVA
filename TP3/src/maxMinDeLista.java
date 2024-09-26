public class maxMinDeLista {
    public int maximo(int[] lista){
        int max = 0;
        for(int i=0;i<lista.length;i++){

            if(lista[i]>max){
                max = lista[i];
            }
            else {
                max = max;
            }
        }
        return max;
    }
    public int minimo(int[] lista){
        int min = maximo(lista);
        for(int i=0;i<lista.length;i++){
            if(lista[i]<min){
                min = lista[i];
            }
            else {
                min = min;
            }
        }
        return min;
    }
    public int diferencia(int a, int b){
        int diferencia = a - b;
        return diferencia;
    }
}
