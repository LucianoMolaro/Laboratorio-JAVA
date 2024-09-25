public class recursion21 {
    public int imprimir(int n) {
        int resultado = 0;
        if (n == 1) {
            resultado = 1;
        }else if (n>1) {
            resultado = n + imprimir(n - 1);
        }
        return resultado;


    }
}
