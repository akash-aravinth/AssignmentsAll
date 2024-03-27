package classes;

import java.util.Scanner;
class Rectangle{
    private int height;
    private int breadth;

    public Rectangle(int height, int breadth) {
        this.height = height;
        this.breadth = breadth;
    }
    private int calculateArea(int length, int breath) {
        return length*breath;
    }
}
