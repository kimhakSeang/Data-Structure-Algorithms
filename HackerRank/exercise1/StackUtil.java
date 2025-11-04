package exercise1;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackUtil {

    private final Stack<Integer> stack = new Stack<>();
    private final PriorityQueue<Integer> minValueQueue = new PriorityQueue<>(1);

    public void push(int data ){
        minValueQueue.add(data);
        stack.push(data);
    }

    public Integer pop(){
        Integer deletedValue = stack.pop();
        if(deletedValue.equals(minValueQueue.peek())){
            minValueQueue.poll();
        }
        return deletedValue;
    }

    public Integer top(){
        return stack.peek();
    }

    public Integer getMin(){
        return minValueQueue.peek();
    }

    public static void main(String[] args) {
        StackUtil storage = new StackUtil();
        System.out.println("************* ITEMS *************");
        storage.push(10);
        storage.push(40);
        storage.push(5);
        storage.push(15);
        storage.push(100);
        System.out.println(storage.stack);

        System.out.println("************* POP *************");
        Integer popValue = storage.pop();
        System.out.println(popValue);

        System.out.println("************* TOP *************");
        Integer top = storage.top();
        System.out.println(top);

        System.out.println("************* FIND MIN VALUE *************");
        Integer minvalue = storage.getMin();
        System.out.println(minvalue);
    }
}
