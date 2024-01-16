package array;

class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] arr = {7, 1, 4, 5, 6, 2};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] arr) {
        if (arr.length == 1) return 0;
        int profit = 0;
        int left = 0;
        for (int right = 1; right < arr.length; right++) {
            if (arr[right] > arr[left]) {
                profit = Math.max(profit, arr[right] - arr[left]);
            }
            else {
                left = right;
            }
        }
        return profit;
    }
}
//TC: O(n); SC: O(1);