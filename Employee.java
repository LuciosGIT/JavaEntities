package entities;

public class Employee {
    public String name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary() {
        return GrossSalary - Tax;
    }
    public void IncreaseSalary(double percentage) {
        System.out.println((percentage/100) * this.GrossSalary + NetSalary());
    }
}
