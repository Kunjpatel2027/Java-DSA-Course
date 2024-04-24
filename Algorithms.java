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
            System.out.print(arr[i] + " ");
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

    // Merge Sort (Divide & Conquer)
    public static void mergeSort(int arr[], int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }

        // Work
        int mid = si + (ei - si) / 2;
        // left part
        mergeSort(arr, si, mid);
        // right
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;// iterator for left
        int j = mid + 1;// iterator for right
        int k = 0;// iterator for temp

        // comparing values for left part and right part and placing the smaller value
        // in the temp arr[]

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];

                j++;
            }
            k++;
        }
        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp values to orignal arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    // Quick Sort Algorithm
    public static void quickSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // pidx = pivot index
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx - 1); // left part
        quickSort(arr, pidx + 1, ei); // right part

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for elements smaller than pivot index

        for (int j = si; j < ei; j++) {

            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    // search in Rotated Search array
    public static int search(int arr[], int target, int si, int ei) {
        // base case
        if (si > ei) {
            return -1;
        }

        // work
        int mid = si + (ei - si) / 2;
        // case
        if (arr[mid] == target) {
            return mid;
        }
        // case1 : mid on Line 1
        if (arr[si] <= arr[mid]) {
            // case a: Left in Line 1
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid);
            } else {
                // case b : right of mid
                return search(arr, target, mid + 1, ei);
            }
        }
        // case2 : mid on line 2
        else {
            // case c: right in Line 2
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }
            // case d: left of mid in line 2
            else {
                search(arr, target, si, mid - 1);
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 2;
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
        // quickSort(arr, 0, arr.length - 1);

        // selectionSort(arr);
        // bubbleSort(arr);
        // insertionSort(arr);
        // countingSort(arr);
        // mergeSort(arr, 0, arr.length - 1);
        // Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr, 0, 3, Collections.reverseOrder());

        // Arrays.sort(arr);

        // printArr(arr);

    }
}
