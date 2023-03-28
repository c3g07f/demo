package src.java.mission2.q3;

// 正式员工类
class RegularEmployee extends Employee {
    private final int workYears;
    private final double bonus;

    public RegularEmployee(String name, int id, double basicSalary, int workYears, double bonus) {
        super(name, id, basicSalary);
        this.workYears = workYears;
        this.bonus = bonus;
    }

    // 实现抽象方法
    @Override
    public double calculateSalary() {
        return this.basicSalary + this.workYears * 1000 + bonus;
    }
}