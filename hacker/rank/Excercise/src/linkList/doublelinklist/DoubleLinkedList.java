package linkList.doublelinklist;

public interface DoubleLinkedList {

    void insertAtHead(int value);
    void insertAtTail(int value);
    void deleteBegin();
    void deleteEnd();
    void deleteElementByValue(int value);
    void displayForward();
    void displayBackward();

}
