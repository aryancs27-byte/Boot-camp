import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int top = scores.pop();
                int newScore = top + scores.peek();
                scores.push(top);      
                scores.push(newScore);  
            } 
            else if (op.equals("D")) {
                scores.push(2 * scores.peek());
            } 
            else if (op.equals("C")) {
                scores.pop();
            } 
            else {
                scores.push(Integer.parseInt(op));
            }
        }

        int totalSum = 0;
        for (int score : scores) {
            totalSum += score;
        }
        return totalSum;
    }
}