package chapter17;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task21Test {

    private Task21 task = new Task21();

    @Test
    public void getVolume() throws Exception {
        int[] arr = new int[]{0, 0, 4, 0, 0, 6, 0, 0, 3, 0, 5, 0, 1, 0, 0, 0};
        assertThat(task.getVolume(arr), is(26));

        arr = new int[]{0, 0, 5, 0, 0, 8, 0, 0, 3, 0, 5, 0, 1, 0, 0, 0};
        assertThat(task.getVolume(arr), is(28));

        arr = new int[]{1, 0, 4, 0, 0, 8, 0, 0, 3, 0, 5, 0, 1, 0, 0, 0};
        assertThat(task.getVolume(arr), is(27));
    }

}