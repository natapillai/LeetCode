package Two_Pointers;


//Brute Force
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

//Using Two-Pointers
class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while(start <= end){
            char currStart = s.charAt(start);
            char currEnd = s.charAt(end);

            if(!Character.isLetterOrDigit(currStart)){
                start++;
            }else if(!Character.isLetterOrDigit(currEnd)){
                end--;
            }else if(Character.toLowerCase(currStart) == Character.toLowerCase(currEnd)){
                start++;
                end--;
            }else{
                return false;
            }
        }

        return true;
    }
}