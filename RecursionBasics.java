
public class RecursionBasics {

    public static void printDec(int n) {
        // base case
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printIncrease(int n) {
        // base cases
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncrease(n - 1);
        System.out.print(n + " ");

    }

    // Problem 3 Print factorial of int n
    public static int fact(int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;

    }

    public static int sum(int n) {

        // base case
        if (n == 1) {
            return 1;
        }
        int snm = sum(n - 1);
        int sn = n + sum(n - 1);
        return sn;
    }

    public static int fib(int n) {
        // long maxFib = Long.MAX_VALUE;
        if (n == 0 || n == 1) {
            return n;

            // above and below is our base cases

        }

        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;

        return fn;
    }

    // Problem 6 is the array sorted of not
    public static boolean isSorted(int arr[], int i) {
        // below is base case
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);

    }

    public static int firstOccurence(int arr2[], int key, int i) {
        if (i == arr2.length) {
            return -1;
        }
        if (arr2[i] == key) {
            return i;
        }
        return firstOccurence(arr2, key, i + 1);
    }

    public static int lastOccurence(int arr2[], int key, int i) {

        // base case
        if (i == arr2.length) {
            return -1;
        }
        int isFound = lastOccurence(arr2, key, i + 1);
        if (isFound == -1 && arr2[i] == key) {
            return i;
        }
        // check forward into the array
        return isFound;
    }

    public static int power(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }

        return x * power(x, n - 1);

    }

    public static int optimizedpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedpower(x, n / 2);
        int halfpowersq = halfPower * halfPower;
        // if n is odd
        if (n % 2 != 0) {

            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;
    }

    private static int[] memo;

    public static int tillingProblem(int n) {
        memo = new int[n + 1]; // Initialize memoization array
        return tillingProblem(n);
    }

    // Interview Question for Amazon Tilling Problem
    public static int tillingProblem(int n, int memo[]) {
        if (n == 0) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        // vertical choice tiling
        int fnm = tillingProblem(n - 1);
        // Horizontal Choice of tiling
        int fnm2 = tillingProblem(n - 2);
        int totalWays = fnm + fnm2;

        memo[n] = totalWays; // Store the computed result in the memoization array
        return totalWays;
    }

    public static void main(String[] args) {

        // int arr[] = { 1, 2, 3, 6, 5 };
        // int key = 5;
        // int arr2[] = { 8, 2, 4, 5, 6, 13, 1, 5, 7 };
        // // System.out.println(fib(n));
        // // System.out.println(lastOccurence(arr2, key, 0));
        // // System.out.println(power(2, 5));
        System.out.println(tillingProblem(3));
    }

}
