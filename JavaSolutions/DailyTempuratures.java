class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> myStack = new Stack<Integer>();
        int[] output = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            while(!myStack.isEmpty() && temperatures[i] > temperatures[myStack.peek()]){
                int index = myStack.pop();
                output[index] = i-index;
            }
            myStack.push(i);
        }
        return output;
    }
}