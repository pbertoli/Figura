package figura;
public class MainFigura {
    public static void main(String[] args) {
        TriangoloScaleno ts = new TriangoloScaleno(2, 3, 4);
        TriangoloEquilatero te = new TriangoloEquilatero(2);
        Quadrato q = new Quadrato(2);
        Rettangolo r = new Rettangolo(3, 2);
        Pentagono p=new Pentagono(3);
        Cerchio c = new Cerchio(3);
        System.out.println(ts + " e area: "+ts.area());
        System.out.println(te+" e area: "+te.area());
        System.out.println(q+" e area: "+q.area());
        System.out.println(r+" e area: "+r.area());
        System.out.println(p+" e area: "+p.area());
        System.out.println(c+" e area: "+c.area());
        System.out.println(ts+" e perim: "+ts.perimetro());
        System.out.println(te+" e perim: "+te.perimetro());
        System.out.println(q+" e perim: "+q.perimetro());
        System.out.println(r+" e perim: "+r.perimetro());
        System.out.println(p+" e perim: "+p.perimetro());
        System.out.println(c+" e perim: "+c.perimetro()); 
    } 
}





