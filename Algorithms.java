import java.util.Arrays;
import java.util.Collections;

public class Algorithms {

    public static void bubbleSort(Integer arr[]) {
        for (int turns = 0; turns < arr.length - 1; turns++) {
            for (int j = 0; j < arr.length - 1 - turns; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }

    public static void selectionSort(Integer arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            // next part is used to find smallest from the remaining unsorted part of the
            // array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            // swap
            // this part is for eliminating the already founded smallest number
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(Integer arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = i;
            int prev = i - 1;

            // finding the right position to insert
            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };

        // selectionSort(arr);
        // bubbleSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        // Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr, 0, 3, Collections.reverseOrder());

        // Arrays.sort(arr);

        printArr(arr);

    }
}
