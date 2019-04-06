// Łukasz Ćwikliński s19334
import static java.lang.Math.*;

public class Rectangle {
    // the Rectangle class has two fields
    public int width;
    public int height;

    // the Rectangle class has one constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // the Rectangle class has three methods
    public int getArea() {
        return width * height;
    }

    public int getCircumference() {
        return 2 * width + 2 * height;
    }

    public double getDiagonal() {
        return sqrt(pow(width, 2) + pow(height, 2));
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,  10);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getCircumference());
        System.out.println(rectangle.getDiagonal());
    }
}
