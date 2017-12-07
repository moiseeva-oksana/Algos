package chapter2;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Task6Test {

    private Task6 task = new Task6();
    private static LinkList<Integer> ints;
    private static LinkList<String> strings;

    @BeforeClass
    public static void init() {
        ints = new LinkList<>(1);
        ints.addToTail(2);
        ints.addToTail(3);
        ints.addToTail(2);
        ints.addToTail(1);

        strings = new LinkList<>("aaa");
        strings.addToTail("bbb");
        strings.addToTail("ccc");
        strings.addToTail("bbb");
        strings.addToTail("aaa");

    }

    @Test
    public void isPalindromeInt() throws Exception {
        assertThat(task.isPalindrome(ints), is(true));
        ints.addToTail(6);
        assertThat(task.isPalindrome(ints), is(false));
    }

    @Test
    public void isPalindromeString() throws Exception {
        assertThat(task.isPalindrome(strings), is(true));
        strings.addToTail("ddd");
        assertThat(task.isPalindrome(strings), is(false));
    }

}