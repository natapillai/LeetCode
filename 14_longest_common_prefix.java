class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        boolean check = false;

        int len = Integer.MAX_VALUE;
        for(String st : strs){
            if(st.length() < len){
                len = st.length();
            }
        }

        for(int i = 0; i < len; i++){
            int count = 0;
            char current ='a';
            for(int j = 0; j < strs.length; j++){

                if(check == false) {
                    if(count == 0) {
                        count++;
                        current = strs[j].charAt(i);
                        System.out.println("current: " + current + " " + "count" + count);
                        sb.append(current);

                    }else{
                        char temp = strs[j].charAt(i);
                        System.out.println("temp: " + temp);

                        if(temp == current){
                            System.out.println(i+" test temp and current");
                            continue;
                        }else{
                            System.out.println("delete");
                            sb.deleteCharAt(i);
                            check = true;
                            return sb.toString();
                        }
                    }

                }


            }
        }

        return sb.toString();
    }
}