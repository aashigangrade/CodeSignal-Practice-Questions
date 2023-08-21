Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.

Example

For st = "abcdc", the output should be
solution(st) = "abcdcba".

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string st

A string consisting of lowercase English letters.

Guaranteed constraints:
3 ≤ st.length ≤ 10.

[output] string
---------------------

String solution(String newStr) {
    boolean flag;
    for (int i = newStr.length(); ; i++) {
        flag = true;
        for (int j = 0; j < i - j - 1; j++) {
            if (i - j - 1 < newStr.length() && newStr.charAt(j) != newStr.charAt(i - j - 1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            StringBuilder palindrome = new StringBuilder(newStr);
            for (int j = newStr.length(); j < i; j++) {
                palindrome.append(newStr.charAt(i - j - 1));
            }
            return palindrome.toString();
        }
    }
}