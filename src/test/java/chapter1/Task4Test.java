package chapter1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Oksana_Moiseeva on 12/4/2017.
 */
public class Task4Test {

    private Task4 task = new Task4();

    @Test
    public void isItReplacedPalindrome() throws Exception {
        assertThat(task.isItReplacedPalindrome("ooou"), is(false));
        assertThat(task.isItReplacedPalindrome("aibohphobai"), is(true));
        assertThat(task.isItReplacedPalindrome("aabaaaa"), is(true));
        assertThat(task.isItReplacedPalindrome("evitatiev"), is(true));
        assertThat(task.isItReplacedPalindrome("evitativ"), is(false));

    }

}