class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0 || s == "") return "";
        if(s.length() == 1) return s;
        // String curr = " ";
        String prev = " ";
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                // String str = s.substring(i,j+1);
                // System.out.println(str);
                String curr = getPalindrome(i,j,s);
                // System.out.println(curr);
                // System.out.println(prev.length());
                if(curr != null){
                    if(curr.length() >= prev.length()){
                        prev = curr;
                    }
                }
                
            }
        }
        if(prev.equals(" ")) return "";
        return prev;
    }
    public String getPalindrome(int start, int end, String s){
        // StringBuilder str = new StringBuilder();
        // String str1 = s.substring(start,end+1);
        // System.out.println("----"+str1);
        int i = start, j = end;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return null;
            }
            start++;
            end--;
        }
        
        String str = s.substring(i,j+1);
        // System.out.println(str+"----");
        return str;
    }
}