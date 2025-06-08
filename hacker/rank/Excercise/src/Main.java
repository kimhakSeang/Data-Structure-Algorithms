import LinkList.LinkListCustomize;
import LinkList.Node;

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

        System.out.println("==============REMOVE UNSORTED================");
        LinkListCustomize linkList4 = new LinkListCustomize();
        linkList4.addAtEnd(10);
        linkList4.addAtEnd(50);
        linkList4.addAtEnd(20);
        linkList4.addAtEnd(20);
        linkList4.addAtEnd(30);
        linkList4.addAtEnd(40);
        linkList4.addAtEnd(10);
        linkList4.addAtEnd(50);
        linkList4.print();
        System.out.println("______________________________");
        linkList4.removeDuplicateUnorderedList();
        linkList4.print();


    }
}