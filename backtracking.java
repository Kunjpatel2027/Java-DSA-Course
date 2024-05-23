public class backtracking {
    public static void changeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion(work)
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); // inner function call
        arr[i] = arr[i] - 2; // backtracking step
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    // find subsets question
    public static void findsubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // recursion step

        // Yes choice
        findsubsets(str, ans + str.charAt(i), i + 1);
        // no choice
        findsubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "Kunj";
        findsubsets(str, "", 0);
        int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);

    }
}
