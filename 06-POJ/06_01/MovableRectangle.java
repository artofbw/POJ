// praca w parach: Łukasz Ćwikliński s19334, Maciej Rybacki s18553
package com.company;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle (int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString() {
        return "MyRectangle[topLeftCorner=" + topLeft.toString() + ", bottomRightCorner" + bottomRight.toString() + "]";
    }

    @Override
    public void moveUp () {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown () {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft () {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight () {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}

