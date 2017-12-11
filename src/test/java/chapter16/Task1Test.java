package chapter16;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {
    private Task1 task = new Task1();

    @Test
    public void swap() throws Exception {
        int[] ints = new int[]{1, 2};
        task.swap(ints);
        assertEquals(2, ints[0]);
        assertEquals(1, ints[1]);
    }

}