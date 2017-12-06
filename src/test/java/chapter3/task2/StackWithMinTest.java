package chapter3.task2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StackWithMinTest {

    private StackWithMin stack = new StackWithMin();
    @Test
    public void getMin() throws Exception {
        stack.push(2);
        stack.push(5);
        stack.push(-1);
        stack.push(9);
        assertThat(stack.pop(), is(9));
        assertThat(stack.getMin(), is(-1));
        stack.push(-7);
        stack.push(8);
        assertThat(stack.getMin(), is(-7));
        assertThat(stack.pop(), is(8));
        System.out.println(stack.peekFirst());
    }

}