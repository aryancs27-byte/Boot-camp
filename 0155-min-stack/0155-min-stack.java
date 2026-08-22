//import java.util.Stack;

//class MinStack {
    //private Stack<Integer> stack;
    //private Stack<Integer> minStack;

    //public MinStack() {
        //stack = new Stack<>();
        //minStack = new Stack<>();
    //}
    
   // public void push(int val) {
        // stack.push(val);

        // if (minStack.isEmpty() || val <= minStack.peek()) {
            //minStack.push(val);
        //}
    //}
    
    // public void pop() {

        // if (stack.peek().equals(minStack.peek())) {
            // minStack.pop();
        //}
        //stack.pop();
    //}
    
    //public int top() {
        //return stack.peek();
    //}
    
    //public int getMin() {
       // return minStack.peek();
    //}
//}
           //STACK APPROACH
class MinStack {
    private Node head;

    private static class Node {
        int val;
        int min;
        Node next;

        Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    public MinStack() {
        head = null;
    }
    
    public void push(int val) {
        if (head == null) {
            head = new Node(val, val, null);
        } else {
            head = new Node(val, Math.min(val, head.min), head);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}
              // MORE EFFICIENT APPROACH
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */