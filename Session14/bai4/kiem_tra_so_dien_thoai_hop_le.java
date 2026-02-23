package bai4;

public class kiem_tra_so_dien_thoai_hop_le extends Exception {

    public kiem_tra_so_dien_thoai_hop_le(String message) {
        super(message);
    }

    // Phương thức kiểm tra số điện thoại
    public static void validatePhoneNumber(String phone)
            throws kiem_tra_so_dien_thoai_hop_le {

        // Kiểm tra độ dài
        if (phone.length() != 10) {
            throw new kiem_tra_so_dien_thoai_hop_le("Sai độ dài (phải đủ 10 chữ số)");
        }

        // Kiểm tra ký tự không hợp lệ
        if (!phone.matches("\\d+")) {
            throw new kiem_tra_so_dien_thoai_hop_le("Chứa ký tự không hợp lệ");
        }
    }
}