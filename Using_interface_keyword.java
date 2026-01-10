interface Animal {
    public void Walks();
}

class Cat implements Animal {
    public void Walks() {
        System.out.println("Walks on 4 legs");
    }
}

public class Using_interface_keyword {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.Walks();
    }
}
