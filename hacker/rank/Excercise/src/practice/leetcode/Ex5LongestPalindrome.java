package practice.leetcode;

import java.util.*;

public class Ex5LongestPalindrome {
//    public static String longestPalindrome(String s) {
//        if(s == null || s.isEmpty()){
//            return s;
//        }
//        String[] arrayString = s.split("");
//        Set<String> result = new HashSet<>();
//        PriorityQueue<List<Integer>> longest = new PriorityQueue<>((a, b) -> (a.getFirst()+a.getLast()) - (b.getFirst()+b.getLast()));
//
//        for(int i =0; i<arrayString.length; i++){
//
//            if( ! result.contains(arrayString[i])){
//
//                int endIndex = arrayString.length-1;
//                for(int j = endIndex; j >=0; j-- ){
//                    if(arrayString[j].equals(arrayString[i])){
//                        endIndex = j;
//                        break;
//                    }
//                }
//                if(longest.isEmpty() ){
//                    longest.add(List.of(i, endIndex));
//                } else if (longest.peek().getLast() - (longest.peek().getFirst()) < (endIndex-i)){
//                    longest.poll();
//                    longest.add(List.of(i, endIndex));
//                }
//
//                result.add(arrayString[i]);
//            }
//        }
//        if (longest.isEmpty()){
//            return "";
//        }
//        String resultPalindrome = "";
//        for(int i =longest.peek().getFirst(); i<=longest.peek().getLast(); i++){
//            resultPalindrome += arrayString[i];
//        }
//
//        return resultPalindrome;
//    }

    private static String findTheLongestPalindrome(String s){
        if(s == null || s.isEmpty()){
            return s;
        }
        String[] arrayString = s.split("");
        String maxPalindrome = "";
        for(int i =0; i<arrayString.length; i=i+1){
            String current= findPalindrome(s, i, i);
            String next = findPalindrome(s, i, i+1);
            String maxCurrentNext = current.length() >= next.length() ? current : next ;
            maxPalindrome = maxPalindrome.length() >= maxCurrentNext.length() ? maxPalindrome : maxCurrentNext;
        }
        return maxPalindrome;
    }

    private static String findPalindrome(String s, int left, int right){
        String newS = "";
        while ( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            newS = (left == right ) ? s.charAt(left)+"" : s.charAt(left)+ newS + s.charAt(right);
            left --;
            right ++;
        }

        System.out.println(newS);
        return newS;
    }

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println("The Longest: "+findTheLongestPalindrome(s));
    }
}
