import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class QuanLyBienSoXe {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> danhSachBienSo = new ArrayList<>();

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    themBienSo();
                    break;
                case 2:
                    hienThiDanhSach();
                    break;
                case 3:
                    timKiemChinhXac();
                    break;
                case 4:
                    timTheoMaTinh();
                    break;
                case 5:
                    sapXepTangDan();
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
        System.out.println("\n************ QUẢN LÝ BIỂN SỐ XE ************");
        System.out.println("1. Thêm các biển số xe");
        System.out.println("2. Hiển thị danh sách biển số xe");
        System.out.println("3. Tìm kiếm biển số xe");
        System.out.println("4. Tìm biển số xe theo mã tỉnh");
        System.out.println("5. Sắp xếp biển số xe tăng dần");
        System.out.println("6. Thoát");
        System.out.print("Lựa chọn của bạn: ");
    }

    // 1. Thêm biển số
    static void themBienSo() {
        System.out.print("Nhập biển số xe: ");
        String bienSo = sc.nextLine().toUpperCase();

        String regex = "^[0-9]{2}[A-Z]-[0-9]{3}\\.[0-9]{2}$";

        if (Pattern.matches(regex, bienSo)) {
            danhSachBienSo.add(bienSo);
            System.out.println("Thêm biển số thành công!");
        } else {
            System.out.println("Biển số KHÔNG đúng định dạng!");
        }
    }

    // 2. Hiển thị
    static void hienThiDanhSach() {
        if (danhSachBienSo.isEmpty()) {
            System.out.println("Danh sách biển số trống!");
            return;
        }

        System.out.println("Danh sách biển số xe:");
        for (String bs : danhSachBienSo) {
            System.out.println(bs);
        }
    }

    // 3. Tìm kiếm chính xác
    static void timKiemChinhXac() {
        System.out.print("Nhập biển số cần tìm: ");
        String canTim = sc.nextLine().toUpperCase();

        if (danhSachBienSo.contains(canTim)) {
            System.out.println("Tìm thấy biển số: " + canTim);
        } else {
            System.out.println("Không tìm thấy biển số!");
        }
    }

    // 4. Tìm theo mã tỉnh
    static void timTheoMaTinh() {
        System.out.print("Nhập mã tỉnh (VD: 29, 51...): ");
        String maTinh = sc.nextLine();

        boolean found = false;
        System.out.println("Các biển số thuộc tỉnh " + maTinh + ":");

        for (String bs : danhSachBienSo) {
            if (bs.startsWith(maTinh)) {
                System.out.println(bs);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có biển số nào thuộc tỉnh này!");
        }
    }

    // 5. Sắp xếp tăng dần
    static void sapXepTangDan() {
        if (danhSachBienSo.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        Collections.sort(danhSachBienSo);
        System.out.println("Đã sắp xếp biển số xe tăng dần!");
        hienThiDanhSach();
    }
}
