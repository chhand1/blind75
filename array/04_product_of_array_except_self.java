package array;

import java.util.Arrays;

class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 5, 6};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int[] arr) {
        int[] prefixProduct = new int[arr.length];
        prefixProduct[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            prefixProduct[i] = prefixProduct[i-1] * arr[i-1];
        }
        int suffixProduct = 1;
        for (int i = arr.length-1; i >= 0; i--) {
            prefixProduct[i] = prefixProduct[i] * suffixProduct;
            suffixProduct = suffixProduct * arr[i];
        }
        return prefixProduct;
    }
}
//TC: O(2n); SC: O(n)