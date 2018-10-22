package figura;

public class Cerchio extends Figura {

    public Cerchio(double raggio) {
        super(0, raggio);
    }

    public double perimetro() {
        return 2 * PIGRECO * lato;
    }

    public double area() {
        return lato * lato * PIGRECO;
    }

    public String toString() {
        return "Cerchio di raggio " + lato;
    }

}
