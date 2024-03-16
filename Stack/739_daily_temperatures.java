class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack<>();
        int[] sol = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            while(!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]){
                int temp = stk.pop();
                sol[temp] = i - temp;
            }
            stk.add(i);
        }
        return sol;
    }
}