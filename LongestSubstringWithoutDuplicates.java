package Ziguar;
import java.util.HashMap;

public class LongestSubstringWithoutDuplicates {

	    public static String findLongestSubstring(String s) {
	        if (s == null || s.length() == 0) {
	            return "";
	        }

	        int n = s.length();
	        int start = 0; 
	        int maxLength = 0; 
	        HashMap<Character, Integer> charIndexMap = new HashMap<>();

	        for (int end = 0; end < n; end++) {
	            char currentChar = s.charAt(end);

	            // If the character is already in the substring, update the start index
	            if (charIndexMap.containsKey(currentChar)) {
	                start = Math.max(charIndexMap.get(currentChar) + 1, start);
	            }

	            charIndexMap.put(currentChar, end);

	            // Update the maximum length if needed
	            maxLength = Math.max(maxLength, end - start + 1);
	        }

	        // Extract the longest substring
	        return s.substring(start, start + maxLength);
	    }

	    public static void main(String[] args) {
	        String input = "Welcome to PowerRouter.";
	        String result = findLongestSubstring(input);

	        System.out.println("Input: " + input);
	        System.out.println("Output: " + result);
	    }
	}
