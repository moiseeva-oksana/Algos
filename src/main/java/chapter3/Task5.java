package chapter3;

import java.util.Deque;
import java.util.LinkedList;

public class Task5 {

    public Deque<Integer> sort(Deque<Integer> stack) {
        Deque<Integer> helper = new LinkedList<>();
        while (!stack.isEmpty()) {
            int elem = stack.pop();
            while (!helper.isEmpty() && helper.peek() < elem) {
                stack.push(helper.pop());
            }
            helper.push(elem);
        }
        return helper;
    }
}