package bai1;

public abstract class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(String name) {
        this.name = name;
    }
    abstract double getArea();
    abstract double getPerimeter();
    void displayInfo(){
        System.out.println(String.format("%.2f",getArea()));
        System.out.println(String.format("%.2f",getPerimeter()));
        System.out.println("Name: " + name);
    }
}
