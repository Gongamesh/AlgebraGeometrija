public abstract class GeometrijskiLik {
    private String naziv;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public abstract void calcOpseg();

    public abstract void calcPovrsina();

    @Override
    public String toString() {
        return "Naziv geometrijskog lika je: " + this.naziv;
    }
}
