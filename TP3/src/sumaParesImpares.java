public class sumaParesImpares {
    public int suma(int[] lista){
        int sumaPar=0;
        for (int i =0; i < lista.length; i++){
            if (lista [i]%2 ==0){
                sumaPar += lista [i];
            }
        }
        return sumaPar;
    }
    public int sumaImpares(int[] lista){
        int sumaImpar=0;
        for (int i =0; i < lista.length; i++){
            if (lista [i]%2 !=0 ){
                sumaImpar += lista [i];
            }
        }
        return sumaImpar;
    }
}

