class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> myList = new ArrayList<>();
        if(numRows == 0) return myList;
        List<Integer> t = new ArrayList<Integer>();
        t.add(1);
        myList.add(t);
        if(numRows == 1) return myList;
        for(int i = 2; i <= numRows; i++){
            List<Integer> temp = new ArrayList<Integer>();
            for(int j = 0; j < i; j++){
                if(j == 0 || j == (i-1)) temp.add(1);
                else
                    temp.add(myList.get(i-2).get(j-1) + myList.get(i-2).get(j));
            }
            myList.add(temp);
        }
        return myList;
    }
}