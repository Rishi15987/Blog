public class stockbuysell {
    public static void main(String[] args) {
        int prices []= {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
// Step 5
/*Summary of problem
 make max profit

Approach (in your own words)
// stor cur val and one where to store max profit
// iterate through each and calculate profit just one case is to be handled at line 10

"What I learned"
no need to panic easiest question

“When to apply”*/