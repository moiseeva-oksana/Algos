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
        assertThat(Util.isEmpty(""), is(true));
        assertThat(Util.isEmpty(null), is(true));
        assertThat(Util.isEmpty("test"), is(false));
    }
}