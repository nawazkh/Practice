class Solution {
    public boolean isValid(String s) {
        if(s == "" || s.length() == 0) return true;
        if(s.length()%2 != 0) return false;
        s = s.trim();
        String[] temp = s.split("");
        int count = 0, i = 0, l = 0;
        String[] myList = new String[temp.length];
        while(i < temp.length){
           if(temp[i].equals(")") || temp[i].equals("}") || temp[i].equals("]")){
               if(l <= 0) return false;
               if(isPair(temp[i],myList[l-1])){
                   l = l-1;
                   count--;
               }else
                   return false;
               i++;
           }
            else{
                myList[l] = temp[i];
                l++;
                i++;
                count++;
            }
        }
        if(count == 0) return true;
        else return false;
    }
    public boolean isPair(String curr, String prev){
        if((prev.equals("(") && curr.equals(")")) || (prev.equals("{") && curr.equals("}")) || (prev.equals("[") && curr.equals("]")) )
            return true;
        return false;
    }
}