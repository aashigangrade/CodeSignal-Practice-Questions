Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
solution(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string inputString

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 50.

[output] boolean

true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
-----------------------

boolean solution(String inputString) {
    Map<Character, Integer> charCount = new HashMap<>();

    for (char c : inputString.toCharArray()) {
        charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }

    int oddCount = 0;
    for (int count : charCount.values()) {
        if (count % 2 != 0) {
            oddCount++;
        }
    }

    return oddCount <= 1;
}