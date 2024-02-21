class Solution {
    public int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}



class Solution {
    public int search(int[] nums, int target) {
        List list = Arrays.stream(nums).boxed().toList();

        if(list.contains(target)){
            return Arrays.binarySearch(nums, target);
        }else{
            return -1;
        }

    }
}