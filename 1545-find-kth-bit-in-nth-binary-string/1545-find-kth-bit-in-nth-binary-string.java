class Solution {
    public char findKthBit(int n, int k) {
        String s = "0";
        while(s.length()<k){
            StringBuilder temp = new StringBuilder();
            temp.append(s);
            temp.append(1);
             for(int i = s.length() - 1;i>=0;i--){
                if(s.charAt(i) == '0' ){
                    temp.append('1');
                }
                else{
                    temp.append('0');
                }
             }
             s = temp.toString();
        }
        return s.charAt(k-1);
    }
}