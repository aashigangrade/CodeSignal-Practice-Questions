You are given a two-digit integer n. Return the sum of its digits.

Example

For n = 29, the output should be
solution(n) = 11.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

A positive two-digit integer.

Guaranteed constraints:
10 ≤ n ≤ 99.

[output] integer

The sum of the first and second digits of the input number.
-------------------

int solution(int n) {
    int firstDigit = n / 10; // Extract the first digit
    int secondDigit = n % 10; // Extract the second digit
    return firstDigit + secondDigit; // Calculate the sum
}
