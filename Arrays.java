import java.util.Scanner;

public class Arrays {

    // passing array as an arguement

    public static void update(int marks[], int nonChangable) {
        nonChangable = 15;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 2;

        }
    }

    // Linear Search
    public static int LinearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Largest number in an array
    public static int getLargest(int numbers[]) {
        int Largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (Largest < numbers[i]) {
                Largest = numbers[i];
            }
        }

        return Largest;

    }

    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // comparisions
            if (numbers[mid] == key) {
                // System.out.println("Found the key ="+key);
                return mid;
            }
            if (numbers[mid] < key) { // right
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            // if (numbers[mid]>key) {
            // start=mid-1;
            // }
        }
        return -1;
    }

    // Reverse an array (here number[])
    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {

            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void printPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + current + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println("");
        }
        System.out.println("total no. of paris : " + tp);

    }

    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        // int sum = 0;
        // int i = 0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {

            // calculate the prefix of the sum
            for (i = 1; i < prefix.length; i++) {
                prefix[i] = prefix[i - 1] + numbers[i];
            }
            for (int j = i; j < numbers.length; j++) {
                int start = i;

                int end = j;
                // for (int k = start; k <= end; k++) { // print
                // // System.out.println(numbers[k] + " ");// subarray
                // // Sum of subarray
                // currSum += numbers[k];
                // }
                // System.out.println(currSum);
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }

            // System.out.println();
        }
        // System.out.println("total subarrays : " + ts);
        System.out.println("max sum of subarrays : " + maxSum);

    }

    // kadaness algorithm
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max subarray sum is : " + ms);
    }

    public static void main(String[] args) {
        // int marks[] = new int[100];
        // int marks[] = { 89, 85, 75 };
        // int nonChangable = 5;
        // update(marks, nonChangable);
        // System.out.println(nonChangable);

        int numbers[] = { -2, -3, 4, -1, -2, 1, 5 };
        // pairing the numbers of arrays
        // printPairs(numbers);
        // printSubarrays(numbers);
        kadanes(numbers);
        // reverse the numbers array
        // reverse(numbers);
        // printing the reversed array
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.print(numbers[i] + "");
        // }
        // System.out.println(" ");
        // System.out.println("largest in the array : " + getLargest(numbers));
        // System.out.println("smallest in the array : " + getSmallest(numbers));

        int key = 55;
        // System.out.println("index for key is : " + binarySearch(numbers, key));
        // int index = LinearSearch(numbers, key);
        // if (index == -1) {
        // System.out.println("Not Found");
        // } else {
        // System.out.println("key is at index : " + index);
        // }

        // Printing the marks with for loop

        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i] + "");
        // }
        // System.out.println();

        // System.out.println("Length of array = " + marks.length);
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("Physics: " + marks[0]);
        // System.out.println("Chemistry: " + marks[1]);

        // System.out.println("Maths: " + marks[2]);
        // int percentage = (marks[1] + marks[0] + marks[2]) / 3;
        // System.out.println("Percentage: " + percentage + "%");

        // updating the existing marks of maths
        // marks[2] = 100;
        // marks[2] = marks[2] + 1;

        // System.out.println("Maths: " + marks[2]);

    }
}
