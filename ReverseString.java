package Ziguar;

public class ReverseString {

	    public static void main(String[] args) {
	        String input = "Welcome";
	        String reversed = reverseString(input);

	        System.out.println("Input: " + input);
	        System.out.println("Output: " + reversed);
	    }

	    public static String reverseString(String str) {
	        char[] charArray = str.toCharArray();
	        int start = 0;
	        int end = str.length() - 1;

	        while (start < end) {
	            // Swap characters at start and end indices
	            char temp = charArray[start];
	            charArray[start] = charArray[end];
	            charArray[end] = temp;

	            // Move indices towards the center
	            start++;
	            end--;
	        }

	        // Convert the character array back to a string
	        return new String(charArray);
	    }
	}
