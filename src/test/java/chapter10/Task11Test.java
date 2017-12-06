package chapter10;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Task11Test {
    private Task11 task = new Task11();

    @Test
    public void peeksAndPits() throws Exception {
        List<Integer> expected = Arrays.asList(5, 1, 3, 2, 3);
        List<Integer> list = Arrays.asList(5, 3, 1, 2, 3);

        assertEquals(expected, task.peeksAndPits(list));
    }

}