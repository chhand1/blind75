package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 5, 8};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<arr.length; i++) {
            int diff = target - arr[i];
            if (!map.containsKey(diff)) {
                map.put(arr[i], i);
            } else {
                result[0] = i;
                result[1] = map.get(diff);
            }
        }
        return result;
    }
}
