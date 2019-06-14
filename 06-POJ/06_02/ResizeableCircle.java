// praca w parach: Łukasz Ćwikliński s19334, Maciej Rybacki s18553

package 06_02;

public class ResizeableCircle extends Circle implements Resizable {
    public ResizeableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius *= percent/100.0;
    }
}