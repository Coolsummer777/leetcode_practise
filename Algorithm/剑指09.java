import java.util.LinkedList;
import java.util.List;

class CQueue {
    private LinkedList<Integer> inStack;
    private LinkedList<Integer> outStack;
    public CQueue() {
        inStack = new LinkedList<>();
        outStack = new LinkedList<>();
    }
    
    public void appendTail(int value) {
        this.inStack.push(value);
    }
    
    public int deleteHead() {
        if(this.outStack.size() > 0){
            return this.outStack.pop();
        } else{
            if(this.inStack.size() > 0){
                while(this.inStack.size() > 0){
                    this.outStack.push(this.inStack.pop());
                }
                return this.outStack.pop();
            }else{
                return -1;
            }
        }
        return -1;
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */