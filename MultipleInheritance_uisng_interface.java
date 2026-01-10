interface A {
    void hello();
}

interface B {
    void hi();
}


class C implements A, B {
    // Must override both methods from interfaces
    @Override
    public void hello() {
        System.out.println("Hello from Interface A");
    }

    @Override
    public void hi() {
        System.out.println("Hi from Interface B");
    }
}

/* Uncommenting this will cause Diamond Problem if class inheritance was tried:
class X {
    void greet() { System.out.println("Greet from X"); }
}

class Y {
    void greet() { System.out.println("Greet from Y"); }
}

class Z extends X, Y { // Not allowed in Java
}
*/

public class MultipleInheritance_uisng_interface {
    public static void main(String[] args) {
        
        C obj = new C();
        obj.hello(); 
        obj.hi();   

        // Class multiple inheritance is not allowed
        // Z obj2 = new Z();  // This would fail to compile
    }
}
