package src.java.mission2.q3;

class TemporaryEmployee extends Employee {
    double workHours;
    double hourlyWage;

    public TemporaryEmployee(String name, int id, double basicSalary, double workHours, double hourlyWage) {
        super(name, id, basicSalary);
        this.workHours = workHours;
        this.hourlyWage = hourlyWage;
    }

    // 实现抽象方法
    @Override
    public double calculateSalary() {
        return workHours * hourlyWage;
    }
}
