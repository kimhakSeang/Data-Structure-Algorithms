package linkList.single;

public class Main {
    public static void main(String[] args) {
//        System.out.println("==============Add END================");
//        LinkListCustomize linkList = new LinkListCustomize();
//        linkList.addAtEnd(10);
//        linkList.addAtEnd(20);
//        linkList.print();
//        System.out.println("______________________________");
//        linkList.addAtEnd(30);
//        linkList.print();
//
//        System.out.println("==============Add BEGIN================");
//        LinkListCustomize linkList2 = new LinkListCustomize();
//        linkList2.addAtBeginning(10);
//        linkList2.addAtBeginning(20);
//        linkList2.print();
//        System.out.println("______________________________");
//        linkList2.addAtBeginning(30);
//        linkList2.print();
//
//        System.out.println("==============Add AFTER================");
//        LinkListCustomize linkList3 = new LinkListCustomize();
//        linkList3.addAtEnd(10);
//        linkList3.addAtEnd(20);
//        linkList3.print();
//        System.out.println("______________________________");
//        linkList3.addAfter(10,30);
//        linkList3.print();

//        System.out.println("==============Find MIDDLE================");
//        LinkListCustomize linkList4 = new LinkListCustomize();
//        linkList4.addAtEnd(10);
//        linkList4.addAtEnd(20);
//        linkList4.addAtEnd(30);
//        linkList4.addAtEnd(40);
//        linkList4.addAtEnd(50);
//        linkList4.print();
//        System.out.println("______________________________");
//        Node middleNode = linkList4.findMiddle();
//        System.out.println(middleNode.data);

//        System.out.println("==============REVERS================");
//        LinkListCustomize linkList4 = new LinkListCustomize();
//        linkList4.addAtEnd(10);
//        linkList4.addAtEnd(20);
//        linkList4.addAtEnd(30);
//        linkList4.addAtEnd(40);
//        linkList4.addAtEnd(50);
//        linkList4.print();
//        System.out.println("______________________________");
//        linkList4.reverse();
//        linkList4.print();

//        System.out.println("==============REMOVE SORTED================");
//        LinkListCustomize linkList4 = new LinkListCustomize();
//        linkList4.addAtEnd(10);
//        linkList4.addAtEnd(10);
//        linkList4.addAtEnd(20);
//        linkList4.addAtEnd(20);
//        linkList4.addAtEnd(30);
//        linkList4.addAtEnd(40);
//        linkList4.addAtEnd(50);
//        linkList4.addAtEnd(50);
//        linkList4.print();
//        System.out.println("______________________________");
//        linkList4.removeDuplicateSorted();
//        linkList4.print();

//        System.out.println("==============REMOVE UNSORTED================");
//        LinkListCustomize linkList4 = new LinkListCustomize();
//        linkList4.addAtEnd(10);
//        linkList4.addAtEnd(50);
//        linkList4.addAtEnd(20);
//        linkList4.addAtEnd(20);
//        linkList4.addAtEnd(30);
//        linkList4.addAtEnd(40);
//        linkList4.addAtEnd(10);
//        linkList4.addAtEnd(50);
//        linkList4.print();
//        System.out.println("______________________________");
//        linkList4.removeDuplicateUnorderedList();
//        linkList4.print();

//        System.out.println("==============MERGE SORTED LINKED LIST================");
//        LinkListCustomize linkedList1 = new LinkListCustomize();
//        linkedList1.addAtEnd(10);
//        linkedList1.addAtEnd(20);
//        linkedList1.addAtEnd(30);
//        linkedList1.addAtEnd(45);
//        linkedList1.print();
//
//        System.out.println(">> List 2");
//        LinkListCustomize linkedList2 = new LinkListCustomize();
//        linkedList2.addAtEnd(20);
//        linkedList2.addAtEnd(35);
//        linkedList2.print();
//        System.out.println("______________________________");
////        LinkListCustomize linkListCustomize = new LinkListCustomize();
////        Node node = linkListCustomize.mergeSortedList(linkedList1.head, linkedList2.head);
////        while(node!=null) {
////            System.out.println(node.data);
////            node = node.next;
////        }
//        linkedList1.mergeSortedListV2(linkedList2.head);
//        linkedList1.print();

//         System.out.println("==============MERGE UNSORTED LINKED LIST================");
//        LinkListCustomize linkedList1 = new LinkListCustomize();
//        linkedList1.addAtEnd(10);
//        linkedList1.addAtEnd(15);
//        linkedList1.addAtEnd(30);
//        linkedList1.addAtEnd(70);
//        linkedList1.print();
//
//        System.out.println(">> List 2");
//        LinkListCustomize linkedList2 = new LinkListCustomize();
//        linkedList2.addAtEnd(20);
//        linkedList2.addAtEnd(50);
//        linkedList2.print();
//        System.out.println("______________________________");
//        linkedList1.mergeUnsortedList(linkedList2.head);
//        linkedList1.print();


//          System.out.println("==============REMOVE BEGIN================");
//        LinkListCustomize linkedList1 = new LinkListCustomize();
//        linkedList1.addAtEnd(10);
//        linkedList1.addAtEnd(15);
//        linkedList1.addAtEnd(30);
//        linkedList1.addAtEnd(70);
//        linkedList1.print();
//        System.out.println("______________________________");
//        linkedList1.removeAtBeginning();
//        linkedList1.print();

//        System.out.println("==============REMOVE END================");
//        LinkListCustomize linkedList1 = new LinkListCustomize();
//        linkedList1.addAtEnd(10);
//        linkedList1.addAtEnd(15);
//        linkedList1.addAtEnd(30);
//        linkedList1.addAtEnd(70);
//        linkedList1.print();
//        System.out.println("______________________________");
//        linkedList1.removeAtEnd();
//        linkedList1.removeAtEnd();
//        linkedList1.print();

        System.out.println("==============REMOVE BY VALUE================");
        LinkListCustomize linkedList1 = new LinkListCustomize();
        linkedList1.addAtEnd(10);
        linkedList1.addAtEnd(15);
        linkedList1.addAtEnd(30);
        linkedList1.addAtEnd(70);
        linkedList1.print();
        System.out.println("______________________________");
        linkedList1.removeByValue(10);
        linkedList1.removeByValue(15);
        linkedList1.print();




    }
}