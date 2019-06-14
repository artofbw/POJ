// praca w parach: Łukasz Ćwikliński s19334, Maciej Rybacki s18553

package 06_02;

public class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.sqrt(radius);
    }
}