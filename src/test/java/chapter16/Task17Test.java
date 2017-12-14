package chapter16;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Task17Test {
    private Task17 task = new Task17();

    @Test
    public void maxSubSum() throws Exception {
        Task17.Result result = task.maxSubSum(Arrays.asList(2, -8, 3, -2, 4, -10));
        assertEquals(5, result.getMaxSum());
        assertEquals(Arrays.asList(3, -2, 4), result.getMaxSubList());

        result = task.maxSubSum(Arrays.asList(-10, 18, 3, -2, 4, -10));
        assertEquals(23, result.getMaxSum());
        assertEquals(Arrays.asList( 18, 3, -2, 4), result.getMaxSubList());
    }

}