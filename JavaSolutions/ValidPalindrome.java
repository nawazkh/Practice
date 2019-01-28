class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0)
            return true;
        s = s.toLowerCase();
        String[] myS = s.split("");
        int head = 0;
        int tail = s.length() - 1;
        while(head < tail){
            // System.out.println("asdfasf"+myS[head]+" "+head);
            if(!(myS[head].matches("[a-z0-9]"))){
                // System.out.println(myS[head]);
                head++;
                continue;
            }
            if(!(myS[tail].matches("[a-z0-9]"))){
                // System.out.println(myS[head]);
                tail--;
                continue;
            }
            if(myS[head].equals(myS[tail])){
                head++;
                tail--;
            }
            else{
                return false;
            }
            
        }
        return true;
    }
}