class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalsize = nums1.length + nums2.length;
        int midi = totalsize/2;

        int[] numsAll = new int[totalsize];

        System.arraycopy(nums1, 0, numsAll, 0, nums1.length);
        System.arraycopy(nums2, 0, numsAll, nums1.length, nums2.length);

        Arrays.sort(numsAll);

        if(totalsize%2 == 0){
            return ((double)(numsAll[midi] + numsAll[midi-1])/2);
        }else{
            return (double) numsAll[midi];
        }

    }
}