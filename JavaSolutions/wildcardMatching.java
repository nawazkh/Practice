class Solution {
    public boolean isMatch(String str, String ptr) {
        int s = 0, p = 0, match = 0, startIndex = -1;
        while(s < str.length()){
            if(p < ptr.length() && (ptr.charAt(p) == '?' || ptr.charAt(p) == str.charAt(s))){
                p++;
                s++;
            }
            else if(p < ptr.length() && ptr.charAt(p) == '*'){
                startIndex = p;
                match = s;
                p++;
            }
            else if(startIndex != -1){
                p = startIndex + 1;
                match++;
                s = match;
            }
            else return false;
        }
        while(p < ptr.length() && ptr.charAt(p) == '*' )
            p++;
        return p == ptr.length();
    }
}