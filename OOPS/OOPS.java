package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Pen pen = new Pen();
        // pen.setColor("Black");
        // pen.setTip(5);
        // System.out.println(pen.getTip());
        // System.out.println(pen.getColor());
        // Student s1 = new Student();
        // Student s2 = new Student("Kunj");

        // Student s3 = new Student(123);
        Student s1 = new Student();

        // s1.name = "Kunj Patel";
        // s1.age = 21;
        // s1.passWord = "abc";
        // s1.marks[0] = 100;
        // s1.marks[1] = 95;
        // s1.marks[2] = 85;

        Student s2 = new Student(s1);

        // s2.passWord = "xyz";
        // s1.marks[2] = 75;
        // for (int i = 0; i < 3; i++) {
        // System.out.println(s2.marks[i]);
        // }

        // student.calculatePercentage(73, 54, 75);
        // System.out.println(s1.name);

        // BankAccount myAcc = new BankAccount();
        // myAcc.userName = "Kunj Patel";
        // myAcc.setPassword("PAtel007");
        s1.schoolName = "JMV";
        s2.schoolName = "DBS";
        System.out.println(s2.schoolName);
        System.out.println(s1.returnPercentage(85, 78, 65));
        Horse h = new Horse();

    }
}

class Student {
    String name;
    int age;
    String passWord;
    int marks[];
    static String schoolName;
    float percentage;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    // below is a constructor (non- parameterized constructor to be specific)
    Student() {
        marks = new int[3];

        System.out.println("constructor is called...");
    }

    // below is a constructor ( parameterized constructor to be specific)
    // shallow constructor
    // Student(Student s1) {
    // marks = new int[3];
    // this.age = age;
    // this.name = name;

    // }
    // deep constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = name;
        this.age = age;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }

    }

    Student(String name) {
        marks = new int[3];

        this.name = name;
    }

    Student(int age) {
        marks = new int[3];

        this.age = age;
    }

    // void calculatePercentage(int phy, int math, int chem) {
    // percentage = (phy + math + chem) / 3;
    // System.out.println(percentage);

    // }
    static int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }
}

class BankAccount {
    public String userName;
    private String passWord;

    public void setPassword(String newPasswd) {
        passWord = newPasswd;
    }
}

class Pen {
    String color = "blue";
    int tip;

    int getTip() {
        return this.tip;
    }

    String getColor() {
        return this.color;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

class Animal {
    Animal() {
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        // super();
        System.out.println("Horse constructor is called");
    }
}
