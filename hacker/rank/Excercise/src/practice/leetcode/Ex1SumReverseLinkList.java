package practice.leetcode;

import linkList.single.LinkList;

import java.math.BigInteger;

public class Ex1SumReverseLinkList {
    private ListNode head;

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Reverse l1 and l2
        l1 = reverseLinkList(l1);
        l2 = reverseLinkList(l2);

        // convert l1, l2 to int
        BigInteger l1Num = convertListToInt(l1);
        BigInteger l2Num = convertListToInt(l2);

        // sum l1 + l2
        BigInteger result = l1Num.add(l2Num);

        // convert result to linkNode
        ListNode resultLinkList = convertIntToLinkList(result+"");

        // return reverse result
        return reverseLinkList(resultLinkList);

    }


    private static ListNode reverseLinkList(ListNode ls){
        if(ls == null || ls.next == null){
            return ls;
        }

        ListNode previous = null;
        ListNode current = ls;
        ListNode next = null;
        while (current.next != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        current.next = previous;
        return current;
    }

    private static BigInteger  convertListToInt(ListNode ls){
        if(ls == null){
            return BigInteger.ZERO;
        }

        ListNode current = ls;

        String strNum = "";
        while (current != null){
            strNum = strNum.concat(current.val+"");
            current = current.next;
        }
        return new BigInteger(strNum);
    }

    private static ListNode convertIntToLinkList(String numStr){
        String[] nums = numStr.split("");
        ListNode list = null;
        for(String digit : nums){
            list = insertLinkList(list, Integer.parseInt(digit));
        }
        return list;
    }

    private static ListNode insertLinkList(ListNode list, int value){
        if(list == null){
            return new ListNode(value);
        }
        ListNode current = list;
        while (current.next != null){
            current = current.next;
        }
        current.next = new ListNode(value);

        return list;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    private static void print(ListNode ls){
        if(ls == null){
            return;
        }

        ListNode current = ls;

        while (current != null){
            System.out.print(current.val);
            current = current.next;
        }
        System.out.println();
    }

//    Input: l1 = [2,4,3], l2 = [5,6,4]
//    Output: [7,0,8]
//    Explanation: 342 + 465 = 807
    public static void main(String[] args) {

        ListNode ls1 = new ListNode(2);
        ls1.next = new ListNode(4);
        ls1.next.next = new ListNode(3);

        ls1 = reverseLinkList(ls1);
        print(ls1);

        ListNode ls2 = new ListNode(5);
        ls2.next = new ListNode(6);
        ls2.next.next = new ListNode(4);

        ls2 = reverseLinkList(ls2);
        print(ls2);

        ListNode result = addTwoNumbers(ls1, ls2);
        print(result);

        // [1999999999]
        ListNode l3 = new ListNode(1);
        l3 = insertLinkList(l3, 9);
        l3 = insertLinkList(l3, 9);
        l3 = insertLinkList(l3, 9);
        l3 = insertLinkList(l3, 9);
        l3 = insertLinkList(l3, 9);
        l3 = insertLinkList(l3, 9);
        l3 = insertLinkList(l3, 9);
        l3 = insertLinkList(l3, 9);
        l3 = insertLinkList(l3, 9);
        l3 = insertLinkList(l3, 9);
        System.out.println(convertListToInt(l3));

    }
}
//1999999999
//199999999
//9999999991