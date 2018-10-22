package figura;

public class TriangoloEquilatero extends Figura {

    public TriangoloEquilatero(double lato) {
        super(2, lato);
    }

    public double area() {
        return lato * lato * Math.sqrt(3) / 4;
    }

    public String toString() {
        return "Triangolo equilatero di lato " + lato;
    }
}
