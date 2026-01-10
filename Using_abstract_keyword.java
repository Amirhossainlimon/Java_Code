abstract class Animal {
    abstract void walk();
    void eat() { 
        System.out.println("Animal eats");
     }
}

class Horse extends Animal {
    Horse() { System.out.println("Created a Horse"); }
    @Override
    public void walk() {
         System.out.println("Walks on 4 legs"); 
        }
}

public class Using_abstract_keyword {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
      
    }
}
