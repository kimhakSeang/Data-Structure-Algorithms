package linkList.doublelinklist;

public class AppMain {

    public static void main(String[] args) {
        DoubleLinkedListCustom doubleLL = new DoubleLinkedListCustom();
        doubleLL.insertAtHead(10);
        doubleLL.insertAtHead(15);
        doubleLL.insertAtHead(20);
        doubleLL.insertAtTail(30);
        doubleLL.insertAtTail(50);
        doubleLL.insertAtTail(40);

        doubleLL.displayForward();
        doubleLL.displayBackward();


    }
}
