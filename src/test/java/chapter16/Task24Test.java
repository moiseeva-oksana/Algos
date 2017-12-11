package chapter16;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Task24Test {

    private Task24 task = new Task24();

    @Test
    public void getPairs() throws Exception {
        List<Integer> integers = Arrays.asList(1, 2, 4, 6, 7, 9, 3, 5);
        assertArrayEquals(new int[]{2,9}, task.getPairs(integers, 11).get(0));
        assertArrayEquals(new int[]{4,7}, task.getPairs(integers, 11).get(1));
        assertArrayEquals(new int[]{6,5}, task.getPairs(integers, 11).get(2));

        assertArrayEquals(new int[]{1,2}, task.getPairs(integers, 3).get(0));
    }

}