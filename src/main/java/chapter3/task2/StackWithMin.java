package chapter3.task2;

import java.util.LinkedList;
//15 minutes
public class StackWithMin extends LinkedList<Integer> {

    private int min;

    public int getMin() {
        return min;
    }

    @Override
    public Integer pop() {
        return super.pop();
    }

    @Override
    public void push(Integer e) {
        if (e < min) {
            min = e;
        }
        super.push(e);
    }
}
