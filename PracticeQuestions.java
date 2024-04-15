import java.util.Scanner;

public class PracticeQuestions {
    /**
     * @param args
     */

    // public static int average(int num1, int num2, int num3) {
    // int average = (num1 + num2 + num3) / 3;

    // return average;

    // }

    // public static boolean isEven(int num1) {
    // if ((num1 % 2) == 0) {
    // return true;
    // } else {
    // return false;
    // }

    // }

    // // // Question 3 Function/ Methods
    // // public static boolean palindroneCheck() {
    // // boolean palindrone = false;
    // // // System.out.println("Enter a Number :");
    // // // Scanner scanner = new Scanner(System.in);
    // // int n = scanner.nextInt();
    // // int reversenum = 0;
    // // while (n > 0) {
    // // int lastdigit = n % 10;
    // // n = n / 10;
    // // reversenum = (reversenum * 10) + lastdigit;
    // // // System.out.print(reversenum);
    // // if (reversenum == n) {
    // // palindrone = true;

    // // }

    // // }
    // // // System.out.println(reversenum);
    // // return false;
    // // }

    // // Question 5 sum of digits in the integer
    // public static int sumofint(int num1) {
    // int sum = 0;
    // while (num1 > 0) {
    // int lastdigit = num1 % 10;

    // sum = sum + lastdigit;
    // num1 /= 10;
    // }
    // return sum;
    // }

    // Question 1 Array
    // public static boolean containsDuplicate(int nums[]) {
    // for (int i = 0; i < nums.length - 1; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] == nums[j]) {
    // return true;
    // }

    // }
    // }
    // return false;
    // }

    // // // Question 2 Array
    // public static int minSearch(int nums2[]) {
    // int start = 0;
    // int end = nums2.length - 1;
    // int mid = start + (end - start) / 2;
    // while (start < end) {
    // if (mid > 0 && nums2[mid - 1] > nums2[mid]) {
    // return mid;
    // }

    // else if (nums2[start] <= nums2[mid] && nums2[mid] > nums2[end]) {
    // return start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return start;
    // }

    // public static int search(int nums2[], int start, int end, int target) {
    // int s = start;
    // int e = end;
    // int mid = s + (e - 1) / 2;
    // while (s <= e) {
    // if (mid == target) {
    // return mid;
    // } else if (mid < target) {
    // mid = mid + 1;
    // } else {
    // mid = mid - 1;

    // }
    // }
    // return -1;
    // }

    // public static int invertedArraySearch(int nums2[], int target) {

    // // index of pivot point
    // int min = minSearch(nums2);
    // // find in sorted left
    // if (nums2[min] <= target && target <= nums2.length - 1) {
    // return search(nums2, min, nums2.length - 1, target);
    // } else {
    // return search(nums2, 0, min, target);
    // }
    // }

    // public static int invertedArraySearch(int[] nums, int target) {// min will
    // have index of minimum element of nums
    // int min = minSearch(nums);
    // // find in sorted left
    // if (nums[min] <= target && target <= nums[nums.length - 1]) {
    // return search(nums, min, nums.length - 1, target);
    // }
    // // find in sorted right
    // else {
    // return search(nums, 0, min, target);
    // }
    // }// binary search to find target in left to right boundary

    // public static int search(int[] nums, int left, int right, int target) {
    // int l = left;
    // int r = right;
    // // System.out.println(left+" "+right);
    // while (l <= r) {
    // int mid = l + (r - l) / 2;
    // if (nums[mid] == target) {
    // return mid;
    // } else if (nums[mid] > target) {
    // r = mid - 1;
    // } else {
    // l = mid + 1;
    // }
    // }
    // return -1;
    // }

    // // smallest element index
    // public static int minSearch(int[] nums) {
    // int left = 0;
    // int right = nums.length - 1;
    // while (left < right) {
    // int mid = left + (right - 1) / 2;
    // if (mid > 0 && nums[mid - 1] > nums[mid]) {
    // return mid;
    // } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
    // left = mid + 1;
    // } else {
    // right = mid - 1;
    // }
    // }
    // return left;
    // }

