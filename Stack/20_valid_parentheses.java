package Stack;

class Solution {
    public boolean isValid(String s) {

        char[] chars = s.toCharArray();

        if(chars.length == 1){
            return false;
        }

        Stack<Character> stk = new Stack<>();

        boolean val = false;

        for(char c : chars){
            if(c == '(' || c == '{' || c == '['){
                stk.add(c);
            }
            if(c == ')'){
                if(stk.empty()){
                    return false;
                }
                if(stk.peek().equals('(')){
                    stk.pop();
                }else{
                    return false;
                }
            }else if(c == '}'){
                if(stk.isEmpty()){
                    return false;
                }
                if(stk.peek().equals('{')){
                    stk.pop();
                }else{
                    return false;
                }
            }else if(c == ']'){
                if(stk.isEmpty()){
                    return false;
                }
                if(stk.peek().equals('[')){
                    stk.pop();
                }else{
                    return false;
                }
            }
            if(stk.isEmpty()){
                val = true;
            }
        }
        if(!stk.isEmpty()){
            return false;
        }
        return val;
    }
}