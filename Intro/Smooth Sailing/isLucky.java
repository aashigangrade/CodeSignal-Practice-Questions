Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it is lucky or not.

Example

For n = 1230, the output should be
solution(n) = true;
For n = 239017, the output should be
solution(n) = false.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 ≤ n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.

boolean solution(int n) {
    String ticketStr = String.valueOf(n);
    int len = ticketStr.length();

    if (len % 2 != 0) {
        return false;  // Ticket number must have an even number of digits
    }

    int sumFirstHalf = 0;
    int sumSecondHalf = 0;

    for (int i = 0; i < len / 2; i++) {
        sumFirstHalf += ticketStr.charAt(i) - '0';
    }

    for (int i = len / 2; i < len; i++) {
        sumSecondHalf += ticketStr.charAt(i) - '0';
    }

    return sumFirstHalf == sumSecondHalf;
}
