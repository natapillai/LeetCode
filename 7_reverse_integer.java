class Solution {
    public int reverse(int x) {
        int temp = 0;
        int fin = 0;

        int val = 0;
        boolean neg = false;

        if(x < 0){
            val = Math.abs(x);
            neg = true;
        }else{
            val = x;
        }


        while(val != 0){
            temp = val%10;
            if(fin > Integer.MAX_VALUE/10 || fin < Integer.MIN_VALUE/10){
                return 0;
            }
            fin = fin*10 + temp;
            val = val/10;
        }

        if(neg == true){
            return -fin;
        }else{
            return fin;
        }

    }
}