import java.util.Scanner;

public class KiemTraTinhHopLeCuaTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Ba cạnh không tạo thành tam giác.");
        }
        // Phân loại tam giác
        else {

            // Tam giác đều
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            }
            // Tam giác cân
            else if (a == b || a == c || b == c) {
                System.out.println("Đây là tam giác cân");
            }
            // Tam giác vuông
            else if (a * a == b * b + c * c ||
                    b * b == a * a + c * c ||
                    c * c == a * a + b * b) {
                System.out.println("Đây là tam giác vuông.");
            }
            // Tam giác thường
            else {
                System.out.println("Đây là tam giác thường.");
            }
        }

        sc.close();
    }
}
