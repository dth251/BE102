package bai1;

public class Lecturer extends Staff implements ICapability {
    private int teachingHours;

    public Lecturer(String id, String name, double baseSalary, int teachingHours) {
        super(id, name, baseSalary);
        this.teachingHours = teachingHours;
    }

    public int getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(int teachingHours) {
        this.teachingHours = teachingHours;
    }

    @Override
    public double calculateTotalSalary() {
        return getBaseSalary() + (teachingHours * 200000);
    }
    @Override
    public void checkPerformance() {
        System.out.println(getName() + ": Đánh giá giảng viên tốt.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Tổng lương: %.0f\n", calculateTotalSalary());
    }

}