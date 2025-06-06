import LinkList.LinkListCustomize;

public class Main {
    public static void main(String[] args) {
        System.out.println("==============Add END================");
        LinkListCustomize linkList = new LinkListCustomize();
        linkList.addAtEnd(10);
        linkList.addAtEnd(20);
        linkList.print();
        System.out.println("______________________________");
        linkList.addAtEnd(30);
        linkList.print();

        System.out.println("==============Add BEGIN================");
        LinkListCustomize linkList2 = new LinkListCustomize();
        linkList2.addAtBeginning(10);
        linkList2.addAtBeginning(20);
        linkList2.print();
        System.out.println("______________________________");
        linkList2.addAtBeginning(30);
        linkList2.print();

        System.out.println("==============Add AFTER================");
        LinkListCustomize linkList3 = new LinkListCustomize();
        linkList3.addAtEnd(10);
        linkList3.addAtEnd(20);
        linkList3.print();
        System.out.println("______________________________");
        linkList3.addAfter(10,30);
        linkList3.print();
        linkList3.addAfter(11,40);


    }
}