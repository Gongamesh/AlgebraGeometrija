public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik>{
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

    public abstract double calcOpseg();

    public abstract double calcPovrsina();

    @Override
    public String toString() {
        return String.format("Naziv geometrijskog lika je: %s\nPovrsina je: %f\nOpseg je: %f", getNaziv(), calcPovrsina(), calcOpseg());
    }

    @Override
    public int compareTo(GeometrijskiLik o) {
        return Double.compare(calcPovrsina(), o.calcPovrsina());
    }
}
