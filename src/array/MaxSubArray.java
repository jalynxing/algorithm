package array;

/**
 * @author jialin.xing
 * @date 2018/12/5
 * @Description
 */
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int i = 0, j = 0,pre = nums[i], aft = 0;
        for (; j < nums.length;) {
            aft += nums[j];
            if (aft > pre) {
                pre = aft;
            }
            if (j == nums.length-1) {
                i++;
                j = i;
                aft = 0;
            }
        }
        return pre;
    }

    public static void main(String[] args) {
        int[] s = {1};
        System.out.println(maxSubArray(s));
    }
}
