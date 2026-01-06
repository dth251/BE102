import java.util.Scanner;

public class TinhDienTichHinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("bán kính : ");
        int r = sc.nextInt();
        float pi = 3.14f;
        double a = pi* r*r;
        System.out.printf("Diện tích : %.2f",a);
    }
}
