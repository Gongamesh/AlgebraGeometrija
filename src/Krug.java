public class Krug extends GeometrijskiLik{
    private double radius;

    public Krug(String naziv, double radius) {
        super(naziv);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcPovrsina() {
        double area = Math.pow(this.radius, 2) * Math.PI;
        return area;
    }

    @Override
    public double calcOpseg() {
        double opseg = 2 * this.radius * Math.PI;
        return opseg;
    }
}
