// Approach - 1
// Brute force - two loops - O(n2)

// Approach - 2
// O(n)
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], max = 0, profit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            profit = prices[i] - min;
            if(profit > max){
                max = profit;
            }
        }
        if(max > 0){
            return max;
        }else{
            return 0;
        }
    }
}
