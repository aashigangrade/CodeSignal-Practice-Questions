Given a string, find the number of different characters in it.

Example

For s = "cabca", the output should be
solution(s) = 3.

There are 3 different characters a, b and c.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string s

A string of lowercase English letters.

Guaranteed constraints:
3 ≤ s.length ≤ 1000.

[output] integer
-------------------

int solution(String s) {
    int[] charCount = new int[26]; // Assuming only lowercase English letters

    for (char c : s.toCharArray()) {
        charCount[c - 'a']++;
    }

    int distinctChars = 0;
    for (int count : charCount) {
        if (count > 0) {
            distinctChars++;
        }
    }

    return distinctChars;
}