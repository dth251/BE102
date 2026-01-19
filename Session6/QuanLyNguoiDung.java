import java.util.Scanner;
import java.util.regex.Pattern;

public class QuanLyNguoiDung {

    static Scanner sc = new Scanner(System.in);

    static String hoTen = null;
    static String email = null;
    static String dienThoai = null;
    static String matKhau = null;

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    nhapThongTin();
                    break;
                case 2:
                    chuanHoaHoTen();
                    break;
                case 3:
                    kiemTraEmail();
                    break;
                case 4:
                    kiemTraDienThoai();
                    break;
                case 5:
                    kiemTraMatKhau();
                    break;
                case 6:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6);
    }

    // ================= MENU =================
    static void showMenu() {
        System.out.println("\n************ QUẢN LÝ NGƯỜI DÙNG ************");
        System.out.println("1. Nhập thông tin người dùng");
        System.out.println("2. Chuẩn hóa họ tên");
        System.out.println("3. Kiểm tra email hợp lệ");
        System.out.println("4. Kiểm tra số điện thoại hợp lệ");
        System.out.println("5. Kiểm tra mật khẩu hợp lệ");
        System.out.println("6. Thoát");
        System.out.print("Lựa chọn của bạn: ");
    }

    // 1. Nhập thông tin
    static void nhapThongTin() {
        System.out.print("Nhập họ và tên: ");
        hoTen = sc.nextLine();

        System.out.print("Nhập email: ");
        email = sc.nextLine();

        System.out.print("Nhập số điện thoại: ");
        dienThoai = sc.nextLine();

        System.out.print("Nhập mật khẩu: ");
        matKhau = sc.nextLine();
    }

    // 2. Chuẩn hóa họ tên
    static void chuanHoaHoTen() {
        if (hoTen == null) {
            System.out.println("Chưa nhập họ tên!");
            return;
        }

        hoTen = hoTen.trim().toLowerCase();
        String[] words = hoTen.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String w : words) {
            result.append(Character.toUpperCase(w.charAt(0)))
                    .append(w.substring(1))
                    .append(" ");
        }

        hoTen = result.toString().trim();
        System.out.println("Họ tên sau chuẩn hóa: " + hoTen);
    }

    // 3. Kiểm tra email
    static void kiemTraEmail() {
        if (email == null) {
            System.out.println("Chưa nhập email!");
            return;
        }

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (Pattern.matches(regex, email)) {
            System.out.println("Email hợp lệ!");
        } else {
            System.out.println("Email KHÔNG hợp lệ!");
        }
    }

    // 4. Kiểm tra số điện thoại VN
    static void kiemTraDienThoai() {
        if (dienThoai == null) {
            System.out.println("Chưa nhập số điện thoại!");
            return;
        }

        String regex = "^(03|05|07|08|09)[0-9]{8}$";
        if (Pattern.matches(regex, dienThoai)) {
            System.out.println("Số điện thoại hợp lệ!");
        } else {
            System.out.println("Số điện thoại KHÔNG hợp lệ!");
        }
    }

    // 5. Kiểm tra mật khẩu
    static void kiemTraMatKhau() {
        if (matKhau == null) {
            System.out.println("Chưa nhập mật khẩu!");
            return;
        }

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8,}$";
        if (Pattern.matches(regex, matKhau)) {
            System.out.println("Mật khẩu hợp lệ!");
        } else {
            System.out.println("Mật khẩu KHÔNG hợp lệ!");
        }
    }
}
