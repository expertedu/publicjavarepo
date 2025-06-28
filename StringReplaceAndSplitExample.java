package publicjavarepo;

public class StringReplaceAndSplitExample {
	public static void main(String[] args) {
        String sentence = "Java is easy. Java is powerful. Java is fun.";

        // 1. Replace character 'a' with '@'
        String replacedChar = sentence.replace('a', '@');
        System.out.println("After replace('a', '@'): " + replacedChar);

        // 2. Replace all "Java" with "Python"
        String replacedWord = sentence.replaceAll("Java", "Python");
        System.out.println("After replaceAll(\"Java\", \"Python\"): " + replacedWord);

        // 3. Split the sentence into words by space
        String[] words = sentence.split(" ");
        System.out.println("After split by space:");
        for (String word : words) {
            System.out.println(word);
        }

        // 4. Split the sentence by "."
        String[] parts = sentence.split("\\.");
        System.out.println("After split by period (.)");
        for (String part : parts) {
            System.out.println(part.trim()); // trim to remove leading spaces
        }
    }
}
