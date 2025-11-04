package linkList.doublelinklist;

import java.util.HashMap;
import java.util.Hashtable;

public class AppMain {

    public static void main(String[] args) {
//        DoubleLinkedListCustom doubleLL = new DoubleLinkedListCustom();
//        doubleLL.insertAtHead(10);
//        doubleLL.insertAtHead(15);
//        doubleLL.insertAtHead(20);
//        doubleLL.insertAtTail(5);
//        doubleLL.insertAtTail(4);
//        doubleLL.insertAtTail(3);
//
//        doubleLL.displayForward();
//        doubleLL.displayBackward();
//
//        doubleLL.deleteBegin();
//        doubleLL.deleteBegin();
//        doubleLL.displayForward();
//
//        doubleLL.deleteEnd();
//        doubleLL.deleteEnd();
//        doubleLL.displayForward();
//
////        doubleLL.deleteElementByValue(5);
//        doubleLL.deleteElementByValue(10);
//
//        doubleLL.displayForward();
        DoubleLinkedListCustom doubleLinkedListCustom = new DoubleLinkedListCustom();
        doubleLinkedListCustom.createLoop();
        boolean isCycleCode = doubleLinkedListCustom.isCycle();
        System.out.println(isCycleCode);

    }
}
