package chapter8;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task5Test {
    private Task5 task = new Task5();

    @Test
    public void multiply() throws Exception {
        assertThat(task.multiply(2,3), is(6));
        assertThat(task.multiply(11,5), is(55));
        assertThat(task.multiply(3,7), is(21));
        assertThat(task.multiply(5,1), is(5));
    }

}