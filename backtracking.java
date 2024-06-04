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

    public static boolean nQueens(char board[][], int row) {

        // base case
        if (row == board.length) {
            // printBoard(board);
            count++;
            return true;
        }
        for (int j = 0; j < board.length; j++) {

            // column loop
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';

                // recursion (work)
                if (nQueens(board, row + 1)) {
                    return true;
                }
                // function call
                board[row][j] = 'x'; // backtracking call
            }

        }
        return false;
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

    static int count = 0;

    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) { // condition for the last cell
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        // ways for down moves
        int w1 = gridWays(i + 1, j, n, m);
        // ways for right move
        int w2 = gridWays(i, j + 1, n, m);
        return w1 + w2;
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // for column
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }

        }
        // for rows
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // for Grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }
        // recursion (work)
        int nextrow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextrow = row + 1;
            nextCol = 0;
        }
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextrow, nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextrow, nextCol)) { // solution exist
                    return true;

                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("solution exists");
            printSudoku(sudoku);
        } else {
            System.out.println("solution does not exists!");
        }

        // Gridways problem

        String str = "abcd";
        // findPermutations(str, "");
        // findsubsets(str, "", 0);
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);
        // N queens Question
        // int n = 2;
        // char board[][] = new char[n][n];
        // // initializing the board
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // board[i][j] = 'x';
        // }
        // }
        // // optimizing n queens for printing 1 possible solution
        // if (nQueens(board, 0)) {
        // System.out.println("solution is possible ");
        // printBoard(board);
        // } else {
        // System.out.println("solution is not possible ");
        // }
        // ;
        // optimizing n queens with count ways:
        // System.out.println("total ways to solve n queens = " + count);
    }

}
