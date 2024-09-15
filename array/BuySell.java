public class BuySell {
    public static void main(String[] args) {
        int stockPrices[] = { 7, 1, 5, 3, 6, 4 };
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < stockPrices.length; i++) {
            if (buyPrice < stockPrices[i]) { //profit
                int profit = stockPrices[i] - buyPrice; // today profit
                maxProfit = Integer.max(maxProfit, profit);
            } else {
                buyPrice = stockPrices[i];
            }
        }
        System.out.println(maxProfit);
    }
}
