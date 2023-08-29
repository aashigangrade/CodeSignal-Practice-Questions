Reverse the order of the bits in a given integer.

Example

For a = 97, the output should be
solution(a) = 67.

97 equals to 1100001 in binary, which is 1000011 after mirroring, and that is 67 in base 10.

For a = 8, the output should be
solution(a) = 1.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer a

Guaranteed constraints:
5 ≤ a ≤ 105.

[output] integer
------------------------

int solution(int a) {
    int reversed = 0;
    while (a > 0) {
        reversed <<= 1; // Shift the current reversed bits to the left
        reversed |= (a & 1); // Add the least significant bit of 'a' to reversed
        a >>= 1; // Shift 'a' to the right
    }
    return reversed;
}