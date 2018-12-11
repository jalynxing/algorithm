package search;

import java.util.Arrays;

/**
 * @author:
 */
public class FibonacciSearch {
    private static int[] fibonacciArray(int length) {
        int[] fibonacci = new int[length];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    private static int fibonacciSearch(int[] nums, int target) {
        int[] f = fibonacciArray(20);
        int k = 0;
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (nums.length > f[k] - 1) {
            k++;
        }

        int[] temp = Arrays.copyOf(nums, f[k]);

        for (int i = high; i < temp.length; i++) {
            temp[i] = nums[high];
        }

        while (low <= high) {
            mid = low + f[k - 2] - 1;
            if (target < nums[mid]) {
                high = mid - 1;
                k -= 2;
            } else if (target > nums[mid]) {
                low = mid + 1;
                k -= 1;
            } else {
                if (mid <= high) {
                    return mid;
                }
                return high;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 3};
        int i = fibonacciSearch(a, 3);
        System.out.println("3在：" + (i + 1));
    }
}
