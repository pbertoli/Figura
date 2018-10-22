package figura;
abstract class Figura implements iFigura{
    private int nLati;
    double lato; 

    public int getNLati() {
        return nLati;
    }

    public void setNLati(int nLati) {
        this.nLati = nLati;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }
    public Figura(int nLati, double lato){
        this.nLati=nLati;
        this.lato=lato;
    }
    public double perimetro() {
        return nLati*lato;
    }
}