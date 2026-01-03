class Employee {
    String name;
    double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double getTotalSalary() {
        return basicSalary;
    }
}

class Faculty extends Employee {
    double researchAllowance;

    Faculty(String name, double basicSalary, double researchAllowance) {
        super(name, basicSalary);
        this.researchAllowance = researchAllowance;
    }

    double getTotalSalary() {
        return basicSalary + researchAllowance;
    }
}

public class Inheritance_ {
    public static void main(String[] args) {
        Faculty f = new Faculty("Rahim", 50000, 10000);
        System.out.println("Total Salary: " + f.getTotalSalary());
    }
}