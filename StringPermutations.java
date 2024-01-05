package Ziguar;

public class StringPermutations {

	    public static void main(String[] args) {
	        String input = "CAT";
	        System.out.println("Input: " + input);
	        System.out.println("Output: ");
	        printPermutations(input);
	    }

	    public static void printPermutations(String str) {
	        if (str == null || str.length() == 0) {
	            return;
	        }

	        permute(str.toCharArray(), 0, str.length() - 1);
	    }

	    private static void permute(char[] chars, int left, int right) {
	        if (left == right) {
	            System.out.println(new String(chars));
	        } else {
	            for (int i = left; i <= right; i++) {
	                swap(chars, left, i);
	                permute(chars, left + 1, right);
	                swap(chars, left, i); // Backtrack to restore the original order
	            }
	        }
	    }

	    private static void swap(char[] chars, int i, int j) {
	        char temp = chars[i];
	        chars[i] = chars[j];
	        chars[j] = temp;
	    }
	}
