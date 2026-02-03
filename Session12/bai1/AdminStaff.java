package bai1;

public class AdminStaff extends Staff implements ICapability {
    private double bonus;

    public AdminStaff(String id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateTotalSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void checkPerformance() {
        System.out.println(getName() + ": Đánh giá nhân viên tốt.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Tổng lương: %.0f\n", calculateTotalSalary());
    }
}
