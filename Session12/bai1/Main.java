package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Staff> staffList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- HỆ THỐNG QUẢN LÝ NHÂN SỰ ---");
            System.out.println("1. Thêm mới nhân viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Cập nhật thông tin");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addNewStaff();
                    break;
                case 2:
                    displayList();
                    break;
                case 3:
                    updateStaff();
                    break;
                case 4:
                    deleteStaff();
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    // 1. Thêm mới
    public static void addNewStaff() {
        System.out.print("Chọn loại (1: Giảng viên, 2: Hành chính): ");
        int type = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();
        System.out.print("Nhập Tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập Lương cứng: ");
        double baseSalary = Double.parseDouble(scanner.nextLine());

        if (type == 1) {
            System.out.print("Nhập số giờ dạy: ");
            int hours = Integer.parseInt(scanner.nextLine());
            staffList.add(new Lecturer(id, name, baseSalary, hours));
        } else if (type == 2) {
            System.out.print("Nhập tiền thưởng (Bonus): ");
            double bonus = Double.parseDouble(scanner.nextLine());
            staffList.add(new AdminStaff(id, name, baseSalary, bonus));
        } else {
            System.out.println("Loại nhân viên không đúng.");
        }
    }

    // 2. Hiển thị danh sách (Sử dụng Đa hình)
    public static void displayList() {
        System.out.println("\n--- DANH SÁCH NHÂN VIÊN ---");
        for (Staff s : staffList) {
            s.displayInfo();
        }
    }

    // 3. Cập nhật theo ID
    public static void updateStaff() {
        System.out.print("Nhập ID nhân viên cần sửa: ");
        String id = scanner.nextLine();
        boolean found = false;

        for (Staff s : staffList) {
            if (s.getId().equalsIgnoreCase(id)) {
                System.out.print("Nhập tên mới: ");
                s.setName(scanner.nextLine());
                System.out.print("Nhập lương cứng mới: ");
                s.setBaseSalary(Double.parseDouble(scanner.nextLine()));

                // Kiểm tra kiểu đối tượng để cập nhật thuộc tính riêng
                if (s instanceof Lecturer) {
                    System.out.print("Nhập số giờ dạy mới: ");
                    ((Lecturer) s).setTeachingHours(Integer.parseInt(scanner.nextLine()));
                } else if (s instanceof AdminStaff) {
                    System.out.print("Nhập bonus mới: ");
                    ((AdminStaff) s).setBonus(Double.parseDouble(scanner.nextLine()));
                }

                System.out.println("Cập nhật thành công!");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Không tìm thấy nhân viên với ID này.");
    }

    // 4. Xóa theo ID
    public static void deleteStaff() {
        System.out.print("Nhập ID nhân viên cần xóa: ");
        String id = scanner.nextLine();
        // Sử dụng lambda expression để xóa (hoặc dùng vòng lặp)
        boolean removed = staffList.removeIf(s -> s.getId().equalsIgnoreCase(id));

        if (removed) {
            System.out.println("Đã xóa nhân viên thành công.");
        } else {
            System.out.println("Không tìm thấy ID để xóa.");
        }
    }
}
