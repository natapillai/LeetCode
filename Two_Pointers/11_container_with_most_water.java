//BRUTE FORCE METHOD O(n^2)

class Solution {
    public int maxArea(int[] height) {

        int maxCapacity = Integer.MIN_VALUE;

        for(int i = 0; i < height.length; i++){
            for(int j = 0; j < height.length; j++){
                if(i != j){
                    if(height[i]<=height[j]){
                        if(maxCapacity < height[i] * (j-i)){
                            maxCapacity = height[i] * (j-i);
                        }
                    }else if(height[i]>height[j]){
                        if(maxCapacity < height[j] * (j-i)){
                            maxCapacity = height[j] * (j-i);
                        }
                    }
                }
            }
        }
        return maxCapacity;
    }
}


//Using Two Pointer Method O(n)

class Solution {
    public int maxArea(int[] height) {

        int maxCapacity = Integer.MIN_VALUE;

        int left = 0;
        int right = height.length-1;

        for(int i = 0; i < height.length; i++){
            if(left<right){
                if(height[left] <= height[right]){
                    if(maxCapacity < height[left]*(right-left)){
                        maxCapacity = height[left]*(right-left);
                    }
                    left++;
                }else if(height[left] > height[right]){
                    if(maxCapacity < height[right]*(right-left)){
                        maxCapacity = height[right]*(right-left);
                    }
                    right--;
                }
            }
        }
        return maxCapacity;
    }
}