import java.sql.Array;
import java.util.*;

public class SlidingWindow {
    /*
        Sliding Window have 2 main types:
        1. Fixed Size Window: window has constant size k
           ✅ Key Point: Only one loop → each element enters and exits the window once.
        2. Variable Size Window: window size grows or shrink/(be come small) base on condition
           ✅ Expanding the window when the sum is too small,
           ✅ Shrinking it when the sum is enough.
     */

    //1. Fixed Size Window
    //Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
    //Output: [3,3,5,5,6,7]
//    public static int[] maxSlidingWindow(int[] nums, int k) {
//        int max = Integer.MIN_VALUE, next_max = Integer.MIN_VALUE;
//        int r = 0, i =0;
//        int[]  result = new int[nums.length - (k-1) ];
//
//        Queue<Integer> curItems = new LinkedList<>();
//
//        for (r=0; r < k ; r++ ){
//            max = Math.max(max, nums[r]);
//            if(r != 0){ // Skip First Index
//                next_max = Math.max(next_max, nums[r]);
//            }
//        }
//        result[i++] =max;
//
//        for(r = k; r < nums.length; r ++){
//            next_max = Math.max(next_max, nums[r]);
//            result[i++] = next_max;
//        }
//
//        return result;
//    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int max = Integer.MIN_VALUE, next_max = Integer.MIN_VALUE;
        int r = 0, i =0;
        int[]  result = new int[nums.length - (k-1) ];

        LinkedList<Integer> curItems = new LinkedList<>();

        for (r=0; r < k ; r++ ){
            curItems.add(nums[r]);
            max = Math.max(max, nums[r]);
            if(r != 0){ // Skip First Index
                next_max = Math.max(next_max, nums[r]);
            }
        }
        result[i++] =max;

        for(r = k; r < nums.length; r ++){
            curItems.poll();
            curItems.add(nums[r]);
            next_max = curItems.stream().max((a,b)-> a - b ).get();
            result[i++] = next_max;
        }

        return result;
    }

//    public static int[] maxSlidingWindow(int[] nums, int k) {
//
//        int item = 0;
//        int[]  result = new int[nums.length - (k-1) ];
//
//        for (int r=0; r < nums.length - (k-1) ; r++ ){
//            int step = 1, next = r, max = Integer.MIN_VALUE;
//            while( step  <= k ) {
//                max = Math.max(max, nums[next ++]);
//                step++;
//            }
//            result[item++] = max;
//        }
//
//        return result;
//    }

    //2. Variable Size/ Dynamic Window
    public static int lengthOfLongestSubstring(int[] nums, int target) {
        int maxStrLength = 0, cur =0;
        int l=0; // index

        for ( int r  = 0 ; r < nums.length ; r++ ){
            cur += nums[r];
            while ( cur >= target){
                cur -= nums[l];
                l ++;
            }
            maxStrLength = Math.max(maxStrLength, r - l);
        }

        return maxStrLength;
    }

    public static void main(String[] args) {
        int[] nums = new int[11];
        nums[0] = 4;
        nums[1] = 5;
        nums[2] = 2;
        nums[3] = 0;
        nums[4] = 1;
        nums[5] = 8;
        nums[6] = 1;
        nums[7] = 2;
        nums[8] = 3;
        nums[9] = 6;
        nums[10] = 9;

        System.out.println(lengthOfLongestSubstring(nums, 15));

        int[] nums2 = {1,3,1,2,0,5}; //[3,3,2,5]
        int[] nums3 = {1,-1};
        System.out.println(Arrays.toString(maxSlidingWindow(nums2, 3)));

    }


}
