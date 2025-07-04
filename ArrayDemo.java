import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};

        //(1)(a) Reverse logic
        int start = 0;
        int end = arr.length - 1;

        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print reversed array
        System.out.println("Reversed Array: ");
        for (int num : arr) {
            System.out.println(num + " ");
        }
        
 //----------------------------------------------------------------------------------------------------------
        
        //(2) (a)find element in given array linear search
        
        
                int[] arr2 = {10, 12, 14, 18, 16};
                int key = 12;
                int pos = -1; 

                for (int i = 0; i < arr2.length; i++) {
                    if (arr2[i] == key) {
                        pos = i;
                        break;
                    }
                }

                if (pos != -1) {
                    System.out.println("Element found at index: " + pos);
                } else {
                    System.out.println("Element not found");
                }
                
                //(b) with duplicate value
                int[] arr3 = {11,20,30,10,40,50,10}; // array with duplicate values
                int key1= 10;
                boolean found = false;
                int count = 0;

                System.out.println("Searching for: " + key1);
                System.out.print("Found at index: ");

                for (int i = 0; i < arr3.length; i++) {
                    if (arr3[i] == key1) {
                        System.out.print(i + " ");
                        found = true;
                        count++;
                    }
                }

                if (!found) {
                    System.out.println("Element not found");
                } else {
                    System.out.println();
                    System.out.println("Total occurrences: " + count);
                }
                
 //----------------------------------------------------------------------------------------------------------------------               
                
                //(3)merge sorted array
                
                int[] arr4 = {10, 15, 25, 55};
                int[] arr5 = {10, 20, 30, 40, 50, 60, 70, 80};
               
                int[] merged = new int[arr5.length + arr4.length];
                int i = 0, j = 0, k = 0;

                // Merge both arrays
                while (i < arr5.length && j < arr4.length) {
                    if (arr5[i] <= arr4[j]) {
                        merged[k++] = arr5[i++];
                    } else {
                        merged[k++] = arr4[j++];
                    }
                }

                // Copy remaining elements
                while (i < arr5.length) {
                    merged[k++] = arr5[i++];
                }
                while (j < arr4.length) {
                    merged[k++] = arr4[j++];
                }

                // Print output
                System.out.print("Merged array (sorted): ");
                for (int num : merged) {
                    System.out.println(num + " ");
                }
                
 //------------------------------------------------------------------------------------------------------------------------               
                //(4) count frequency of alphabets
                
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a line of text: ");
                String line = sc.nextLine().toLowerCase();

                int[] freq = new int[26]; // for a to z

                for (int l= 0; l < line.length(); l++) {
                    char ch = line.charAt(l);

                    if (ch >= 'a' && ch <= 'z') {
                        freq[ch - 'a']++;
                    }
                }

                System.out.println("Alphabet frequencies:");
                for (int m = 0; m < 26; m++) {
                    if (freq[m] > 0) {
                        System.out.println((char) (m + 'a') + " = " + freq[m]);
                    }
                }
                
 //-----------------------------------------------------------------------------------------------------------------------               
                //methods in array----------------------------------------------------
                
                //(1)System.arraycopy()
                int[] original = {1, 2, 3, 4, 5};
                int[] copy = new int[3];
                System.out.println(original==copy);  //references are different --output false

              
                System.arraycopy(original, 1, copy, 0, 3);
                for (int l= 0; l <copy.length; l++) {
                System.out.println(copy[l]);
                
                }
                
//-----------------------------------------------------------------------------------------------------------------------                
                //(2)clone method
                
                int[] original1 = {10, 20, 30, 40};
                int[] cloned = original1.clone();

                // Modify
                original1[0] = 99;       //clone array will not change

                
                System.out.println("Original: ");
                for (int x = 0; x < original1.length; x++) {
                    System.out.print(original1[x] + " ");
                }
               System.out.println();

                System.out.println("Cloned:   ");
                for (int y = 0; y < cloned.length; y++) {
                    System.out.println(cloned[y] + " ");
                }
                
//----------------------------------------------------------------------------------------------------------------------                
                
                //(3) Arrays.binarySearch method
                
                int[] binarySearch= {10, 20, 30, 40, 50};

                int val = 30;

                // array should be in sorted manner
                int index = Arrays.binarySearch(binarySearch, val);

                if (index >= 0) {
                    System.out.println("Key " + val + " found at index " + index);
                } else {
                    System.out.println("Key " + val + " not found");
                }
                
 //--------------------------------------------------------------------------------------------------------------------------               
                
                //(4) sort array method
                
                int[] sortArr= {3, 1, 5};
				Arrays.sort(sortArr);  // arr becomes {1, 3, 5}
				System.out.print("Sorted array: ");
		        for (int newArr : sortArr) {
		            System.out.println(newArr + " ");
		        }

//----------------------------------------------------------------------------------------------------------------------------
		       //(5) array fill method
		        //Arrays.fill(array, value);                // Fill entire array
		       // Arrays.fill(array, fromIndex, toIndex, value); // Fill a range (fromIndex inclusive, toIndex exclusive)
		        
		        int[] fillArr = new int[5];
		        Arrays.fill(fillArr, 7);             // array fill with 7
		        System.out.print("Filled array: ");
		        for (int p  : fillArr) System.out.println(p + " ");
		        System.out.println();
		        
//--------------------------------------------------------------------------------------------------------------------------		        
                //(6) compare method(equal arrays)
		        int[] a = {1, 2, 3};
		        int[] b = {1, 2, 3};

		        int result = Arrays.compare(a, b);

		        System.out.println("Result: " + result); // Output: 0(equal arrays)
		        
		        int[] u = {1, 2, 3};
		        int[] v = {1, 2, 5};

		        int comp = Arrays.compare(u, v);

		        System.out.println("Result: " + comp); // Output: negative(not equal arrays first is less than second)

//-------------------------------------------------------------------------------------------------------------------------		        
		      
		        //(7) array equal method
		        
		        int[] r = {10, 20, 30};
		        int[] s = {10, 20, 30};

		        boolean res = Arrays.equals(r, s);

		        System.out.println("Arrays equal? " + res);
	}

}

