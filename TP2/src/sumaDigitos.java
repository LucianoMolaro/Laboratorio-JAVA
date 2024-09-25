public class sumaDigitos {
    public int sumarDigitos(int a) {
        int resultado = 0;
        if (a <= 9) {
            resultado = a;
        }else if (a>1) {
            resultado = a%10 + sumarDigitos(a/10);
        }
        return resultado;


    }
}


