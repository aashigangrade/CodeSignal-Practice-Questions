In the popular Minesweeper game you have a board with some mines and those cells that do not contain a mine have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a Minesweeper game setup.

Example

For

matrix = [[true, false, false],
          [false, true, false],
          [false, false, false]]
the output should be

solution(matrix) = [[1, 2, 1],
                    [2, 1, 1],
                    [1, 1, 1]]
Check out the image below for better understanding:



Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.array.boolean matrix

A non-empty rectangular matrix consisting of boolean values - true if the corresponding cell contains a mine, false otherwise.

Guaranteed constraints:
2 ≤ matrix.length ≤ 100,
2 ≤ matrix[0].length ≤ 100.

[output] array.array.integer

Rectangular matrix of the same size as matrix each cell of which contains an integer equal to the number of mines in the neighboring cells. Two cells are called neighboring if they share at least one corner.
----------------------

int[][] solution(boolean[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] hintsMatrix = new int[rows][cols];

    int[][] adjacents = {
        {-1, -1}, {-1, 0}, {-1, 1},
        {0, -1},           {0, 1},
        {1, -1}, {1, 0},  {1, 1}
    };

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j]) {
                for (int[] adjacent : adjacents) {
                    int newRow = i + adjacent[0];
                    int newCol = j + adjacent[1];

                    if (isValid(newRow, newCol, rows, cols)) {
                        hintsMatrix[newRow][newCol]++;
                    }
                }
            }
        }
    }

    return hintsMatrix;
}

public static boolean isValid(int row, int col, int rows, int cols) {
    return row >= 0 && row < rows && col >= 0 && col < cols;
}