package publicjavarepo;

public class StringMethodsExampleSubstringAndConcatenation {
	public static void main(String[] args) {
        String str = "Prakash";

        // 1. substring(start)
        String sub1 = str.substring(3); // from index 3 to end
        System.out.println("substring(3): " + sub1); // Output: "kash"

        // 2. substring(start, end)
        String sub2 = str.substring(1, 4); // from index 1 to 3 (end is exclusive)
        System.out.println("substring(1, 4): " + sub2); // Output: "rak"

        // 3. concat(String s2)
        String greeting = "Hello ";
        String fullName = greeting.concat(str); // "Hello " + "Prakash"
        System.out.println("Using concat: " + fullName); // Output: "Hello Prakash"

        // 4. + operator
        String message = "Welcome " + str + "!";
        System.out.println("Using + operator: " + message); // Output: "Welcome Prakash!"
    }
}
