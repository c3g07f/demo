package src.java.mission2.q3;
// 定义抽象类Employee
abstract class Employee {
    String name;
    int id;
    double basicSalary;

    public Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    // 抽象方法
    public abstract double calculateSalary();
}
