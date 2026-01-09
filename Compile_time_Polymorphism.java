class Person {

    // Method 1: just name
    void display(String name) {
        System.out.println("Name: " + name);
    }

    // Method 2: just age
    void display(int age) {
        System.out.println("Age: " + age);
    }

    // Method 3: name + age
    void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class  Compile_time_Polymorphism  {
    public static void main(String[] args) {
        Person p = new Person();

        p.display("Amir");       // Name only
        p.display(22);           // Age only
        p.display("Limon", 22);   // Name + Age
    }
}
