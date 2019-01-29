class Solution {
    public String countAndSay(int n) {
        if(n == 0)
            return "";
        if(n == 1)
            return "1";
        int point = 0, i = 0, l = 0, r = 0;
        String[] input = new String[n];
        input[0] = "1";
        // String[] input = {"1211"};
        for(int z = 1; z < n; z++){
            r = input[z-1].length() - 1;
            l = 0;
            point = 0;
            i = 0;
            String finalTemp = "";
            String temp = "";
            while(point <= r && i <= r){
                if(input[z-1].charAt(point) == input[z-1].charAt(i)){
                    // System.out.println("1) point: "+point+" i:"+i+" input[0].charAt(i):"+input[z-1].charAt(i)+" temp:"+temp);
                    temp = temp + input[z-1].charAt(point);
                    i++;
                    // System.out.println("2) point: "+point+" i:"+i+" temp:"+temp);
                    // continue;
                }else{
                    System.out.println("3) point: "+point+" i:"+i+" input[0].charAt(i):"+input[z-1].charAt(i)+" temp:"+temp);
                    finalTemp = finalTemp + temp.length()+""+temp.charAt(0);
                    // System.out.println("in here "+point+" "+i+" "+temp);
                    // finalTemp = temp + temp.charAt(0);
                    point = i;
                    temp = input[z-1].charAt(i)+"";
                    // System.out.println("4) point: "+point+" i:"+i+" input[0].charAt(i):"+input[z-1].charAt(i)+" temp:"+temp+" finalTemp:"+finalTemp);
                    i++;
                }
            }
            input[z] = finalTemp + temp.length()+""+temp.charAt(0);
        }
        
        // System.out.println(input[n-1]);
        return input[n-1];
    }
}