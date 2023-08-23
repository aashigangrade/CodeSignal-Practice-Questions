Define a word as a sequence of consecutive English letters. Find the longest word from the given string.

Example

For text = "Ready, steady, go!", the output should be
solution(text) = "steady".

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string text

Guaranteed constraints:
4 ≤ text.length ≤ 50.

[output] string

The longest word from text. It is guaranteed that there is a unique output.
----------------

String solution(String text) {
    String[] words = text.split("[^a-zA-Z]+");
    String longestWord = "";

    for (String word : words) {
        if (word.length() > longestWord.length()) {
            longestWord = word;
        }
    }

    return longestWord;
}
