public class Krug {
    private String naziv;
    private double radius;

    public Krug(String naziv, double radius) {
        this.naziv = naziv;
        this.radius = radius;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calcArea() {
        double area = Math.pow(this.radius, 2) * Math.PI;
        System.out.println("Povrsina kruga je : "+area);
    }

    public void calcOpseg() {
        double opseg = 2 * this.radius * Math.PI;
        System.out.println("Opseg kruga je: " +opseg);
    }
}
