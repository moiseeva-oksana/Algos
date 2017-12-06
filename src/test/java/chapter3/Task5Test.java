package chapter3;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Task5Test {

    private Task5 task = new Task5();

    @Test
    public void sort() throws Exception {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(-9);
        stack.push(11);
        Deque<Integer> sorted = task.sort(stack);
        assertThat(sorted.pop(), is(-9));
        assertThat(sorted.pop(), is(1));
        assertThat(sorted.pop(), is(3));
        assertThat(sorted.pop(), is(5));
    }

}