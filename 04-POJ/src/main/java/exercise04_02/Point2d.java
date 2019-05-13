// Exercise 04_02
// praca w parach: Łukasz Cwikliński s19334, Rafał Sochacki s20047

package exercise04_02;

public class Point2d {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2d() {}

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] points = {this.getX(), this.getY()};
        return points;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}