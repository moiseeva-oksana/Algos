package chapter16;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task8Test {

    private Task8 task = new Task8();

    @Test
    public void spell() throws Exception {
        assertEquals("two thousands three hundreds forty five", task.spell(2345));
        assertEquals("two thousands three hundreds twelve", task.spell(2312));
        assertEquals("two thousands two", task.spell(2002));
    }

}