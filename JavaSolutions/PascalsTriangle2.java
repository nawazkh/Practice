class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList = helper(rowIndex, myList);
        return myList;
    }
    public List<Integer> helper(int rowIndex, List<Integer> lastRow){
        int n = lastRow.size();
        // System.out.println(n);
        if((rowIndex+1) == n) return lastRow;
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        for(int i = 1; i <n; i++){
            temp.add(lastRow.get(i-1)+lastRow.get(i));
        }
        temp.add(1);
        return helper(rowIndex, temp);
    }
}