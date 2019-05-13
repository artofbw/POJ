// Exercise 04_02
// praca w parach: Łukasz Cwikliński s19334, Rafał Sochacki s20047

package exercise04_02;

public class Point3d extends Point2d{
    private float z = 0.0f;

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3d() {}

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] points = {this.getX(), this.getY(), this.getZ()};
        return points;
    }
}