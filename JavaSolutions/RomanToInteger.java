class Solution {
    public int romanToInt(String s) {
        if(s.length()==0 || s == null) return 0;
        s = s.charAt(0) + ""+ s;
        System.out.println(s);
        String[] input = s.split("");
        int value = 0,count = 0, i = input.length-1;
        while(i > 0){
            System.out.println(input[i]);
               switch(input[i]){
                case "I":
                    count = count + 1;
                    break;

                case "V":
                    if(input[i-1].equals("I")){
                        count = count + 4;
                        i = i - 1;
                        break;
                    }else
                        count = count + 5;
                    break;

                case "X":
                    if(input[i-1].equals("I")){
                        count = count + 9;
                        i = i - 1;
                        break;
                    }else
                        count = count + 10;
                    break;

                case "L":
                    if(input[i-1].equals("X")){
                        count = count + 40;
                        i = i - 1;
                        break;
                    }else
                        count = count + 50;
                    break;

                case "C":
                    if(input[i-1].equals("X")){
                        count = count + 90;
                        i = i - 1;
                        break;
                    }else
                        count = count + 100;
                    break;

                case "D":
                    if(input[i-1].equals("C")){
                        count = count + 400;
                        i = i - 1;
                        break;
                    }else
                        count = count + 500;
                    break;

                case "M":
                    if(input[i-1].equals("C")){
                        count = count + 900;
                        i = i - 1;
                        break;
                    }else
                        count = count + 1000;
                    break;
            }
            i = i-1;
        }
        return count;
    }
}