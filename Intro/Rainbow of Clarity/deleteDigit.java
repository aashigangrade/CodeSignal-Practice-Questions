Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.

Example

For n = 152, the output should be
solution(n) = 52;
For n = 1001, the output should be
solution(n) = 101.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

Guaranteed constraints:
10 ≤ n ≤ 106.

[output] integer
-------------------

int solution(int n) {
    String numStr = Integer.toString(n);
    int maxNum = Integer.MIN_VALUE;

    for (int i = 0; i < numStr.length(); i++) {
        StringBuilder sb = new StringBuilder(numStr);
        sb.deleteCharAt(i);
        int currentNum = Integer.parseInt(sb.toString());
        maxNum = Math.max(maxNum, currentNum);
    }

    return maxNum;
}
