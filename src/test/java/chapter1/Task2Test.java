package chapter1;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
/**
 * Created by Oksana_Moiseeva on 12/4/2017.
 */

public class Task2Test {

    private Task2 task = new Task2();

    @Test
    public void isReplacedTest() {
        assertThat(task.isReplaced("qwerty", "ytrewq"), is(true));
        assertThat(task.isReplaced("Hello World", "World Hello"), is(true));
        assertThat(task.isReplaced("qwert", "ytrewq"), is(false));
        assertThat(task.isReplaced("aaa", null), is(false));

    }
}