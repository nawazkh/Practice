class Solution {
    public void reverseString(char[] s) {
        if(s.length <= 1 || s == null)
            return;
        int head = 0; 
        int tail = s.length - 1;
        while(head < tail){
            char temp = s[head];
            s[head] = s[tail];
            s[tail] = temp;
            head++;
            tail--;
        }
    }
}