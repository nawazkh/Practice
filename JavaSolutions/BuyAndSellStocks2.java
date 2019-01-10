class Solution {
    public int maxProfit(int[] prices) {
        //find profit array
        //next find max sub array
        if(prices.length < 1){
            return 0;
        }
        if(prices.length < 2){
            return 0;
        }
        int[] profits = new int[prices.length-1];
        profits = findProfits(prices);
        // for (int i = 0; i < profits.length; i++){
        //     System.out.println(profits[i]);
        // }
        int max_sum = 0;
        int current_sum = 0;
        boolean is_reset = false;
        for(int i = 0; i < profits.length; i++){
            current_sum = current_sum + profits[i];
            if(current_sum > 0){
                // System.out.println("int here"+max_sum);
                max_sum = max_sum + current_sum;
                current_sum = 0;
            }
            if(current_sum < 0){
                current_sum = 0;
            }
            
        }
        // System.out.println(max_sum);
        return max_sum;
    }
    public int[] findProfits(int[] prices){
        int[] profits = new int[prices.length-1];
        for (int i = 0; i < profits.length; i++){
            profits[i] = prices[i+1] - prices[i];
        }
        
        return profits;
    }
}