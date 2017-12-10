package chapter2;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task5Test {

    private Task5 task = new Task5();
    private static LinkList<Integer> first = new LinkList<>();
    private static LinkList<Integer> second = new LinkList<>();
    private static LinkList<Integer> third = new LinkList<>();

    @BeforeClass
    public static void init() {
        first.addToTail(6);
        first.addToTail(3);
        first.addToTail(5);

        second.addToTail(2);
        second.addToTail(1);
        second.addToTail(7);

        third.addToTail(3);
        third.addToTail(2);
        third.addToTail(1);

    }


    @Test
    public void sum() throws Exception {
        assertThat(task.sum(first, second).toString(), is("8421"));
        assertThat(task.sum(first, third).toString(), is("956"));
        assertThat(task.sum(second, third).toString(), is("538"));
    }

}