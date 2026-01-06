import java.util.Scanner;

public class TinhTongHaiPhanSo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int tu = (a * d) + (b * c);
        int mau = b *d;
        System.out.println(tu +"/"+mau);
    }
}
