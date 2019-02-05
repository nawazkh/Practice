public class IsUniqueChars{
    public static void main(String[] args) {
        IsUniqueChars temp = new IsUniqueChars();
        System.out.println(temp.isUnique("beautiful"));
    }
    public boolean isUnique(String str){
        int checker = 0;
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i) - 'a';
            System.out.println(val+" "+str.charAt(i));
            if((checker & (1 << val)) > 0){
                return false;
            }
            checker |= (1 << val);
            System.out.println((1<<val)+" :val: "+val+" :checker:"+checker);
        }
        return true;
    }
}