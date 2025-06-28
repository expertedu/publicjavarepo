package publicjavarepo;

public class StringExample {
	/*
	 * In Java, a String is a class from the java.lang package that represents a
	 * sequence of characters.
	 * 
	 * It is immutable, meaning once a String object is created, its contents cannot
	 * be changed.
	 */
	
	public static void main(String[] args) {
        String name = "Prakash";

        System.out.println("Length: " + name.length()); //output-7
        System.out.println("Uppercase: " + name.toUpperCase()); //output-PRAKASH
        System.out.println("Char at 0: " + name.charAt(0)); //output-P
        System.out.println("Substring: " + name.substring(2, 5)); //output-aka
        System.out.println("Contains 'ash': " + name.contains("ash")); //output-true
        System.out.println("No of occurance of index in string: " + name.indexOf('a')); //output-2
        System.out.println("Last occurance of index in string: " + name.lastIndexOf('P')); //output-
    }
}
