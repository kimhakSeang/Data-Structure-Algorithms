package exercise1;

import linkList.dynamic.doublelinkedlist.DoubleLinkedList;
import linkList.dynamic.doublelinkedlist.DoubleLinkedListImpl;

public class StackStorage<T> {
    private final DoubleLinkedList<T> list;

    public StackStorage() {
        this.list = new DoubleLinkedListImpl<>();
    }

    public void push(T data ){
        list.insertAtHead(data);
    }

    public T pop(){
        T top = list.findBegin();
        if(top != null ){
            list.deleteBegin();
        }
        return top;
    }

    public T top(){
        return list.findBegin();
    }

    public T getMin(){
        return list.findMinValue();
    }

    public void print(){
        list.displayForward();
    }
}
