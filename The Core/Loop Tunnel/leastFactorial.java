Given an integer n, find the minimal k such that

k = m! (where m! = 1 * 2 * ... * m) for some integer m;
k >= n.
In other words, find the smallest factorial which is not less than n.

Example

For n = 17, the output should be
solution(n) = 24.

17 < 24 = 4! = 1 * 2 * 3 * 4, while 3! = 1 * 2 * 3 = 6 < 17).

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

A positive integer.

Guaranteed constraints:
1 ≤ n ≤ 120.

[output] integer
---------------------

int solution(int n) {
    int factorial = 1;
    int m = 1;

    while (factorial < n) {
        m++;
        factorial *= m;
    }

    return factorial;
}
