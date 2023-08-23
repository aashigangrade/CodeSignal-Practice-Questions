Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.

Example

For

matrix = [[1, 2, 1],
          [2, 2, 2],
          [2, 2, 2],
          [1, 2, 3],
          [2, 2, 1]]
the output should be
solution(matrix) = 6.

Here are all 6 different 2 × 2 squares:

1 2
2 2
2 1
2 2
2 2
2 2
2 2
1 2
2 2
2 3
2 3
2 1
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.array.integer matrix

Guaranteed constraints:
1 ≤ matrix.length ≤ 100,
1 ≤ matrix[i].length ≤ 100,
0 ≤ matrix[i][j] ≤ 9.

[output] integer

The number of different 2 × 2 squares in matrix.
-------------------

int solution(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int count = 0;

    for (int i = 0; i < rows - 1; i++) {
        for (int j = 0; j < cols - 1; j++) {
            int a = matrix[i][j];
            int b = matrix[i][j + 1];
            int c = matrix[i + 1][j];
            int d = matrix[i + 1][j + 1];

            if (a != b || a != c || a != d) {
                count++;
            }
        }
    }

    return count;
}

int solution(int[][] matrix) {
    int row = matrix.length;
    int col = matrix[0].length;
    List<List<Integer>> uniqueMatrix = new ArrayList<>();

    for (int i = 0; i < row - 1; i++) {
        for (int j = 0; j < col - 1; j++) {
            List<Integer> matrix2 = new ArrayList<>();
            matrix2.add(matrix[i][j]);
            matrix2.add(matrix[i][j + 1]);
            matrix2.add(matrix[i + 1][j]);
            matrix2.add(matrix[i + 1][j + 1]);

            if (!uniqueMatrix.contains(matrix2)) {
                uniqueMatrix.add(matrix2);
            }
        }
    }

    return uniqueMatrix.size();
}
