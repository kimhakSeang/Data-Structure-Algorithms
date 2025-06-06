package LinkList;

import java.util.Objects;

public class LinkListCustomize implements LinkList {
    private Node head;



    @Override
    public void addAtEnd(Integer data) {

        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    @Override
    public void addAtBeginning(Integer data) {
        Node newNode = new Node(data);
        Node current = head;
        if(current == null){
            head = newNode;
            return;
        }
        newNode.next = current;
        head = newNode;
    }

    @Override
    public void addAfter(Integer prevData, Integer newData) {
        Node newNode = new Node(newData);
        if( head ==  null){
            head = newNode;
        }
        Node current = head;
        while(!Objects.equals(current.data, prevData)){
            current = current.next;
            if (current == null){
                throw new RuntimeException("Previous value not found!");
            }
        }
        newNode.next = current.next;
        current.next= newNode;
    }

    @Override
    public void removeAtBeginning() {

    }

    @Override
    public void removeAtEnd() {

    }

    @Override
    public void removeByValue(Integer value) {

    }

    @Override
    public void reverse() {

    }

    @Override
    public Node findMiddle() {
        return null;
    }

    @Override
    public Node findNthNodeFromEnd(Integer n) {
        return null;
    }

    @Override
    public void removeDuplicateSorted() {

    }

    @Override
    public void removeDuplicateUnorderedList() {

    }

    @Override
    public void print() {
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }

    }

    @Override
    public Node mergeSortedList(Node head1, Node head2) {
        return null;
    }

    @Override
    public Node mergeUnsortedList(Node head1, Node head2) {
        return null;
    }
}
