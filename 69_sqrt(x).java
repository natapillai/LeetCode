class Solution {
    public int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }

        int first = 1;
        int last = x;
        int mid = 0;

        while(first <= last){
            mid = first + (last - first)/2;

            if(mid * mid == x){
                return mid;
            }else if((double) mid*mid > (double) x){
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return Math.round(last);
    }
}