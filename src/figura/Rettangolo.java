package figura;

public class Rettangolo extends Figura {

    double altezza;

    public Rettangolo(double base, double altezza) {
        super(4, base);
        this.altezza = altezza;
    }

    public double perimetro() {
        return 2 * (lato + altezza);
    }

    public double area() {
        return lato * altezza;
    }

    public String toString() {
        return "Rettangolo di base " + lato
                + ", altezza " + altezza;
    }

}
