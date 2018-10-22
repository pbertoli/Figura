package figura;

public class Quadrato extends Figura {

    public Quadrato(double lato) {
        super(4, lato);
    }

    public double area() {
        return lato * lato;
    }

    public String toString() {
        return "Quadrato di lato " + lato;
    }

}
