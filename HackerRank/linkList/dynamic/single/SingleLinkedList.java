package linkList.dynamic.single;

import java.util.HashSet;
import java.util.Objects;

public class SingleLinkedList<T> implements LinkList<T> {
    Node<T> head;



    @Override
    public void addAtEnd(T data) {

        if (head == null) {
            head = new Node(data);
            return;
        }
        Node<T> current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    @Override
    public void addAtBeginning(T data) {
        Node<T> newNode = new Node(data);
        Node<T> current = head;
        if(current == null){
            head = newNode;
            return;
        }
        newNode.next = current;
        head = newNode;
    }

    @Override
    public void addAfter(T prevData, T newData) {
        Node<T> newNode = new Node(newData);
        if( head ==  null){
            head = newNode;
        }
        Node<T> current = head;
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
        if(head == null){
            throw new RuntimeException("LinkedList is empty!");
        }
        head = head.next;
    }

    @Override
    public void removeAtEnd() {
        if(head == null){
            throw new RuntimeException("LinkedList is empty!");
        }
        if(head.next == null ){
            head = null;
            return;
        }

        Node<T> current = head;
        while (current.next != null && current.next.next != null ){
            current = current.next;
        }
        current.next = null;
    }

    @Override
    public void removeByValue(T value) {
        if(head == null){
            throw new RuntimeException("LinkedList is empty!");
        }
        if(head.data == value){
            head = head.next;
            return;
        }

        Node<T> current = head;
        Node<T> prev = null;
        while(current !=null && current.data != value){
            prev = current;
            current = current.next;
        }
        if (current == null ) return;
        else prev.next = current.next;
    }


    @Override
    public void reverse() {
        if(head ==  null){
            return;
        }
        Node<T> current = head;
        Node<T> prev = null;
        Node<T> next = null;
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
    public Node<T> findBeginData() {
        return head;
    }

    @Override
    public Node<T> findMinVale() {
        return null;
    }

    @Override
    public Node<T> findMiddle() {
        if (head ==  null){
            throw  new RuntimeException("LinkList is empty");
        }
        Node<T> firstNode = head;
        Node<T> secondNode = head;
        while(secondNode.next != null && secondNode.next.next != null){
            firstNode = firstNode.next;
            secondNode = secondNode.next.next;
        }
        return firstNode;
    }

    @Override
    public Node<T> findNthNodeFromEnd(T n) {
        return null;
    }

    @Override
    public void removeDuplicateSorted() {
        if(head ==  null || head.next == null) return;

        Node<T> current = head;
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

        Node<T> current = head;
        HashSet<T> hashSet = new HashSet();
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
        Node<T> current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }

    }


}
