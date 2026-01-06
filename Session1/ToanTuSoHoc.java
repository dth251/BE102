import java.util.Scanner;

public class ToanTuSoHoc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất (firstNumber) : ");
        int firstNumber = input.nextInt();
        System.out.print("Nhập số thứ hai (secondNumber) : ");
        int secondNumber = input.nextInt();
        System.out.printf("Tổng : %d \n", firstNumber + secondNumber );
        System.out.printf("Hiệu : %d \n", firstNumber - secondNumber);
        System.out.printf("Tích : %d \n", firstNumber * secondNumber);
        System.out.printf("Thương : %d \n", firstNumber / secondNumber);
        System.out.printf("Phần dư : %d \n", firstNumber % secondNumber);
    }
}
