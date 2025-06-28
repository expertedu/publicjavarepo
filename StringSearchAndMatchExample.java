package publicjavarepo;

public class StringSearchAndMatchExample {
	public static void main(String[] args) {
        String text = "Hello Prakash, welcome to Java programming!";

        // 1. Search using contains()
        System.out.println("Contains 'Prakash': " + text.contains("Prakash")); // true

        // 2. Search using indexOf()
        System.out.println("Length of the String: "+text.length()); //43
        System.out.println("Index of 'Java': " + text.indexOf("Java")); // 26

        // 3. startsWith() - check if text starts with "Hello"
        System.out.println("Starts with 'Hello': " + text.startsWith("Hello")); // true

        // 4. endsWith() - check if text ends with "programming!"
        System.out.println("Ends with 'programming!': " + text.endsWith("programming!")); // true

        // 5. matches() - full string match using regex
        System.out.println("Matches full pattern: " + text.matches(".*welcome.*Java.*")); // true

        // 6. Case-insensitive search (manual way)
        String lowerText = text.toLowerCase();
        System.out.println("Contains 'prakash' (ignore case): " + lowerText.contains("prakash")); // true
    }
}
