package Ziguar;

public class FibonacciSeries {

	    public static void main(String[] args) {
	        int n = 10; // Number of Fibonacci numbers to generate
	        printFibonacciSeries(n);
	    }

	    public static void printFibonacciSeries(int n) {
	        if (n <= 0) {
	            return;
	        }

	        int first = 0, second = 1;

	        System.out.print("Fibonacci Series (first " + n + " numbers): " + first);

	        for (int i = 1; i < n; i++) {
	            System.out.print(", " + second);

	            int next = first + second;
	            first = second;
	            second = next;
	        }

	        System.out.println();
	    }
	}
