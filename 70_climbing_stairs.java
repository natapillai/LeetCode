class Solution {
    public int climbStairs(int n) {
        int temp1 = 1;
        int temp2 = 2;
        int temp3 = 0;

        if(n==0){
            return 0;
        }else if(n == 1){
            return 1;
        }else if(n==2){
            return 2;
        }

        for(int i = 2; i < n; i++){
            temp3 = temp1 + temp2;
            temp1 = temp2;
            temp2 = temp3;
        }
        return temp3;
    }
} n