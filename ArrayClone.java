public class ArrayClone {

	    public static void main(String[] args) {
	        int[][] original = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	      
	        int[][] clone = new int[original.length][];
	        for (int i = 0; i < original.length; i++) {
	            clone[i] = original[i].clone();
	        }
	        
	        
	        System.out.println("Original array:");
	        for (int[]a : original) {
	            for (int val : a) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	        
	        System.out.println("Cloned array:");
	        for (int[] b : clone) {
	            for (int val : b) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }

	        // Modify original
	        original[0][0] = 99;
	        original[1][2] = 88;

	        // Print original
	        System.out.println("Original array modified:");
	        for (int[]a : original) {
	            for (int val : a) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }

	        // Print clone
	        System.out.println("Cloned after modification array:");
	        for (int[] b : clone) {
	            for (int val : b) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	    }
	}
