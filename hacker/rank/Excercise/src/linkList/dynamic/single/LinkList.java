package linkList.dynamic.single;

public interface LinkList <T> {

    void addAtEnd(T data);

    void addAtBeginning(T data);

    void addAfter(T prevData, T newData);

    void removeAtBeginning();

    void removeAtEnd();

    void removeByValue(T value);

    void reverse();

    Node<T> findBeginData();

    Node<T> findMinVale();

    Node<T> findMiddle();

    Node<T> findNthNodeFromEnd(T n);

    void removeDuplicateSorted();

    void removeDuplicateUnorderedList();
    void print();
}
