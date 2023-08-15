/*
Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
solution(inputString) = true;
For inputString = "abac", the output should be
solution(inputString) = false;
For inputString = "a", the output should be
solution(inputString) = true.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string inputString

A non-empty string consisting of lowercase characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 105.

[output] boolean

true if inputString is a palindrome, false otherwise.
*/

boolean solution(String s) {
    int start = 0;
    int end = s.length() - 1;
    while(start <= end) {
        while(start <= end && !Character.isLetterOrDigit(s.charAt(start))) {
            start++;
        }
        while(start <= end && !Character.isLetterOrDigit(s.charAt(end))) {
            end--;
        }
        if(start <= end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}