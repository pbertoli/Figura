package figura;
public class TriangoloScaleno extends Figura {
    double lato2, lato3;
    
    public double getLato1() {
        return getLato();
    }

    public void setLato1(double lato) {
        this.setLato(lato);
    }
    public double getLato2() {
        return lato2;
    }

    public void setLato2(double lato2) {
        this.lato2 = lato2;
    }

    public double getLato3() {
        return lato3;
    }

    public void setLato3(double lato3) {
        this.lato3 = lato3;
    }
    public TriangoloScaleno(double l1, double l2, double l3) {
        super(3,l1);
        lato2=l2;
        lato3=l3;
    }
    public double perimetro(){
        return lato+lato2+lato3;
    }
    public double area() {
        double p=perimetro()/2.0;
        return Math.sqrt((p-lato)*(p-lato2)*(p-lato3));
    }
    public String toString() {
        return "Triangolo scaleno di lati: "+lato+", "+lato2+", "+lato3; 
    }
}

