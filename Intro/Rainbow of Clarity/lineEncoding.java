Given a string, return its encoding defined as follows:

First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
for example, "aabbbc" is divided into ["aa", "bbb", "c"]
Next, each substring with length greater than one is replaced with a concatenation of its length and the repeating character
for example, substring "bbb" is replaced by "3b"
Finally, all the new strings are concatenated together in the same order and a new string is returned.
Example

For s = "aabbbc", the output should be
solution(s) = "2a3bc".

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string s

String consisting of lowercase English letters.

Guaranteed constraints:
4 ≤ s.length ≤ 15.

[output] string

Encoded version of s.
--------------------------

String solution(String s) {
    StringBuilder encoded = new StringBuilder();

    int i = 0;
    while (i < s.length()) {
        char currentChar = s.charAt(i);
        int count = 0;
        while (i < s.length() && s.charAt(i) == currentChar) {
            count++;
            i++;
        }

        if (count > 1) {
            encoded.append(count);
        }
        encoded.append(currentChar);
    }

    return encoded.toString();
}
