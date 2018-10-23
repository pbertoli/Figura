package figura;

public class Esagono extends Figura {

    public Esagono(double lato) {
        super(6, lato);
    }

    public double area() {
        return 6 * lato * lato * Math.sqrt(3) / 4;
    }

    public String toString() {
        return "Pentagono di lato " + lato;
    }

}
