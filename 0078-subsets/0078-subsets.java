import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int totalSubsets = 1 << n;
        
        for(int j = 0; j < totalSubsets; j++){
        List<Integer> current = new ArrayList<>();
        for( int i = 0; i < n;i++){
            if((j & ( 1 << i)) != 0){
                 current.add(nums[i]);
            }
        }
        result.add(current);
    }
    return result;
    }
}

    