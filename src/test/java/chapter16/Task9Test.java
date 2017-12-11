package chapter16;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task9Test {

    private Task9 task = new Task9();

    @Test
    public void subtract() throws Exception {
        assertEquals(5, task.subtract(9, 4));
    }

    @Test
    public void multiply() throws Exception {
        assertEquals(21, task.multiply(3, 7));
    }

    @Test
    public void divide() throws Exception {
        assertEquals(3, task.divide(9, 3));
        assertEquals(3, task.divide(10, 3));
    }

}