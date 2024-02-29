class Solution {
    public String addBinary(String a, String b) {

        StringBuffer sb = new StringBuffer();

        int carry = 0;
        int alen = a.length() - 1;
        int blen = b.length() - 1;

        while(alen >= 0 || blen >= 0 || carry == 1){
            if(alen >= 0){
                int temp = Integer.parseInt(String.valueOf(a.charAt(alen)));
                carry = carry + temp;
                alen--;
            }
            if(blen >= 0){
                int temp = Integer.parseInt(String.valueOf(b.charAt(blen)));
                carry = carry + temp;
                blen--;
            }

            sb.append(carry%2);
            carry = carry / 2;

        }

        return sb.reverse().toString();
    }
}