class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // call parent constructor
        System.out.println("Child Constructor");
    }
}

public class Using_super_keyword {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
