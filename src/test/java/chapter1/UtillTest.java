package chapter1;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
/**
 * Created by Oksana_Moiseeva on 12/5/2017.
 */
public class UtillTest {
    @Test
    public void isCharReplaced() {
        assertThat(Utill.isEmpty(""), is(true));
        assertThat(Utill.isEmpty(null), is(true));
        assertThat(Utill.isEmpty("test"), is(false));
    }
}