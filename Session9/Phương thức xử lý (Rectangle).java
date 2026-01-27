package bai1;

import java.util.Scanner;
public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public  double getArea() {
        return width * height;
    }
    public  double getPerimeter() {
        return (width + height) * 2;
    }

    public void printInfo() {
        System.out.println(getArea());
        System.out.println(getPerimeter());
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rt = new Rectangle(sc.nextInt(), sc.nextInt());
        rt.getArea();
        rt.getPerimeter();
        rt.printInfo();
    }
}
