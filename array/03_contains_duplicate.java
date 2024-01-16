package array;

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 5};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i< arr.length; i++) {
            if (set.contains(arr[i])) return true;
            else set.add(arr[i]);
        }
        return false;
    }
}
//TC: O(n); SC: O(n);