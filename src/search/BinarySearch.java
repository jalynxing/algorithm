package search;

/**
 * @author jialin.xing
 * @date 2018/12/5
 * @Description
 */
public class BinarySearch {

    private static int BinarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (target < nums[mid]) {
                high = mid - 1;
            }
            if (target > nums[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6, 10, 15};
        int i = BinarySearch(a, 0);
        System.out.println("16在：" + i);
    }
}
