import java.util.HashMap;
import java.util.Map;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currentSum = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
    
            currentSum += nums[i];
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);

        
            if (i >= k) {
                int outNum = nums[i - k];
                currentSum -= outNum;
                freqMap.put(outNum, freqMap.get(outNum) - 1);
                if (freqMap.get(outNum) == 0) {
                    freqMap.remove(outNum);
                }
            }

            if (i >= k - 1 && freqMap.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}