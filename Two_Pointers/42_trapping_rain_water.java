class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];

        int maxLeft = 0;
        int maxRight = 0;
        int sum = 0;

        for(int i = 0; i < height.length; i++){
            if(height[i] > maxLeft){
                left[i] = maxLeft;
                maxLeft = height[i];
            }else{
                left[i] = maxLeft;
            }
        }

        for(int i = height.length-1; i >= 0; i--){
            if(height[i] > maxRight){
                right[i] = maxRight;
                maxRight = height[i];
            }else{
                right[i] = maxRight;
            }
        }

        for(int i = 0; i < height.length; i++){
            int temp = Math.min(left[i], right[i]) - height[i];
            if(temp < 0){
                temp = 0;
            }
            sum = sum + temp;
        }

        return sum;
    }
}