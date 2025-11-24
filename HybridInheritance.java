public class HybridInheritance {
    // Base class
    static class ClassA {
        void displayA() {
            System.out.println("This is ClassA");
        }
    }

    // Hierarchical inheritance
    static class ClassB extends ClassA {
        void displayB() {
            System.out.println("This is ClassB");
        }
    }

    static class ClassC extends ClassA {
        void displayC() {
            System.out.println("This is ClassC");
        }
    }

    // Multiple inheritance using interfaces
    interface InterfaceB {
        void methodB();
    }

    interface InterfaceC {
        void methodC();
    }

    // ClassD implementing multiple interfaces (hybrid inheritance)
    static class ClassD implements InterfaceB, InterfaceC {
        public void methodB() {
            System.out.println("InterfaceB method implemented in ClassD");
        }

        public void methodC() {
            System.out.println("InterfaceC method implemented in ClassD");
        }
    }

    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.displayA();
        b.displayB();

        ClassC c = new ClassC();
        c.displayA();
        c.displayC();

        ClassD d = new ClassD();
        d.methodB();
        d.methodC();
    }
}
