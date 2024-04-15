package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.walk();
        // h.changeColor();
        // Human h1 = new Human();
        // h1.walk();
        Mustang myMustang = new Mustang();
        // Animal-> Horse-> Mustang
    }
}

abstract class Animal {
    String color;

    Animal() {
        // color = "Brown";
        System.out.println("animal constructor is called ");
    }

    void eats() {
        System.out.println("eats anything");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor is called");
    }

    void walk() {
        System.out.println(" walks with four legs");
    }

    void changeColor() {
        color = "Yellow";
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor is called");
    }
}

class Human extends Animal {
    void walk() {
        System.out.println("walks with two legs");
    }

    void changeColor() {
        color = "dark Brown";
    }
}