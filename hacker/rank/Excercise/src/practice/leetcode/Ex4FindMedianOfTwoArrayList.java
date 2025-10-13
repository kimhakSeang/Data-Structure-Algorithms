package practice.leetcode;

import linkList.single.LinkList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class Ex4FindMedianOfTwoArrayList {

    public static double findMedianSortedArraysV3(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0, m1 = 0, m2 = 0;

        // Find median.
        for (int count = 0; count <= (n + m) / 2; count++) {
            m2 = m1;
            if (i != n && j != m) {
                if (nums1[i] > nums2[j]) {
                    m1 = nums2[j++];
                } else {
                    m1 = nums1[i++];
                }
            } else if (i < n) {
                m1 = nums1[i++];
            } else {
                m1 = nums2[j++];
            }
        }

        // Check if the sum of n and m is odd.
        if ((n + m) % 2 == 1) {
            return (double) m1;
        } else {
            double ans = (double) m1 + (double) m2;
            return ans / 2.0;
        }
    }

//    0 <= m <= 1000
//            0 <= n <= 1000
//            1 <= m + n <= 2000
//            -106 <= nums1[i], nums2[i] <= 106
    public static double findMedianSortedArraysV2(int[] nums1, int[] nums2) {

        if(nums1 == null && nums2 == null){
            return 0;
        }

        int minLength = Math.min(nums1.length, nums2.length);
        LinkedList<Integer> list = new LinkedList<>();
        for(int i =0; i < minLength ; i++){
                if(nums1[i] < nums2[i]){
                    if(list.isEmpty()){
                        list.addLast(nums1[i]);
                        list.addLast(nums2[i]);
                    }else if ( list.peekLast() > nums1[i] && list.peekLast() > nums2[i]) {
                        int temp  = list.pollLast();
                        list.addLast(nums1[i]);
                        list.addLast(nums2[i]);
                        list.addLast(temp);
                    }else if( list.peekLast() > nums1[i] && list.peekLast() < nums2[i]){
                        int temp  = list.pollLast();
                        list.addLast(nums1[i]);
                        list.addLast(temp);
                        list.addLast(nums2[i]);
                    }else {
                        list.addLast(nums1[i]);
                        list.addLast(nums2[i]);
                    }
                }else {
                    if(list.isEmpty()){
                        list.addLast(nums2[i]);
                        list.addLast(nums1[i]);
                    }else if ( list.peekLast() > nums1[i] && list.peekLast() > nums2[i]) {
                        int temp  = list.pollLast();
                        list.addLast(nums2[i]);
                        list.addLast(nums1[i]);
                        list.addLast(temp);
                    }else if( list.peekLast() < nums1[i] && list.peekLast() > nums2[i]){
                        int temp  = list.pollLast();
                        list.addLast(nums2[i]);
                        list.addLast(temp);
                        list.addLast(nums1[i]);
                    }else {
                        list.addLast(nums2[i]);
                        list.addLast(nums1[i]);
                    }
                }

        }

        if(nums1.length > nums2.length){
            for(int i =minLength; i < nums1.length ; i++){
                if(list.isEmpty()){
                    list.addLast(nums1[i]);
                } else if ( list.peekLast() > nums1[i] ){
                    int temp  = list.pollLast();
                    list.addLast(nums1[i]);
                    list.addLast(temp);
                }else {
                    list.addLast(nums1[i]);
                }
            }
        }else if (nums1.length < nums2.length){
            for(int i = minLength; i < nums2.length ; i++){
                if(list.isEmpty()){
                    list.addLast(nums2[i]);
                } else if ( list.peekLast() > nums2[i] ){
                    int temp  = list.pollLast();
                    list.addLast(nums2[i]);
                    list.addLast(temp);
                }else {
                    list.addLast(nums2[i]);
                }
            }
        }
        list.sort((o1, o2) -> {return o1 - o2;});

        int totalLength = nums1.length + nums2.length;
        if(totalLength%2 != 0){
            return list.get(totalLength/2);
        }
        int avg = totalLength/2;
        int num1 = list.get(avg);
        int num2 = list.get(avg-1);
        return (double) (num1 + num2) /2;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] newNum = new int[nums1.length + nums2.length];

        int minLength = 0;
        int maxLength = 0;
        if(nums1.length > nums2.length){
            minLength = nums2.length;
            maxLength = nums1.length;
        }else{
            minLength = nums1.length;
            maxLength = nums2.length;
        };

        int newIndex = -1;
        for ( int i = 0; i< minLength; i++){
            newIndex += 1;
            if(nums1[i] > nums2[i]){
                newNum[newIndex] = nums2[i];
                newNum[newIndex =+ 1] = nums1[i];
            } else{
                newNum[newIndex] = nums1[i];
                newNum[newIndex += 1] = nums2[i];
            }
        }

        if(newIndex != newNum.length -1){
            int[] maxItem = nums1.length > nums2.length ? nums1 : nums2;
            for( int i = (minLength+maxLength) - minLength -1; i < maxItem.length ; i++ ){
                newNum[newIndex] = maxItem[i];
            }
        }


        if(maxLength % 2 == 0){
            return (double) (newNum[newNum.length / 2 - 1] + newNum[newNum.length / 2]) /2;
        }

        return newNum[newNum.length/2];

    }

    public static void main(String[] args) {
        int[] emp = new int[0];
        int[] nums1 = new int[1];
        nums1[0] = -7;
//        nums1[1] = 2;
//        nums1[2] = 3;
        int[] nums2 = new int[4];
        nums2[0] = -10;
        nums2[1] = -9;
        nums2[2] = -6;
        nums2[3] = -5;


        double medianSortedArrays = findMedianSortedArraysV3(nums1, nums2);
        System.out.println(medianSortedArrays);

    }
}
