// Exercise 04_02
// praca w parach: Łukasz Cwikliński s19334, Rafał Sochacki s20047

package excersise04_04;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {}

    public Rectangle(double width) {
        this.width = width;
        this.length = width;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
        this.length = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    public double getPerimeter() {
        return 2 * this.getWidth() + 2 * this.getLength();
    }

    public String toString() {
        return "area: " + this.getArea() + ", perimeter:" + this.getPerimeter();
    }
}
