// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        if (top == -1) {
            return true;
        }
        return false;
    }

    Stack() {
        // Initialize your constructor
        this.top = -1;
    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        top++;
        if (top >= 1000) {
            return false;
        } else {
            a[top] = x;
            return true;
        }
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here

        int topValue = peek();
        top--;

        return topValue;
    }

    int peek() {
        // Write your code here
        if (isEmpty()) {
            System.out.println("Stack UNderflow");
            return 0;
        }
        return a[top];
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
