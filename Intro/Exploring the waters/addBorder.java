Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

solution(picture) = ["*****",
                     "*abc*",
                     "*ded*",
                     "*****"]
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 ≤ picture.length ≤ 100,
1 ≤ picture[i].length ≤ 100.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1.
----------------------------------------------------------

String[] solution(String[] picture) {
    int numRows = picture.length;
    int numCols = picture[0].length();

    String[] borderedPicture = new String[numRows + 2];
    Arrays.fill(borderedPicture, "");
    String border = "*".repeat(numCols + 2);

    borderedPicture[0] = border;
    borderedPicture[numRows + 1] = border;

    for (int i = 0; i < numRows; i++) {
        borderedPicture[i + 1] = "*" + picture[i] + "*";
    }

    return borderedPicture;
}