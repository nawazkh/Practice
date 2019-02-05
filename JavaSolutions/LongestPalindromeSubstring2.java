class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0 || s == "") return "";
        if(s.length() == 1) return s;
        String prev = " ";
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            int len1 = lenPalindrome(i,i,s);
            int len2 = lenPalindrome(i,i+1,s);
            
            int len = Math.max(len1,len2);
            
            if( len > end-start){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int lenPalindrome(int start, int end, String s){
        while(start >=0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        return (end-start-1);
    }
}