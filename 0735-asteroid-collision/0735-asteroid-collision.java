import java.util.Arrays;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int[] stack = new int[asteroids.length];
        int top = -1;

        for(int ast : asteroids ){
            boolean exploded = false;

            while(top >= 0 && stack[top] > 0 && ast < 0){
                if(stack[top] < -ast){
                    top--;
                }
                else if(stack[top] == -ast){
                    top--;
                    exploded = true;
                    break;
                }
                else{
                    exploded = true;
                    break;
                }
            }

            if(!exploded){
                stack[++top] = ast;
            }
        }
         return Arrays.copyOf(stack,top+1);
    }
}