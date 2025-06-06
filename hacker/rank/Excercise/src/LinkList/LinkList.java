package LinkList;

public interface LinkList {

    void addAtEnd(Integer data);

    void addAtBeginning(Integer data);

    void addAfter(Integer prevData, Integer newData);

    void removeAtBeginning();

    void removeAtEnd();

    void removeByValue(Integer value);

    void reverse();

    Node findMiddle();

    Node findNthNodeFromEnd(Integer n);

    void removeDuplicateSorted();

    void removeDuplicateUnorderedList();

    Node mergeUnsortedList(Node head1, Node head2);

    Node mergeSortedList(Node head1, Node head2);

    void print();
}
