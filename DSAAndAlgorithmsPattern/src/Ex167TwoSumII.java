import java.util.Arrays;

public class Ex167TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;
        int sum = 0;
        while ( left < right){
            sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left+1, right+1};
            }else if( sum > target){
                right --;
            }else{
                left ++;
            }
        }
        return new int[2];

    }

    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        Ex167TwoSumII ex = new Ex167TwoSumII();
        System.out.println(Arrays.toString(ex.twoSum(num, 9)));
    }
}
