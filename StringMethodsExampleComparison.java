package publicjavarepo;

public class StringMethodsExampleComparison {
	public static void main(String[] args) {
        String str1 = "Prakash";
        String str2 = "Prakash";
        String str3 = "prakash";
        String str4 = "Prajwal";

        // 1. equals(String)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // false (case-sensitive)

        // 2. equalsIgnoreCase(String)
        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3)); // true

        // 3. compareTo(String)
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0 (equal)
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3)); // Negative (uppercase < lowercase)
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4)); // Depends on dictionary order
    }
}
