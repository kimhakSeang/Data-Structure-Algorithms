package linkList.dynamic.doublelinkedlist;

public interface DoubleLinkedList<T>{
    void insertAtHead(T value);
    T findBegin();
    T findMinValue();
    void deleteBegin();
    void displayForward();
}
