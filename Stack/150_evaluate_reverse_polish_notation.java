class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();

        for(String s : tokens){
            if(s.matches("[+-/*]")){
                int temp1 = numbers.pop();
                int temp2 = numbers.pop();
                switch(s){
                    case "+":
                        numbers.add(temp2 + temp1);
                        break;
                    case "-":
                        numbers.add(temp2 - temp1);
                        break;
                    case "/":
                        numbers.add(temp2 / temp1);
                        break;
                    case "*":
                        numbers.add(temp2 * temp1);
                        break;
                }
            }else{
                numbers.add(Integer.parseInt(s));
            }
        }
        return numbers.pop();
    }
}