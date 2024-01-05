package Ziguar;
import java.util.LinkedList;
import java.util.Queue;

	public class StackUsingQueues {

	    private Queue<Integer> queue1 = new LinkedList<>();
	    private Queue<Integer> queue2 = new LinkedList<>();
	    private int topElement;

	    // Push element onto stack
	    public void push(int x) {
	        queue1.add(x);
	        topElement = x;
	    }

	    // Removes the element on the top of the stack
	    public void pop() {
	        while (queue1.size() > 1) {
	            topElement = queue1.remove();
	            queue2.add(topElement);
	        }

	        queue1.remove(); // Remove the last element (top of the stack)

	        // Swap the references of queue1 and queue2
	        Queue<Integer> temp = queue1;
	        queue1 = queue2;
	        queue2 = temp;
	    }

	    // Get the top element
	    public int top() {
	        return topElement;
	    }

	    // Returns whether the stack is empty
	    public boolean isEmpty() {
	        return queue1.isEmpty() && queue2.isEmpty();
	    }

	    public static void main(String[] args) {
	        StackUsingQueues stack = new StackUsingQueues();

	        // Push elements onto the stack
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);

	        // Display the top element
	        System.out.println("Top element: " + stack.top());

	        // Pop an element
	        stack.pop();

	        // Display the top element after pop
	        System.out.println("Top element after pop: " + stack.top());

	        // Check if the stack is empty
	        System.out.println("Is the stack empty? " + stack.isEmpty());
	    }
	}
