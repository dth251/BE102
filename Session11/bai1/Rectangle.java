package bai1;

public class Rectangle extends Shape implements Drawable {
    private double width;
    private double height;

    public Rectangle(String name, double height, double width) {
        super(name);
        this.height = height;
        this.width = width;
    }


    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public String toString() {
        return super.toString() + " width= " + width + " height= " + height;
    }
}
