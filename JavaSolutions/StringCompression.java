public class StringCompression{
    public static void main(String[] args) {
        String input = "ababcccccaab";
        System.out.println(giveCompression(input));
    }

    public static String giveCompression(String input){
        if(input == null) return null;
        StringBuilder returnOp = new StringBuilder();
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            count++;
            if((i+1) == input.length() || input.charAt(i) != input.charAt(i+1) ){
                returnOp.append(input.charAt(i));
                returnOp.append(count);
                count = 0;
            }
        }
        if(returnOp.length() == input.length())
            return input;
        else
            return returnOp.toString();
    }
}