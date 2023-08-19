Find the leftmost digit that occurs in a given string.

Example

For inputString = "var_1__Int", the output should be
solution(inputString) = '1';
For inputString = "q2q-q", the output should be
solution(inputString) = '2';
For inputString = "0ss", the output should be
solution(inputString) = '0'.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string inputString

A string containing at least one digit.

Guaranteed constraints:
3 ≤ inputString.length ≤ 10.

[output] char
------------------

public char solution(String inputString) {
    for (char c : inputString.toCharArray()) {
        if (Character.isDigit(c)) {
            return c;
        }
    }
    return ' ';
}