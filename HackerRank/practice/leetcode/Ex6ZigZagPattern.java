package practice.leetcode;

import java.util.*;

public class Ex6ZigZagPattern {
    public static String convert(String s, int numRows) {
        if(numRows < 2) return s;

        Map<Integer, List<String>> rows = new LinkedHashMap<>();
        int currentRow = 0, op = 1;
        for (int i = 0; i < s.length(); i++){

            if(currentRow >= numRows || (op == -1 && currentRow > 1)){
                op = -1;
            }else {
                op = 1;
            }

            currentRow = currentRow + op;
            List<String> row = rows.get(currentRow);
            if(row == null){
                row = new LinkedList<>();
            }
            row.add(s.charAt(i)+"");
            rows.put(currentRow, row);
        }
//        rows.forEach((row, value) -> System.out.println(row+":"+value));

        List<String> row = new ArrayList<>();
        for (int i = 1; i <= rows.size();i ++){
            row.addAll(rows.get(i));
        }
        return String.join("", row);
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int row = 3;
        System.out.println(convert(s, row));
    }
}
