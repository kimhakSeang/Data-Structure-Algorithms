package LinkList;

import java.util.HashSet;
import java.util.Objects;

public class LinkListCustomize implements LinkList {
    Node head;



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
    public Node mergeSortedList(Node root1, Node root2) {
        if(root1 == null) return root2;
        if(root2 == null) return root1;

        Node head = new Node(0);
        Node tail = head;
        while (root1 != null && root2!=null){
            if(root1.data < root2.data){
                tail.next = root1;
                root1 = root1.next;
            } else if (root1.data > root2.data) {
                tail.next = root2;
                root2 = root2.next;
            }else{
                tail.next = root1;
                root1 = root1.next;
                root2 = root2.next;
            }
            tail = tail.next;
        }
        if(root1 != null || root2 != null){
            tail.next =  root1 != null ? root1 : root2;
        }
        return head.next;
    }

    @Override
    public void mergeSortedListV2(Node other) {
        if(other == null || head == null) return;

        Node headDummy = new Node(0);
        Node tail = headDummy;

        while(head != null && other!=null){
            if(head.data  < other.data){
                tail.next = head;
                head = head.next;
            }else if(head.data > other.data) {
                tail.next = other;
                other = other.next;
            }else {
                tail.next = head;
                head = head.next;
                other = other.next;
            }
            tail = tail.next;
        }
        if(head!=null || tail!=null){
            tail.next = head!=null ? head : tail;
        }
        head = headDummy.next;
    }


    @Override
    public void mergeUnsortedList(Node other) {
        if(head == null) head = other;
        Node current = head;
        while(current.next != null) current = current.next;
        current.next = other;
    }
}
