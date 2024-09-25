public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion() {
        this.numerador = 1;
        this.denominador = 1;
    }


    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador debe ser distinto de 0");
        }
        this.denominador = denominador;
    }
    public int getDenominador() {
        return denominador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public int getNumerador() {
        return numerador;
    }

    public Fraccion (int numerador, int denominador) {
        this.numerador = numerador;
        this.setDenominador(denominador);
    }
    public Fraccion (Fraccion f) {
        this.numerador = f.getNumerador();
        this.denominador = f.getDenominador();
    }
    public String toString(){return numerador+"/"+denominador;}


    public Fraccion suma(Fraccion f2){
        int mcm = this.minimoComunMultiplo(this.denominador, f2.denominador);
        int divMcmDenominadorF1 = mcm/this.denominador;
        int divMcmDenominadorF2 = mcm/f2.denominador;
        Fraccion resultado = new Fraccion();
        resultado.setNumerador((divMcmDenominadorF1*this.getNumerador()) + divMcmDenominadorF2*f2.getNumerador());
        resultado.setDenominador(mcm);
        return resultado;
    }

    public Fraccion resta(Fraccion f2){
        int mcm = this.minimoComunMultiplo(this.denominador, f2.denominador);
        int divMcmDenominadorF1 = mcm/this.denominador;
        int divMcmDenominadorF2 = mcm/f2.denominador;
        Fraccion resultado = new Fraccion();
        resultado.setNumerador((divMcmDenominadorF1*this.getNumerador()) - divMcmDenominadorF2*f2.getNumerador());
        resultado.setDenominador(mcm);
        return resultado;
    }
    public Fraccion multiplicacion(Fraccion f2){
        Fraccion resultado = new Fraccion();
        resultado.setNumerador((this.getNumerador()*f2.getNumerador()));
        resultado.setDenominador(this.getDenominador()*f2.getDenominador());
        return resultado;
    }
    public Fraccion division(Fraccion f2){
        Fraccion resultado = new Fraccion();
        resultado.setNumerador((this.getNumerador()*f2.getDenominador()));
        resultado.setDenominador(this.getDenominador()*f2.getNumerador());
        return resultado;
    }


    public int maximoComunDivisor(int a, int b){
        int c;
        while (b!=0){
            c = b;
            b = a % b;
            a = c;
        }
        return a;
    }
    private int minimoComunMultiplo(int a, int b){return (a*b)/this.maximoComunDivisor(a,b);}
}
