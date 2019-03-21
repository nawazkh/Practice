class Solution {
    public String addBoldTag(String s, String[] dict) {
        if(s.length() == 0) return null;
        if(dict.length == 0) return s;
        int[] letter = new int[s.length() + 1];
        for(int i = 0; i < dict.length; i++){
            for(int j = 0; j < s.length(); j++){
                int start = s.indexOf(dict[i],j);
                if(start > -1){
                    letter[start] += 1;
                    letter[start + dict[i].length()] += -1;
                }
            }
        }
        int val = 0;
        for(int i = 0; i < letter.length; i++){
            System.out.print(letter[i]);
            val += letter[i];
            letter[i] = val;
            
        }
        StringBuilder stb = new StringBuilder();
        boolean start = false;
        for(int i = 0; i < letter.length - 1; i++){
            if(letter[i] >= 1){
                if(!start){
                    start = true;
                    stb.append("<b>");
                }
                stb.append(s.charAt(i));
            }
            else if(letter[i] <= 0){
                if(start){
                    start = false;
                    //stb.append(s.charAt(i-1));
                    stb.append("</b>");
                    // continue;
                }
                stb.append(s.charAt(i));
            }
        }
        if(start) stb.append("</b>");
        return stb.toString();
    }
}