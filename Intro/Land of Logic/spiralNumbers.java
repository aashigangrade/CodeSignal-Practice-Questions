Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.

Example

For n = 3, the output should be

solution(n) = [[1, 2, 3],
               [8, 9, 4],
               [7, 6, 5]]
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

Matrix size, a positive integer.

Guaranteed constraints:
3 ≤ n ≤ 100.

[output] array.array.integer
-----------------

int[][] solution(int n) {
    int[][] spiralMatrix = new int[n][n];
    int num = 1;
    int rowStart = 0, rowEnd = n - 1;
    int colStart = 0, colEnd = n - 1;

    while (num <= n * n) {
        for (int i = colStart; i <= colEnd; i++) {
            spiralMatrix[rowStart][i] = num++;
        }
        rowStart++;

        for (int i = rowStart; i <= rowEnd; i++) {
            spiralMatrix[i][colEnd] = num++;
        }
        colEnd--;

        for (int i = colEnd; i >= colStart; i--) {
            spiralMatrix[rowEnd][i] = num++;
        }
        rowEnd--;

        for (int i = rowEnd; i >= rowStart; i--) {
            spiralMatrix[i][colStart] = num++;
        }
        colStart++;
    }

    return spiralMatrix;
}
