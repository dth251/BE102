import java.util.Scanner;

public class TinhTongCacSoChanVaTongCacSoLeTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Nhập số hàng của mảng : ");
        int x = sc.nextInt();
        System.out.print("Nhập số cột của mảng : ");
        int y = sc.nextInt();
        int[][] arr = new int[x][y];
        int old = 0;
        int even = 0;
        System.out.println("Nhập các phần tử của mảng : ");
        for  (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("Nhập phần tử thứ a[%d][%d] :  " ,i,j);
                arr[i][j] = sc.nextInt();
                if (arr[i][j] % 2 == 0 ) {
                    even += arr[i][j];
                }
                else
                    old += arr[i][j];
            }
        }
        System.out.println("Tổng các số chẵn : " + even);
        System.out.println("Tổng các số lẻ : " + old);
    }
}
