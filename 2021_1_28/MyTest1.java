import java.util.Scanner;
/**
 * 2021/1/17
 */

/**
 *
 1.给定一个整数数组 nums 和一个整数目标值 target，
 请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍. 你可以按任意顺序返回答案。

 示例 1：
     输入：nums = [3,2,4], target = 6
     输出：[1,2]

 2.

 */
public class MyTest1 {
    /**
     * 第一题（来源力扣）
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] r = new int[2];
        for(int i = 0;i<nums.length;i++){
            for (int j = 0;j<nums.length;j++){
                if(i != j && nums[i] + nums[j] == target){
                    r[0] = i;
                    r[1] = j;
                    break;
                }
            }
        }
        return r;
    }

    public static void main(String[] args) {
        /**
         * 2.来源牛客网（基础）：
         * 确定不同整型数据类型在内存中占多大（字节），输出不同整型数据类型在内存中占多大（字节）。
         */
        System.out.println("The size of short is "+Short.SIZE/8+" bytes.");
        System.out.println("The size of int is "+Integer.SIZE/8+" bytes.");
        System.out.println("The size of long is "+Long.SIZE/8+" bytes.");
        System.out.println("The size of long long is "+Long.SIZE/8+" bytes.");

    }
}
