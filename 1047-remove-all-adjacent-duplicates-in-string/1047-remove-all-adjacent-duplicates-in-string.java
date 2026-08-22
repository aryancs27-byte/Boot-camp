class Solution {
    public String removeDuplicates(String s) {
        StringBuilder a = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = a.length();

            if (len > 0 && a.charAt(len - 1) == c) {
                a.deleteCharAt(len - 1); 
            } else {
                a.append(c); 
            }
        }

        return a.toString();
    }
}