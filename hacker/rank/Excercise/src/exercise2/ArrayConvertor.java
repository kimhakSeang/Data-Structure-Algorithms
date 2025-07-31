package exercise2;

import java.util.Arrays;

public class ArrayConvertor {

//    គេអោយ Array មួយ ចូរសរសេរ Algorithm ដើម្បីបំលែងធាតុនីមួយៗ។
//    ឧទាហរណ៍៖
//    Input: [1,2,3,4] => គុណធាតុទាំងអស់ចូលគ្នា លើកលែងតែខ្លួនឯង។
//    Output: [24,12,8,6]
//
//    ពន្យល់៖
//            1 => 2*3*4 = 24
//            2 => 1*3*4 = 12
//            3 => 1*2*4 = 8
//            4 => 1*2*3 = 6
    public static int[] multiOtherElement(int[] items){
        int[] arrayResult = new int[items.length];
        for( int i = 0; i<items.length; i++){
            int result = 1;
            for(int j = 0; j<items.length; j++){
                if(i == j) continue;
                result *= items[j];
            }
            arrayResult[i] = result;
        }
        return arrayResult;
    }

    public static int[] multiOtherElementRecursive(int[] items){

        int[] arrayResult = new int[items.length];
        for( int i = 0; i<items.length; i++){
            int temp = items[i];
            items[i] = 1; // exclude current index
            arrayResult[i] = multiOther(items);
            items[i] = temp;
        }
        return arrayResult;
    }

    private static int multiOther(int[] items){
        if(items.length == 0){
            return 1;
        }
        int[] newItem = new int[items.length -1];
        System.arraycopy(items, 1, newItem, 0, items.length - 1);
        return items[0] * multiOther(newItem);
    }

    public static void main(String[] args) {
        int[] items = new int[10];
        for (int i = 0; i<items.length; i++){
            items[i] = i+1;
        }
        System.out.print(">> ITEMS:");
        System.out.println(Arrays.toString(items));
        System.out.print(">> RESULT:");
        System.out.println(Arrays.toString(multiOtherElement(items)));
        System.out.print(">> RESULT2:");
        System.out.println(Arrays.toString(multiOtherElementRecursive(items)));
    }
}
