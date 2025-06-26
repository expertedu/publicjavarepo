package publicjavarepo;

public class StringLengthandCharactersAccessExample {
	public static void main(String[] args) {
        String message = "Prakash Rathod";

        // 1. length()
        int len = message.length();
        System.out.println("Length of the string: " + len);  // Output: 15

        // 2. charAt(int index)
        char ch = message.charAt(3);
        System.out.println("Character at index 3: " + ch);   // Output: 'k'

        // 3. indexOf(char)
        int firstIndex = message.indexOf('a');
        System.out.println("First occurrence of 'a': " + firstIndex); // Output: 2

        // 4. lastIndexOf(char)
        int lastIndex = message.lastIndexOf('a');
        System.out.println("Last occurrence of 'a': " + lastIndex); // Output: 8
    }
}
