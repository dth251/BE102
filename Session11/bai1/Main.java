package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng hình bạn muốn : ");
        int n = sc.nextInt();
        Shape[] shapes = new Shape[n];
        for(int i = 0; i < n; i++){
            System.out.println("(1) Hình Tròn ; (2) Hình Chữ Nhật ");
            System.out.println("Nhập hình: ");
            int choice  = sc.nextInt();
            if(choice == 1){
                System.out.println("Nhập bán kính hình tròn: ");
                Circle c = new Circle("Circle", sc.nextInt());
                shapes[i] = c;
            }
            if(choice == 2){
                System.out.println("Nhập chiều dài và chiều rộng hình chữ nhật : ");
                Rectangle r = new Rectangle("Rectangle", sc.nextInt(), sc.nextInt());
                shapes[i] = r;
            }
        }
        System.out.println("\n---------------KET QUA ------------------");
        for(Shape s : shapes){
            s.displayInfo();
            if(s instanceof Shape){
                ((Drawable) s).draw();
            }
            System.out.println("----------------------------------------");
        }

    }
}


