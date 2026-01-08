import java.util.Scanner;

public class TinhTongCacSoTu1DenN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n <= 0){
            System.err.println("Số nhập vào không hợp lệ.");
        }
        else {
            int sum = 0;
            for(int i = 1; i <= n; i++){
                 sum += i;
            }
            System.out.println("Tổng các số từ 1 đến " + n +" là: " + sum );
        }
    }
}
