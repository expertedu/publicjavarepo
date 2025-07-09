import java.util.Scanner;
		public class DigitPatterns {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Choose number to print pattern:");
		        System.out.println("1. Repeating Row Digits");
		        System.out.println("2. Continuous Digits with Wrapping");
		        System.out.println("3. Mirror Right-Angled Triangle");
		        System.out.println("4. Pyramid with Same Digit");
		        System.out.println("5. Inverted Triangle with Same Digit");
		        System.out.println("6. Digit Diamond");
		        System.out.println("7. Binary Triangle");
		        System.out.println("8. Wrapping Digits in Square");
		        System.out.print("Enter your choice: ");
		        int choice = sc.nextInt();

		        switch (choice) {
		            case 1:
		                for (int i = 1; i <= 5; i++) {
		                    for (int j = 1; j <= i; j++) {
		                        System.out.print(i + " ");
		                    }
		                    System.out.println();
		                }
		                break;

		            case 2:
		                int num = 1;
		                for (int i = 1; i <= 5; i++) {
		                    for (int j = 1; j <= i; j++) {
		                        System.out.print((num % 10) + " ");
		                        num++;
		                    }
		                    System.out.println();
		                }
		                break;

		            case 3:
		                for (int i = 1; i <= 5; i++) {
		                    for (int s = 1; s <= 5 - i; s++) {
		                        System.out.print("  ");
		                    }
		                    for (int j = 1; j <= i; j++) {
		                        System.out.print(i + " ");
		                    }
		                    System.out.println();
		                }
		                break;

		            case 4:
		                for (int i = 1; i <= 5; i++) {
		                    for (int s = 1; s <= 5 - i; s++) {
		                        System.out.print(" ");
		                    }
		                    for (int j = 1; j <= i; j++) {
		                        System.out.print(i + " ");
		                    }
		                    System.out.println();
		                }
		                break;

		            case 5:
		                for (int i = 5; i >= 1; i--) {
		                    for (int j = 1; j <= i; j++) {
		                        System.out.print(i + " ");
		                    }
		                    System.out.println();
		                }
		                break;

		            case 6:
		                int n = 3;
		                for (int i = 1; i <= n; i++) {
		                    for (int s = n - i; s > 0; s--) {
		                        System.out.print(" ");
		                    }
		                    for (int j = 1; j <= i; j++) {
		                        System.out.print(i + " ");
		                    }
		                    System.out.println();
		                }
		                for (int i = n + 1; i <= 5; i++) {
		                    for (int s = 1; s <= i - n; s++) {
		                        System.out.print(" ");
		                    }
		                    for (int j = 5; j >= i; j--) {
		                        System.out.print(i + " ");
		                    }
		                    System.out.println();
		                }
		                break;

		            case 7:
		                for (int i = 1; i <= 5; i++) {
		                    for (int j = 1; j <= i; j++) {
		                        System.out.print((i + j) % 2 + " ");
		                    }
		                    System.out.println();
		                }
		                break;

		            case 8:
		                int digit = 1;
		                for (int i = 1; i <= 5; i++) {
		                    for (int j = 1; j <= 5; j++) {
		                        System.out.print((digit % 10) + " ");
		                        digit++;
		                    }
		                    System.out.println();
		                }
		                break;

		            default:
		                System.out.println("Invalid choice");
		        }

		      
		}

	}


