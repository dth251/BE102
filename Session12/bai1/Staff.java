package bai1;

public abstract class Staff  {
    // Sửa private thành protected để lớp con có thể dùng trực tiếp
    private String id;
    private String name;
    private double baseSalary;

    public Staff(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Phương thức trừu tượng
    public abstract double calculateTotalSalary();

    // Hiển thị thông tin chung
    public void displayInfo() {
        // Dùng printf để căn lề cho đẹp
        System.out.printf("ID: %-5s | Tên: %-15s | Lương cứng: %-10.0f", id, name, baseSalary);
    }
}

