package chapter2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Oksana_Moiseeva on 12/5/2017.
 */
public class Task1Test {
    private Task1 task = new Task1();

    @Test
    public void removeDuplicates() throws Exception {
        LinkList<Integer> list = new LinkList<>(1);
        list.addToTail(2);
        list.addToTail(3);
        list.addToTail(3);
        list.addToTail(5);
        task.removeDuplicates(list);

        LinkList<Integer> expected = new LinkList<>(1);
        expected.addToTail(2);
        expected.addToTail(3);
        expected.addToTail(5);
        assertEquals(expected.toString(), list.toString());
    }
    @Test
    public void removeSeveralDuplicates() throws Exception {
        LinkList<Integer> list = new LinkList<>(1);
        list.addToTail(2);
        list.addToTail(2);
        list.addToTail(3);
        list.addToTail(3);
        list.addToTail(3);
        list.addToTail(5);
        task.removeDuplicates(list);

        LinkList<Integer> expected = new LinkList<>(1);
        expected.addToTail(2);
        expected.addToTail(3);
        expected.addToTail(5);
        assertEquals(expected.toString(), list.toString());
    }

}