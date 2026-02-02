package bai3;

public abstract class Employee {
    private int id;
    private String Name;

    public Employee(int id, String name) {
        this.id = id;
        Name = name;
    }

    abstract double calculateSalary();
    void showInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + Name);
        System.out.println("Salary: " + calculateSalary());
    }
}
