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
        if(head == null || head.next == null){
            tail = null;
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;

    }

    @Override
    public void deleteEnd() {
        if(tail == null || tail.prev == null){
            tail = null;
            head = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    @Override
    public void deleteElementByValue(int value) {
        if(head == null){
            head = null;
            tail = null;
            return;
        }
        Node currentHead = head;
        while( currentHead != null && currentHead.data != value ){
            currentHead = currentHead.next;
        }

        if(currentHead == null || currentHead.data != value) return;

        if(currentHead.prev==null && currentHead.next == null){
            head = null;
            tail = null;
            return;
        }

        if(currentHead.prev == null){
            currentHead.next.prev=null;
            tail = currentHead.next;
            head = currentHead.next;
        }else if (currentHead.next==null){
            currentHead.prev.next=null;
            tail = currentHead.prev;
            head = currentHead.prev;

        }else {
            currentHead = currentHead.next;
            currentHead.prev = currentHead.prev.prev;
        }

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
