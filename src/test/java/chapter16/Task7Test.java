package chapter16;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task7Test {

    private Task7 task = new Task7();

    @Test
    public void max() throws Exception {
        assertEquals(5, task.max(5, 2));
        assertEquals(-2, task.max(-8, -2));
        assertEquals(17, task.max(5, 17));
    }

}