class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(s == null || s.length() == 0 || k == 0) return 0;
        int start = 0, end = 0, maxlen = 0;
        HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
        for(end = 0; end < s.length(); end++){
            myMap.put(s.charAt(end), myMap.getOrDefault(s.charAt(end), 0) + 1);
            if(myMap.size() > k ){
                while(start < end){
                    char c = s.charAt(start++);
                    myMap.put(c, myMap.get(c) - 1);
                    if(myMap.get(c) == 0){
                        myMap.remove(c);
                        break;
                    }
                }
            }
            maxlen = Math.max(maxlen, end - start + 1);
        }
        return maxlen;
    }
}