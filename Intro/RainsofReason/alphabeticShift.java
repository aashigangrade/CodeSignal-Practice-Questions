Given a string, your task is to replace each of its characters by the next one in the English alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).

Example

For inputString = "crazy", the output should be solution(inputString) = "dsbaz".

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string inputString

A non-empty string consisting of lowercase English characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 1000.

[output] string

---------------

String solution(String inputString) {
    char[] charArray = inputString.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
        char currentChar = charArray[i];
        if (currentChar == 'z') {
            charArray[i] = 'a';
        } else if (currentChar == 'Z') {
            charArray[i] = 'A';
        } else if (Character.isLetter(currentChar)) {
            charArray[i] = (char) (currentChar + 1);
        }
    }
    return new String(charArray);
}