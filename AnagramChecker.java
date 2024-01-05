package Ziguar;
import java.util.Arrays;

public class AnagramChecker {

	    public static void main(String[] args) {
	        String str1 = "Welcome";
	        String str2 = "ceelmow";

	        if (areAnagrams(str1, str2)) {
	            System.out.println("The strings are anagrams.");
	        } else {
	            System.out.println("The strings are not anagrams.");
	        }
	    }

	    public static boolean areAnagrams(String str1, String str2) {
	        // Check if the lengths of the strings are equal
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        // Convert strings to char arrays and sort them
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();

	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	        // Compare the sorted char arrays
	        return Arrays.equals(charArray1, charArray2);
	    }
	}

