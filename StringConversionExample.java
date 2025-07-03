package publicjavarepo;

public class StringConversionExample {
	public static void main(String[] args) {
        // 1. String to Integer
        String strNumber = "123";
        int number = Integer.parseInt(strNumber);
        System.out.println("String to int: " + number);

        // 2. Integer to String
        int num = 456;
        String numStr = String.valueOf(num);
        System.out.println("Int to String: " + numStr);

        // 3. String to Double
        String strDouble = "3.1415";
        double pi = Double.parseDouble(strDouble);
        System.out.println("String to double: " + pi);

        // 4. Double to String
        double rate = 9.99;
        String rateStr = String.valueOf(rate);
        System.out.println("Double to String: " + rateStr);

        // 5. Char to String
        char letter = 'A';
        String letterStr = Character.toString(letter);
        System.out.println("Char to String: " + letterStr);

        // 6. String to Char (first character)
        String name = "Prakash";
        char firstChar = name.charAt(0);
        System.out.println("First character of string: " + firstChar);
    }
}
