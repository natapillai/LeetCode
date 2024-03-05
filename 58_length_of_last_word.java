class Solution {
    public int lengthOfLastWord(String s) {
        StringBuffer sb = new StringBuffer();

        for(int i = s.length()-1; i >= 0; i--){

            if(s.charAt(i) == ' ' && sb.isEmpty()){
                continue;
            }else if(s.charAt(i) == ' ' && !sb.isEmpty()){
                break;
            }else{
                sb.append(s.charAt(i));
            }
        }

        return sb.length();
    }
}