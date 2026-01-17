import java.util.Scanner;

public class SapXepMangSaoChoSoChanDungTruocSoLeDungSau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        if (n == 0){
            System.out.println("Mảng không có phần tử ");

        }
        else {
            System.out.print("Nhập các phần tử của mảng : ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if ((arr[j] % 2 == 1) && arr[j + 1] % 2 == 0) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.print("Mảng sau khi sắp xếp : ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
