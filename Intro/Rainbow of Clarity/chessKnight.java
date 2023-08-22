Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.

The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.



Example

For cell = "a1", the output should be
solution(cell) = 2.



For cell = "c2", the output should be
solution(cell) = 6.



Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string cell

String consisting of 2 letters - coordinates of the knight on an 8 × 8 chessboard in chess notation.

Guaranteed constraints:
cell.length = 2,
'a' ≤ cell[0] ≤ 'h',
1 ≤ cell[1] ≤ 8.

[output] integer
-------------------

int solution(String cell) {
    int x = cell.charAt(0) - 'a' + 1;
    int y = cell.charAt(1) - '0';

    int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

    int numMoves = 0;
    for (int i = 0; i < 8; i++) {
        int newX = x + dx[i];
        int newY = y + dy[i];

        if (isValid(newX, newY)) {
            numMoves++;
        }
    }

    return numMoves;
}

static boolean isValid(int x, int y) {
    return x >= 1 && x <= 8 && y >= 1 && y <= 8;
}