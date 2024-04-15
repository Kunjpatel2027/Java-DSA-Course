package OOPS;

public class Inheritance {
    public static void main(String[] args) {

        Fish tuna = new Fish();
        tuna.eats();
        tuna.breathe();
        tuna.color = "BLack";
        System.out.println(tuna.color);
    }

}

class Animal {
    String color;

    void eats() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// derived class
class Fish extends Animal {
    int fins = 2;

    void swims() {
        System.out.println("swims in water");
    }
}

class Mammals extends Animal {
    void legs() {
        System.out.println("two");
    }
}

class Humans extends Mammals {
    void walks() {
        System.out.println("walk with two legs");
    }
}