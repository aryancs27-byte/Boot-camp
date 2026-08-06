class Solution {
    public void reverseString(char[] s) {
        String str = new String(s);

        str = new StringBuilder(str).reverse().toString() ;
        
        for(int i = 0; i < s.length; i++){
            s[i]= str.charAt(i);
        }
        }
}