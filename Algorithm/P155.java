import java.util.LinkedList;
import java.util.PriorityQueue;

import javafx.scene.layout.Priority;

class MinStack {

    LinkedList<Integer> stack;
    PriorityQueue<Integer> queue;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new LinkedList<>();
        queue = new PriorityQueue<>();
    }
    
    public void push(int x) {
        stack.push(x);
        queue.add(x);
    }
    
    public void pop() {
        queue.remove(stack.pop());
    }
    
    public int top() {
        return stack.getFirst();
    }
    
    public int getMin() {
        return queue.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */