package array;

/**
 * @author jialin.xing
 * @date 2018/12/5
 * @Description
 */
public class SearchInsert {
    public int searchInsert(int[] num, int target) {
        int low = 0;
        int high = num.length - 1;
        int mid ;
        while (low <= high) {
            mid = (low + high) / 2;
            if (num[mid] == target) {
                return mid;
            }
            if (target < num[mid]) {
                high = mid - 1;
            }
            if (target > num[mid]) {
                low = mid + 1;
            }
        }
        return low ;
    }
}
