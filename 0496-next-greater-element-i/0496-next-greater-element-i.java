class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap <Integer , Integer > mpp = new HashMap<>();
        for(int nums : nums2){
            while( !st.isEmpty() && st.peek() < nums ){
                mpp.put(st.pop(),nums);
            }
            st.push(nums);
        }
        while(!st.isEmpty()){
            mpp.put(st.pop(),-1);
        }
        int[] ans =new int [nums1.length];
        for(int i = 0 ; i<nums1.length;i++){
            ans[i] = mpp.get(nums1[i]);
        }
        return ans;
    }
}