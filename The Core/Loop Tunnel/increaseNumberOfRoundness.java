Define an integer's roundness as the number of trailing zeroes in it.

Given an integer n, check if it's possible to increase n's roundness by swapping some pair of its digits.

Example

For n = 902200100, the output should be
solution(n) = true.

One of the possible ways to increase roundness of n is to swap digit 1 with digit 0 preceding it: roundness of 902201000 is 3, and roundness of n is 2.

For instance, one may swap the leftmost 0 with 1.

For n = 11000, the output should be
solution(n) = false.

Roundness of n is 3, and there is no way to increase it.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

A positive integer.

Guaranteed constraints:
100 ≤ n ≤ 109.

[output] boolean

true if it is possible to increase n's roundness, false otherwise.
--------------------------

boolean solution(int n) {
    boolean foundNonZero = false;
    int trailingZeroes = 0;

    while (n > 0) {
        int digit = n % 10;

        if (digit == 0 && foundNonZero) {
            trailingZeroes++;
            break;
        } else if (digit != 0) {
            foundNonZero = true;
        }

        n /= 10;
    }

    return trailingZeroes > 0;
}
