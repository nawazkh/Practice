class Solution {
    public int firstUniqChar(String s) {
        String[] myS = s.split("");
        Map myMap = new HashMap();
        for(int i = 0; i < s.length(); i++){
            if(myMap.containsKey(myS[i])){
                int count = (int)myMap.get(myS[i]);
                count++;
                myMap.put(myS[i],count);
            }else{
                myMap.put(myS[i],1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            if((int)myMap.get(myS[i]) == 1)
                return i;
        }
        return -1;
    }
}