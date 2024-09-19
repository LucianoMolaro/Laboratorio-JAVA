public class Fraccion {
    private int numerador1;
    private int denominador1;
    private int numerador2;
    private int denominador2;

    public double f1(int a, int b) {
        this.numerador1 = a;
        this.denominador1 = b;


        double fraccion1 = numerador1 / denominador1;
        return fraccion1;
    }
    public double f2(int c, int d) {
        this.numerador2 = c;
        this.denominador2 = d;
        double fraccion2 = numerador2/denominador2;
        return fraccion2;
    }

}
