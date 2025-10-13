package practice.leetcode;

import java.util.Arrays;

public class Ex1Sum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i< nums.length;i ++){
            for (int j = 0; j< nums.length;j ++){
                if(i==j) continue;
                if(nums[i] + nums[j]==target){
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] item = new int[3];
//        [3,2,4]
        item[0] = 3;
        item[1] = 2;
        item[2] = 4;
        System.out.println(Arrays.toString(twoSum(item, 6)));


    }
}
