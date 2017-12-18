package exam_part_1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task1Test {

    private Task1 task = new Task1();

    @Test
    public void isFibonacci() throws Exception {
        assertThat(task.isFibonacci("1123581321", 8), is(true));
        assertThat(task.isFibonacci("3581321", 8), is(true));
        assertThat(task.isFibonacci("11235813219", 8), is(false));
    }

}