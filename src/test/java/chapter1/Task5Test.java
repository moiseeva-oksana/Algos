package chapter1;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Oksana_Moiseeva on 12/5/2017.
 */
public class Task5Test {

    private Task5 task = new Task5();

    @Test
    public void isCharReplaced() throws Exception {
        assertThat(task.isCharReplaced("qwert", "awert"), is(true));
        assertThat(task.isCharReplaced("qwert", "awerr"), is(false));
        assertThat(task.isCharReplaced("qwer", "awert"), is(false));
        assertThat(task.isCharReplaced("qwerty", "qwerty"), is(true));
    }

    @Test
    public void isCharDeletedTest() {
        assertThat(task.isCharDeleted("qwerty", "qerty"), is(true));
        assertThat(task.isCharDeleted("qwerty", "qrty"), is(false));
        assertThat(task.isCharDeleted("abcd", "qrt"), is(false));
    }

    @Test
    public void isOnlyOneReplacingTest() {
        assertThat(task.isOnlyOneReplacing("pale", "ple"), is(true));
        assertThat(task.isOnlyOneReplacing("pales", "pale"), is(true));
        assertThat(task.isOnlyOneReplacing("pale", "bale"), is(true));
        assertThat(task.isOnlyOneReplacing("pale", "bake"), is(false));
    }

}