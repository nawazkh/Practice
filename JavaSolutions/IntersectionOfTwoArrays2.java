class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,int[]> myMap = new HashMap<Integer,int[]>();
        for(int i = 0; i < nums1.length; i++){
            if(myMap.containsKey(nums1[i])){
                int[] count = myMap.get(nums1[i]);
                count[0]++;
                count[1]++;
                myMap.put(nums1[i], count);
            }
            else{
                int[] count = {0,0,0};
                count[0]++;
                count[1]++;
                myMap.put(nums1[i], count);
            }      
        }
        
        for(int i = 0; i < nums2.length; i++){
            if(myMap.containsKey(nums2[i])){
                int[] count = myMap.get(nums2[i]);
                count[0]++;
                count[2]++;
                myMap.put(nums2[i], count);
            }
            else{
                int[] count = {0,0,0};
                count[0]++;
                count[2]++;
                myMap.put(nums2[i], count);
            }      
        }
        List<Integer> retNum = new ArrayList<>();
        for(int key : myMap.keySet()){
            int[] count = myMap.get(key);
            if(count[1] > count[2]){
                for(int i = 0; i < count[2]; i++){
                    retNum.add(key);
                }
            }
            else if(count[1] < count[2]){
                for(int i = 0; i < count[1]; i++){
                    retNum.add(key);
                }
            }
            else if(count[1] == count[2]){
                for(int i = 0; i < count[2]; i++){
                    retNum.add(key);
                }
            }
        }
        int[] ret = new int[retNum.size()];
        Iterator<Integer> iterator = retNum.iterator();
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = iterator.next().intValue();
        }
        return ret;
    }
}