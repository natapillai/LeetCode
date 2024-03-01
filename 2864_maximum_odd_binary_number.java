class Solution {
    public String maximumOddBinaryNumber(String s) {
        int len = s.length();
        int count = 0;
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < len; i++){
            if(count>1){
                sb.append('1');
                count--;
            }else if(count == 1 && i != len-1){
                sb.append('0');
            }else{
                sb.append('1');
            }
        }
        return sb.toString();
    }
}