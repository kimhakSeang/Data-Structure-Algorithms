package practice.leetcode;

import java.math.BigInteger;

public class Ex1SumReverseLinkList2 {
    public static ListNode sumoflists(ListNode l1, ListNode l2)
        {
            ListNode sumhead=null;
            ListNode last=null;
            int carry=0;
            int sum=0;
            while(l1!=null || l2!=null)
            {
                sum=0;
                if(l1==null)
                {
                    sum=l2.val + carry;
                    if(sum>=10)
                    {
                        carry=sum/10;
                        sum=sum%10;

                    }
                    else
                    {
                        carry=0;
                    }
                    ListNode temp=new ListNode(sum,null);
                    if(sumhead==null)
                    {
                        sumhead=temp;
                        last=temp;
                    }
                    else
                    {
                        last.next=temp;
                        last=temp;
                    }
                    if(l2.next==null && carry>0)
                    {
                        temp=new ListNode(carry,null);
                        last.next=temp;
                        last=temp;
                    }
                    l2=l2.next;
                }
                else if(l2==null)
                {
                    sum=l1.val + carry;
                    if(sum>=10)
                    {
                        carry=sum/10;
                        sum=sum%10;
                    }
                    else
                    {
                        carry=0;
                    }
                    ListNode temp=new ListNode(sum,null);
                    if(sumhead==null)
                    {
                        sumhead=temp;
                        last=temp;
                    }
                    else
                    {
                        last.next=temp;
                        last=temp;
                    }
                    if(l1.next==null && carry>0)
                    {
                        temp=new ListNode(carry,null);
                        last.next=temp;
                        last=temp;
                    }
                    l1=l1.next;
                }
                else
                {
                    sum=l1.val+l2.val + carry;
                    if(sum>=10)
                    {
                        carry=sum/10;
                        sum=sum%10;
                    }
                    else
                    {
                        carry=0;
                    }

                    ListNode temp=new ListNode(sum,null);
                    if(sumhead==null)
                    {
                        sumhead=temp;
                        last=temp;
                    }
                    else
                    {
                        last.next=temp;
                        last=temp;
                    }
                    if(l1.next==null && l2.next==null && carry>0)
                    {
                        temp=new ListNode(carry,null);
                        last.next=temp;
                        last=temp;
                    }
                    l1=l1.next;
                    l2=l2.next;
                }
            }
            return sumhead;
        }
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
        {


            ListNode sumhead2=sumoflists(l1,l2);
            return sumhead2;

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

    private static Ex1SumReverseLinkList.ListNode insertLinkList(Ex1SumReverseLinkList.ListNode list, int value){
        if(list == null){
            return new Ex1SumReverseLinkList.ListNode(value);
        }
        Ex1SumReverseLinkList.ListNode current = list;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Ex1SumReverseLinkList.ListNode(value);

        return list;
    }

//    Input: l1 = [2,4,3], l2 = [5,6,4]
//    Output: [7,0,8]
//    Explanation: 342 + 465 = 807
    public static void main(String[] args) {

        ListNode ls1 = new ListNode(2);
        ls1.next = new ListNode(4);
        ls1.next.next = new ListNode(3);

        print(ls1);

        ListNode ls2 = new ListNode(5);
        ls2.next = new ListNode(6);
        ls2.next.next = new ListNode(4);
        ls2.next.next.next = new ListNode(0);
        ls2.next.next.next.next = new ListNode(1);
        ls2.next.next.next.next.next = new ListNode(0);

        print(ls2);

        ListNode result = addTwoNumbersV2(ls1, ls2);
        print(result);


    }

    public static ListNode addTwoNumbersV2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}