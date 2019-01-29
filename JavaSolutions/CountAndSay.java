class Solution {
    public String countAndSay(int n) {
        if(n == 0)
            return "";
        if(n == 1)
            return "1";
        int point = 0, i = 0, r = 0;
        String[] input = new String[n];
        input[0] = "1";
        for(int z = 1; z < n; z++){
            r = input[z-1].length() - 1;
            point = 0;
            i = 0;
            String finalTemp = "";
            String temp = "";
            while(point <= r && i <= r){
                if(input[z-1].charAt(point) == input[z-1].charAt(i)){
                    temp = temp + input[z-1].charAt(point);
                    i++;
                }else{
                    System.out.println("3) point: "+point+" i:"+i+" input[0].charAt(i):"+input[z-1].charAt(i)+" temp:"+temp);
                    finalTemp = finalTemp + temp.length()+""+temp.charAt(0);
                    point = i;
                    temp = input[z-1].charAt(i)+"";
                    i++;
                }
            }
            input[z] = finalTemp + temp.length()+""+temp.charAt(0);
        }
        return input[n-1];
    }
}