import java.util.Scanner;

public class TimSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        switch(n){
            case 1:
                System.out.println("Tháng 1 có 31 Ngày.");
                break;
            case 2:
                System.out.println("Tháng 1 có 28 hoặc Ngày.");
                break;
            case 3:
                System.out.println("Tháng 1 có 31 Ngày.");
                break;
            case 4:
                System.out.println("Tháng 1 có 30 Ngày.");
                break;
            case 5:
                System.out.println("Tháng 1 có 31 Ngày.");
                break;
            case 6:
                System.out.println("Tháng 1 có 30 Ngày.");
                break;
            case 7:
                System.out.println("Tháng 1 có 31 Ngày.");
                break;
            case 8:
                System.out.println("Tháng 1 có 31 Ngày.");
                break;
            case 9:
                System.out.println("Tháng 1 có 30 Ngày.");
                break;
            case 10:
                System.out.println("Tháng 1 có 31 Ngày.");
                break;
            case 11:
                System.out.println("Tháng 1 có 30 Ngày.");
                break;
            case 12:
                System.out.println("Tháng 1 có 31 Ngày.");
                break;
            default:
                System.err.println("Tháng không hợp lệ.");
        }
    }
}
