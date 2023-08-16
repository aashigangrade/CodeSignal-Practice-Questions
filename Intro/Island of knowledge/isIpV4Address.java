An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.

Given a string, find out if it satisfies the IPv4 address naming rules.

Example

For inputString = "172.16.254.1", the output should be
solution(inputString) = true;

For inputString = "172.316.254.1", the output should be
solution(inputString) = false.

316 is not in range [0, 255].

For inputString = ".254.255.0", the output should be
solution(inputString) = false.

There is no first number.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string inputString

A string consisting of digits, full stops and lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 30.

[output] boolean

true if inputString satisfies the IPv4 address naming rules, false otherwise.
------------------------

boolean solution(String inputString) {
    String[] parts = inputString.split("\\.");

    if (parts.length != 4) {
        return false;
    }

    for (String part : parts) {
        if (!isValidPart(part)) {
            return false;
        }
    }

    return true;
}

public static boolean isValidPart(String part) {
    if (part.isEmpty() || part.length() > 3) {
        return false;
    }

    if(part.charAt(0) == '0' && part.length()>1)return false;

    for (char c : part.toCharArray()) {
        if (!Character.isDigit(c)) {
            return false;
        }
    }

    int num = Integer.parseInt(part);
    return num >= 0 && num <= 255;
}