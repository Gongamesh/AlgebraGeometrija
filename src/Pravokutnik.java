public class Pravokutnik extends GeometrijskiLik{
    double sirina;
    double visina;

    public Pravokutnik(String naziv, double sirina, double visina) {
        super(naziv);
        this.sirina = sirina;
        this.visina = visina;
    }

    public double getSirina() {
        return this.sirina;
    }

    public double getVisina() {
        return this.visina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    @Override
    public double calcOpseg() {
        double opseg = 2 * (this.visina + this.sirina);
        return opseg;
    }

    @Override
    public double calcPovrsina() {
        double povrsina = this.sirina * this.visina;
        return povrsina;
    }
}
