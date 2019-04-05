import static java.lang.Math.*;

public class Triangle {
    // the Triangle class has three fields
    public int a;
    public int b;
    public int c;

    // the Triangle class has one constructor
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // the Triangle class has five methods
    public double getArea() {
        int p = (a + b + c) / 2;
        return sqrt(p * ((p - a) * (p - b) * (p - c)));
    }

    public int getCircumference() {
        return a + b + c;
    }

    public boolean isEquilateral() {
        return a == b && b == c;
    }

    public boolean isIsosceles() {
        return b==c || a==b || c==a;
    }

    public boolean isScalene() {
        return a!=b && b!=c && c!=a;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 7,5);

        System.out.println(triangle.getArea());
        System.out.println(triangle.getCircumference());
        System.out.println(triangle.isEquilateral());
        System.out.println(triangle.isIsosceles());
        System.out.println(triangle.isScalene());
    }
}
