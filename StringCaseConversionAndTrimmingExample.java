package publicjavarepo;

public class StringCaseConversionAndTrimmingExample {
	public static void main(String[] args) {
        String original = "   Prakash Rathod   ";

        // Display original string with spaces
        System.out.println("Original string: '" + original + "'");

        // 1. Trim the string
        String trimmed = original.trim();
        System.out.println("Trimmed string: '" + trimmed + "'");

        // 2. Convert to Upper Case
        String upperCase = trimmed.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        // 3. Convert to Lower Case
        String lowerCase = trimmed.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);
    }
}
