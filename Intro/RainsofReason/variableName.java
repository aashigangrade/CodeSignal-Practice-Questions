Correct variable names consist only of English letters, digits and underscores and they cannot start with a digit.

Check if the given string is a correct variable name.

Example

For name = "var_1__Int", the output should be
solution(name) = true;
For name = "qq-q", the output should be
solution(name) = false;
For name = "2w2", the output should be
solution(name) = false.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string name

Guaranteed constraints:
1 ≤ name.length ≤ 10.

[output] boolean

true if name is a correct variable name, false otherwise.
--------------------

boolean solution(String name) {
    if (name.length() == 0 || Character.isDigit(name.charAt(0))) {
        return false;
    }

    for (char ch : name.toCharArray()) {
        if (!Character.isLetterOrDigit(ch) && ch != '_') {
            return false;
        }
    }

    return true;
}
