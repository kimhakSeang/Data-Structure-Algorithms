package linkList.doublelinklist;

import java.util.Currency;

public class DoubleLinkedListCustom implements DoubleLinkedList{
    Node head;
    Node tail;


    @Override
    public void insertAtHead(int value) {
        Node newNode = new Node(value);
        if(head== null) {
            head = newNode;
            tail = newNode;
            return;
        }
        Node current =  head;
        head = newNode;
        head.next = current;
        current.prev = head;
    }

    @Override
    public void insertAtTail(int value) {
        Node newNode = new Node(value);
        if(head== null) {
            head = newNode;
            tail = newNode;
            return;
        }
        Node temp = tail;
        newNode.prev = temp;
        temp.next = newNode;
        tail = newNode;
    }

    @Override
    public void deleteBegin() {

    }

    @Override
    public void deleteEnd() {

    }

    @Override
    public void deleteElementByValue(int value) {

    }

    @Override
    public void displayForward() {
        System.out.println(">>>>>> DISPLAY FORWARD <<<<<<<<<");
        Node current = head;
        while( current != null){
            System.out.println(current.data);
            current =  current.next;
        }
    }

    @Override
    public void displayBackward() {
        System.out.println(">>>>>> DISPLAY BACKWARD <<<<<<<<<");
        Node current = tail;
        while( current != null){
            System.out.println(current.data);
            current =  current.prev;
        }
    }
}
