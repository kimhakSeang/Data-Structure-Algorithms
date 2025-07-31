package linkList.dynamic.single;

public class Node <T> {
    Node next;
    public T data;

    public Node(T data) {
        this.next = null;
        this.data = data;
    }
}
