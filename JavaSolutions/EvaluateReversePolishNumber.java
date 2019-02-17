class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 0) return 0;
        Stack<String> myStack = new Stack<String>();
        Integer val = 0;
        Map<String,String> myMap = new HashMap<String,String>();
        myMap.put("+","+");myMap.put("-","-");myMap.put("/","/");myMap.put("*","*");
        for(int i = 0; i < tokens.length; i++){
            if(myMap.containsKey(tokens[i])){
                // System.out.println(tokens[i]+" "+myStack.peek()+" "+myStack.toString());
                Integer val1 = Integer.parseInt(myStack.pop());
                Integer val2 = Integer.parseInt(myStack.pop());
                if(tokens[i].equals("+"))
                    myStack.push(Integer.toString(val1+val2));
                else if(tokens[i].equals("-"))
                    myStack.push(Integer.toString(val2-val1));
                else if(tokens[i].equals("/"))
                    myStack.push(Integer.toString(val2/val1));
                else if(tokens[i].equals("*"))
                    myStack.push(Integer.toString(val2*val1));
            }
            else{
                // System.out.println("hello");
                myStack.push(tokens[i]);
            }
        }
        return Integer.parseInt(myStack.pop());
    }
}