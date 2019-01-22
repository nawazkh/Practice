class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length < 1){
            return digits;
        }
        else if(digits.length == 1 && digits[0] == 0){
            digits[0]++;
            return digits;
        }
        else{
            int carry = 0;
            int sum = 0;
            sum = digits[digits.length - 1] + 1 + carry;
            if(digits[digits.length - 1] != 0)
                carry = (sum % 10 == 0) ? 1 : 0;
            else
                carry = 0;
            System.out.println(carry);
            digits[digits.length - 1] = sum % 10;
            for(int i = digits.length - 2; i >= 0; i--){
                sum = digits[i] + carry;
                if(digits[i] != 0)
                    carry = (sum % 10 == 0) ? 1 : 0;
                else
                    carry = 0;
                digits[i] = sum % 10;
            }
            if(carry == 1){
                int[] newRetArray = new int[digits.length+1];
                for(int i = digits.length - 1; i > 0; i--){
                    newRetArray[i] = digits[i];
                }
                newRetArray[0] = 1;
                return newRetArray;
            }
        }
        return digits;
    }
}