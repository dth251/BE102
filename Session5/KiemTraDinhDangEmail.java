import java.util.Scanner;

public class KiemTraDinhDangEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine().trim();
        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}$";
        boolean check = email.matches(regex);
        System.out.println(check?"email hop le":"email khong hop le");
    }
}
