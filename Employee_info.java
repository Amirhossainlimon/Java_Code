class Employee {
    String name, address, jobtitle;
    Double salary, bonous;

    void info() {
        System.out.println("Employees:");
    }
}

class Manager extends Employee {

    void manag_info() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobtitle);
    }

    void bonous_m(Double b) {
        bonous = b;
        System.out.println("Salary after bonus: " + (salary + bonous));
    }

    void report_m() {
        System.out.println("Performance rate 95%");
    }
}

class Developer extends Employee {

    void dev_info() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobtitle);
    }

    void bonous_d(Double b) {
        bonous = b;
        System.out.println("Salary after bonus: " + (salary + bonous));
    }

    void report_d() {
        System.out.println("Performance rate 85%");
    }
}

class Programmer extends Employee {

    void prog_info() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobtitle);
    }

    void bonous_p(Double b) {
        bonous = b;
        System.out.println("Salary after bonus: " + (salary + bonous));
    }

    void report_p() {
        System.out.println("Performance rate 95%");
    }
}

public class Employee_info {
    public static void main(String[] args) {

        Manager m = new Manager();
        m.name = "Mr.Jubaer";
        m.address = "Dhanmondi";
        m.salary = 25000.0;
        m.jobtitle = "Manager";

        m.manag_info();
        m.bonous_m(15000.0);
        m.report_m();

        Developer d = new Developer();
        d.name = "Limon";
        d.address = "Bosila";
        d.salary = 35000.0;
        d.jobtitle = "Senior Developer";

        d.dev_info();
        d.bonous_d(10000.0);
        d.report_d();


        Programmer p = new Programmer();
        p.name = "Eshan";
        p.address = "Jatrabari";
        p.salary = 30000.0;
        p.jobtitle = "Junior Developer";

        p.prog_info();
        p.bonous_p(8000.0);
        p.report_p();
    }
}

