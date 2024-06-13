import java.util.ArrayList;

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

    // Array List interview Question : Container with most water
    // public static int storeWater(ArrayList<Integer> height) {
    // int maxWater = 0;
    // // Brute Force Approach : O(n^2)
    // for (int i = 0; i < height.size(); i++) {
    // for (int j = i + 1; j < height.size(); j++) {
    // int heightCont = Math.min(height.get(i), height.get(j));
    // int widthCont = j - 1;
    // int currWater = heightCont * widthCont;
    // maxWater = Math.max(maxWater, currWater);
    // }

    // }
    // return maxWater;
    // }

    // 2 Pointer Approach : Time complexity: O(n)
    public static int storeWaterNew(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            // calculate Area of Water
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            // update Pointers
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;

    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(6);
        System.out.println(storeWaterNew(height));

        // int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        // int prices[] = { 7, 1, 5, 3, 6, 4 };
        // System.out.println(buyAndSellStocks(prices));
        // System.out.println(trappedRainwater(height));
    }
}
