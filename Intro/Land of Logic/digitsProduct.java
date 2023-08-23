Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.

Example

For product = 12, the output should be
solution(product) = 26;
For product = 19, the output should be
solution(product) = -1.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer product

Guaranteed constraints:
0 ≤ product ≤ 600.

[output] integer
-------------------

int solution(int product) {
    if (product == 0) {
        return 10; // Edge case: the smallest integer with a product of 0 is 10
    }

    if (product == 1) {
        return 1; // Edge case: the smallest integer with a product of 1 is 1
    }

    // Find the digits that multiply to the given product
    StringBuilder result = new StringBuilder();
    for (int digit = 9; digit >= 2; digit--) {
        while (product % digit == 0) {
            result.append(digit);
            product /= digit;
        }
    }

    // If the product is not 1, it cannot be formed using single digits
    if (product > 1) {
        return -1;
    }

    // Reverse the result and convert it to an integer
    return Integer.parseInt(result.reverse().toString());
}