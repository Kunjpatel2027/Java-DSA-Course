public class DSAInterviewQuestions {
    public static int trappedRainwater(int height[]) {
        int n = height.length;
        // calculate left max boundary - array and
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedWater = 0;

        // loop
        for (int i = 0; i < n; i++) {
            // water Level = min(left max boundary , right max boundary )

            int WaterLevel = Math.min(leftMax[i], rightMax[i]);

            // Trapped rainwater = [WaterLevel height - bar height ]* width of the bar

            trappedWater += (WaterLevel - height[i]);
        }
        return trappedWater;
    }

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i])// profit
            {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {

        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(prices));
        // System.out.println(trappedRainwater(height));
    }
}
