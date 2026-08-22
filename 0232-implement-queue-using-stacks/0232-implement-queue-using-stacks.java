//import java.util.ArrayDeque;
//import java.util.Deque;

//class MyQueue {
   // private Deque<Integer> inStack;
    //private Deque<Integer> outStack;

    //public MyQueue() {
      //  inStack = new ArrayDeque<>();
        //outStack = new ArrayDeque<>();
    //}
    
    //public void push(int x) {
      //  inStack.push(x);
    //}
    
    //public int pop() {
      //  moveInToOut();
        //return outStack.pop();
    //}
    
    //public int peek() {
      //  moveInToOut();
        //return outStack.peek();
    //}
    
    //public boolean empty() {
      //  return inStack.isEmpty() && outStack.isEmpty();
    //}

    //private void moveInToOut() {
      //  if (outStack.isEmpty()) {
        //    while (!inStack.isEmpty()) {
          //      outStack.push(inStack.pop());
            //}
        //}
    //}
//}

class MyQueue {
    private int[] inStack;
    private int[] outStack;
    private int inTop;
    private int outTop;

    public MyQueue() {
   
        inStack = new int[100];
        outStack = new int[100];
        inTop = -1;
        outTop = -1;
    }
    
    public void push(int x) {
        inStack[++inTop] = x;
    }
    
    public int pop() {
        moveInToOut();
        return outStack[outTop--];
    }
    
    public int peek() {
        moveInToOut();
        return outStack[outTop];
    }
    
    public boolean empty() {
        return inTop == -1 && outTop == -1;
    }

    private void moveInToOut() {
        if (outTop == -1) {
            while (inTop >= 0) {
                outStack[++outTop] = inStack[inTop--];
            }
        }
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */