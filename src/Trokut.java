public class Trokut extends GeometrijskiLik{
    double a;
    double b;
    double c;

    public Trokut(String naziv, double a, double b, double c) {
        super(naziv);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public void calcOpseg() {
        double opseg = this.a + this.b + this.c;
        System.out.println("Opseg trokuta je: "+opseg);
    }

    @Override
    public void calcPovrsina() {
        double s = (this.a + this.b + this.c) / 2;
        double area = Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
        System.out.println("Povrsina trokuta je: " +area);
    }
}
