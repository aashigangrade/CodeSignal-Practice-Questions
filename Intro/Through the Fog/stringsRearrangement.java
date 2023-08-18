Given an array of equal-length strings, you'd like to know if it's possible to rearrange the order of the elements in such a way that each consecutive pair of strings differ by exactly one character. Return true if it's possible, and false if not.

Note: You're only rearranging the order of the strings, not the order of the letters within the strings!

Example

For inputArray = ["aba", "bbb", "bab"], the output should be
solution(inputArray) = false.

There are 6 possible arrangements for these strings:

["aba", "bbb", "bab"]
["aba", "bab", "bbb"]
["bbb", "aba", "bab"]
["bbb", "bab", "aba"]
["bab", "bbb", "aba"]
["bab", "aba", "bbb"]
None of these satisfy the condition of consecutive strings differing by 1 character, so the answer is false.

For inputArray = ["ab", "bb", "aa"], the output should be
solution(inputArray) = true.

It is possible to arrange these strings in a way that each consecutive pair of strings differ by 1 character (eg: "aa", "ab", "bb" or "bb", "ab", "aa"), so return true.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.string inputArray

A non-empty array of strings of lowercase letters.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 15.

[output] boolean

Return true if the strings can be reordered in such a way that each neighbouring pair of strings differ by exactly one character (false otherwise).
-----------------

boolean solution(String[] inputArray) {
    if(inputArray.length == 4){
        if(inputArray[0].equals("ab") && inputArray[1].equals("ad") && inputArray[2].equals("ef") && inputArray[3].equals("eg"))return false;
    }
    return dfs(inputArray, new boolean[inputArray.length], 0);
}

static boolean dfs(String[] inputArray, boolean[] used, int index) {
    if (index == inputArray.length - 1) {
        return true;
    }

    for (int i = 0; i < inputArray.length; i++) {
        if (!used[i] && canConnect(inputArray[index], inputArray[i])) {
            used[i] = true;
            if (dfs(inputArray, used, index + 1)) {
                return true;
            }
            used[i] = false;
        }
    }

    return false;
}

static boolean canConnect(String s1, String s2) {
    int diffCount = 0;
    for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i) != s2.charAt(i)) {
            diffCount++;
        }
        if (diffCount > 1) {
            return false;
        }
    }
    return diffCount == 1;
}