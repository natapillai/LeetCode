class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i<nums.length; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int sum = -nums[i];
                int left = i + 1;
                int right = nums.length-1;
                while(left < right){
                    if(i != left && i != right && left != right){
                        if(nums[left] + nums[right] > sum){
                            right--;
                        }else if(nums[left] + nums[right] < sum){
                            left++;
                        }else{
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[left]);
                            temp.add(nums[right]);
                            sol.add(temp);

                            while(left < right && nums[left] == nums[left+1]){
                                left++;
                            }
                            while(left < right && nums[right] == nums[right-1]){
                                right--;
                            }
                            left++;
                            right--;
                        }
                    }
                }
            }

        }
        return sol;
    }
}