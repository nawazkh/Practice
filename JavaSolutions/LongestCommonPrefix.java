class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        for(int i = 0; i < strs.length; i++){
            for(int j = 0; j < strs[i].length(); j++){
                if(myMap.containsKey(strs[i].substring(0,j+1))){
                    int count = myMap.get(strs[i].substring(0,j+1));
                    count++;
                    myMap.put(strs[i].substring(0,j+1), count);
                }
                else{
                    myMap.put(strs[i].substring(0,j+1), 1);
                }
            }
        }
        int maxLen = strs.length;
        String result = "";
        for(String key : myMap.keySet()){
            if(myMap.get(key) >= maxLen && key.length() >= result.length()){
                result = key;
            }
        }
        return result;
    }
}