    // Questions for Basic Sorting Algorithms
    // Question 1
    // a. Bubble Sort
    // public static void bubbleSort(int arr[]) {
    // for (int turns = 0; turns < arr.length - 1; turns++) {
    // for (int j = 0; j < arr.length - 1 - turns; j++) {
    // // to change the order of sorting from decending to ascending change sign of
    // <
    // // to >
    // if (arr[j] < arr[j + 1]) {
    // // swap
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }
    // }

    // b. Selection Sort
    // public static void selectionSort(int arr[]) {

    // for (int i = 0; i < arr.length - 1; i++) {
    // int minPos = i;
    // for (int j = i + 1; j < arr.length - 1; j++) {
    // if (arr[minPos] < arr[j]) {
    // minPos = j;

    // }
    // }
    // int temp = arr[minPos];
    // arr[minPos] = arr[i];
    // arr[i] = temp;
    // }
    // }

    // c. insertion sort
    // public static void insertionSort(int arr[]) {
    // for (int i = 1; i < arr.length; i++) {
    // int curr = i;
    // int prev = i - 1;

    // // for changing the order from decending to ascending change the sign of
    // // arr[prev]< curr to > curr
    // while (prev >= 0 && arr[prev] < curr) {
    // arr[prev + 1] = arr[prev];
    // prev--;
    // }
    // arr[prev + 1] = curr;

    // }
    // }

    // public static void countingSort(int arr[]) {
    // int largest = Integer.MIN_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // largest = Math.max(largest, i);
    // }

    // int count[] = new int[largest + 1];
    // for (int i = 0; i < arr.length; i++) {
    // count[arr[i]]++;
    // }

    // int j = 0;
    // for (int i = count.length - 1; i >= 0; i--) {

    // while (count[i] > 0) {
    // arr[j] = i;
    // j++;
    // count[i]--;
    // }

    // }
    // }

    // public static void printArr(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i] + "");
    // }
    // System.out.println();
    // }

    // Questions for strings
    // Question 1

    // public static void count(String str) {
    // // StringBuilder sb = new StringBuilder("");
    // int count = 0;
    // for (int i = 0; i < str.length(); i++) {

    // char ch = str.charAt(i);
    // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch ==
    // 's') {
    // count++;
    // }

    // }
    // System.out.println("count of vowels =" + count);
    // }

    // question 4 Strings = Anagrams or not
    public static boolean isAnaogramOrNot(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++)
                if (str1.charAt(i) == str2.charAt(j)) {
                    return true;
                }
        }
        return false;
    }

    public static void main(String[] args) {
        // Questions for bit manipulation
        // Question 2
        int num = 4;
        // System.out.println(-~num);

        // Question 4
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
        }

        // String str1 = "race";
        // String str2 = "car";
        // System.out.println(isAnaogramOrNot(str1, str2));
        // Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // count(str);

        // String str = "ShradhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str1) + " " + str.equals(str2));

        // String str = "ApnaCollege".replace("l", "");
        // System.out.println(str);

        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // selectionSort(arr);
        // bubbleSort(arr);
        // // insertionSort(arr);
        // countingSort(arr);
        // printArr(arr);
        // Arrays Questions
        // Question 1

        // int nums[] = { 1, 2, 3, 4, 6, 8 };
        // int nums2[] = { 4, 5, 6, 7, 1, 2, 3 };
        // int pos = invertedArraySearch(nums2, 2);
        // System.out.println(pos);

        // System.out.println(containsDuplicate(nums));

        // Questions of Functions/Methods

        // int num1 = 274589;
        // int num2 = 35;
        // int num3 = 47;
        // System.out.println(sumofint(num1));
        // System.out.println(palindroneCheck());

        // // Question 3 MATH() class
        // System.out.println(Math.min(num2, num3));
        // System.out.println(Math.max(num2, num3));
        // System.out.println(Math.sqrt(num3));
        // System.out.println(Math.pow(10, 14));
        // // System.out.println(Math.);
        // System.out.println(Math.abs(num3));

        // Question 1 (i)
        // int x = 2, y = 5;
        // int exp1 = (x * y / x);
        // int exp2 = (x * (y / x));
        // System.out.print(exp1 + " , ");
        // System.out.print(exp2);

        // (ii)

        // int x = 200, y = 50, z = 100;
        // if (x > y && y > z) {
        // System.out.println("Hello");
        // }
        // if (z > y && z < x) {
        // System.out.println("Java");
        // }
        // if ((y + 200) < x && (y + 150) < z) {
        // System.out.println("Hello Java");
        // }

        // (iii)
        // int x, y, z;
        // x = y = z = 2;
        // x += y;
        // y -= z;
        // z /= (x + y);
        // System.out.println(x + " " + y + " " + z);

        // (iv)

        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;
        // int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b *
        // y);
        // System.out.println(exp);

        // (v)

        // int x = 10, y = 5;
        // int exp1 = (y * (x / y + x / y));
        // int exp2 = (y * x / y + y * x / y);

        // ans for both the print statement would be as they are just opening brackets
        // in the last one

        // System.out.println(exp1);
        // System.out.println(exp2);

        // Variable and Datatypes Questions

        // Question 1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number : ");
        // double a = sc.nextDouble();
        // System.out.println("Enter Second number : ");
        // double b = sc.nextDouble();
        // System.out.println("Enter Third number : ");
        // double c = sc.nextDouble();
        // double average = a + b + c / 3;
        // System.out.println("Average = " + average);

        // // Question 2

        // System.out.println("Enter the length of side : ");
        // double side = sc.nextDouble();
        // double areaofsquare = side * side;
        // System.out.println("Area of square = " + areaofsquare);

        // // Question 3

        // System.out.println("Enter the price of Pen : ");
        // float costofPen = sc.nextFloat();
        // System.out.println("Enter the price of Pencil : ");

        // float costofPencil = sc.nextFloat();
        // System.out.println("Enter the price of Eraser : ");

        // float costofEraser = sc.nextFloat();
        // float sumNotax = costofEraser + costofPen + costofPencil;
        // System.out.println(sumNotax);
        // float tax = (costofEraser + costofPen + costofPencil * 18 / 100);
        // float total = sumNotax + tax;

        // System.out.println("Total with tax =" + total);

        // Question 4

        // byte b = 4;
        // char c = 'a';
        // short s = 512;
        // int i = 1000;
        // float f = 3.14f;
        // double d = 99.9954;

        // double result = (f * b) + (i % c) - (d * s);
        // System.out.println(result);

        // // QUestion 5
        // int $ = 24;

        // Pratice questions of If else and switch

        // Question 1

        // System.out.println("Enter a number: ");
        // int number = sc.nextInt();
        // if (number < 0) {
        // System.out.println(number + " is a negative number");

        // } else {
        // System.out.println(number + " is a positive number");
        // }

        // Question 2

        // double temp = 98;
        // if (temp < 100) {
        // System.out.println("You have Fever , please go to doctor!");

        // } else {
        // System.out.println("You do not have fever , Eat an ice-cream");

        // }

        // Question 3
        // System.out.println("Enter a number between 1-7 : ");
        // int number = sc.nextInt();
        // switch (number) {
        // case 1:
        // System.out.println("Monday");

        // break;
        // case 2:
        // System.out.println("Tuesday");

        // break;
        // case 3:
        // System.out.println("Wednesday");

        // break;
        // case 4:
        // System.out.println("Thurday");

        // break;
        // case 5:
        // System.out.println("Friday");

        // break;
        // case 6:
        // System.out.println("Saturday");

        // break;
        // case 7:
        // System.out.println("Sunday");

        // break;

        // default:
        // break;
        // }

        // Question 4
        // int a = 34, b = 36;
        // // Ternary Operator example
        // boolean x = (a < b) ? true : false;
        // int y = (a > b) ? a : b;
        // System.out.println(y);

        // Question 5
        // this one has nested if else statement

        // System.out.println("Enter a year : ");
        // int year = sc.nextInt();
        // if (year % 4 == 0) {
        // if (year % 100 == 0) {
        // if (year % 400 == 0) {
        // System.out.println(year + " is a leap year");
        // } else {
        // System.out.println(year + " is not a leap year");
        // }
        // } else {
        // System.out.println(year + " is a leap year");
        // }
        // } else {
        // System.out.println(year + " is not a leap year");

        // }

        // Practice Questions for Loops

        // Question 1

        // for (int i = 0; i < 5; i++) {
        // System.out.println("Hello");
        // i += 2;

        // }

        // Question 2

        // int evenSum = 0;
        // int oddSum = 0;
        // int choice;
        // int num;

        // do {
        // System.out.println("Enter a number : ");
        // num = sc.nextInt();

        // if (num % 2 == 0) {
        // System.out.println(evenSum += num);
        // } else {
        // System.out.println(oddSum += num);
        // }

        // System.out.println("Do you want to contiue ? if yes then enter 1 or 0 to
        // exit");
        // choice = sc.nextInt();

        // } while (choice == 0);
        // {
        // System.out.println("Sum of even Numbers : " + evenSum);
        // System.out.println("Sum of odd Numbers : " + oddSum);
        // }

        // Question 3
        // System.out.println("Enter a number : ");
        // int n = sc.nextInt();
        // int fact = 1;

        // for (int i = 1; i <= n; i++) {
        // fact *= i;
        // }
        // System.out.println("Factorial = " + fact);

        // Question 4

        // System.out.println("Enter a number : ");
        // int n = sc.nextInt();

        // for (int i = 1; i <= 10; i++) {

        // int ans = n * i;
        // System.out.println(n + "*" + i + "=" + ans);
        // }

        // Question 5

        // Arrays Questions
        // Question 1

    }

}
