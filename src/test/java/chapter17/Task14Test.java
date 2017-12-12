package chapter17;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task14Test {

    private Task14 task = new Task14();

    @Test
    public void kMin() throws Exception {
        int[] arr = new int[]{7, 5, 7, 9, 4, 6, 2, 3, 2};
        assertArrayEquals(new int[]{2, 2, 3}, task.kMin(arr, 3));

        arr = new int[]{-1, 5, 6, -9, 1, 2, 5};
        assertArrayEquals(new int[]{-9, -1, 1, 2}, task.kMin(arr, 4));

    }

}