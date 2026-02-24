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
    public void calcOpseg() {
        double opseg = 2 * (this.visina + this.sirina);
        System.out.println("Opseg pravokutnika je: " +opseg);
    }

    @Override
    public void calcPovrsina() {
        double povrsina = this.sirina * this.visina;
        System.out.println("Povrsina pravokutnika je: "+povrsina);
    }
}
