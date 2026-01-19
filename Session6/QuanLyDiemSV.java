import java.util.Scanner;

public class QuanLyDiemSV {

    static Scanner sc = new Scanner(System.in);
    static int n = 0;
    static double[] diem;

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    nhapDanhSachDiem();
                    break;
                case 2:
                    inDanhSachDiem();
                    break;
                case 3:
                    tinhDiemTrungBinh();
                    break;
                case 4:
                    timMaxMin();
                    break;
                case 5:
                    demDatVaTruot();
                    break;
                case 6:
                    sapXepTangDan();
                    break;
                case 7:
                    thongKeGioiVaXuatSac();
                    break;
                case 8:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 8);
    }

    // ================= MENU =================
    static void showMenu() {
        System.out.println("\n************ QUẢN LÝ ĐIỂM SV ************");
        System.out.println("1. Nhập danh sách điểm sinh viên");
        System.out.println("2. In danh sách điểm");
        System.out.println("3. Tính điểm trung bình của các sinh viên");
        System.out.println("4. Tìm điểm cao nhất và thấp nhất");
        System.out.println("5. Đếm số lượng sinh viên đạt và trượt");
        System.out.println("6. Sắp xếp điểm tăng dần");
        System.out.println("7. Thống kê số lượng sinh viên giỏi và xuất sắc");
        System.out.println("8. Thoát");
        System.out.print("Lựa chọn của bạn: ");
    }

    // ============== CHỨC NĂNG ==============

    // 1. Nhập điểm
    static void nhapDanhSachDiem() {
        System.out.print("Nhập số lượng sinh viên: ");
        n = sc.nextInt();
        diem = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm sinh viên " + (i + 1) + ": ");
            diem[i] = sc.nextDouble();
        }
    }

    // 2. In danh sách
    static void inDanhSachDiem() {
        if (diem == null) {
            System.out.println("Chưa nhập danh sách điểm!");
            return;
        }
        System.out.println("Danh sách điểm:");
        for (double d : diem) {
            System.out.print(d + "  ");
        }
        System.out.println();
    }

    // 3. Tính điểm trung bình
    static void tinhDiemTrungBinh() {
        if (diem == null) return;

        double sum = 0;
        for (double d : diem) {
            sum += d;
        }
        System.out.println("Điểm trung bình: " + (sum / n));
    }

    // 4. Tìm max - min
    static void timMaxMin() {
        if (diem == null) return;

        double max = diem[0];
        double min = diem[0];

        for (double d : diem) {
            if (d > max) max = d;
            if (d < min) min = d;
        }

        System.out.println("Điểm cao nhất: " + max);
        System.out.println("Điểm thấp nhất: " + min);
    }

    // 5. Đếm đạt / trượt
    static void demDatVaTruot() {
        if (diem == null) return;

        int dat = 0, truot = 0;

        for (double d : diem) {
            if (d >= 5) dat++;
            else truot++;
        }

        System.out.println("Số sinh viên đạt: " + dat);
        System.out.println("Số sinh viên trượt: " + truot);
    }

    // 6. Sắp xếp tăng dần
    static void sapXepTangDan() {
        if (diem == null) return;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (diem[i] > diem[j]) {
                    double temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;
                }
            }
        }

        System.out.println("Danh sách điểm sau khi sắp xếp tăng dần:");
        inDanhSachDiem();
    }

    // 7. Thống kê giỏi / xuất sắc
    static void thongKeGioiVaXuatSac() {
        if (diem == null) return;

        int gioiXuatSac = 0;

        for (double d : diem) {
            if (d >= 8) gioiXuatSac++;
        }

        System.out.println("Số sinh viên giỏi và xuất sắc: " + gioiXuatSac);
    }
}
