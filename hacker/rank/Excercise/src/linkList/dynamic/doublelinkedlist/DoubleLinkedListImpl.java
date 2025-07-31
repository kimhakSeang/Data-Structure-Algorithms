package linkList.dynamic.doublelinkedlist;



public class DoubleLinkedListImpl<T> implements DoubleLinkedList<T>{
    Node<T> head;
    Node<T> tail;


    @Override
    public void insertAtHead(T value) {
        Node<T> newNode = new Node<T>(value);
        if(head== null) {
            head = newNode;
            tail = newNode;
            addMinToNextOfTail(value);
            return;
        }
        Node<T> current =  head;
        head = newNode;
        head.next = current;
        current.prev = head;

        // Add min to header.prev
        addMinToNextOfTail(value);
    }

    @Override
    public T findBegin() {
        return head.data;
    }

    @Override
    public T findMinValue() {
        return tail.data;
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
    public void displayForward() {
        Node<T> current = head;
        while( current != null){
            System.out.println(current.data);
            current =  current.next;
        }
    }

    private void addMinToNextOfTail(T value){
        Node<T> newNode = new Node<>(value);

        if (tail.next == null){
            tail.next = newNode;
            tail.next.prev = tail;
        } else if(value instanceof Number) {
            if( ( (Integer)value < (Integer) tail.next.data)){
                tail.next = newNode;
                tail.next.prev = tail;
            }
        }else if (value instanceof String){
            if( ( value.toString().length() < tail.next.data.toString().length())){
                tail.next = newNode;
                tail.next.prev = tail;
            }
        }
    }

}
