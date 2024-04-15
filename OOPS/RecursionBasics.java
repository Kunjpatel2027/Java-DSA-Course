package OOPS;

public class RecursionBasics {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printIncrease(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncrease(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        int n = 10;
        printIncrease(n);
        printDec(n);
    }

}
