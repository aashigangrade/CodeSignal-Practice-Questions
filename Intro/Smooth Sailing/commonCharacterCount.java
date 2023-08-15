Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string s1

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s1.length < 15.

[input] string s2

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s2.length < 15.

[output] integer

int solution(String str1, String str2) {
    int[] freq1 = new int[26];  // Assuming only lowercase English letters
    int[] freq2 = new int[26];

    for (char c : str1.toCharArray()) {
        freq1[c - 'a']++;
    }

    for (char c : str2.toCharArray()) {
        freq2[c - 'a']++;
    }

    int commonCount = 0;
    for (int i = 0; i < 26; i++) {
        commonCount += Math.min(freq1[i], freq2[i]);
    }

    return commonCount;
}
