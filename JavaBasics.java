// import java.util.Scanner;

public class JavaBasics {

    /**
     * @param args
     */

    // public static void swap(int a, int b) {

    // // swap exchange
    // int temp = a;
    // a = b;
    // b = temp;
    // System.out.println("a = " + a);
    // System.out.println("b = " + b);
    // }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }

        return f;

    }

    // Binomial coefficient

    // public static int bcoefficient(int n, int r) {
    // int nfact = factorial(n);
    // int rfact = factorial(r);
    // int nmr = factorial(n - r);

    // int bi = nfact / (rfact * nmr);
    // return bi;
    // }

    // public static int product(int a, int b) {
    // int product = a * b;
    // System.out.println(product);
    // return product;

    // }

    // public static void printHelloWorld() {
    // System.out.println("Hello World");

    // }

    // public static int calculateSum(int a, int b) { // this int a and int b in the
    // Parenthesis are called formal
    // // Pararmeters

    // int sum = a + b;
    // System.out.println("sum is : " + sum);
    // return sum;
    // }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    // this is for fuctiion overloading with datatypes

    public static float sum(float a, float b) {
        return (a + b);

    }

    // this is called method-overloading
    public static int sum(int a, int b, int c) {
        return (a + b + c);
    }

    public static boolean isPrime(int n) {

        boolean isPrime = true;

        if (n == 2) {
            isPrime = true;
        }
        // for (int i = 2; i <= n - 1; i++) {
        // if (n % i == 0) {
        // isPrime = false;
        // }

        // }
        // return isPrime;

        // optimized for loop
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }

        }
        return isPrime;
    }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void BintoDecimal(int binNum) {
        int pow = 0;
        int myNum = binNum;
        int dec = 0;
        while (binNum > 0) {
            int lastdigit = binNum % 10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
            // this.pow;
        }

        System.out.println("Decimal of " + myNum + "= " + dec);
    }

    public static void DecitoBin(int decNum) {

        int pow = 0;
        int mydecNum = decNum;
        int bin = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary of " + mydecNum + "= " + bin);
    }

    public static void main(String[] args) {
        // sum(2, 30);
        // sum(2, 3, 45); // this above lines give us an example of function overloading
        // // with parameters

        // System.out.println(sum(4.8f, 5.9f)); // this above lines give us an example
        // of function overloading with
        // Datatypes

        // primeOrNot(5);
        // primesInRange(100);
        // BintoDecimal(1111101);
        DecitoBin(110);
        // System.out.println(bcoefficient(13, 14));
        // System.out.println("Hello Kunj ");
        // System.out.println("Hello Kunj ");
        // System.out.println("Hello Kunj \n how are you ?");

        // Defining a variable
        // int a = 5;
        // System.out.println(a);
        // // long b = 1.6567777777775;
        // char x = 'b';
        // System.out.println(x);
        // String name = "Ottawa";
        // System.out.println(name);
        // double c = 45.65;
        // System.out.println(c);
        // byte d = 4;
        // System.out.println(d);

        // float price = 10.5f;
        // System.out.println(price);
        // boolean bb = true;
        // System.out.println(bb);

        // here a is address of the variable or name and int is a type of variable and 5
        // is the value that is stored in the variable

        // Printing a pattern
        // System.out.println("\n* * * *\n* * *\n* *\n*");

        // code to calculate sum of a and b
        /*
         * this is for
         * multi line comments
         */
        // Scanner scanner = new Scanner(System.in);
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();

        // int sum = a + b;
        // int product = a * b;
        // int div = a / b;
        // System.out.println(div);

        // Area of Circle

        // double radius = scanner.nextDouble();
        // double pie = 3.14;
        // double area = pie * radius * radius;
        // System.out.println(area);

        // Type Conversion
        // int a = 655;
        // long b = a;
        // System.out.println(b);

        // Type Casting
        // float marks = 99.999f;
        // int marks2 = (int) marks;
        // System.out.println(marks2);

        // Example of Type casting with char

        // char ch = 'a';
        // int number = ch;
        // System.out.println(number);

        // Type Promotion in expresion

        // int a = 10;
        // float b = 20.25f;
        // long c = 24;
        // double d = 30;
        // double ans = a + b + c + d;
        // System.out.println(ans);

        // example 1 of Type promotion
        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte) (a + b + c);
        // System.out.println(bt);

        // example 2 of Type promotion

        // byte b = 5;
        // byte a = (byte) (b * 2);
        // System.out.println(a);

        // Operators :

        // Arithmetic
        // 1 Binary
        // int a = 10;
        // int b = 15;
        // System.out.println("Add=" + (a + b));

        // 2 Unary
        // int a = 10;
        // int b = a++;
        // System.out.println(a);
        // System.out.println(b);

        // int a = 10;
        // int b = a--;
        // System.out.println(a);
        // System.out.println(b);

        // Relational Operators

        // int a = 4;
        // int b = 5;
        // System.out.println(a != b);
        // System.out.println(a < b);
        // System.out.println(a >= b);
        // System.out.println(a <= b);

        // Logical Operators

        // System.out.println((3 > 2) || (5 < 0));

        // System.out.println(!(5 < 0));

        // linear Serach
        // int arr[] = new int[5];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = i + i * 19;

        // }
        // int SerchValue = 72;

        // If Else Loop example
        // System.out.println("Enter your age : ");
        // int age = scanner.nextInt();
        // if (age >= 18) {
        // System.out.println("Adult");

        // }
        // if (age > 13 && age < 18) {
        // System.out.println("Teenager");

        // } else {
        // System.out.println("Not Adult");

        // }
        // int A = 2;
        // int B = 3;
        // if (A >= B) {
        // System.out.println("A is Largest of 2");
        // } else {
        // System.out.println("B is Largest of 2");

        // }

        // Print if a number is even or odd
        // System.out.println("Enter a Number : ");
        // int num = scanner.nextInt();
        // if (num % 2 == 0) {
        // System.out.println(num + " is even Number");
        // } else {
        // System.out.println(num + " is Odd Number");
        // }

        // Else if example
        // int age = 6;
        // if (age >= 18) {
        // System.out.println("adult");

        // }
        // so in this case the else if loop is only checked if the above if condition
        // becomes false , so it saves computational time of compiler

        // else if (age >= 13 && age <= 17) {
        // System.out.println("Child ");
        // } else {
        // System.out.println("Baby");
        // }

        // Print the Largest of 3 numbers

        // int a = 2;
        // int b = 3;
        // int c = 4;
        // if (a >= b && a >= c) {
        // System.out.println("LArgest is a : " + a);
        // }

        // else if (b >= c) {
        // System.out.println("LArgest is b : " + b);
        // } else {
        // System.out.println("LArgest is c : " + c);

        // }

        // Ternary Operator
        // // example 1
        // int num = 5546988;
        // String type = ((num % 2) == 0) ? "Even" : "Odd";
        // System.out.println(type);

        // example 2
        // int marks = 33;
        // String rc = marks >= 33 ? "Pass" : "Fail";
        // System.out.println(rc);

        // switch Statements

        // int number = 1;
        // switch (number) {
        // case 1:
        // System.out.println("Burger");
        // break;
        // case 2:
        // System.out.println("Samosa");
        // break;
        // case 3:
        // System.out.println("Pizza");

        // break;

        // default:
        // System.out.println("You are dumb enough to dream about this junk food!");
        // break;
        // }

        // char ch = 'f';
        // switch (ch) {
        // case 'a':
        // System.out.println("Burger");
        // break;
        // case 'f':
        // System.out.println("Samosa");
        // break;
        // case 'g':
        // System.out.println("Pizza");

        // break;

        // default:
        // System.out.println("You are dumb enough to dream about this junk food!");
        // break;
        // }

        // Calculator using Switch Statement
        // System.out.println("Enter first number : ");
        // int a = scanner.nextInt();
        // System.out.println("Enter second number : ");

        // int b = scanner.nextInt();
        // System.out.println("Enter your Operator:");
        // char ch = scanner.next().charAt(0);
        // switch (ch) {
        // case '+':
        // System.out.println(a + b);

        // break;
        // case '-':
        // System.out.println(a - b);
        // break;
        // case '*':
        // System.out.println(a * b);
        // break;
        // case '/':
        // System.out.println(a * b);
        // break;
        // case '%':
        // System.out.println(a % b);

        // default:
        // System.out.println("Bas itna hi aata hai ");
        // break;
        // }

        // Loops

        // 1.) While loop : this loop will run till the condition will be true
        // example
        // int counter = 0;
        // while (counter < 20) {
        // System.out.println("You are chutiya :)");
        // // here we are increasing the value of counter using increment operator(++)
        // by
        // // 1.
        // counter++;

        // }
        // System.out.println("Printed the string 20 times");

        // Print number from 1 to 10 using while loop

        // int count = 1;
        // while (count <= 10) {
        // System.out.println(count);

        // count++;
        // }

        // Print number from 1 to n
        // here n mean range
        // System.out.println("Enter a range : ");
        // int range = scanner.nextInt();
        // int counter = 1;
        // while (counter <= range) {
        // System.out.println(counter + " ");
        // counter++;
        // }

        // Print sum of first n natural numbers

        // int n = scanner.nextInt();
        // int i = 1; // i is an iterator
        // int sum = 0;
        // while (i <= n) {
        // sum = sum + i;
        // i++;
        // }
        // System.out.println(sum);

        // For loop
        // example
        // for (int i = 1; i <= 5; i++) {
        // System.out.println("Hello World");
        // }

        // print a square pattern
        // int num = scanner.nextInt();
        // int ln;
        // for (ln = 1; ln < 5; ln++) {
        // System.out.println("****");
        // }

        // Printing the number in reverse
        // System.out.println("Enter a Number :");
        // int n = scanner.nextInt();
        // while (n > 0) {
        // int lastdigit = n % 10;
        // System.out.print(lastdigit + " ");
        // n = n / 10;
        // }
        // System.out.println();

        // // Reverse the Given number
        // System.out.println("Enter a Number :");
        // int n = scanner.nextInt();
        // int reversenum = 0;
        // while (n > 0) {
        // int lastdigit = n % 10;
        // n = n / 10;
        // reversenum = (reversenum * 10) + lastdigit;
        // // System.out.print(reversenum);
        // }
        // System.out.println(reversenum);

        // // DO WHile loop

        // int counter = 1;
        // do {
        // System.out.println("Hello World Guysssss!!!");
        // counter++;
        // } while (counter < 10);

        // // break statement example
        // for (int i = 1; i < 10; i++) {
        // if (i == 3) {
        // break;
        // }
        // System.out.println(i);
        // }
        // System.out.println("Exiting the loop");

        // Practice Question
        // do {
        // int num = scanner.nextInt();
        // if (num % 10 == 0) {
        // break;
        // }
        // System.out.println(num);
        // } while (true);

        // Continue keyword example

        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // continue;
        // }
        // System.out.println(i);
        // }

        // Continue keyword question
        // Display all numbers entered except the multiples of 10

        // do {
        // System.out.println("Enter your number : ");
        // int i = scanner.nextInt();
        // if (i % 10 == 0) {
        // continue;
        // }
        // System.out.println("number was :" + i);
        // }

        // while (true);

        // Check if the number is prime or not with the help of loop

        // int n = scanner.nextInt();
        // boolean isPrime = true;

        // if (n == 2) {
        // System.out.println("number is prime");
        // } else {
        // for (int i = 2; i <= Math.sqrt(n); i++) {
        // if (n % i == 0) // n is a multiple of i (if not equal to 1 or n)
        // {
        // isPrime = false;
        // }

        // }

        // if (isPrime == true) {
        // System.out.println("number is prime");
        // } else {
        // System.out.println("number is not prime");
        // }
        // }

        // Functions and Methods

        // calling the hello world function
        // printHelloWorld(); // function call

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // calculateSum(a, b); // this a, b are called as arguements

        // swap - value exchange
        // int a = 15;
        // int b = 6;
        // int n = 4;
        // int r = 3;
        // int x = (n - r);

        // int i;
        // swap(a, b);
        // product(a, b);
        // System.out.println(factorial(n));
        // System.out.println(factorial(r));
        // System.out.println(bcoefficient(n, r));

    }

}
