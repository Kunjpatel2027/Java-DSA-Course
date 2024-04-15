import java.util.Scanner;

public class Matrices {

    // public static boolean search(int matrix[][], int key, int n, int m) {

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (matrix[i][j] == key) {
    // System.out.println("found at cell (" + i + "," + j + ")");
    // return true;
    // }

    // }

    // }
    // System.out.println("key not found ");
    // return false;
    // }

    // public static int searchLargest(int matrix[][], int n, int m) {
    // int largest = Integer.MIN_VALUE;
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {

    // if (matrix[i][j] > largest) {
    // largest = matrix[i][j];
    // // System.out.println("found at cell (" + i + "," + j + ")");

    // }
    // }
    // }
    // return largest;
    // }

    // public static int searchSmallest(int matrix[][], int n, int m) {
    // int smallest = Integer.MAX_VALUE;
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {

    // if (matrix[i][j] < smallest) {
    // smallest = matrix[i][j];
    // // System.out.println("found at cell (" + i + "," + j + ")");

    // }
    // }
    // }
    // return smallest;
    // }

    public static void printSpiral(int[][] spiralMatrix) {
        int startRow = 0;
        int startColumn = 0;
        int endRow = spiralMatrix.length - 1;
        int endColumn = spiralMatrix.length - 1;
        while (startRow <= endRow && startColumn <= endColumn) {
            // top
            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(spiralMatrix[startRow][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(spiralMatrix[i][endColumn] + " ");
            }
            // bottom
            for (int j = endColumn - 1; j >= startColumn; j--) {
                if (startColumn == endColumn) {
                    return;
                }

                System.out.print(spiralMatrix[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(spiralMatrix[i][startColumn] + " ");
            }

            startColumn++;
            endColumn--;
            startRow++;
            endRow--;

        }
        System.out.println();
    }

    public static int diagonalSum(int[][] spiralMatrix) {
        int sum = 0;
        // for (int i = 0; i < spiralMatrix.length; i++) {
        // for (int j = 0; j < spiralMatrix[0].length; j++) {
        // if (i == j) {
        // sum += spiralMatrix[i][j];
        // } else if (i + j == spiralMatrix.length - 1) {
        // sum += spiralMatrix[i][j];
        // }
        // }
        // }
        // below is then optimized approach for the diagonal sums
        for (int i = 0; i < spiralMatrix.length; i++) {
            // pd
            sum += spiralMatrix[i][i];
            if (i != spiralMatrix.length - 1 - i) {
                sum += spiralMatrix[i][spiralMatrix.length - i - 1];
            }
        }
        return sum;
    }

    public static boolean staircaseSearch(int spiralMatrix[][], int key) {
        int row = 0;
        int col = spiralMatrix.length - 1;
        while (row <= spiralMatrix.length && col >= 0) {
            if (key == spiralMatrix[row][col]) {
                System.out.println("( " + row + "," + col + ")");
                return true;
            } else if (key < spiralMatrix[row][col]) {
                col--;
            } else {
                row++;
            }

        }
        System.out.println("key not found!!");
        return false;
    }

    public static void main(String[] args) {

        int[][] spiralMatrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // System.out.println(diagonalSum(spiralMatrix));
        // printSpiral(spiralMatrix);
        // int[][] matrix = new int[3][3];
        // int n = matrix.length;
        // int m = matrix[0].length;
        int key = 0;
        staircaseSearch(spiralMatrix, key);

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // Scanner sc = new Scanner(System.in);
        // matrix[i][j] = sc.nextInt();
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print(matrix[i][j] + " ");

        // }
        // System.out.println();

        // }

        // search(matrix, key, n, m);
        // searchLargest(matrix, n, m);
        // int largestNumber = searchLargest(matrix, n, m);
        // System.out.println("Largest number = " + largestNumber);
        // int smallestNumber = searchSmallest(matrix, n, m);
        // System.out.println("Smallest Number =" + smallestNumber);
        //
    }
}
