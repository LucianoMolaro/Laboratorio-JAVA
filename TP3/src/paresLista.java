public class paresLista {
    public int[] pares(){
        int [] pares = new int [20];
        for(int i=0; i<20; i++){
            int aleatorio = (int)(Math.random() * 100 + 1);
            if(aleatorio % 2==0){
                pares[i]=aleatorio;
            }else {
                i-=1;
            }
        }
        return pares;
    }
    public int promedio(int [] lista){
        int suma = 0;
        for(int i=0; i<lista.length; i++){
            suma += lista[i];
        }
        return suma / 20;
    }
    public int mayorPromedio(int [] lista){
        int mayores = 0;
        for(int i=0; i<lista.length; i++){
            if(lista[i]>promedio(lista)){
                mayores+=1;
            }
        }
        return mayores;
    }
    public int menorPromedio(int [] lista){
        int menores = 0;
        for(int i=0; i<lista.length; i++){
            if(lista[i]<promedio(lista)){
                menores+=1;
            }
        }
        return menores;
    }
    public int igualesPromedio(int [] lista){
        int iguales = 0;
        for(int i=0; i<lista.length; i++){
            if(lista[i]==promedio(lista)){
                iguales+=1;
            }
        }
        return iguales;
    }
}
