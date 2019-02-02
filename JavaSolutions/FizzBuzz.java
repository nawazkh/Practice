class Solution {
    public List<String> fizzBuzz(int n) {
        if(n < 1) return null;
        List<String> myString = new ArrayList<String>();
        String temp = "";
        boolean t = false;
        for(int i = 1; i <= n; i++){
            temp = "";
            t = false;
            if(i % 3 == 0) {
                temp = temp +"Fizz";
                t = true;
            }
            if(i % 5 == 0) {
                temp = temp +"Buzz";
                t = true;
            }
            if(!(t))
                temp = temp+i+"";
            myString.add(temp);
        }
        return myString;
    }
}