import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {
		//(1)String declaration
		String str1="Java";
		String str2="Java";
		String str3=new String("Java");
		
		System.out.println(str1==str2);// both points to same reference(scp)(true)	
		System.out.println(str1==str3);//different objects(false)
		System.out.println(str1.equals(str3));//same content(true)
		
		//(2)String immutability
		//once a String object is created, its value cannot be changed.
		String str4 = "Hello";
		str4.concat(" IBC");
		System.out.println(str4); // Hello (unchanged)
		
		str4=str4.concat(" IBC");
		System.out.println(str4); // Hello IBC (changed only after reassignment and points new object)
		
		//(3)methods in string
		String s = "Programming";
		System.out.println(s.length());         // 11
		System.out.println(s.charAt(2));        // o
		System.out.println(s.indexOf('g'));     // 3
		System.out.println(s.lastIndexOf('g')); // 10
		System.out.println(s.contains("gram")); // true
		System.out.println(s.startsWith("Pro")); // true
		System.out.println(s.endsWith("ing"));   // true
		System.out.println(s.substring(4));       // ramming(only starting index given)
		System.out.println(s.substring(4, 7));     //ram(starting and end index given)
		System.out.println(s.replace('a', '@'));
		System.out.println(s.replaceAll("Prog", "Diag")); // Diagramming
		System.out.println(s.replaceFirst("m", "M")); // PrograMming
		System.out.println(s.toUpperCase());    //  PROGRAMMING 
		System.out.println(s.toLowerCase());    //  programming
		System.out.println(s.trim());           //removes spaces from both side
		
		String s2 = "";
		System.out.println(s2.isEmpty());    // true
		System.out.println("   ".isBlank()); // true
		
		String s3 = "IBC";
		char[] ch = s3.toCharArray();
		for (char c : ch) {
		    System.out.println(c + " ");          //I B C
		}
		
		String s4 = "Hi";
		System.out.println(s4.repeat(3));    //HiHiHi
		
		//(4)reverse string
		  String str = "Hello World";
	      String reversed = "";

	      for (int i = str.length() - 1; i >= 0; i--) 
	      {
	             reversed += str.charAt(i);
	      }

	        System.out.println("Reversed: " + reversed);//dlrow olleH
	        
	        
	     //(5)palindrome string
	        String str5 = "madam";
	        boolean isPalindrome = true;

	        for (int i = 0; i < str5.length() / 2; i++) {
	            if (str5.charAt(i) != str5.charAt(str5.length() - i - 1)) {
	                isPalindrome = false;
	                break;
	            }
	        }

	        if (isPalindrome)
	            System.out.println(str5 + " is a palindrome.");//output  madam is a palindrome
	        else
	            System.out.println(str5 + " is not a palindrome.");     
	        
	        
	        //(6)find depth of file structure
	        String path = "c/user/java/ibc/sample.java";

	        int count = 0;
	        for (int i = 0; i < path.length(); i++) {
	            if (path.charAt(i) == '/') {
	                count++;
	            }
	        }

	        System.out.println("Number of folder levels: " + count);   //output --4
	        
	        
	        //(7)find file name i.e. sample.java only extract substring
	        String fileName = path.substring(path.lastIndexOf('/') + 1);

	        System.out.println(fileName); // output---- sample.java
	    
	        
	        
	        //(7) tokenizer
	        String st1 = "sample text";
	        String st2= "Ramesh ,R";
	        String st3 = "Ramesh ,R and Suresh,S";
	        String st4 = "usr/user/java/programs/stringtoken.java";

	        // Tokenizing s1 by space (default)
	        System.out.println("Tokens from s1 (space):");
	        StringTokenizer stoken1 = new StringTokenizer(st1);
	        while (stoken1.hasMoreTokens()) {
	            System.out.println(stoken1.nextToken());
	        }

	        // Tokenizing s2 by comma
	        System.out.println("\nTokens from s2 (comma):");
	        StringTokenizer stoken2 = new StringTokenizer(st2, ",");
	        while (stoken2.hasMoreTokens()) {
	            System.out.println(stoken2.nextToken());
	        }

	        // Tokenizing s3 by comma
	        System.out.println("\nTokens from s3 (comma):");
	        StringTokenizer stoken3 = new StringTokenizer(st3, ",");
	        while (stoken3.hasMoreTokens()) {
	            System.out.println(stoken3.nextToken());
	        }

	        // Tokenizing path by slash
	        System.out.println("\nTokens from path (slash):");
	        StringTokenizer stPath = new StringTokenizer(st4, "/");
	        while (stPath.hasMoreTokens()) {
	            System.out.println(stPath.nextToken());
	        }
		
	}

}

