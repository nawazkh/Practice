class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        String[] myS = s.split("");
        Map<String, Integer> myMap = new HashMap<String,Integer>();
        for(int i = 0; i < s.length(); i++){
            if(myMap.containsKey(myS[i])){
                int count = myMap.get(myS[i]);
                count++;
                myMap.put(myS[i], count);
            }else{
                myMap.put(myS[i], 1);
            }
        }
        myS = t.split("");
        for(int i = 0; i < t.length(); i++){
            if(myMap.containsKey(myS[i])){
                if(myMap.get(myS[i]) <= 0)
                    return false;
                int count = myMap.get(myS[i]);
                count--;
                myMap.put(myS[i], count);
            }else{
                return false;
            }
        }
        return true;
    }
}