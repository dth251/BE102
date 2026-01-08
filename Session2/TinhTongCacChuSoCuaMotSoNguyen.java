import java.util.Scanner;

public class TinhTongCacChuSoCuaMotSoNguyen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if ( n < 0 ){
            n = Math.abs(n);
        }
        int sum = 0;
        while(n > 0) {
            int tam = n % 10;
            sum += tam;
            n = n / 10;
        }
        System.out.println("Tổng các chữ số là: " + sum);
    }
}
