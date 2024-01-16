package array;

import java.util.Arrays;

class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] arr) {
        int curr = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], arr[i] + curr);
            max = Math.max(max, curr);
        }
        return max;
    }
}
//TC: O(n); SC: O(1);