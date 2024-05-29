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

    // find permutations with backtracking
    public static void findPermutations(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recurssion (work)
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(Newstr, ans + curr);
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row) {

        // base case
        if (row == board.length) {
            printBoard(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {

            // column loop
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';

                // recursion (work)
                nQueens(board, row + 1); // function call
                board[row][j] = 'x'; // backtracking call
            }

        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------------chess board----------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String str = "abcd";
        // findPermutations(str, "");
        // findsubsets(str, "", 0);
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);
        // N queens Question
        int n = 10;
        char board[][] = new char[n][n];
        // initializing the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
    }
}
