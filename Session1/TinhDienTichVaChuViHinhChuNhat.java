import java.util.Scanner;

public class TinhDienTichVaChuViHinhChuNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("width = ");
        float width = Float.parseFloat(input.nextLine());
        System.out.print("height = ");
        float height = Float.parseFloat(input.nextLine());
        float area = width * height;
        float perimeter = 2 * (width + height);
        System.out.printf("Diện Tích : %.2f \n", area);
        System.out.printf("Chu vi : %.2f \n", perimeter);
    }
}
