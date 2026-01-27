package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int id;
    private String fullName;
    private int age;
    private double gpa;

    private static int count = 0;

    public static final double MIN_GPA = 0.0;
    public static final double MAX_GPA = 4.0;

    public Student(int id, String fullName, int age, double gpa) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gpa = gpa;
        count++;
    }
    public static int getCount() {
        return count;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Tuổi: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("---------------------");
    }
}

package bai2;

import bai2.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> st = new ArrayList<>();
        for(int i = 1; i <= 3; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String fullName = sc.nextLine();
            int age = sc.nextInt();
            double gpa = sc.nextDouble();
            st.add(new Student(id,fullName,age,gpa));
        }
        for(Student s: st){
            s.printInfo();
        }
        System.out.println("Tổng số sinh viên đã tạo: " + Student.getCount());
    }
}

