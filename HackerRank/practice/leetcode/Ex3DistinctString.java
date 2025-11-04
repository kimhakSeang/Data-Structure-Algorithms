package practice.leetcode;

import java.util.*;

public class Ex3DistinctString {
//    Given a string s, find the length of the longest substring without duplicate characters.
//    Example 1:
//    Input: s = "abcabcbb"
//    Output: 3
//    Explanation: The answer is "abc", with the length of 3.
    private static int countLetter(String s){
        int maxS = 0;
        List<String> currentS = new LinkedList<>();
        String[] arrayS = s.split("");
        for (String itemS: arrayS){
            if(currentS.contains(itemS)){
                if(maxS<currentS.size()){
                    maxS = currentS.size();
                }
                int startIndex = currentS.indexOf(itemS);
                currentS = currentS.subList(startIndex+1, currentS.size());
                currentS.add(itemS);
            }else if(!Objects.equals(itemS, "")){
                currentS.add(itemS);
            }
        }
        if(maxS<currentS.size()){
            maxS = currentS.size();
        }
        return maxS;
    }

    private static int lengthOfLongestSubstring(String s){

        int left = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
//        "dvdf"
//        "pwwkew"
        System.out.println(countLetter(s));
        System.out.println(lengthOfLongestSubstring(s));
    }

}
