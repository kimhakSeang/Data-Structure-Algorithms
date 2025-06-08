package LinkList;

import java.util.HashSet;
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
        if(head ==  null){
            return;
        }
        Node current = head;
        Node prev = null;
        Node next = null;
        // 1 2 3 4 5
        while ( current.next != null ){ // 1 2 3 4
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current.next = prev;     // 5-> 4
        head = current;
    }

    @Override
    public Node findMiddle() {
        if (head ==  null){
            throw  new RuntimeException("LinkList is empty");
        }
        Node firstNode = head;
        Node secondNode = head;
        while(secondNode.next != null && secondNode.next.next != null){
            firstNode = firstNode.next;
            secondNode = secondNode.next.next;
        }
        return firstNode;
    }

    @Override
    public Node findNthNodeFromEnd(Integer n) {
        return null;
    }

    @Override
    public void removeDuplicateSorted() {
        if(head ==  null || head.next == null) return;

        Node current = head;
        while(current.next.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            }
            current = current.next;
        }
        if(current.data == current.next.data) {
            current.next = current.next.next;
        }
    }

    @Override
    public void removeDuplicateUnorderedList() {
        if(head ==  null || head.next == null) return;

        Node current = head;
        HashSet<Integer> hashSet = new HashSet();
        while(current.next.next != null){
            hashSet.add(current.data);
            if (hashSet.contains(current.next.data)){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        if (hashSet.contains(current.next.data)){
            current.next = current.next.next;
        }

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
