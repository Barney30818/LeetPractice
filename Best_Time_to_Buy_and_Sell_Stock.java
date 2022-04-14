class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
    }

    public static int maxProfit(int[] prices) {
        int cheapestStock = prices[0];
        int maxProfit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i]<cheapestStock){
                cheapestStock = prices[i];
            }
            if(maxProfit<prices[i]-cheapestStock){
                maxProfit = prices[i]-cheapestStock;
            }
        }
        return maxProfit;
    }
}
