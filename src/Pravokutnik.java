public class Pravokutnik {
    String naziv;
    double sirina;
    double visina;

    public Pravokutnik(String naziv, double sirina, double visina) {
        this.naziv = naziv;
        this.sirina = sirina;
        this.visina = visina;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public double getSirina() {
        return this.sirina;
    }

    public double getVisina() {
        return this.visina;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public void calcOpseg() {
        double opseg = 2 * (this.visina + this.sirina);
        System.out.println("Opseg pravokutnika je: " +opseg);
    }

    public void calcPovrsina() {
        double povrsina = this.sirina * this.visina;
        System.out.println("Povrsina pravokutnika je: "+povrsina);
    }
}
