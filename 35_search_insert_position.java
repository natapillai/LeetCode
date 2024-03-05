class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        if(nums.length == 1){
            if(target > nums[0]){
                return 1;
            }else{
                return 0;
            }
        }

        while(start < end) {
            mid = start + (end - start)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }

        if(nums[start] >= target){
            return start;
        }else{
            return start + 1;
        }

    }
}