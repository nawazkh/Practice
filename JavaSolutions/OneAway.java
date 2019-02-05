public class OneAway{
    public static void main(String[] args) {
        String one = "pales";
        String two = "pale";
        System.out.print(checkOneAway(one,two));
    }

    public static boolean checkOneAway(String p, String q){
        if((p.length()-q.length()) > 1 || (p.length()-q.length() < -1)) return false;
        int i = (p.length()+q.length());
        int j = 0, k = 0;
        boolean isMismatch = false;
        while(j < p.length() && k < q.length()){
            if(p.charAt(j) != q.charAt(k)){
                if(!(isMismatch))
                    isMismatch = true;
                else
                    return false;
                if(p.length() > q.length()){
                    j++;
                }else
                    k++;
            }
            j++;
            k++;
        }
        if(p.length() > q.length()){
            return ((p.length() - j) > 1) ? false : true;
        }else if(p.length() < q.length())
            return ((q.length() - k) > 1) ? false : true;

        return true;
    }
}