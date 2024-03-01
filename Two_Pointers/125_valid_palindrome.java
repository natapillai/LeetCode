package Two_Pointers;

class Solution {
    public boolean isPalindrome(String s) {
        boolean ispal = false;
        String org = "";
        String pal = "";
        String temp = "";
        char[] chars = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(chars[i])){
                temp = Character.toString(chars[i]).toLowerCase();
                org += temp;
                pal = temp + pal;
            }
        }

        if(org.equals(pal)){
            ispal = true;
        }else{
            ispal = false;
        }

        return ispal;
    }
}