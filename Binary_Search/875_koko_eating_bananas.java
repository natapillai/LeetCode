class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        for(int pile : piles) {
            end = Math.max(end, pile);
        }

        while(start <= end) {
            int mid = start + (end - start)/2;
            int sumH = 0;
            for(int pile : piles) {
                sumH += Math.ceil((double)pile/mid);
            }

            if(h < sumH) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }

        return start;

    }
}