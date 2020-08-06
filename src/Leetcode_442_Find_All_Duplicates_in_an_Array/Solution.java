package Leetcode_442_Find_All_Duplicates_in_an_Array;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[Math.abs(nums[i]) - 1] > 0) nums[Math.abs(nums[i]) - 1] = -1 * nums[Math.abs(nums[i]) - 1];
            else ans.add(Math.abs(nums[i]));
        }
        return ans;
    }
}
