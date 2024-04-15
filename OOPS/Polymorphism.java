package OOPS;

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // calc.sum(45, 85);
        // System.out.println(calc.sum(45, 85));
        // System.out.println(calc.sum(52, 650, 7896));
        // System.out.println(calc.sum(7.5f, 8.96f));

        Deer d = new Deer();
        d.eats();
        Animal animal = new Animal();
        animal.eats();
    }
}

class Calculator {

    // method overloading given below
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;

    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    void eats() {
        System.out.println("Eats anything ");
    }

}

class Deer {
    void eats() {
        System.out.println("Eats Grass");
    }
}
