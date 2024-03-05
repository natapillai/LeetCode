class Solution {
    public int strStr(String haystack, String needle) {
        int temp = -1;

        if(haystack.contains(needle)){
            temp = haystack.indexOf(needle);
        }

        return temp;
    }
}