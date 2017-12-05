package chapter1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Oksana_Moiseeva on 12/5/2017.
 */
public class Task6Test {

    private Task6 task = new Task6();

    @Test
    public void reduce() throws Exception {
        assertThat(task.reduce("qqqwweertyuui"), is("q3w2e2rtyu2i"));
        assertThat(task.reduce("qwerty"), is("qwerty"));
        assertThat(task.reduce("asdfffgrrrr"), is("asdf3gr4"));
        assertThat(task.reduce("qqwerty"), is("qqwerty"));
    }

}