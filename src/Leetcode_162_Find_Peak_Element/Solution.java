package Leetcode_162_Find_Peak_Element;

class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(low < high){
            mid = low + (high - low) / 2;
            if(nums[mid] > nums[mid + 1]){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}
