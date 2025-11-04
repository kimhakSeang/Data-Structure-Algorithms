package exercise3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindBiggestNumberByRank {
    //    លំហាត់ទី៣
//    ស្វែងរកធាតុធំបំផុតទី K ក្នុង Array មិនតាមលំដាប់។
//    ឧទាហរណ៍៖
//    Input: [3,2,1,5,6,4], k = 2
//    Output: 5
//    ព្រោះលេខ៥ ជាធាតុធំជាងគេលំដាប់ទី២។
    public static int findBiggestNumberByRank(int[] listNum, int k){
        PriorityQueue<Integer> topNum = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : listNum) {
            topNum.add(num);
        }
        Object o = topNum.stream().toArray()[k-1];
        return (int) o;
    }

    public static int findBiggestNumberByRank(ArrayList<Integer> listNum, int k){
        listNum.sort(Comparator.reverseOrder());
        return listNum.get(k-1);
    }

    public static void main(String[] args) {
        int[] listNum = new int[6];
        listNum[0] = 3;
        listNum[1] = 2;
        listNum[2] = 1;
        listNum[3] = 5;
        listNum[4] = 6;
        listNum[5] = 4;

        ArrayList<Integer> listNum2 = new ArrayList<>();
        listNum2.add(3);
        listNum2.add(2);
        listNum2.add(1);
        listNum2.add(5);
        listNum2.add(6);
        listNum2.add(4);

        System.out.println("Value: "+listNum2);
        System.out.println("Array Result: "+findBiggestNumberByRank(listNum, 2));
        System.out.println("ArrayList Result: "+findBiggestNumberByRank(listNum2, 2));
    }
}
